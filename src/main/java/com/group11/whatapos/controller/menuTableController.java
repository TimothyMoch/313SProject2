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
 * @author ryanomalley
 */
public final class menuTableController {
    public static void clearTable(DefaultTableModel table){
        int rowCount = table.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            table.removeRow(i);
        }
    }
    
    public static void refreshTables(Menu frame){
        Map<Character, JTable> tables = new HashMap<>();
        //
        tables.put('E', frame.entreesTable);
        tables.put('S', frame.sideTable);
        tables.put('B', frame.drinkTable);
        tables.put('D', frame.desertTable);
        
        for(var table : tables.entrySet()){
            char category = table.getKey();
            DefaultTableModel model = (DefaultTableModel) table.getValue().getModel();
            populateTable(model, category);
            ButtonColumn buttonColumn = new ButtonColumn(table.getValue(), null, 3);
        }
        /*DefaultTableModel entreeTable = (DefaultTableModel) frame.entreesTable.getModel();
        clearTable(entreeTable);
        populateTable(entreeTable, 'E');
        
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
     * 
     * @param frame The menu frame in the project
     */
    private static void populateTable(DefaultTableModel table, char category){
        
        // Grab items from database if menuModel is blank
        if(menuModel.items.size() == 0){
            menuModel.refreshMenu();
        }
        
        for(itemModel item: menuModel.items.values()){
            if(item.itemCat == category){
                table.addRow(new Object[]{item.itemCode, item.itemName, item.price, "Add to Order"});
            }
        }
    }
    
}
