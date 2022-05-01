/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminWorkArea;

import Code.Directory_Address;
import Code.EcoSystem;
import Code.EnterPrise;
import Code.Network;
import com.sun.jndi.cosnaming.IiopUrl.Address;
import java.awt.CardLayout;
import java.awt.Component;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saich
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */

      private JPanel upperConatiner;
      private EcoSystem eco;
      private Directory_Address addresslist;
    public ManageEnterpriseJPanel(JPanel userContainer,EcoSystem eco) {
        initComponents();
        this.upperConatiner = userContainer;
        this.eco = eco;
        addresslist =new Directory_Address();
        populateTable();
        populateComboBox();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        networkLbl = new javax.swing.JLabel();
        CmbNetk = new javax.swing.JComboBox();
        enterprisetypeLbl = new javax.swing.JLabel();
        CombEnterprise = new javax.swing.JComboBox();
        nameLbl = new javax.swing.JLabel();
        textf1 = new javax.swing.JTextField();
        BtnBack = new javax.swing.JButton();
        BtnSubmit = new javax.swing.JButton();
        MainLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameTbl = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

        networkLbl.setText("Network:");

        CmbNetk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        enterprisetypeLbl.setText("Enterprise Type:");

        CombEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nameLbl.setText("Name:");

        textf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textf1ActionPerformed(evt);
            }
        });

        BtnBack.setText("<< Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnSubmit.setText("Submit");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });

        MainLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MainLabel.setText("Manage Enterprise");

        nameTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Network", "Type"
            }
        ));
        jScrollPane1.setViewportView(nameTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(452, 452, 452)
                                        .addComponent(networkLbl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(453, 453, 453)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(enterprisetypeLbl)
                                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(453, 453, 453)
                                .addComponent(BtnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CombEnterprise, 0, 137, Short.MAX_VALUE)
                                .addComponent(CmbNetk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textf1))
                            .addComponent(BtnSubmit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(MainLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(MainLabel)
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmbNetk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterprisetypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CombEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textf1ActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        upperConatiner.remove(this);
        Component[] cmpArray = upperConatiner.getComponents();
        Component component= cmpArray[cmpArray.length-1];
        SystemAdminWorkAreaJPanel sysAdmin = (SystemAdminWorkAreaJPanel) component;
        sysAdmin.populateTreewithData();
        CardLayout crd = (CardLayout) upperConatiner.getLayout();
        crd.previous(upperConatiner);// TODO add your handling code here:
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
        Network network = (Network) CmbNetk.getSelectedItem();
        EnterPrise.EntType type = (EnterPrise.EntType) CombEnterprise.getSelectedItem();
        System.out.println(CombEnterprise.getSelectedItem());
        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        String name = textf1.getText();
        for (EnterPrise e: network.getDirectoEnterpri().getEnterpList()) {
            if (e.getOrgName().equals(name)) {
                JOptionPane.showMessageDialog(this, "Enterprise name already exists.Please select a different name.");
                return;
            }
        }
        EnterPrise enterprise = network.getDirectoEnterpri().AddEnterPrise(name, type);
          Code.Address adr = addresslist.insertAddress();
// adr address doesnot hace setEnterprise
        adr.setName(textf1.getText());

        populateTable();        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JComboBox CmbNetk;
    private javax.swing.JComboBox CombEnterprise;
    private javax.swing.JLabel MainLabel;
    private javax.swing.JLabel enterprisetypeLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTable nameTbl;
    private javax.swing.JLabel networkLbl;
    private javax.swing.JTextField textf1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       DefaultTableModel model = (DefaultTableModel) nameTbl.getModel();
       model.setRowCount(0);
       for(Network ntw : eco.getNetworks()){
       for(EnterPrise ent : ntw.getDirectoEnterpri().getEnterpList()){
        Object[] row = new Object[4];
        row[0] = ent.getOrgName();
        row[1] = ntw.getNetwork_Name();
        row[2] = ent.getEnterprise_type().getValue();
        row[3] = ent.getZip();
        model.addRow(row);
    }
}
  
    }

    private void populateComboBox() {
    // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   CmbNetk.removeAllItems();
CombEnterprise.removeAllItems();
for(Network ntw : eco.getNetworks()){
    CmbNetk.addItem(ntw);
}
for (EnterPrise.EntType type : EnterPrise.EntType.values()){
    CombEnterprise.addItem(type);
}


    }







}
