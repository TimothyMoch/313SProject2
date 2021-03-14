package com.group11.whatapos.model;

import java.sql.*;
import java.util.*;

public class itemModel {
    public String itemName;
    public String itemCode;
    public char itemCat;
    public double price;
    public Connection conn;
    public ArrayList<String> allowedItemAttributes;

    public itemModel(String _itemCode){
        conn = database.getInstance().returnConnection();
        itemCode = _itemCode;
        itemCat = _itemCode.charAt(0);
        allowedItemAttributes = new ArrayList<String>();
        refreshItem();
    }

    /* Queries database for latest item details */
    public void refreshItem() {
        
        String query =  "SELECT * from item where itemcode = '" + itemCode + "';";

        /* Wrapped in Try/Catch statement due to IDE warning */
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                itemName = rs.getString("itemname");
                price = rs.getDouble("price");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        //begin this is for allowed item attributes
        query =  "SELECT * from \"allowed item attributes\" where itemcode = '" + itemCode + "';";

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                allowedItemAttributes.add(rs.getString("attributename"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void printItemDetails(){
        System.out.println("itemName: " + itemName);
        System.out.println("itemCode: " + itemCode);
        System.out.println("price: " + price);
    }

}