package com.group11.whatapos.model;

import java.sql.*;

public class itemModel {
    private String itemName;
    private String itemCode;
    private char itemCat;
    private double price;
    private Connection conn;

    public itemModel(String _itemCode){
        conn = database.getInstance().returnConnection();
        itemCode = _itemCode;
        itemCat = _itemCode.charAt(0);
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
    }

    public void printItemDetails(){
        System.out.println("itemName: " + itemName);
        System.out.println("itemCode: " + itemCode);
        System.out.println("price: " + price);
    }

}
