/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Role_Administration;

import Code.EnterPrise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pridh
 */
public class WorkAreaPanel_Admin extends javax.swing.JPanel {
    
    JPanel panel;
    EnterPrise enterprise;

    /**
     * Creates new form WorkAreaPanel_Admin
     */
    public WorkAreaPanel_Admin(JPanel p, EnterPrise e) {
        initComponents();
        this.panel=p;
        this.enterprise=e;
        lblValue.setText(e.getOrgName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        btnOrg = new javax.swing.JButton();
        btnEmp = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("My Work Area - Administrative Role");

        lblEnterprise.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEnterprise.setText("Enterprise:");

        lblValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblValue.setText("<value>");

        btnOrg.setBackground(new java.awt.Color(153, 153, 153));
        btnOrg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnOrg.setText("Manage Organization");
        btnOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrgActionPerformed(evt);
            }
        });

        btnEmp.setBackground(new java.awt.Color(153, 153, 153));
        btnEmp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEmp.setText("Manage Employee");
        btnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpActionPerformed(evt);
            }
        });

        btnUser.setBackground(new java.awt.Color(153, 153, 153));
        btnUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUser.setText("Manage User");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(345, 345, 345))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValue)
                    .addComponent(lblEnterprise))
                .addGap(51, 51, 51)
                .addComponent(btnOrg)
                .addGap(40, 40, 40)
                .addComponent(btnEmp)
                .addGap(38, 38, 38)
                .addComponent(btnUser)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 51, Short.MAX_VALUE)
                    .addComponent(lblHeader)
                    .addGap(0, 455, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrgActionPerformed
        UserInterface.Role_HospitalAdmin.ManagePanel_Organization manageOrganizationPanel = new UserInterface.Role_HospitalAdmin.ManagePanel_Organization(panel, enterprise.getOrgaDirectory());
        panel.add("manageOrganizationPanel", manageOrganizationPanel);
        CardLayout l = (CardLayout) panel.getLayout();
        l.next(panel);       // TODO add your handling code here:
    }//GEN-LAST:event_btnOrgActionPerformed

    private void btnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpActionPerformed
        UserInterface.Role_HospitalAdmin.ManagePanel_Employee manageEmployeePanel = new UserInterface.Role_HospitalAdmin.ManagePanel_Employee(panel, enterprise.getOrgaDirectory());
        panel.add("manageEmployeePanel", manageEmployeePanel);
        CardLayout l = (CardLayout) panel.getLayout();
        l.next(panel);        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        UserInterface.Role_HospitalAdmin.ManagePanel_Account  manageAccountPanel = new UserInterface.Role_HospitalAdmin.ManagePanel_Account(panel, enterprise);
        panel.add("manageAccountPanel",manageAccountPanel);
        CardLayout l = (CardLayout) panel.getLayout();
        l.next(panel);        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmp;
    private javax.swing.JButton btnOrg;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblValue;
    // End of variables declaration//GEN-END:variables
}
