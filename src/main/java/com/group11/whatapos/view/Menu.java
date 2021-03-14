/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group11.whatapos.view;

// Importing other modules here
import com.group11.whatapos.controller.*;
import com.group11.whatapos.model.menuModel;
import java.awt.Dimension;
import java.awt.Toolkit;
/**
 *
 * @author Ryan
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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

        leftBar = new javax.swing.JPanel();
        appLogo = new javax.swing.JLabel();
        customersPageBtn = new javax.swing.JButton();
        ordersPageBtn = new javax.swing.JButton();
        menuPageBtn = new javax.swing.JButton();
        mainContent = new javax.swing.JPanel();
        searchBtn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        entreesTab = new javax.swing.JPanel();
        entreesContainer = new javax.swing.JScrollPane();
        entreesTable = new javax.swing.JTable();
        sideTab = new javax.swing.JPanel();
        sideContainer = new javax.swing.JScrollPane();
        sideTable = new javax.swing.JTable();
        drinkTab = new javax.swing.JPanel();
        drinkContainer = new javax.swing.JScrollPane();
        drinkTable = new javax.swing.JTable();
        desertTab = new javax.swing.JPanel();
        desertContainer = new javax.swing.JScrollPane();
        desertTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        refreshItems = new javax.swing.JButton();
        rightBar = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        orderNum = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        subtotalLabel = new javax.swing.JLabel();
        salesTaxLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        salesTax = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        orderSeperator = new javax.swing.JSeparator();
        checkoutBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        itemPic = new javax.swing.JLabel();
        itemName = new javax.swing.JLabel();
        incItemBtn = new javax.swing.JButton();
        decItemBtn = new javax.swing.JButton();
        itemCount = new javax.swing.JLabel();
        deleteItemBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentOrderTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 42, 70));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

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
        menuPageBtn.setForeground(new java.awt.Color(255, 119, 15));
        menuPageBtn.setText("Menu");
        menuPageBtn.setToolTipText("");
        menuPageBtn.setBorder(null);
        menuPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPageBtnActionPerformed(evt);
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
                    .addComponent(menuPageBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(517, Short.MAX_VALUE))
        );

        mainContent.setBackground(new java.awt.Color(30, 42, 70));

        searchBtn.setBackground(new java.awt.Color(255, 118, 15));
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(30, 42, 70));
        jTabbedPane1.setForeground(new java.awt.Color(30, 42, 70));
        jTabbedPane1.setToolTipText("");

        entreesTab.setBackground(new java.awt.Color(30, 42, 70));

        entreesTable.setBackground(new java.awt.Color(30, 42, 70));
        entreesTable.setForeground(new java.awt.Color(255, 255, 255));
        entreesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Item Price", "Add to Cart"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        entreesTable.setGridColor(new java.awt.Color(30, 42, 70));
        entreesTable.setRowHeight(32);
        entreesTable.setRowSelectionAllowed(false);
        entreesTable.setShowGrid(false);
        entreesTable.setShowHorizontalLines(true);
        entreesTable.setShowVerticalLines(true);
        entreesContainer.setViewportView(entreesTable);

        javax.swing.GroupLayout entreesTabLayout = new javax.swing.GroupLayout(entreesTab);
        entreesTab.setLayout(entreesTabLayout);
        entreesTabLayout.setHorizontalGroup(
            entreesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entreesTabLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(entreesContainer)
                .addGap(0, 0, 0))
        );
        entreesTabLayout.setVerticalGroup(
            entreesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entreesTabLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(entreesContainer)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Entrees", entreesTab);

        sideTab.setBackground(new java.awt.Color(30, 42, 70));

        sideTable.setBackground(new java.awt.Color(30, 42, 70));
        sideTable.setForeground(new java.awt.Color(255, 255, 255));
        sideTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Item Price", "Add to Cart"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        sideTable.setGridColor(new java.awt.Color(30, 42, 70));
        sideTable.setRowHeight(32);
        sideTable.setRowSelectionAllowed(false);
        sideTable.setShowGrid(false);
        sideTable.setShowHorizontalLines(true);
        sideTable.setShowVerticalLines(true);
        sideContainer.setViewportView(sideTable);

        javax.swing.GroupLayout sideTabLayout = new javax.swing.GroupLayout(sideTab);
        sideTab.setLayout(sideTabLayout);
        sideTabLayout.setHorizontalGroup(
            sideTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideTabLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sideContainer)
                .addGap(0, 0, 0))
        );
        sideTabLayout.setVerticalGroup(
            sideTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideTabLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(sideContainer)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Sides", sideTab);

        drinkTab.setBackground(new java.awt.Color(30, 42, 70));

        drinkTable.setBackground(new java.awt.Color(30, 42, 70));
        drinkTable.setForeground(new java.awt.Color(255, 255, 255));
        drinkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Item Price", "Add to Cart"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        drinkTable.setGridColor(new java.awt.Color(30, 42, 70));
        drinkTable.setRowHeight(32);
        drinkTable.setRowSelectionAllowed(false);
        drinkTable.setShowGrid(false);
        drinkTable.setShowHorizontalLines(true);
        drinkTable.setShowVerticalLines(true);
        drinkContainer.setViewportView(drinkTable);

        javax.swing.GroupLayout drinkTabLayout = new javax.swing.GroupLayout(drinkTab);
        drinkTab.setLayout(drinkTabLayout);
        drinkTabLayout.setHorizontalGroup(
            drinkTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drinkTabLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(drinkContainer)
                .addGap(0, 0, 0))
        );
        drinkTabLayout.setVerticalGroup(
            drinkTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drinkTabLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(drinkContainer)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Drinks", drinkTab);

        desertTab.setBackground(new java.awt.Color(30, 42, 70));

        desertTable.setBackground(new java.awt.Color(30, 42, 70));
        desertTable.setForeground(new java.awt.Color(255, 255, 255));
        desertTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Item Price", "Add to Cart"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        desertTable.setGridColor(new java.awt.Color(30, 42, 70));
        desertTable.setRowHeight(32);
        desertTable.setRowSelectionAllowed(false);
        desertTable.setShowGrid(false);
        desertTable.setShowHorizontalLines(true);
        desertTable.setShowVerticalLines(true);
        desertContainer.setViewportView(desertTable);

        javax.swing.GroupLayout desertTabLayout = new javax.swing.GroupLayout(desertTab);
        desertTab.setLayout(desertTabLayout);
        desertTabLayout.setHorizontalGroup(
            desertTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desertTabLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(desertContainer)
                .addGap(0, 0, 0))
        );
        desertTabLayout.setVerticalGroup(
            desertTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desertTabLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(desertContainer)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Desert", desertTab);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        refreshItems.setText("Refresh Items");
        refreshItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainContentLayout = new javax.swing.GroupLayout(mainContent);
        mainContent.setLayout(mainContentLayout);
        mainContentLayout.setHorizontalGroup(
            mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContentLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainContentLayout.createSequentialGroup()
                        .addComponent(searchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                    .addComponent(refreshItems))
                .addGap(36, 36, 36))
        );
        mainContentLayout.setVerticalGroup(
            mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refreshItems)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        rightBar.setBackground(new java.awt.Color(3, 13, 36));

        jPanel4.setBackground(new java.awt.Color(39, 49, 70));

        orderNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orderNum.setForeground(new java.awt.Color(255, 255, 255));
        orderNum.setText("Order #424");

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(orderNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 483, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(orderNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        subtotalLabel.setText("Subtotal");

        salesTaxLabel.setText("Sales Tax");

        totalLabel.setText("Total");

        subtotal.setText("jLabel5");

        salesTax.setText("jLabel6");

        total.setText("jLabel7");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderSeperator)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(subtotalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subtotal))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(totalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(salesTaxLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salesTax)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtotalLabel)
                    .addComponent(subtotal))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salesTaxLabel)
                    .addComponent(salesTax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(orderSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(total))
                .addGap(22, 22, 22))
        );

        checkoutBtn.setBackground(new java.awt.Color(255, 119, 15));
        checkoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkoutBtn.setText("Complete Order");

        jPanel2.setBackground(new java.awt.Color(30, 42, 70));

        itemPic.setText("jLabel14");

        itemName.setBackground(new java.awt.Color(30, 42, 70));
        itemName.setForeground(new java.awt.Color(255, 255, 255));
        itemName.setText("Patty Melt");

        incItemBtn.setBackground(new java.awt.Color(30, 42, 70));
        incItemBtn.setForeground(new java.awt.Color(255, 255, 255));
        incItemBtn.setText("+");
        incItemBtn.setBorder(null);

        decItemBtn.setBackground(new java.awt.Color(30, 42, 70));
        decItemBtn.setForeground(new java.awt.Color(255, 255, 255));
        decItemBtn.setText("-");
        decItemBtn.setBorder(null);
        decItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decItemBtnActionPerformed(evt);
            }
        });

        itemCount.setBackground(new java.awt.Color(30, 42, 70));
        itemCount.setForeground(new java.awt.Color(255, 255, 255));
        itemCount.setText("1");

        deleteItemBtn.setBackground(new java.awt.Color(30, 42, 70));
        deleteItemBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteItemBtn.setText("X");
        deleteItemBtn.setBorder(null);
        deleteItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(itemPic, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(itemName, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(103, 103, 103)
                .addComponent(decItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemCount, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(deleteItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(itemPic))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(incItemBtn)
                    .addComponent(decItemBtn)
                    .addComponent(itemCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteItemBtn))
                .addContainerGap())
        );

        currentOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Price", "-", "Quantity", "+", "X"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(currentOrderTable);

        javax.swing.GroupLayout rightBarLayout = new javax.swing.GroupLayout(rightBar);
        rightBar.setLayout(rightBarLayout);
        rightBarLayout.setHorizontalGroup(
            rightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightBarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(rightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkoutBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
            .addGroup(rightBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(36, 36, 36))
        );
        rightBarLayout.setVerticalGroup(
            rightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightBarLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(rightBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void customersPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersPageBtnActionPerformed
        viewController.changeToCustomerView();
    }//GEN-LAST:event_customersPageBtnActionPerformed

    private void ordersPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersPageBtnActionPerformed
        viewController.changeToOrdersView();
    }//GEN-LAST:event_ordersPageBtnActionPerformed

    private void menuPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPageBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPageBtnActionPerformed

    private void deleteItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteItemBtnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        menuTableController.refreshTables(this);
        currentOrderController.refreshTables(this);
    }//GEN-LAST:event_formComponentShown

    private void refreshItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshItemsActionPerformed
        // TODO add your handling code here:
        menuModel.refreshMenu();
        menuTableController.refreshTables(this);
    }//GEN-LAST:event_refreshItemsActionPerformed

    private void decItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decItemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decItemBtnActionPerformed
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
    public javax.swing.JLabel appLogo;
    public javax.swing.JButton checkoutBtn;
    public javax.swing.JTable currentOrderTable;
    public javax.swing.JButton customersPageBtn;
    public javax.swing.JButton decItemBtn;
    public javax.swing.JButton deleteItemBtn;
    public javax.swing.JScrollPane desertContainer;
    public javax.swing.JPanel desertTab;
    public javax.swing.JTable desertTable;
    public javax.swing.JScrollPane drinkContainer;
    public javax.swing.JPanel drinkTab;
    public javax.swing.JTable drinkTable;
    public javax.swing.JScrollPane entreesContainer;
    public javax.swing.JPanel entreesTab;
    public javax.swing.JTable entreesTable;
    public javax.swing.JButton incItemBtn;
    public javax.swing.JLabel itemCount;
    public javax.swing.JLabel itemName;
    public javax.swing.JLabel itemPic;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JPanel leftBar;
    public javax.swing.JPanel mainContent;
    public javax.swing.JButton menuPageBtn;
    public javax.swing.JLabel orderNum;
    public javax.swing.JSeparator orderSeperator;
    public javax.swing.JButton ordersPageBtn;
    public javax.swing.JButton refreshItems;
    public javax.swing.JPanel rightBar;
    public javax.swing.JLabel salesTax;
    public javax.swing.JLabel salesTaxLabel;
    public javax.swing.JButton searchBtn;
    public javax.swing.JScrollPane sideContainer;
    public javax.swing.JPanel sideTab;
    public javax.swing.JTable sideTable;
    public javax.swing.JLabel subtotal;
    public javax.swing.JLabel subtotalLabel;
    public javax.swing.JLabel total;
    public javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
