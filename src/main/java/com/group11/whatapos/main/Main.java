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
package com.group11.whatapos.main;

import com.group11.whatapos.model.*;
import com.group11.whatapos.view.*;
import com.group11.whatapos.controller.*;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import javax.swing.JOptionPane;


/**
 *
 * @author ryanomalley
 */
public class Main {
    public static void main(String args[]){
        database db = database.getInstance();
        db.createConnection();
        menuModel menu = menuModel.getInstance();
        viewController view = new viewController();
    }
}
