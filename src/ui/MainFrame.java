/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import model.Item;
import ui.ViewInventoryPanel;
import java.util.List;
/**
 *
 * @author Admin
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        InventoryPanel newItemPanel = new InventoryPanel(bottomPanel, this);
        this.inventoryPanel = newItemPanel;
        ViewInventoryPanel newViewPanel = new ViewInventoryPanel(new Item());
        this.viewInventoryPanel = newViewPanel;
        ItemPanel newInventoryPanel = new ItemPanel(bottomPanel, this);
        this.itemPanel = newInventoryPanel;
        
        bottomPanel.add(itemPanel);
        bottomPanel.add(inventoryPanel);
        bottomPanel.add(viewInventoryPanel);
        
    }
    
    public void setViewPanelListOfItems(List<Item> listOfItems) {
        //ViewInventoryPanel newViewPanel = new ViewInventoryPanel(new Item());
        this.viewInventoryPanel.setListOfItems(listOfItems);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        SplitPane = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        addItemButton = new javax.swing.JButton();
        viewInventoryButton = new javax.swing.JButton();
        updateInventoryButton = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 800));

        SplitPane.setDividerLocation(90);
        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topPanel.setBackground(new java.awt.Color(204, 204, 204));

        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        viewInventoryButton.setText("View Inventory");
        viewInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInventoryButtonActionPerformed(evt);
            }
        });

        updateInventoryButton.setText("Update Inventory");
        updateInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInventoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(addItemButton)
                .addGap(53, 53, 53)
                .addComponent(updateInventoryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(viewInventoryButton)
                .addGap(170, 170, 170))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addItemButton)
                    .addComponent(viewInventoryButton)
                    .addComponent(updateInventoryButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SplitPane.setTopComponent(topPanel);

        bottomPanel.setMinimumSize(new java.awt.Dimension(500, 500));
        bottomPanel.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(bottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed

        CardLayout layout = (CardLayout)bottomPanel.getLayout();
        layout.first(bottomPanel);
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void viewInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInventoryButtonActionPerformed
       
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.last(bottomPanel);
        this.viewInventoryPanel.refreshListOfItems();
    }//GEN-LAST:event_viewInventoryButtonActionPerformed

    private void updateInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInventoryButtonActionPerformed
        CardLayout layout = (CardLayout)bottomPanel.getLayout();
        layout.first(bottomPanel);
        layout.next(bottomPanel);
        this.inventoryPanel.refreshListOfItems();
    }//GEN-LAST:event_updateInventoryButtonActionPerformed

    public void enableViewButton() {
        //this.viewInventoryButton.setEnabled(true);
    }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton addItemButton;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton updateInventoryButton;
    private javax.swing.JButton viewInventoryButton;
    // End of variables declaration//GEN-END:variables
    private InventoryPanel inventoryPanel;
    private ViewInventoryPanel viewInventoryPanel;
    private ItemPanel itemPanel;
    
    
}