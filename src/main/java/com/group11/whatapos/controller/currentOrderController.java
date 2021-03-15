/*
 * Copyright (C) 2021 Scott Carrion
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTable;
import javax.swing.JLabel;

/**
 *
 * @author Scott Carrion
 */
public final class currentOrderController {
    // There will only be one current order at a time, so it is static and publicly accessible through the currentOrderController
    public static orderModel currentOrder = new orderModel();
    
    public static void clearTable(DefaultTableModel table){
        int rowCount = table.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            table.removeRow(i);
        }
    }
    
    public static void refreshTable(Menu frame) {
        // Define callbacks for each button click    
        
        Action customizePressed = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
                JTable table = (JTable)e.getSource();
                int modelRow = Integer.valueOf( e.getActionCommand() );
                System.out.println("Customize clicked for item: " + table.getValueAt(modelRow, 0));
                
                viewController.changeToCustomizerView(table, modelRow);
            }
        };
        
        Action xPressed = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {               
                // Delete the row data from the table
                JTable table = (JTable)e.getSource();
                int modelRow = Integer.valueOf( e.getActionCommand() );
                ((DefaultTableModel)table.getModel()).removeRow(modelRow);
                
                // Then, delete the corresponding element from currentOrder.items
                currentOrder.items.remove(modelRow);
                
                System.out.println("Deleted row index " + modelRow);    
            }
        };
        
        
        // Iterate through all the tables on Menu Page
        JTable table = frame.currentOrderTable;
        //int lastColumn = table.getColumnCount() - 1;
        // Get the models for the populateTable() method
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        // Update the title of the title bar for the current order section, in case it changed
        frame.orderNum.setText("Your order ID: " + currentOrder.orderid);
        
        // Add items to the table
        clearTable(model);
        populateTable(model);
        
        // Set the 3rd, 5th, and 6th columns to buttons (-, +, and x)
        ButtonColumn customizeColumn = new ButtonColumn(table, customizePressed, 2);
        ButtonColumn xColumn = new ButtonColumn(table, xPressed, 3);
    }
    /**
     * 
     * @param frame The menu frame in the project
     */
    private static void populateTable(DefaultTableModel table) {
        System.out.println("Populating table...");
        
        // Add each item in currentOrder to the table
        for (int i = 0; i < currentOrder.items.size(); i++) {
            System.out.println("Rendering this item on order table:");
            currentOrder.items.get(i).printItemDetails();
            table.addRow(new Object[]{currentOrder.items.get(i).itemName, currentOrder.items.get(i).price, "Customize...", "X"});
        }
        
    }
    
    private static int numItemOccurrences(itemModel itemToCheck, ArrayList<itemModel> itemsToSearch) {
        // Look through itemsToSearch. Count how many times itemToCheck occurs in itemsToSearch
        // This works by checking the itemModels' item codes
        int numOccurrences = 0;
        for (int i = 0; i < itemsToSearch.size(); i++) {
            if (itemToCheck.itemCode.equals(itemsToSearch.get(i).itemCode)) {
                numOccurrences++;  // Increment if item codes are the same
            }
        }
        
        return numOccurrences;
    }
    
}
