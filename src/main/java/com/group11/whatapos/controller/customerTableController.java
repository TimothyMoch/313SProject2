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
public final class customerTableController {
    public static int PAGELENGTH = 30;
    
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
    
    public static ArrayList<customerModel> searchCustomer(String text){
        String query = "SELECT * from customers where CONCAT(customers.customerfirstname, ' ' ,customers.customerlastname) LIKE '%" + text.toUpperCase() + "%' or customers.customerid LIKE '%" + text.toLowerCase() + "%' LIMIT " + PAGELENGTH + ";";
        ArrayList<customerModel> result = new ArrayList<>();
        Connection conn = database.getInstance().returnConnection();
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String customerName = rs.getString("customerfirstname") + " " + rs.getString("customerlastname");
                String customerId = rs.getString("customerid");
                result.add(new customerModel(customerName, customerId));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    
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
    
    public static void clearTable(DefaultTableModel customerTable){
        int rowCount = customerTable.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            customerTable.removeRow(i);
        }
    }
    
    public static void updateTable(DefaultTableModel customerTable, ArrayList<customerModel> data){
        clearTable(customerTable);
        for(int i = 0; i < PAGELENGTH && i < data.size(); ++i){
            customerTable.addRow((new Object[]{data.get(i).name,data.get(i).customerId}));
        }
    }
    public static void refreshCustomers(DefaultTableModel customerTable, int offset){
        clearTable(customerTable);
        ArrayList<customerModel> customerList = grabCustomers(offset);
        for(int i = 0; i < customerList.size(); ++i){
            customerTable.addRow((new Object[]{customerList.get(i).name,customerList.get(i).customerId}));
        }
    }
}
