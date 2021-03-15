
package com.group11.whatapos.controller;

import com.group11.whatapos.model.database;
import com.group11.whatapos.view.*;
import javax.swing.JOptionPane;

public final class viewController {
    private static Customers customerView = null;
    private static Menu menuView = null;
    private static Orders ordersView = null;
    private static Checkout checkoutView = null;
    
    public viewController(){
        menuView = new Menu();
        customerView = new Customers();
        ordersView = new Orders();
        checkoutView = new Checkout();
        
        menuView.runFrame();
    }
    
    public static void closeAllFrames(){
        customerView.closeFrame();
        ordersView.closeFrame();
        menuView.closeFrame();
    }
    
    public static void changeToCustomerView(){
        customerView.runFrame();
        
        //Close other frames
        ordersView.closeFrame();
        menuView.closeFrame();
    }
    
    public static void changeToMenuView(){
        menuView.runFrame();
        
        //Close other frames
        customerView.closeFrame();
        ordersView.closeFrame();
    }
    
    public static void changeToOrdersView(){
        ordersView.runFrame();  
        
        //Close other frames
        customerView.closeFrame();
        menuView.closeFrame();
    }
    
    public static void changeToCheckoutView(){
        checkoutView.runFrame();  
        
        //Close other frames
        customerView.closeFrame();
        menuView.closeFrame();
    }
    
}
