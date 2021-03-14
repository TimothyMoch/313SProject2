package com.group11.whatapos.model;

import java.sql.*;
import java.util.*;

public class menuModel {
    public static Map<String, itemModel> items;
    public static database db;
    
    public menuModel(database _db){
        db = _db;
        items = new HashMap<String, itemModel>();
        refreshMenu();
    }
    
    public void refreshMenu(){
        ArrayList<String> itemCodes = queryItemCodes();
        //Query all itemCodes
        
        //If item is not in map, add it and refresh all items
        for(int i = 0; i < itemCodes.size(); ++i){
            String currentItemCode = itemCodes.get(i);
            //Add item to map, since it does not exist
            if(!items.containsKey(currentItemCode)){
                items.put(currentItemCode, new itemModel(currentItemCode));
            }
            else{
                items.get(currentItemCode).refreshItem();
            }
        }
    }
    
    ArrayList<String> queryItemCodes(){
        ArrayList<String> itemCodes = new ArrayList<String>();
        Connection conn = db.returnConnection();
        String query =  "SELECT itemcode from item;";

        /* Wrapped in Try/Catch statement due to IDE warning */
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                itemCodes.add(rs.getString("itemcode"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return itemCodes;
    }
    public void printMenu(){
        if(!items.isEmpty()){
            for (Map.Entry<String,itemModel> item : items.entrySet()){
                item.getValue().printItemDetails();
            }           
        }
    }
}
