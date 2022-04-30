/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Role_Pharmacy;

import Code.Account;
import Code.DrugPantry;
import Code.DrugPantryList;
import Code.EnterPrise;
import Code.Network;
import Code.Organization.Organization;
import Code.Organization.Organization_Pharmacy;
import Code.WorkQueue.PharmacyWorkRequest;
import Code.WorkQueue.SupplierWorkRequest;
import Code.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pridh
 */
public class WorkAreaPanel_Pharmacy extends javax.swing.JPanel {

    private Network network;
    private Organization_Pharmacy op;
    private Organization orgz;
    private DrugPantryList dp;
    private EnterPrise enterprise;
    private Account acc;
    JPanel panel;

    /**
     * Creates new form WorkAreaPanel_Pharmacy
     */
    public WorkAreaPanel_Pharmacy(JPanel panel, Account acc, EnterPrise enterprise, Organization_Pharmacy op, Network network) {
        initComponents();
        this.op=(Organization_Pharmacy) orgz;
        this.panel=panel;
        this.network=network;
        this.enterprise=enterprise;
        this.dp= dp;
        this.acc=acc;
        arrangeRows();
        fillDocRows();
    }
    
    public void fillDocRows() {
        DefaultTableModel tab = (DefaultTableModel) tblDoc.getModel();
        tab.setRowCount(0);
        for (WorkRequest wr : op.getWQ().getWorkRequestList()) {
            Object[] o = new Object[4];
            String drug = ((PharmacyWorkRequest) wr).getMedicationName();
            System.out.println("****" + drug);
            o[0] = drug;
            int num = ((PharmacyWorkRequest) wr).getQuantity();
            o[1] = num;
            o[2] = ((PharmacyWorkRequest) wr).getStatus();
            tab.addRow(o);
        }
    }
    
    public void arrangeRows() {

        int rc = tblPharmacy.getRowCount();
        DefaultTableModel tbl = (DefaultTableModel) tblPharmacy.getModel();
        for (int i = rc - 1; i >= 0; i--) {
            tbl.removeRow(i);
        }
        for (DrugPantry dp : op.getDrugs()) {
            Object o[] = new Object[6];
            o[0] = dp;
            o[1] = dp.getSerialNo();
            o[2] = dp.getQuantitypresent();
            o[3] = dp.getQuantityneeded();
            o[4] = dp.getReorderQuantity();
            o[5] = dp.getReorderStatus();
            tbl.addRow(o);
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

        lblHeader = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        tblPharmacy = new javax.swing.JTable();
        btnStatus = new javax.swing.JButton();
        lblSerialNumber = new javax.swing.JLabel();
        lblMedicine = new javax.swing.JLabel();
        lblAvailableQuantity = new javax.swing.JLabel();
        lblReqQuantity = new javax.swing.JLabel();
        lblReorder = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        txtMedicine = new javax.swing.JTextField();
        txtAvailableQuantity = new javax.swing.JTextField();
        txtReqQuantity = new javax.swing.JTextField();
        txtReorder = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnAddMedicine = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        btnReqs = new javax.swing.JButton();
        btnViewReq = new javax.swing.JButton();
        lblDocTbl = new javax.swing.JLabel();
        scrollPane2 = new javax.swing.JScrollPane();
        tblDoc = new javax.swing.JTable();

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(0, 102, 102));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("PHARMACY MEDICINE INVENTORY LOG");

        tblPharmacy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "SERIAL NUMBER", "AVAILABLE QUANTITY", "REQUIRED QUANTITY", "REORDER LEVEL", "REORDER STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane.setViewportView(tblPharmacy);

        btnStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnStatus.setText("INVENTORY STATUS CHECK!");
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });

        lblSerialNumber.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblSerialNumber.setText("SERIAL NUMBER:");

        lblMedicine.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblMedicine.setText("MEDICNE NAME:");

        lblAvailableQuantity.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblAvailableQuantity.setText("AVAILABLE QUANTITY:");

        lblReqQuantity.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblReqQuantity.setText("REQUIRED QUANTITY:");

        lblReorder.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblReorder.setText("REORDER LEVEL:");

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddMedicine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddMedicine.setText("ADD MEDICINE");
        btnAddMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMedicineActionPerformed(evt);
            }
        });

        btnDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDetails.setText("VIEW DETAILS >>");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        btnReqs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReqs.setText("VIEW REQUESTS");
        btnReqs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqsActionPerformed(evt);
            }
        });

        btnViewReq.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViewReq.setText("VIEW REQUESTS FROM DOCTORS");

        lblDocTbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDocTbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocTbl.setText("View Requests from Doctor:");

        tblDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "QUANTITY", "STATUS"
            }
        ));
        scrollPane2.setViewportView(tblDoc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblReqQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblReorder, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(btnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtReqQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                            .addComponent(txtReorder, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                            .addComponent(btnAddMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnViewReq)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnReqs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblAvailableQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAvailableQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDocTbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblHeader)
                .addGap(18, 18, 18)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSerialNumber)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMedicine)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAvailableQuantity))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(txtAvailableQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReqs, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReqQuantity)
                            .addComponent(txtReqQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReorder)
                            .addComponent(txtReorder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnViewReq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnAddMedicine))
                .addGap(18, 18, 18)
                .addComponent(lblDocTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        for(DrugPantry dp : op.getDrugs()){

            if(dp.getQuantitypresent()<=dp.getReorderQuantity()){
                if(!dp.getReorderStatus().equals("Y")){
                    SupplierWorkRequest swr=new SupplierWorkRequest();

                    dp.setReorderStatus("Y");
                    swr.setMedicationName(dp.getDrugName());
                    swr.setQuantity(dp.getQuantityneeded());
                    swr.setSender(acc);

                    acc.getWorkQueue().getWorkRequestList().add(swr);
                    for(EnterPrise enterprise : network.getDirectoEnterpri().getEnterpList()){
                        System.out.println("***** Organization Name:" +enterprise.getOrgName());
                        for(Organization g : enterprise.getOrgaDirectory().getOrganizations()){
                            System.out.println("***** Organization Name:" +g.getOrgName());
                            if(g.getOrgName().equals("Supplier Organization")){
                                System.out.println("True");

                                System.out.println("***** organization Name"+g.getOrgName());

                                g.getWQ().getWorkRequestList().add(swr);
                            }
                        }

                    }

                }

            }
        }
        JOptionPane.showMessageDialog(null, "Status of inventory checked and updated!", "Warning", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_btnStatusActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        panel.remove(this);
        CardLayout layout = (CardLayout) panel.getLayout();
        layout.previous(panel);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicineActionPerformed
        DrugPantry dp=new DrugPantry();

        String pre=txtAvailableQuantity.getText();
        try{
            Integer.parseInt(pre);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Please provide valid data in Available Quantity");
            return;
        }
        dp.setDrugName(txtMedicine.getText());
        int qp= Integer.parseInt(txtAvailableQuantity.getText());
        dp.setQuantitypresent(qp);
        String sno=txtSerialNumber.getText();
        try{
            Integer.parseInt(sno);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Serial Number must be integer!");
            return;
        }
        int sn= Integer.parseInt(txtSerialNumber.getText());
        dp.setSerialNo(sn);
        String rc=txtReqQuantity.getText();
        try
        {
            Integer.parseInt(rc);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Required quantity must be integer!");
            return;
        }
        int rt= Integer.parseInt(txtReqQuantity.getText());
        dp.setQuantityneeded(rt);

        String ro=txtReorder.getText();
        try
        {
            Integer.parseInt(ro);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Reorder level must be integer!");
            return;
        }
        int rl= Integer.parseInt(txtReorder.getText());
        dp.setReorderQuantity(rl);
        op.addDrug(dp);
        dp.setReorderStatus("N");

        DefaultTableModel dtm =(DefaultTableModel) tblPharmacy.getModel();

        dtm.setRowCount(0);
        for(DrugPantry drp : op.getDrugs()){
            Object row[] = new Object[5];
            row[0] = drp;
            row[1] = drp.getSerialNo();
            row[2]= drp.getQuantitypresent();
            row[3]=drp.getQuantityneeded();
            row[4]= drp.getReorderQuantity();
            dtm.addRow(row);
        }

        JOptionPane.showMessageDialog(null, "Medicine Added Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMedicineActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        int val = tblPharmacy.getSelectedRow();
        if(val<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DrugPantry dp = (DrugPantry)tblPharmacy.getValueAt(val, 0);

        CardLayout c = (CardLayout) panel.getLayout();
        panel.add("UpdateEntryJPanel", new EntryPanel_Update(panel, acc, enterprise,dp));
        c.next(panel);        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnReqsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqsActionPerformed
        CardLayout c = (CardLayout) panel.getLayout();
        panel.add("ViewrequestJPanel", new RequestPanel_View( panel, acc, enterprise, orgz));
        c.next(panel);        // TODO add your handling code here:
    }//GEN-LAST:event_btnReqsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMedicine;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnReqs;
    private javax.swing.JButton btnStatus;
    private javax.swing.JButton btnViewReq;
    private javax.swing.JLabel lblAvailableQuantity;
    private javax.swing.JLabel lblDocTbl;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMedicine;
    private javax.swing.JLabel lblReorder;
    private javax.swing.JLabel lblReqQuantity;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JTable tblDoc;
    private javax.swing.JTable tblPharmacy;
    private javax.swing.JTextField txtAvailableQuantity;
    private javax.swing.JTextField txtMedicine;
    private javax.swing.JTextField txtReorder;
    private javax.swing.JTextField txtReqQuantity;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}