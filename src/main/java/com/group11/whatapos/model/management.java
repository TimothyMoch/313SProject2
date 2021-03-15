package com.group11.whatapos.model;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class management{
    public static Connection conn = database.getInstance().returnConnection();
    
    public void addItemtoMenu(String itemCode, String itemName, double price){
        try {
            String query = "INSERT INTO item(itemname, itemcode, price) VALUES (\'" + itemName + "\', \'" + itemCode +"\', " + price + ");";
            Statement stmt = conn.createStatement();
            stmt.executeQuery(query);

        } catch (SQLException ex) {
            Logger.getLogger(management.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String query = "INSERT INTO \"order count\"(itemcode, ordercount) VALUES (\'" + itemCode + "\', 0);";
            Statement stmt = conn.createStatement();
            stmt.executeQuery(query);

        } catch (SQLException ex) {
            Logger.getLogger(management.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return ArrayList<String> of top 2 trending and bottom 2 trending
     * in order: {top1, top2, bottom1, bottom2}
     */
/*
    public ArrayList<String> getTrending(){
        ArrayList<String> trendingItems = new ArrayList<String>();

        //get top 2 and bottom 2
        try {
            String query = "SELECT \'" + item + "\' FROM \"order count\" ORDER BY DESC LIMIT 2 UNION ALL SELECT itemcode FROM \"order count\" ORDER BY ASC LIMIT 2;";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                trendingItems.add(rs.getString("itemcode"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(management.class.getName()).log(Level.SEVERE, null, ex);
        }


        return trendingItems;
    }
*/
    /**
     * allows management to change price for item.
     * @param item String
     * @param newPrice double
     */
    public void changePrice(String item, double newPrice){
        try {
            String query = "UPDATE item SET price = " + newPrice + "WHERE itemcode = \'" + item + "\';";
            Statement stmt = conn.createStatement();
            stmt.executeQuery(query);

        } catch (SQLException ex) {
            Logger.getLogger(management.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    /**
     * calculates the current revenue of a given item for a given date range. Then calculates
     * the "new" revenue of the item if the price were different and subtracts the revenues to
     * get the difference in revenue. If the result is negative, that means they lost money.
     * @param item String
     * @param newPrice double
     * @param date1 String
     * @param date2 String
     * @return double
     */
    public double getRevenueDiff(String item, double newPrice, String startDate, String endDate){
        int totalOrders = 0;
        double totalRev;
        double newTotalRev;
        double diff;
        double price = 0;
        Connection conn = database.getInstance().returnConnection();

        java.sql.Date date1 = java.sql.Date.valueOf(startDate);
        java.sql.Date date2 = java.sql.Date.valueOf(endDate);
        
        try {
            String query = "SELECT COUNT(\'" + item + "\') FROM orders WHERE orderdate BETWEEN" + date1 + "and" + date2 + ";";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            totalOrders = rs.getInt("count"); //this line may or may not work

        } catch (SQLException ex) {
            Logger.getLogger(management.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String query = "SELECT price FROM item WHERE itemcode = \'" + item + "\';";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            price = rs.getDouble("price");

        } catch (SQLException ex) {
            Logger.getLogger(management.class.getName()).log(Level.SEVERE, null, ex);
        }

        totalRev = totalOrders * price;
        newTotalRev = totalOrders * newPrice;
        diff = newTotalRev - totalRev;
        return diff;
    }
}