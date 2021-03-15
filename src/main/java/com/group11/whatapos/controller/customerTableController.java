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
 * Controller for the table within the Customer page
 * @author ryanomalley
 */
public final class customerTableController {
    // The length of pages for Pagination
    public static int PAGELENGTH; //This value is updated from GUI
    
    /**
     * Grabs the number of rows in the customer table
     * @return number of rows in the customer table
     */
    public static int numRows(){
        int numberRows = 0;
        database db = database.getInstance();
        Connection conn = db.returnConnection();
        
        String query = "SELECT COUNT(*) from customers;";
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
     * Searches for a string within the customers table, including all fields
     * @param text Search text
     * @return Based on the page size, returns top matches to string
     */
    public static ArrayList<customerModel> searchCustomer(String text){
        // The limit is the page size because that's all you'll display anyways
        // More would be a waste of computation
        String query = "SELECT * from customers where CONCAT(customers.customerfirstname, ' ' ,customers.customerlastname) LIKE '%" + text.toUpperCase() + "%' or customers.customerid LIKE '%" + text.toLowerCase() + "%' LIMIT " + PAGELENGTH + ";";
        ArrayList<customerModel> result = new ArrayList<>();
        Connection conn = database.getInstance().returnConnection();
        // Execute the query
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                // Add the results to an ArrayList of CustomerModels
                String customerName = rs.getString("customerfirstname") + " " + rs.getString("customerlastname");
                String customerId = rs.getString("customerid");
                result.add(new customerModel(customerName, customerId));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    
    /**
     * Grabs PAGELENGTH customers from the database, takes in an offset
     * @param offset offset to query from
     * @return ArrayList of customerModels for the page
     */
    public static ArrayList<customerModel> grabCustomers(int offset){
        database db = database.getInstance();
        Connection conn = db.returnConnection();
        ArrayList<customerModel> customers = new ArrayList<>();
        
        String query = "SELECT * FROM customers LIMIT " + PAGELENGTH + " OFFSET " + offset + ";";
        /* Wrapped in Try/Catch statement due to IDE warning */
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String customerName = rs.getString("customerfirstname") + " " + rs.getString("customerlastname");
                String customerId = rs.getString("customerid");
                customers.add(new customerModel(customerName, customerId));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        
        return customers;
    }
    
    /**
     * Loops through and removes all rows in the given table model
     * @param customerTable table model of the customer table
     */
    public static void clearTable(DefaultTableModel customerTable){
        int rowCount = customerTable.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            customerTable.removeRow(i);
        }
    }
    
    /**
     * Given a list of customers and the table, inserts customers as rows
     * @param customerTable Table model to insert rows into
     * @param data The customer models to insert into the table
     */
    public static void updateTable(DefaultTableModel customerTable, ArrayList<customerModel> data){
        clearTable(customerTable);
        for(int i = 0; i < PAGELENGTH && i < data.size(); ++i){
            customerTable.addRow((new Object[]{data.get(i).name,data.get(i).customerId}));
        }
    }
    /**
     * Updates the table based on the offset
     * @param customerTable Table model to insert rows into
     * @param offset Offset of models
     */
    public static void refreshCustomers(DefaultTableModel customerTable, int offset){
        clearTable(customerTable);
        // Grabs customers based on offset (AKA pagination)
        ArrayList<customerModel> customerList = grabCustomers(offset);
        for(int i = 0; i < customerList.size(); ++i){
            customerTable.addRow((new Object[]{customerList.get(i).name,customerList.get(i).customerId}));
        }
    }
}
