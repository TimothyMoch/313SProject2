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

import com.group11.whatapos.model.database;
import com.group11.whatapos.view.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author ryanomalley
 */
public final class viewController {
    private static Customers customerView = null;
    private static Menu menuView = null;
    private static Orders ordersView = null;
    private static ItemCustomizer itemView = null;
    private static Manager managerView = null;
    
    public viewController(){
        menuView = new Menu();
        customerView = new Customers();
        ordersView = new Orders();
        itemView = new ItemCustomizer();        
        managerView = new Manager();
        menuView.runFrame();
    }
    
    public static void closeAllFrames(){
        customerView.closeFrame();
        ordersView.closeFrame();
        menuView.closeFrame();
        itemView.closeFrame();
        managerView.closeFrame();        
    }
    
    public static void changeToCustomerView(){
        customerView.runFrame();
        
        //Close other frames
        ordersView.closeFrame();
        menuView.closeFrame();
        itemView.closeFrame();
        managerView.closeFrame();
    }
    
    public static void changeToMenuView(){
        menuView.runFrame();
        
        //Close other frames
        customerView.closeFrame();
        ordersView.closeFrame();
        itemView.closeFrame();
        managerView.closeFrame();
    }
    
    public static void changeToOrdersView(){
        ordersView.runFrame();  
        
        //Close other frames
        customerView.closeFrame();
        menuView.closeFrame();
        itemView.closeFrame();
        managerView.closeFrame();
    }
    
    public static void changeToCustomizerView(JTable table, int row) {
        // Update the callingTable and callingTableRow so we display the right
        // info once we show the frame
        itemView.callingTable = table;
        itemView.callingTableRow = row;
        itemView.runFrame();
        
        // Close other frames, except for the menu frame
        customerView.closeFrame();
        ordersView.closeFrame();
        managerView.closeFrame();
    }
    
    public static void changeToManagerView(){
        managerView.runFrame();  
        
        //Close other frames
        customerView.closeFrame();
        menuView.closeFrame();
        ordersView.closeFrame();
    } 
}
