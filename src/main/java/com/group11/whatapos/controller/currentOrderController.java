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
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTable;

/**
 *
 * @author Scott Carrion
 */
public final class currentOrderController {
    // There will only be one current order at a time, so it is static and publicly accessible through the currentOrderController
    public static orderModel currentOrder = new orderModel("DEBUG_CUSTOMERID");  // TODO: PUT ACTUAL CUSTOMER ID HERE LATER
    
    public static void clearTable(DefaultTableModel table){
        int rowCount = table.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            table.removeRow(i);
        }
    }
    
    public static void refreshTable(Menu frame) {
        // Define callbacks for each button click    
        Action minusPressed = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
                /*
                // This deletes row data
                JTable table = (JTable)e.getSource();
                int modelRow = Integer.valueOf( e.getActionCommand() );
                ((DefaultTableModel)table.getModel()).removeRow(modelRow);
                */
                System.out.println("Minus clicked!");
                //JTable table = (JTable)e.getSource();
                //int rowClicked = Integer.valueOf(e.getActionCommand());
                //System.out.println(table.getValueAt(rowClicked, 1));
            }
        };
        
        Action plusPressed = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
                /*
                // This deletes row data
                JTable table = (JTable)e.getSource();
                int modelRow = Integer.valueOf( e.getActionCommand() );
                ((DefaultTableModel)table.getModel()).removeRow(modelRow);
                */
                System.out.println("Plus clicked!");
                //JTable table = (JTable)e.getSource();
                //int rowClicked = Integer.valueOf(e.getActionCommand());
                //System.out.println(table.getValueAt(rowClicked, 1));
            }
        };
        
        Action xPressed = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
                /*
                // This deletes row data
                JTable table = (JTable)e.getSource();
                int modelRow = Integer.valueOf( e.getActionCommand() );
                ((DefaultTableModel)table.getModel()).removeRow(modelRow);
                */
                System.out.println("X clicked!");
                System.out.println("Testing interfacing with orderModel class...\nCurrent Customer ID is:");
                System.out.println(currentOrderController.currentOrder.customerid);
                // FIXME: WANT TO USE THIS BUT HOW? System.out.println(orderModel.customerid);
                //JTable table = (JTable)e.getSource();
                //int rowClicked = Integer.valueOf(e.getActionCommand());
                //System.out.println(table.getValueAt(rowClicked, 1));
            }
        };
        
        
        // Iterate through all the tables on Menu Page
        JTable table = frame.currentOrderTable;
        //int lastColumn = table.getColumnCount() - 1;
        // Get the models for the populateTable() method
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        // Add items to the table
        populateTable(model);
        
        // Set the 3rd, 5th, and 6th columns to buttons (-, +, and x)
        ButtonColumn minusColumn = new ButtonColumn(table, minusPressed, 2);
        ButtonColumn plusColumn = new ButtonColumn(table, plusPressed, 4);
        ButtonColumn xColumn = new ButtonColumn(table, xPressed, 5);
    }
    /**
     * 
     * @param frame The menu frame in the project
     */
    private static void populateTable(DefaultTableModel table) {
        table.addRow(new Object[]{"Patty Melt", "3.99", "-", "1", "+", "X"});
    }
    
}
