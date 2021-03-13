package com.group11.whatapos.model;

/*
 * This class will be used to pass recommendations
 * to the GUI from the database. This will be used to
 * represent the current customer's recommendations.
 * The object must be recreated whenever the current
 * customer changes.
 */
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class recommendations {
    private Connection conn;
    private String customerid;
    private ArrayList<java.sql.Date> dates; 
    private ArrayList<String> itemCodes;

    /**
     * This constructor retrieves the recommendations for the
     * current customer from the database and stores the
     * itemcode and dates in two ArrayLists.
     * @param _customerid String
     * @param _db database
     */

    public recommendations(String _customerid, database _db){
        conn = _db.returnConnection();
        customerid = _customerid;
        String itemCode = "";
        try {
            String query = "SELECT itemcode, orderdate " +
                            "FROM recommendations " +
                            "ORDER BY orderdate DESC " +
                            "WHERE customerid = " + customerid + ";";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                //itemCode.add(rs.getString("itemcode"));
                dates.add(rs.getDate("orderdate"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param index int between 0 and 4, inclusive (if it goes higher, there is something wrong)
     * @return a recommended item's itemcode
     */
    public String getItemCode(int index){
        return itemCodes.get(index);
    }

    /**
     * Adds a recommendation to the arrays.
     * This occurs whenever an order is completed.
     * When a recommendation is added, the earliest
     * item is deleted from the recommendations arrays.
     * This does NOT update the database.
     * @param itemCode String
     * @param orderdate java.sql.Date
     */
    public void addRecommendation(String itemCode, java.sql.Date orderdate){
        dates.set(4, orderdate);
        itemCodes.set(4, itemCode);
    }

    /**
     * Updates the database with the most recent recommendations
     * information for the current customer. It does this by
     * deleting the customer's recommendations off the database
     * and then adding the new set.
     */
    public void updateDatabase(){
        //deletes from database
        try {
            String query = "DELETE FROM recommendations " +
                            "WHERE customerid = " + customerid + ";";
            Statement stmt = conn.createStatement();
            stmt.executeQuery(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
        }

        //adds to database
        for (int i = 0; i < itemCodes.size(); ++i){
            try {
                String query = "INSERT INTO recommendations(customerid, itemcode, orderdate) " +
                "VALUES (" + customerid + ", " + itemCodes.get(i) + ", " + dates.get(i) + ");";
                Statement stmt = conn.createStatement();
                stmt.executeQuery(query);
                
            } catch (SQLException ex) {
                Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}