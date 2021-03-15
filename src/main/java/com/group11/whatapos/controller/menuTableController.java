
package com.group11.whatapos.controller;

import com.group11.whatapos.dependencies.ButtonColumn;
import com.group11.whatapos.view.*;
import com.group11.whatapos.model.*;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import javax.swing.table.TableCellRenderer;
import com.group11.whatapos.dependencies.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTable;


public final class menuTableController {
    /**
     * Clears the table of any rows
     * @param table Table Model to clear rows from
     */
    public static void clearTable(DefaultTableModel table){
        int rowCount = table.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            table.removeRow(i);
        }
    }
    /**
     * Refresh the data for the table of items on the menu page
     * @param frame The Menu page Jframe
     */
    public static void refreshTables(Menu frame){
        Map<Character, JTable> tables = new HashMap<>();
        // Stores all the tables on the Menu page
        tables.put('E', frame.entreesTable);
        tables.put('S', frame.sideTable);
        tables.put('B', frame.drinkTable);
        tables.put('D', frame.desertTable);
        
        // Iterate through all the tables on Menu Page
        for(var table : tables.entrySet()){
            int lastColumn = table.getValue().getColumnCount() - 1;
            // Grab the category
            char category = table.getKey();
            // Get the models for the populateTable() method
            DefaultTableModel model = (DefaultTableModel) table.getValue().getModel();
            // Clear the table of existing data
            clearTable(model);
            // Add items to the table
            populateTable(model, category);
            // Set the last column to button
            ButtonColumn buttonColumn = new ButtonColumn(table.getValue(), null, lastColumn);
        }
        /*
        
        // TODO:// Create an action for adding an item to the order!!!!!
        
        Action delete = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
                JTable table = (JTable)e.getSource();
                int modelRow = Integer.valueOf( e.getActionCommand() );
                ((DefaultTableModel)table.getModel()).removeRow(modelRow);
            }
        };

        ButtonColumn buttonColumn = new ButtonColumn(frame.entreesTable, delete, 3);
        buttonColumn.setMnemonic(KeyEvent.VK_D);*/
    }
    /**
     * Adds items to the given table and category
     * @param table The table model to add rows to
     * @param category The category of items to add
     */
    private static void populateTable(DefaultTableModel table, char category){
        
        // Grab items from database if menuModel is blank
        if(menuModel.items.size() == 0){
            menuModel.refreshMenu();
        }
        // Iterate through the menuModel items, if the category matches add to our table
        for(itemModel item: menuModel.items.values()){
            if(item.itemCat == category){
                // The last row is our button column, so give it the text we want for the button!
                table.addRow(new Object[]{item.itemCode, item.itemName, item.price, "Add to Order"});
            }
        }
    }
    
}
