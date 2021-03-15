
package com.group11.whatapos.main;

import com.group11.whatapos.model.*;
import com.group11.whatapos.view.*;
import com.group11.whatapos.controller.*;

public class Main {
    public static void main(String args[]){
        database db = database.getInstance();
        db.createConnection();
        menuModel menu = menuModel.getInstance();
        viewController view = new viewController();
    }
}
