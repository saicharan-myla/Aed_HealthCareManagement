/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.HealthCareEquipmentAdmin;

import Code.Employee;
import Code.Organization.Directory_Organization;
import Code.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saich
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeeJPanel
     */
private Directory_Organization organizationdir;
private JPanel uppercontainer;

    public ManageEmployeeJPanel(JPanel uppercontainer ,Directory_Organization organizationDir) {
        initComponents();
this.uppercontainer = uppercontainer;
this.organizationdir = organizationDir;
populateOrgComboBox();
populateOrgEmpBox();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        org1Lbl = new javax.swing.JLabel();
        cmbbox = new javax.swing.JComboBox();
        name = new javax.swing.JLabel();
        nametextfield = new javax.swing.JTextField();
        BtnBack = new javax.swing.JButton();
        BtnCreateEmployee = new javax.swing.JButton();
        MainLabel = new javax.swing.JLabel();
        orgLbl = new javax.swing.JLabel();
        orgCmbBox = new javax.swing.JComboBox();

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
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
        jScrollPane1.setViewportView(table1);

        org1Lbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        org1Lbl.setText("Organization :");

        cmbbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        name.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        name.setText(" Name             :");

        nametextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametextfieldActionPerformed(evt);
            }
        });

        BtnBack.setText("<< Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnCreateEmployee.setText("Create Employee");
        BtnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateEmployeeActionPerformed(evt);
            }
        });

        MainLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MainLabel.setForeground(new java.awt.Color(0, 102, 102));
        MainLabel.setText("Manage Employee");

        orgLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        orgLbl.setText("Organization :");

        orgCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgCmbBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(orgLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orgCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(448, 448, 448))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(org1Lbl)
                            .addComponent(name))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(359, 359, 359))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCreateEmployee))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MainLabel)
                        .addGap(392, 392, 392))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(MainLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgLbl)
                    .addComponent(orgCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(org1Lbl))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(nametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCreateEmployee))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nametextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametextfieldActionPerformed

    private void BtnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateEmployeeActionPerformed
        Organization organization = (Organization) cmbbox.getSelectedItem();
        String name = nametextfield.getText();
        organization.getEmpDir().AddEmployee(name);
        populateTable(organization);// TODO add your handling code here:
    }//GEN-LAST:event_BtnCreateEmployeeActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
 uppercontainer.remove(this);
        CardLayout layout = (CardLayout) uppercontainer.getLayout();
        layout.previous(uppercontainer);  

   
    

    }//GEN-LAST:event_BtnBackActionPerformed

    private void orgCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgCmbBoxActionPerformed
        // TODO add your handling code here:
Organization organization = (Organization) orgCmbBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        
    }

   
    }//GEN-LAST:event_orgCmbBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnCreateEmployee;
    private javax.swing.JLabel MainLabel;
    private javax.swing.JComboBox cmbbox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametextfield;
    private javax.swing.JLabel org1Lbl;
    private javax.swing.JComboBox orgCmbBox;
    private javax.swing.JLabel orgLbl;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables

    private void populateTable(Organization organization) {
       

 // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
DefaultTableModel model = (DefaultTableModel) table1.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmpDir().getE_List()){
            Object[] row = new Object[2];
            row[0] = employee.getEId();
            row[1] = employee.getEName();
            model.addRow(row);
        }
        


    }

    private void populateOrgComboBox() {
      // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
orgCmbBox.removeAllItems();
        
        for (Organization organization : organizationdir.getOrganizations()){
            orgCmbBox.addItem(organization);
        }
   
    }

    private void populateOrgEmpBox() {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        cmbbox.removeAllItems();
        
        for (Organization organization : organizationdir.getOrganizations()){
            cmbbox.addItem(organization);
        }
    }
}