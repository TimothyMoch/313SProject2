package com.group11.whatapos.model;

/*
 *This class represents the ordering process
 *Whenever an order is created, this class is
 *populated with the necessary fields to create
 *the queries that occur when the order is
 *added to the database.
 */
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class orderModel {
    private Connection conn;
    private String orderid;
    private String customerid;
    private java.sql.Date date; //updated at the end of the order
    private ArrayList<String> itemCodes; //itemnum is represented by the index of the item in the array + 1

    /**
     * order constructor takes 2 argument
     * and creates a new order with a new orderid
     * for the given customer. The other argument is to connect to the database
     * The date is added when the customer checks out.
     * Items are added to the item arraylist using the
     * addItem function. 
     * NOTE: IF THE CUSTOMER IS NEW, THEY WILL HAVE TO BE GIVEN A NEW UUID
     *       AND THEY WILL HAVETO BE ADDED TO THE DATABASE BEFORE THE CUSTOMER ID
     *       IS PASSED TO THE ORDER.
     * @param _customerid
     * @param _db
     */
    public orderModel(String _customerid, database _db){
        conn = _db.returnConnection();
        orderid = "order-" + UUID.randomUUID().toString();
        customerid = _customerid;
        ArrayList<String> itemCodes = new ArrayList<String>();
    }

    /**
     * This function adds the given itemcode to the
     * itemCode arraylist for an order.
     * @param itemCode
     */
    public void addItem(String itemCode){
        itemCodes.add(itemCode);
    }

    /**
     * sets the date of the order to the current system date.
     * Used in updateDatabase function to set the date of the transaction.
     */
    public void setDate(){
        long ms = System.currentTimeMillis();
        date = new java.sql.Date(ms);
    }

    /**
     * Updates the orders table in the database with the order information.
     * This does not currently update the itemAttributes table, the recommendations table,
     * the order count table, or the 
     */
    public void updateDatabase(){
        setDate();
        //update orders and "order count" tables
        for (int i = 0; i < itemCodes.size(); ++i){

            //this statement updates the orders table in the database
            try {
                String query = "INSERT INTO orders(orderid, customerid, orderdate, itemcode, itemnum) "
                        + "VALUES (" + orderid + ", " + customerid + ", " + date + ", " + itemCodes.get(i) + ", " + (i + 1) + ");";
                Statement stmt = conn.createStatement();
                stmt.executeQuery(query);
            } catch (SQLException ex) {
                Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
            }

            //this statement updates the order table in the database
            try {
                String query = "UPDATE \"order count\"" + " SET ordercount = ordercount + 1 "
                            + "WHERE itemcode = " + itemCodes.get(i) + ";";
                Statement stmt = conn.createStatement();
                stmt.executeQuery(query);
            } catch (SQLException ex) {
                Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
