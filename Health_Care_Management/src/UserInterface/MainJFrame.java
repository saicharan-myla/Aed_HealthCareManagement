/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Code.Account;
import Code.DB4OUtil.DB4OUtil;
import Code.EcoSystem;
import Code.EnterPrise;
import Code.Network;
import Code.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pridh
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private EcoSystem eco;
    private Network net;
    private DB4OUtil db = DB4OUtil.getInstance();
    

    public MainJFrame() {
        initComponents();
        eco = db.retrieveSystem();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        loginPanel = new javax.swing.JPanel();
        lblImage1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblImage2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        fieldPassword = new javax.swing.JPasswordField();
        containerPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setDividerLocation(150);

        loginPanel.setBackground(new java.awt.Color(153, 153, 255));

        lblUsername.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lblUsername.setText("Username");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lblPassword.setText("Password");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsername)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldPassword))
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout)
                .addGap(12, 12, 12)
                .addComponent(lblImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(loginPanel);

        containerPanel.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(containerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String usr = txtUsername.getText();
        char[] arr = fieldPassword.getPassword();
        String pwd = String.valueOf(arr);

        Account acc = eco.getUserAccDir().validateAccount(usr, pwd);
        EnterPrise ent = null;
        Organization orgz = null;
        Network net = null;

        if (acc == null) {
            for (Network n : eco.getNetworks()) {
                for (EnterPrise e : n.getDirectoEnterpri().getEnterpList()) {
                    acc = e.getUserAccDir().validateAccount(usr, pwd);
                    if (acc == null) {
                        for (Organization org : e.getOrgaDirectory().getOrganizations()) {
                            acc = org.getUserAccDir().validateAccount(usr, pwd);
                            if (acc != null) {
                                net = n;
                                ent = e;
                                orgz = org;
                                System.out.println("***" + n.getNetwork_Name());
                                break;
                            }
                        }
                    } else {
                        ent = e;
                        break;

                    }
                    if (orgz != null) {
                        break;
                    }
                }
                if (ent != null) {
                    break;
                }
            }
        }
// TODO add your handling code here:
        if (acc != null) {
//error casting
            CardLayout layout = (CardLayout) containerPanel.getLayout();
            containerPanel.add(acc.getRole().toString() + "workArea", acc.getRole().createWorkArea(containerPanel, acc, orgz, ent, eco, net));
            layout.next(containerPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Credentials invalid");
            return;
        }
        lblUsername.setEnabled(false);
        btnLogin.setEnabled(false);
        lblPassword.setEnabled(false);
        btnLogout.setEnabled(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        btnLogout.setEnabled(false);
        txtUsername.setText("");
        fieldPassword.setText("");
        txtUsername.setEnabled(true);
        db.storeSystem(eco);
        btnLogin.setEnabled(true);
        containerPanel.removeAll();
        fieldPassword.setEnabled(true);
        JPanel p = new JPanel();
        containerPanel.add("blank", p);
        CardLayout layoutCard = (CardLayout) containerPanel.getLayout();
        layoutCard.next(containerPanel);
        db.storeSystem(eco);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JLabel lblImage1;
    private javax.swing.JLabel lblImage2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
