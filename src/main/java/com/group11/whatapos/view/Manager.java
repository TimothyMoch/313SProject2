package com.group11.whatapos.view;

import com.group11.whatapos.controller.*;
import com.group11.whatapos.model.menuModel;
import java.awt.Dimension;
import java.awt.Toolkit;
/*
 * Copyright (C) 2021 Timot
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

/**
 *
 * @author Tim
 */
public class Manager extends javax.swing.JFrame {

    /**
     * Creates new form Manager
     */
    public Manager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        NameFeild1 = new javax.swing.JTextField();
        NameFeild2 = new javax.swing.JTextField();
        PriceChange1 = new javax.swing.JLabel();
        ChangePricePanel1 = new javax.swing.JPanel();
        PriceChangeLable1 = new javax.swing.JLabel();
        CodeFeildChanging1 = new javax.swing.JTextField();
        NewPriceFeild1 = new javax.swing.JTextField();
        ProfitLable1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        NewPriceFeild2 = new javax.swing.JTextField();
        leftBar = new javax.swing.JPanel();
        appLogo = new javax.swing.JLabel();
        customersPageBtn = new javax.swing.JButton();
        ordersPageBtn = new javax.swing.JButton();
        menuPageBtn = new javax.swing.JButton();
        ManagerPageButton = new javax.swing.JButton();
        MainContentPanel = new javax.swing.JPanel();
        AddItemPanel = new javax.swing.JPanel();
        CodeFeildAdding = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        NewItemLabel = new javax.swing.JLabel();
        NameFeild3 = new javax.swing.JTextField();
        ChangePricePanel = new javax.swing.JPanel();
        PriceChangeLable = new javax.swing.JLabel();
        CodeFeildChanging = new javax.swing.JTextField();
        NewPriceFeild = new javax.swing.JTextField();
        ProfitLable = new javax.swing.JLabel();
        StartDateFeild = new javax.swing.JTextField();
        EndDateFeild1 = new javax.swing.JTextField();
        ChangePricePanel3 = new javax.swing.JPanel();
        PriceChangeLable3 = new javax.swing.JLabel();
        CodeFeildAvailability = new javax.swing.JTextField();
        AvailabilityButton = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(50, 62, 90));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(50, 62, 90));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        NameFeild1.setText("New Item Name");
        NameFeild1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFeild1ActionPerformed(evt);
            }
        });

        NameFeild2.setText("New Item Name");
        NameFeild2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFeild2ActionPerformed(evt);
            }
        });

        PriceChange1.setForeground(new java.awt.Color(255, 119, 15));
        PriceChange1.setText("Change an item price:");
        PriceChange1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ChangePricePanel1.setBackground(new java.awt.Color(50, 62, 90));

        PriceChangeLable1.setForeground(new java.awt.Color(255, 119, 15));
        PriceChangeLable1.setText("Change an item price:");
        PriceChangeLable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CodeFeildChanging1.setText("ItemCode");
        CodeFeildChanging1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeFeildChanging1ActionPerformed(evt);
            }
        });

        NewPriceFeild1.setText("NewPrice");
        NewPriceFeild1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPriceFeild1ActionPerformed(evt);
            }
        });

        ProfitLable1.setForeground(new java.awt.Color(240, 240, 240));
        ProfitLable1.setText("Expected profit, 1 week extrapolation:");
        ProfitLable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        javax.swing.GroupLayout ChangePricePanel1Layout = new javax.swing.GroupLayout(ChangePricePanel1);
        ChangePricePanel1.setLayout(ChangePricePanel1Layout);
        ChangePricePanel1Layout.setHorizontalGroup(
            ChangePricePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePricePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChangePricePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PriceChangeLable1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(CodeFeildChanging1))
                .addGap(18, 18, 18)
                .addComponent(NewPriceFeild1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(ProfitLable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ChangePricePanel1Layout.setVerticalGroup(
            ChangePricePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePricePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChangePricePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChangePricePanel1Layout.createSequentialGroup()
                        .addComponent(PriceChangeLable1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChangePricePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NewPriceFeild1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodeFeildChanging1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ProfitLable1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(3, 13, 36));
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Add Item");

        jMenu1.setText("jMenu1");

        NewPriceFeild2.setText("NewPrice");
        NewPriceFeild2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPriceFeild2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftBar.setBackground(new java.awt.Color(3, 13, 36));

        customersPageBtn.setBackground(new java.awt.Color(3, 13, 36));
        customersPageBtn.setForeground(new java.awt.Color(255, 255, 255));
        customersPageBtn.setText("Customers");
        customersPageBtn.setToolTipText("");
        customersPageBtn.setBorder(null);
        customersPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersPageBtnActionPerformed(evt);
            }
        });

        ordersPageBtn.setBackground(new java.awt.Color(3, 13, 36));
        ordersPageBtn.setForeground(new java.awt.Color(255, 255, 255));
        ordersPageBtn.setText("Orders & Trends");
        ordersPageBtn.setToolTipText("");
        ordersPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersPageBtnActionPerformed(evt);
            }
        });

        menuPageBtn.setBackground(new java.awt.Color(3, 13, 36));
        menuPageBtn.setForeground(new java.awt.Color(250, 250, 250));
        menuPageBtn.setText("Menu");
        menuPageBtn.setToolTipText("");
        menuPageBtn.setBorder(null);
        menuPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPageBtnActionPerformed(evt);
            }
        });

        ManagerPageButton.setBackground(new java.awt.Color(3, 13, 36));
        ManagerPageButton.setForeground(new java.awt.Color(255, 119, 15));
        ManagerPageButton.setText("Management");
        ManagerPageButton.setToolTipText("");
        ManagerPageButton.setBorder(null);
        ManagerPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerPageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftBarLayout = new javax.swing.GroupLayout(leftBar);
        leftBar.setLayout(leftBarLayout);
        leftBarLayout.setHorizontalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarLayout.createSequentialGroup()
                .addGroup(leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftBarLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(appLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addComponent(ordersPageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customersPageBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPageBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManagerPageButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftBarLayout.setVerticalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(appLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(menuPageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customersPageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordersPageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManagerPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainContentPanel.setBackground(new java.awt.Color(30, 42, 70));

        AddItemPanel.setBackground(new java.awt.Color(50, 62, 90));

        CodeFeildAdding.setText("ItemCode");
        CodeFeildAdding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeFeildAddingActionPerformed(evt);
            }
        });

        jTextField2.setText("New Item Price");

        jButton1.setBackground(new java.awt.Color(3, 13, 36));
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Add Item");

        NewItemLabel.setForeground(new java.awt.Color(255, 119, 15));
        NewItemLabel.setText("Add a new item:");
        NewItemLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NameFeild3.setText("New Item Name");
        NameFeild3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFeild3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddItemPanelLayout = new javax.swing.GroupLayout(AddItemPanel);
        AddItemPanel.setLayout(AddItemPanelLayout);
        AddItemPanelLayout.setHorizontalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddItemPanelLayout.createSequentialGroup()
                        .addComponent(NewItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AddItemPanelLayout.createSequentialGroup()
                        .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddItemPanelLayout.createSequentialGroup()
                                .addComponent(NameFeild3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2))
                            .addComponent(CodeFeildAdding))
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        AddItemPanelLayout.setVerticalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddItemPanelLayout.createSequentialGroup()
                        .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameFeild3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CodeFeildAdding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        ChangePricePanel.setBackground(new java.awt.Color(50, 62, 90));

        PriceChangeLable.setForeground(new java.awt.Color(255, 119, 15));
        PriceChangeLable.setText("Change an item price:");
        PriceChangeLable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CodeFeildChanging.setText("ItemCode");
        CodeFeildChanging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeFeildChangingActionPerformed(evt);
            }
        });

        NewPriceFeild.setText("NewPrice");
        NewPriceFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPriceFeildActionPerformed(evt);
            }
        });

        ProfitLable.setForeground(new java.awt.Color(240, 240, 240));
        ProfitLable.setText("Expected profit, 1 week extrapolation:");
        ProfitLable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        StartDateFeild.setText("Start Date: yyyy/mm/dd");
        StartDateFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDateFeildActionPerformed(evt);
            }
        });

        EndDateFeild1.setText("End Date: yyyy/mm/dd");
        EndDateFeild1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndDateFeild1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChangePricePanelLayout = new javax.swing.GroupLayout(ChangePricePanel);
        ChangePricePanel.setLayout(ChangePricePanelLayout);
        ChangePricePanelLayout.setHorizontalGroup(
            ChangePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChangePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ChangePricePanelLayout.createSequentialGroup()
                        .addComponent(CodeFeildChanging, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewPriceFeild))
                    .addComponent(PriceChangeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChangePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartDateFeild, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(EndDateFeild1))
                .addGap(18, 18, 18)
                .addComponent(ProfitLable, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );
        ChangePricePanelLayout.setVerticalGroup(
            ChangePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChangePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ProfitLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ChangePricePanelLayout.createSequentialGroup()
                        .addGroup(ChangePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PriceChangeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StartDateFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChangePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NewPriceFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodeFeildChanging, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EndDateFeild1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ChangePricePanel3.setBackground(new java.awt.Color(50, 62, 90));

        PriceChangeLable3.setForeground(new java.awt.Color(255, 119, 15));
        PriceChangeLable3.setText("Enable/Disable Item in menu:");
        PriceChangeLable3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CodeFeildAvailability.setText("ItemCode");
        CodeFeildAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeFeildAvailabilityActionPerformed(evt);
            }
        });

        AvailabilityButton.setBackground(new java.awt.Color(3, 13, 36));
        AvailabilityButton.setForeground(new java.awt.Color(240, 240, 240));
        AvailabilityButton.setText("Enable/Disable Item");

        javax.swing.GroupLayout ChangePricePanel3Layout = new javax.swing.GroupLayout(ChangePricePanel3);
        ChangePricePanel3.setLayout(ChangePricePanel3Layout);
        ChangePricePanel3Layout.setHorizontalGroup(
            ChangePricePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePricePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChangePricePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PriceChangeLable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CodeFeildAvailability))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AvailabilityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ChangePricePanel3Layout.setVerticalGroup(
            ChangePricePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePricePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChangePricePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AvailabilityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ChangePricePanel3Layout.createSequentialGroup()
                        .addComponent(PriceChangeLable3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CodeFeildAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout MainContentPanelLayout = new javax.swing.GroupLayout(MainContentPanel);
        MainContentPanel.setLayout(MainContentPanelLayout);
        MainContentPanelLayout.setHorizontalGroup(
            MainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChangePricePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChangePricePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainContentPanelLayout.setVerticalGroup(
            MainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainContentPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(AddItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChangePricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChangePricePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customersPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersPageBtnActionPerformed
        viewController.changeToCustomerView();
    }//GEN-LAST:event_customersPageBtnActionPerformed

    private void ordersPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersPageBtnActionPerformed
        viewController.changeToOrdersView();
    }//GEN-LAST:event_ordersPageBtnActionPerformed

    private void menuPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPageBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPageBtnActionPerformed

    private void ManagerPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerPageButtonActionPerformed
        // TODO add your handling code here:
        viewController.changeToManagerView();
    }//GEN-LAST:event_ManagerPageButtonActionPerformed

    private void CodeFeildAddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodeFeildAddingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodeFeildAddingActionPerformed

    private void NameFeild1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFeild1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFeild1ActionPerformed

    private void NameFeild2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFeild2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFeild2ActionPerformed

    private void NameFeild3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFeild3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFeild3ActionPerformed

    private void CodeFeildChangingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodeFeildChangingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodeFeildChangingActionPerformed

    private void NewPriceFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPriceFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPriceFeildActionPerformed

    private void CodeFeildChanging1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodeFeildChanging1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodeFeildChanging1ActionPerformed

    private void NewPriceFeild1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPriceFeild1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPriceFeild1ActionPerformed

    private void CodeFeildAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodeFeildAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodeFeildAvailabilityActionPerformed

    private void NewPriceFeild2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPriceFeild2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPriceFeild2ActionPerformed

    private void StartDateFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDateFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartDateFeildActionPerformed

    private void EndDateFeild1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndDateFeild1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndDateFeild1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }
    public void closeFrame(){
        this.setVisible(false); //you can't see me!
        this.dispose(); //Destroy the JFrame object
    }
    public void runFrame(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        this.setVisible(true);
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddItemPanel;
    private javax.swing.JButton AvailabilityButton;
    private javax.swing.JPanel ChangePricePanel;
    private javax.swing.JPanel ChangePricePanel1;
    private javax.swing.JPanel ChangePricePanel3;
    private javax.swing.JTextField CodeFeildAdding;
    private javax.swing.JTextField CodeFeildAvailability;
    private javax.swing.JTextField CodeFeildChanging;
    private javax.swing.JTextField CodeFeildChanging1;
    private javax.swing.JTextField EndDateFeild1;
    private javax.swing.JPanel MainContentPanel;
    private javax.swing.JButton ManagerPageButton;
    private javax.swing.JTextField NameFeild1;
    private javax.swing.JTextField NameFeild2;
    private javax.swing.JTextField NameFeild3;
    private javax.swing.JLabel NewItemLabel;
    private javax.swing.JTextField NewPriceFeild;
    private javax.swing.JTextField NewPriceFeild1;
    private javax.swing.JTextField NewPriceFeild2;
    private javax.swing.JLabel PriceChange1;
    private javax.swing.JLabel PriceChangeLable;
    private javax.swing.JLabel PriceChangeLable1;
    private javax.swing.JLabel PriceChangeLable3;
    private javax.swing.JLabel ProfitLable;
    private javax.swing.JLabel ProfitLable1;
    private javax.swing.JTextField StartDateFeild;
    private javax.swing.JLabel appLogo;
    private javax.swing.JButton customersPageBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel leftBar;
    private javax.swing.JButton menuPageBtn;
    private javax.swing.JButton ordersPageBtn;
    // End of variables declaration//GEN-END:variables
}
