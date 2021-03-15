package com.group11.whatapos.model;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 *This class represents the ordering process
 *Whenever an order is created, this class is
 *populated with the necessary fields to create
 *the queries that occur when the order is
 *added to the database.
 */

public class orderModel {
    public Connection conn;
    public String orderid;
    public String customerid;
    public java.sql.Date date; //updated at the end of the order
    public ArrayList<itemModel> items; //itemnum is represented by the index of the item in the array + 1
    public ArrayList<itemAttributesModel> itemAttributesList; //represents item attributes for all items of one order, index rules still follow

    /**
     * order constructor takes 2 arguments
     * and creates a new order with a new orderid
     * for the given customer. The other argument is to connect to the database
     * The date is added when the customer checks out.
     * Items are added to the item arraylist using the
     * addItem function. Likewise for itemAttributesList.
     */
    public orderModel(){
        conn = database.getInstance().returnConnection();
        orderid = "order-" + UUID.randomUUID().toString();
        customerid = "";
        date = new java.sql.Date(0);
        items = new ArrayList<itemModel>();
        itemAttributesList = new ArrayList<itemAttributesModel>();
    }
    
    /**
     * This function adds the given item model to
     * the array of items for this order.
     * @param item itemModel
     */
    public void addItem(itemModel item){
        items.add(item);
    }

    /**
     * removes an item from the order at a specific index.
     * returns that item.
     * @param index int
     * @return itemModel
     */
    public itemModel removeItem(int index){
        itemModel removedItem = items.get(index);
        items.remove(index);
        return removedItem;
    }

    /**
     * adds item attributes for a single item to the item attributes list
     * @param attributes String
     * @param comments String
     */
    public void addItemAttributes(String attributes, String comments){
        itemAttributesModel newAttributes = new itemAttributesModel(attributes, comments);
        itemAttributesList.add(newAttributes);
    }

    /**
     * Removes attributes for an item from the order.
     * @param index int
     * @return itemAttributesModel
     */
    public itemAttributesModel removeItemAttributes(int index){
        itemAttributesModel removedAttributes = itemAttributesList.get(index);
        itemAttributesList.remove(index);
        return removedAttributes;
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
    public void writeToDatabase(){
        setDate();
        //update orders and "order count" tables
        for (int i = 0; i < items.size(); ++i){

            //this statement updates the orders table in the database
            try {
                String query = "INSERT INTO orders(orderid, customerid, orderdate, itemcode, itemnum) "
                        + "VALUES (\'" + orderid + "\', \'" + customerid + "\', " + date + ", \'" + items.get(i).itemCode + "\', " + (i + 1) + ");";
                Statement stmt = conn.createStatement();
                stmt.executeQuery(query);
            } catch (SQLException ex) {
                Logger.getLogger(orderModel.class.getName()).log(Level.SEVERE, null, ex);
            }

            //this statement updates the order table in the database
            try {
                String query = "UPDATE \"order count\"" + " SET ordercount = ordercount + 1 "
                            + "WHERE itemcode = \'" + items.get(i).itemCode + "\';";
                Statement stmt = conn.createStatement();
                stmt.executeQuery(query);
            } catch (SQLException ex) {
                Logger.getLogger(orderModel.class.getName()).log(Level.SEVERE, null, ex);
            }

            //this statement updates the item attribute table in the database
            try {
                String query = "INSERT INTO \"item attributes\"(orderid, itemnum, attributelist, othercomments)"
                        + "VALUES (\'" + orderid + "\', " + (i + 1) + ", " + date + ", \'"
                        + itemAttributesList.get(i).getItemAttributes() + "\', \'" + itemAttributesList.get(i).getOtherComments() + "\');";
                Statement stmt = conn.createStatement();
                stmt.executeQuery(query);
            } catch (SQLException ex) {
                Logger.getLogger(orderModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * clears the order of all information.
     */
    public void deleteOrder(){
        //conn;
        orderid = "";
        customerid = "";
        items.clear();
        itemAttributesList.clear();
    }
}
