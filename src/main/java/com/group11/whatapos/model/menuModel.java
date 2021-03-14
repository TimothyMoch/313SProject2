package com.group11.whatapos.model;

import java.sql.*;
import java.util.*;

public class menuModel {
    public static Map<String, itemModel> items;
    public static database db;
    private static menuModel instance = new menuModel();
    
    public static menuModel getInstance(){
        return instance;
    }
    
    private menuModel(){
        db = database.getInstance();
        items = new HashMap<String, itemModel>();
        refreshMenu();
    }
    
    public static void refreshMenu(){
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
    
    private static ArrayList<String> queryItemCodes(){
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
}
