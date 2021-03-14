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
 *
 * @author ryanomalley
 */
public final class orderTableController {
    public static int PAGELENGTH = 30;
    
    /** 
     * Queries the database for the most order item then updates the labels
     * within the given JFrame to display that information.
     * 
     * @param frame the current order JFrame object
     * @see JFrame
     */
    public static void handleItemTrends(Orders frame){
        Connection conn = database.getInstance().returnConnection();
        String trendingItemQuery = "SELECT *\n" + "FROM \"order count\"\n" + "WHERE ordercount = (SELECT MAX(ordercount) FROM \"order count\");";
        /* Wrapped in Try/Catch statement due to IDE warning */
        String trendingItemCode = "";
        String trendingItemCount = "";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(trendingItemQuery);

            while (rs.next()) {
                trendingItemCode = rs.getString("itemcode");
                trendingItemCount = rs.getString("ordercount");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        String worstItemQuery = "SELECT *\n" + "FROM \"order count\"\n" + "WHERE ordercount = (SELECT MIN(ordercount) FROM \"order count\");";
        /* Wrapped in Try/Catch statement due to IDE warning */
        String worstItemCode = "";
        String worstItemCount = "";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(worstItemQuery);

            while (rs.next()) {
                worstItemCode = rs.getString("itemcode");
                worstItemCount = rs.getString("ordercount");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //Grab menu item names from the map
        if(menuModel.items.size() == 0){
            menuModel.refreshMenu();
        }
        String trendingItemName = menuModel.items.get(trendingItemCode).itemName;
        String worstItemName = menuModel.items.get(worstItemCode).itemName;   
        


        
        //Updates the label text to display trends on screen
        frame.trendingItemName.setText(trendingItemName);
        frame.trendingItemCount.setText(trendingItemCount + " sales");
        frame.worstItemName.setText(worstItemName);
        frame.worstItemCount.setText(worstItemCount + " sales");
    }
    /**
     * 
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
    
    public static ArrayList<orderModel> searchOrder(String text){
        String query = "SELECT * from orders where orderid LIKE '%" + text + "%' LIMIT " + PAGELENGTH + ";";
        ArrayList<orderModel> result = new ArrayList<>();
        Connection conn = database.getInstance().returnConnection();
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String orderID = rs.getString("orderid");
                String customerID = rs.getString("customerid");
                String orderDate = rs.getString("orderdate");
                String itemCode = rs.getString("itemcode");
                result.add(new orderModel(orderID, customerID, orderDate, itemCode));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    
    public static ArrayList<orderModel> grabOrders(int offset){
        database db = database.getInstance();
        Connection conn = db.returnConnection();
        ArrayList<orderModel> orders = new ArrayList<>();
        
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
                orders.add(new orderModel(orderID, customerID, orderDate, itemCode));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        
        return orders;
    }
    
    public static void clearTable(DefaultTableModel orderTable){
        int rowCount = orderTable.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            orderTable.removeRow(i);
        }
    }
    
    public static void updateTable(DefaultTableModel orderTable, ArrayList<orderModel> data){
        clearTable(orderTable);
        for(int i = 0; i < PAGELENGTH && i < data.size(); ++i){
            orderTable.addRow((new Object[]{data.get(i).orderID, data.get(i).customerID, data.get(i).orderDate, data.get(i).itemCode}));
        }
    }
    public static void refreshOrders(DefaultTableModel orderTable, int offset){
        clearTable(orderTable);
        ArrayList<orderModel> orderList = grabOrders(offset);
        for(int i = 0; i < orderList.size(); ++i){
            orderTable.addRow((new Object[]{orderList.get(i).orderID, orderList.get(i).customerID, orderList.get(i).orderDate, orderList.get(i).itemCode}));
        }
    }
}
