/*
 * Copyright (C) 2021 ryanomalley
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.group11.whatapos.controller;

import com.group11.whatapos.model.*;
import com.group11.whatapos.view.*;
import java.sql.*;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 * Controller for the table on the Order Page
 * @author ryanomalley
 */
public final class orderTableController {
    public static int PAGELENGTH; //Updated via GUI
    
    /** 
     * Queries the database for the most order item then updates the labels
     * within the given JFrame to display that information.
     * 
     * @param frame the current order JFrame object
     * @see JFrame
     */
    public static void handleItemTrends(Orders frame){
        

        Connection conn = database.getInstance().returnConnection();
        String bestItemCode = "";
        String bestItemCount = "";
        String secondBestItemCode = "";
        String secondBestItemCount = "";
        
        String worstItemCode = "";
        String worstItemCount = "";
        String secondWorstItemCode = "";
        String secondWorstItemCount = "";
        
        /*                       *
        *   GRAB THE WORST ITEMS *
        *                        */   
        
        String query = "SELECT * from \"order count\" order by ordercount;";
        /* Wrapped in Try/Catch statement due to IDE warning */
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //Get the first two rows for worst items
            rs.next();
            worstItemCode = rs.getString("itemcode");
            worstItemCount = rs.getString("ordercount");
            //Advances to 2nd row for 2nd worst item
            rs.next();
            secondWorstItemCode = rs.getString("itemcode");
            secondWorstItemCount = rs.getString("ordercount");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        
        /*                      *
        *   GRAB THE BEST ITEMS *
        *                       */                      
        
        
        query = "SELECT * from \"order count\" order by ordercount DESC;";
        
        /* Wrapped in Try/Catch statement due to IDE warning */
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //Advances to first row for best item
            rs.next();
            bestItemCode = rs.getString("itemcode");
            bestItemCount = rs.getString("ordercount");
            //Advances to second row for 2nd best item
            rs.next();
            secondBestItemCode = rs.getString("itemcode");
            secondBestItemCount = rs.getString("ordercount");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        
        //Grab menu item names from the map
        
        menuModel.refreshMenu();
        
        
        // Get the itemnames from our menuModel
        
        // Uses the menuModel for itemNames to save time
        
        String bestItemName = menuModel.items.get(bestItemCode).itemName;
        String secondBestItemName = menuModel.items.get(secondBestItemCode).itemName;
        String worstItemName = menuModel.items.get(worstItemCode).itemName;
        String secondWorstItemName = menuModel.items.get(secondWorstItemCode).itemName;  
        //Updates the label text to display trends on screen
        frame.trendingItemName.setText(bestItemName);
        frame.trendingItemCount.setText(bestItemCount + " sales");
        frame.secondTrendingItemName.setText(secondBestItemName);
        frame.secondTrendingItemCount.setText(secondBestItemCount + " sales");
        
        frame.worstItemName.setText(worstItemName);
        frame.worstItemCount.setText(worstItemCount + " sales");
        frame.secondWorstItemName.setText(secondWorstItemName);
        frame.secondWorstItemCount.setText(secondWorstItemCount + " sales");
    }
    /**
     * Returns the number of rows within the order table on our database
     * @return numbers of rows within the order table
     */
    public static int numRows(){
            int numberRows = 0;
            database db = database.getInstance();
            Connection conn = db.returnConnection();
            String query = "SELECT COUNT(*) from orders;";
            /* Wrapped in Try/Catch statement due to IDE warning */
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    numberRows = rs.getInt("count");
                }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return numberRows;
    }
    /**
     * Searches for orders within the orderid column of the order table
     * @param text string to search for in the orderid column
     * @return list of orderModels of length PAGELENGTH
     */
    public static ArrayList<orderTableModel> searchOrder(String text){
        // Limit to PAGELENGTH to prevent waste
        String query = "SELECT * from orders where orderid LIKE '%" + text + "%' LIMIT " + PAGELENGTH + ";";
        ArrayList<orderTableModel> result = new ArrayList<>();
        Connection conn = database.getInstance().returnConnection();
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            // Add results to the list of OrderModels
            while (rs.next()) {
                String orderID = rs.getString("orderid");
                String customerID = rs.getString("customerid");
                String orderDate = rs.getString("orderdate");
                String itemCode = rs.getString("itemcode");
                result.add(new orderTableModel(orderID, customerID, orderDate, itemCode));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    
    /**
     * Grabs PAGELENGTH amount of orders from offset
     * @param offset offset to grab orders from
     * @return returns list of orderModels. PAGELENGTH amount of orderModels from offset
     */
    public static ArrayList<orderTableModel> grabOrders(int offset){
        database db = database.getInstance();
        Connection conn = db.returnConnection();
        ArrayList<orderTableModel> orders = new ArrayList<>();
        
        String query = "SELECT * FROM orders LIMIT " + PAGELENGTH + " OFFSET " + offset + ";";
        /* Wrapped in Try/Catch statement due to IDE warning */
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String orderID = rs.getString("orderid");
                String customerID = rs.getString("customerid");
                String orderDate = rs.getString("orderdate");
                String itemCode = rs.getString("itemcode");
                orders.add(new orderTableModel(orderID, customerID, orderDate, itemCode));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        
        return orders;
    }
    
    /**
     * Clears the order table
     * @param orderTable Table Model to clear
     */
    public static void clearTable(DefaultTableModel orderTable){
        int rowCount = orderTable.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            orderTable.removeRow(i);
        }
    }
    /**
     * Given a list of customers and the table, inserts customers as rows
     * @param customerTable Table model to insert rows into
     * @param data The customer models to insert into the table
     */
    public static void updateTable(DefaultTableModel orderTable, ArrayList<orderTableModel> data){
        clearTable(orderTable);
        for(int i = 0; i < PAGELENGTH && i < data.size(); ++i){
            orderTable.addRow((new Object[]{data.get(i).orderID, data.get(i).customerID, data.get(i).orderDate, data.get(i).itemCode}));
        }
    }
    /**
     * Updates the table based on the offset
     * @param orderTable Table model to insert rows into
     * @param offset Offset of models
     */  
    public static void refreshOrders(DefaultTableModel orderTable, int offset){
        clearTable(orderTable);
        ArrayList<orderTableModel> orderList = grabOrders(offset);
        for(int i = 0; i < orderList.size(); ++i){
            orderTable.addRow((new Object[]{orderList.get(i).orderID, orderList.get(i).customerID, orderList.get(i).orderDate, orderList.get(i).itemCode}));
        }
    }
}
