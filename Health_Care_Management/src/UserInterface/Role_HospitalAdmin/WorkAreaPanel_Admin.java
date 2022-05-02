/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Role_HospitalAdmin;

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
    public WorkAreaPanel_Admin(JPanel panel, EnterPrise e) {
        initComponents();
        this.panel=panel;
        this.enterprise=e;
        lblVal.setText(enterprise.getOrgName());
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
        lblVal = new javax.swing.JLabel();
        lblEnt = new javax.swing.JLabel();
        btnOrgMng = new javax.swing.JButton();
        btnMngEmp = new javax.swing.JButton();
        BtnMngUsr = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Hospital Work Area - Administrative Role");

        lblVal.setText("<Value>");

        lblEnt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblEnt.setText("Enterprise : ");

        btnOrgMng.setBackground(new java.awt.Color(153, 153, 153));
        btnOrgMng.setText("Manage Organization");
        btnOrgMng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrgMngActionPerformed(evt);
            }
        });

        btnMngEmp.setBackground(new java.awt.Color(153, 153, 153));
        btnMngEmp.setText("Manage Employee");
        btnMngEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngEmpActionPerformed(evt);
            }
        });

        BtnMngUsr.setBackground(new java.awt.Color(153, 153, 153));
        BtnMngUsr.setText("Manage User");
        BtnMngUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMngUsrActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manage.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrgMng, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMngEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMngUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEnt)
                                .addGap(33, 33, 33)
                                .addComponent(lblVal)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnt)
                    .addComponent(lblVal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnOrgMng)
                        .addGap(53, 53, 53)
                        .addComponent(btnMngEmp)
                        .addGap(55, 55, 55)
                        .addComponent(BtnMngUsr))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrgMngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrgMngActionPerformed
        ManagePanel_Organization m = new ManagePanel_Organization(panel, enterprise.getOrgaDirectory());
        panel.add("managePanel_Organization", m);
        CardLayout layout = (CardLayout) panel.getLayout();
        layout.next(panel);
    }//GEN-LAST:event_btnOrgMngActionPerformed

    private void btnMngEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngEmpActionPerformed
        ManagePanel_Employee m = new ManagePanel_Employee(panel, enterprise.getOrgaDirectory());
        panel.add("managePanel_Employee", m);
        CardLayout lyt = (CardLayout) panel.getLayout();
        lyt.next(panel);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMngEmpActionPerformed

    private void BtnMngUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMngUsrActionPerformed
        ManagePanel_Account  m = new   ManagePanel_Account(panel, enterprise) ;
        panel.add("managePanel_Account",m);
        CardLayout cly = (CardLayout) panel.getLayout();
        cly.next(panel);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMngUsrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMngUsr;
    private javax.swing.JButton btnMngEmp;
    private javax.swing.JButton btnOrgMng;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEnt;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblVal;
    // End of variables declaration//GEN-END:variables
}
