/*
 * Copyright (C) 2021 Timot
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

import com.group11.whatapos.model.database;
import com.group11.whatapos.model.management;
import static com.group11.whatapos.model.management.conn;
import com.group11.whatapos.view.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Timot
 */

//**********************************************//

public final class managerController {
    
    public static void changePrice(String item, double newPrice){
        try {
            String query = "UPDATE item SET price = " + newPrice + "WHERE itemcode = \'" + item + "\';";
            Statement stmt = conn.createStatement();
            stmt.executeQuery(query);

        } catch (SQLException ex) {
            Logger.getLogger(management.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static double getRevenueDiff(String item, double newPrice, String startDate, String endDate){
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
    
    public static void addItemtoMenu(String itemCode, String itemName, double price){
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
}
