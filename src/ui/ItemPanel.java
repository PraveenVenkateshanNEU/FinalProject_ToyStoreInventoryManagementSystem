/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.util.regex.*;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.awt.Image;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import model.Item;
import util.DatabaseConnector;
/**
 *
 * @author Admin
 */
public class ItemPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    private JPanel bottomPanel;
    private final MainFrame mainFrame;
    public ItemPanel(JPanel bottomPanel, MainFrame mainFrame) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.mainFrame = mainFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ActiveButtonGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        itemNameLabel = new javax.swing.JLabel();
        ManufacturerLabel = new javax.swing.JLabel();
        CategoryTypeLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        ItemNameTextField = new javax.swing.JTextField();
        ManufacturerTextField = new javax.swing.JTextField();
        categoryTypeComboBox = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        SKNLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        SKNTextField = new javax.swing.JTextField();
        activeLabel = new javax.swing.JLabel();
        YesRadioButton = new javax.swing.JRadioButton();
        NoRadioButton = new javax.swing.JRadioButton();
        WarrantyLabel = new javax.swing.JLabel();
        WarrantyTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(700, 700));

        titleLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Add Item");

        itemNameLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        itemNameLabel.setText("Item Name");

        ManufacturerLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        ManufacturerLabel.setText("Manufacturer");

        CategoryTypeLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        CategoryTypeLabel.setText("Category");

        genderLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        ItemNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNameTextFieldActionPerformed(evt);
            }
        });
        ItemNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ItemNameTextFieldKeyReleased(evt);
            }
        });

        ManufacturerTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ManufacturerTextFieldKeyReleased(evt);
            }
        });

        categoryTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronics", "Soft Toys", "Puzzles" }));
        categoryTypeComboBox.setSelectedIndex(-1);

        submitButton.setText("Save");
        submitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        submitButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        SKNLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        SKNLabel.setText("SKU Number");

        SKNTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SKNTextFieldKeyReleased(evt);
            }
        });

        activeLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        activeLabel.setText("Active");

        ActiveButtonGroup.add(YesRadioButton);
        YesRadioButton.setText("Yes");
        YesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesRadioButtonActionPerformed(evt);
            }
        });

        ActiveButtonGroup.add(NoRadioButton);
        NoRadioButton.setText("No");

        WarrantyLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        WarrantyLabel.setText("Warranty Duration");

        WarrantyTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                WarrantyTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(genderLabel)
                        .addGap(326, 326, 326))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ManufacturerLabel)
                                .addGap(31, 31, 31))
                            .addComponent(itemNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SKNLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoryTypeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(activeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WarrantyLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(YesRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NoRadioButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ManufacturerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ItemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SKNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoryTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WarrantyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
            .addGroup(layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(titleLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemNameLabel)
                            .addComponent(ItemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManufacturerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManufacturerLabel))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SKNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SKNLabel))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WarrantyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WarrantyLabel))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CategoryTypeLabel)
                            .addComponent(categoryTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(activeLabel)
                            .addComponent(YesRadioButton)
                            .addComponent(NoRadioButton))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(genderLabel)
                .addGap(210, 210, 210)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void ItemNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNameTextFieldActionPerformed
       
    }//GEN-LAST:event_ItemNameTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        Item newUser = new Item();
        
        try{
            newUser.setItemName(ItemNameTextField.getText());
            newUser.setManufacturer(ManufacturerTextField.getText());
            newUser.setSkuNo(SKNTextField.getText());
            newUser.setWarranty(WarrantyTextField.getText());
            newUser.setCategory(categoryTypeComboBox.getSelectedItem().toString());
            if (YesRadioButton.isSelected() == true) {
                newUser.setActive("Yes");
            } else if (NoRadioButton.isSelected() == true) {
                newUser.setActive("No");
            }
            DatabaseConnector.addUser(newUser);
            JOptionPane.showMessageDialog(null,"Item has been added!", "Successful entry", JOptionPane.PLAIN_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_submitButtonActionPerformed
    
    private void ItemNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemNameTextFieldKeyReleased
        
    }//GEN-LAST:event_ItemNameTextFieldKeyReleased

    private void ManufacturerTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ManufacturerTextFieldKeyReleased
       
    }//GEN-LAST:event_ManufacturerTextFieldKeyReleased

    private void SKNTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SKNTextFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_SKNTextFieldKeyReleased

    private void YesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YesRadioButtonActionPerformed

    private void WarrantyTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WarrantyTextFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_WarrantyTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ActiveButtonGroup;
    private javax.swing.JLabel CategoryTypeLabel;
    private javax.swing.JTextField ItemNameTextField;
    private javax.swing.JLabel ManufacturerLabel;
    private javax.swing.JTextField ManufacturerTextField;
    private javax.swing.JRadioButton NoRadioButton;
    private javax.swing.JLabel SKNLabel;
    private javax.swing.JTextField SKNTextField;
    private javax.swing.JLabel WarrantyLabel;
    private javax.swing.JTextField WarrantyTextField;
    private javax.swing.JRadioButton YesRadioButton;
    private javax.swing.JLabel activeLabel;
    private javax.swing.JComboBox<String> categoryTypeComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel itemNameLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
    String selectedImagePath;
}