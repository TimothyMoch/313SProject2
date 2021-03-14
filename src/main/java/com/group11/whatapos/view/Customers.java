/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group11.whatapos.view;
import com.group11.whatapos.controller.*;
import com.group11.whatapos.model.customerModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.Integer.parseInt;
import static java.lang.Math.ceil;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Timot
 */
public class Customers extends javax.swing.JFrame {
    class Pagination {
        public int currentPage;
        public int currentOffset;
        public int maxPages;
        public int pageSize;
        
        public Pagination(){
            currentPage = 0;
            currentOffset = 0;
            pageSize = customerTableController.PAGELENGTH;
            getMaxPages();
        }
        
        public int getMaxPages(){
            pageSize = customerTableController.PAGELENGTH;
            double numItems = customerTableController.numRows();
            maxPages = (int) ceil(numItems / pageSize) - 1;
            return maxPages;
        }
        
        public void updatePagination(Customers frame){
            pageSize = customerTableController.PAGELENGTH;
            frame.pagination_maxPages.setText("/" + valueOf(maxPages));
            frame.pagination_pageNum.setText(valueOf(currentPage));
            updateTable(frame);
        }
        
        public void backPage(Customers frame){
            if(currentPage != 0){
                currentPage--;
            }
            updatePagination(frame);            
        }
        
        public void nextPage(Customers frame){
            if(currentPage < maxPages){
                currentPage++;

            }
            updatePagination(frame);
        }
        
        public void goToPage(Customers frame){
            //Has to convert the text field to integer
            int goToPage = parseInt(frame.pagination_pageNum.getText());
            //Ensure that the requested page is within bounds
            if(goToPage >= 0 && goToPage <= maxPages){
                currentPage = goToPage;
            }
            //Updates anyways, because if it's not valid, we want the field to reset
            updatePagination(frame);
        }
        
        public void updateTable(Customers frame){
            int currentOffset = currentPage*pageSize;
            DefaultTableModel customerTable = (DefaultTableModel) frame.customerTable.getModel();
            customerTableController.refreshCustomers(customerTable, currentOffset);
        }
        
    }
    /**
     * Creates new form Customers
     */
    public Customers() {
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

        mainContainer = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        pagination_pageBack = new javax.swing.JButton();
        pagination_pageNum = new javax.swing.JTextField();
        pagination_pageNext = new javax.swing.JButton();
        pagination_goTo = new javax.swing.JButton();
        pagination_maxPages = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        itemsPerPage = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        leftBar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        mainContainer.setBackground(new java.awt.Color(30, 42, 70));

        searchField.setToolTipText("Search Customers");
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFieldKeyTyped(evt);
            }
        });

        customerTable.setAutoCreateRowSorter(true);
        customerTable.setBackground(new java.awt.Color(30, 42, 70));
        customerTable.setForeground(new java.awt.Color(255, 255, 255));
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Customer ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable.setRowHeight(32);
        customerTable.setRowMargin(4);
        customerTable.setSelectionBackground(new java.awt.Color(30, 42, 70));
        customerTable.setShowGrid(false);
        jScrollPane1.setViewportView(customerTable);

        pagination_pageBack.setText("<");
        pagination_pageBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagination_pageBackActionPerformed(evt);
            }
        });

        pagination_pageNum.setText("0");
        pagination_pageNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagination_pageNumActionPerformed(evt);
            }
        });

        pagination_pageNext.setText(">");
        pagination_pageNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagination_pageNextActionPerformed(evt);
            }
        });

        pagination_goTo.setText("Go To");
        pagination_goTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagination_goToActionPerformed(evt);
            }
        });

        pagination_maxPages.setForeground(new java.awt.Color(204, 204, 204));
        pagination_maxPages.setText("...");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Search for Customer");

        itemsPerPage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "50", "75", "100" }));
        itemsPerPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsPerPageActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Customers per Page");

        javax.swing.GroupLayout mainContainerLayout = new javax.swing.GroupLayout(mainContainer);
        mainContainer.setLayout(mainContainerLayout);
        mainContainerLayout.setHorizontalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContainerLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainContainerLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainContainerLayout.createSequentialGroup()
                        .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchField)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainContainerLayout.createSequentialGroup()
                                .addComponent(pagination_pageBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(pagination_pageNum, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pagination_maxPages)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pagination_goTo)
                                .addGap(8, 8, 8)
                                .addComponent(pagination_pageNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemsPerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );
        mainContainerLayout.setVerticalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContainerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pagination_pageBack)
                    .addComponent(pagination_pageNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagination_pageNext)
                    .addComponent(pagination_goTo)
                    .addComponent(pagination_maxPages)
                    .addComponent(itemsPerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leftBar.setBackground(new java.awt.Color(3, 13, 36));

        jLabel12.setIcon(new javax.swing.ImageIcon("/Users/ryanomalley/Documents/College/2020-2021/Spring 2021/CSCE 315/Project 2/313SProject2/src/main/images/logo.png")); // NOI18N

        Button5.setBackground(new java.awt.Color(3, 13, 36));
        Button5.setForeground(new java.awt.Color(255, 119, 15));
        Button5.setText("Customers");
        Button5.setToolTipText("");
        Button5.setBorder(null);
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setBackground(new java.awt.Color(3, 13, 36));
        Button6.setForeground(new java.awt.Color(255, 255, 255));
        Button6.setText("Orders");
        Button6.setToolTipText("");
        Button6.setBorder(null);
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button7.setBackground(new java.awt.Color(3, 13, 36));
        Button7.setForeground(new java.awt.Color(255, 255, 255));
        Button7.setText("Menu");
        Button7.setToolTipText("");
        Button7.setBorder(null);
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftBarLayout = new javax.swing.GroupLayout(leftBar);
        leftBar.setLayout(leftBarLayout);
        leftBarLayout.setHorizontalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarLayout.createSequentialGroup()
                .addGroup(leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftBarLayout.createSequentialGroup()
                        .addGroup(leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftBarLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(leftBarLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel8)))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addComponent(Button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftBarLayout.setVerticalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(44, 44, 44)
                .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(402, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        viewController.changeToOrdersView();
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        viewController.changeToMenuView();
    }//GEN-LAST:event_Button7ActionPerformed

    //Frame shown
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        customerTableController.PAGELENGTH = parseInt(itemsPerPage.getSelectedItem().toString());
        tablePagination = new Pagination();
        customerTableController.refreshCustomers(model, tablePagination.currentOffset);
        tablePagination.updatePagination(this);
    }//GEN-LAST:event_formComponentShown

    private void pagination_pageBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagination_pageBackActionPerformed
        tablePagination.backPage(this);
    }//GEN-LAST:event_pagination_pageBackActionPerformed

    private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
        // TODO add your handling code here:
        String text = searchField.getText();
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        //Reset
        if(text.length() == 0){
            customerTableController.refreshCustomers(model, tablePagination.currentOffset);
        }
        else {
            ArrayList<customerModel> searchResults = customerTableController.searchCustomer(text);
            customerTableController.updateTable(model, searchResults);
        }
    }//GEN-LAST:event_searchFieldKeyTyped

    private void pagination_pageNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagination_pageNextActionPerformed
        tablePagination.nextPage(this);
    }//GEN-LAST:event_pagination_pageNextActionPerformed

    private void pagination_goToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagination_goToActionPerformed
        // TODO add your handling code here:
        tablePagination.goToPage(this);
    }//GEN-LAST:event_pagination_goToActionPerformed

    private void itemsPerPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsPerPageActionPerformed
        customerTableController.PAGELENGTH = parseInt(itemsPerPage.getSelectedItem().toString());
        tablePagination.currentPage = 0;
        tablePagination.getMaxPages();
        tablePagination.updatePagination(this);
    }//GEN-LAST:event_itemsPerPageActionPerformed

    private void pagination_pageNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagination_pageNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagination_pageNumActionPerformed

    public void closeFrame(){
        this.setVisible(false); //you can't see me!
        this.dispose(); //Destroy the JFrame object
    }
    public void runFrame(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        this.setVisible(true);
    }
    
    private Pagination tablePagination;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Button5;
    public javax.swing.JButton Button6;
    public javax.swing.JButton Button7;
    public javax.swing.JTable customerTable;
    public javax.swing.JComboBox<String> itemsPerPage;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel leftBar;
    public javax.swing.JPanel mainContainer;
    public javax.swing.JButton pagination_goTo;
    public javax.swing.JLabel pagination_maxPages;
    public javax.swing.JButton pagination_pageBack;
    public javax.swing.JButton pagination_pageNext;
    public javax.swing.JTextField pagination_pageNum;
    public javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables

}
