/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Role_Administration;

import Code.Employee;
import Code.Organization.Directory_Organization;
import Code.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pridh
 */
public class ManagePanel_Employee extends javax.swing.JPanel {
    
    private Directory_Organization od;
    private JPanel panel;

    /**
     * Creates new form ManagePanel_Employee
     */
    public ManagePanel_Employee() {
        initComponents();
        fillOrgCmb();
        fillOrgEmpCmb();
    }
    
    public void fillOrgCmb() {
        cmbOrg.removeAllItems();

        for (Organization organization : od.getOrganizations()) {
            cmbOrg.addItem(organization);
        }
    }

    public void fillOrgEmpCmb() {
        cmbOrg2.removeAllItems();

        for (Organization organization : od.getOrganizations()) {
            cmbOrg2.addItem(organization);
        }
    }
    
    private void fillTable(Organization o){
        DefaultTableModel m = (DefaultTableModel) tblEmployee.getModel();
        m.setRowCount(0);
        for (Employee employee : o.getEmpDir().getE_List()){
            Object[] r = new Object[2];
            r[0] = employee.getEId();
            r[1] = employee.getEName();
            m.addRow(r);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrganization = new javax.swing.JLabel();
        cmbOrg = new javax.swing.JComboBox();
        lblOrganization2 = new javax.swing.JLabel();
        cmbOrg2 = new javax.swing.JComboBox();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        lblHeading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrganization.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblOrganization.setText("Organization:");
        add(lblOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 151, -1));

        cmbOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgActionPerformed(evt);
            }
        });
        add(cmbOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 112, 168, 29));

        lblOrganization2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblOrganization2.setText("Organization");
        add(lblOrganization2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        cmbOrg2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrg2ActionPerformed(evt);
            }
        });
        add(cmbOrg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 440, 140, 29));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 143, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 110, 29));

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
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
        scrollPane.setViewportView(tblEmployee);

        add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 170, 600, 206));

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeading.setText("Manage Employee");
        add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 9, -1, -1));

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 581, 143, 70));

        btnCreate.setBackground(new java.awt.Color(153, 153, 153));
        btnCreate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnCreate.setText("Create Employee");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 581, 239, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgActionPerformed
        Organization organization = (Organization) cmbOrg.getSelectedItem();
        if (organization != null){
            fillTable(organization);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOrgActionPerformed

    private void cmbOrg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOrg2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        panel.remove(this);
        CardLayout l = (CardLayout) panel.getLayout();
        l.previous(panel);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        Organization org = (Organization) cmbOrg2.getSelectedItem();
        String name = txtName.getText();

        org.getEmpDir().AddEmployee(name);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox cmbOrg;
    private javax.swing.JComboBox cmbOrg2;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblOrganization2;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
