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
    public static ArrayList<String> grabCustomers(int numCustomers, int offset){
        database db = database.getInstance();
        Connection conn = db.returnConnection();
        ArrayList<String> customers = new ArrayList<String>();
        
        String query = "SELECT * FROM customers LIMIT " + numCustomers + " OFFSET " + offset + ";";
        /* Wrapped in Try/Catch statement due to IDE warning */
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String currCustomer = rs.getString("customerfirstname") + " " + rs.getString("customerlastname");
                
                customers.add(currCustomer);
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
    public static void refreshCustomers(DefaultTableModel customerTable){
        clearTable(customerTable);
        ArrayList<String> customerList = grabCustomers(30, 0);
        for(int i = 0; i < 30; ++i){
            customerTable.addRow((new Object[]{customerList.get(i)}));
        }
    }
    
    public static JTable createCustomerTable(){
        String[] columnNames = {"Name"};
        String[][] data = {{"Mary Lou"},{"John Smith"}};
        JTable customerTable = new JTable(data, columnNames);
        return customerTable;
    }
}
