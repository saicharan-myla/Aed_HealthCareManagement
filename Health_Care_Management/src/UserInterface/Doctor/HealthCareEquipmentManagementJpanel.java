/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Doctor;

import Code.Account;
import Code.DocPrescription;
import Code.EcoSystem;
import Code.EnterPrise;
import Code.MedicalEquipPantryEnterPrise;
import Code.Network;
import Code.Organization.Organization;
import Code.Organization.Organization_Doctor;
import Code.Organization.Organization_EquipmentHandling;
import Code.PrescriptionList;
import Code.WorkQueue.DoctorWorkRequest;
import Code.WorkQueue.HealthcareEquipmentWorkRequest;
import Code.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saich
 */
public class HealthCareEquipmentManagementJpanel extends javax.swing.JPanel {

    private DocPrescription docpres;
    private DoctorWorkRequest docreq;
    private EnterPrise enter;
    private Account acc;
    private JPanel upperContainer;
    private Organization_Doctor doctorOrg;
    private PrescriptionList p_list;
    private EcoSystem eco;
    private Network ntk;
    private EnterPrise.EntType enttpe;
    private Organization_EquipmentHandling eqhandle;
    private MedicalEquipPantryEnterPrise medenter;

    /**
     * Creates new form HealthCareEquipmentManagementJpanel
     */
    public HealthCareEquipmentManagementJpanel(JPanel upperContainer, Account acc, Organization_Doctor doctorOrg, EnterPrise enter, EcoSystem eco, Network ntk) {
        initComponents();
        this.upperContainer = upperContainer;
        this.acc = acc;
        this.enter = enter;
        this.doctorOrg = doctorOrg;
        this.ntk = ntk;
        this.eco = eco;

        populateWorkTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        tblMedEq = new javax.swing.JTable();
        lblUrgency = new javax.swing.JLabel();
        cmbUrgency = new javax.swing.JComboBox();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JSpinner();
        btnBack = new javax.swing.JButton();
        btnReq = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        lblMedEq = new javax.swing.JLabel();
        cmbEq = new javax.swing.JComboBox();
        btnRef = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        tblMedEq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICAL EQUIPMENT", "MESSAGE", "QUANTITY", "SENDER", "RECEIVER", "STATUS", "REQUEST DATE", "ACTUAL PRICE", "LOAN PRICE"
            }
        ));
        scrollPane.setViewportView(tblMedEq);

        lblUrgency.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUrgency.setText("URGENCY LEVEL:");

        cmbUrgency.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Please select--", "VERY CRITICAL(<2 HRS)", "MODERATE(<5 HRS)", "LOW PRIORITY(24 HRS)" }));
        cmbUrgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUrgencyActionPerformed(evt);
            }
        });

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantity.setText("QUANTITY:");

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnReq.setBackground(new java.awt.Color(153, 153, 153));
        btnReq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/request.png"))); // NOI18N
        btnReq.setText("Request");
        btnReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("REQUEST MEDICAL EQUIPMENT");

        lblMedEq.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMedEq.setText("MEDICAL EQUIPMENT:");

        cmbEq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Please Select--", "Oxygen Cylinder", "Pulse Oxymeter", "Stretcher", "Thermometer", "Stethescope", "Diabetes Machine", "COVID Testing Kits", "Syringes", "Blood pressure Kit", " " }));
        cmbEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEqActionPerformed(evt);
            }
        });

        btnRef.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRef.setText("Refresh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHeader)
                .addGap(100, 100, 100)
                .addComponent(btnRef)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedEq, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUrgency, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReq, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbUrgency, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                .addComponent(cmbEq, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(127, 127, 127)
                        .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRef, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedEq, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUrgency, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUrgency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnReq))
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbUrgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUrgencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUrgencyActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        upperContainer.remove(this);
        CardLayout layout = (CardLayout) upperContainer.getLayout();
        layout.previous(upperContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqActionPerformed
        HealthcareEquipmentWorkRequest request = new HealthcareEquipmentWorkRequest();
        request.setEquipmentName(cmbEq.getSelectedItem().toString());
        request.setSender(acc);
        request.setStatus("Sent");
        request.setUrgencyLevel(cmbUrgency.getSelectedItem().toString());

        request.setQuantity(Integer.parseInt(txtQuantity.getValue().toString()));

        Date date = new Date();
        int min = 20;
        int max = 40;
        Random rand = new Random();

        int n1 = rand.nextInt((max - min)) + 1;
        int n2 = rand.nextInt(10) + 1;

        request.setActualprice(n1);
        request.setHospitalName(enter.getOrgName());

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        request.setRequestDate(dateFormat.format(date));
        request.setLoanedprice(n2);
        Organization org = null;
        for (Organization organization : enter.getOrgaDirectory().getOrganizations()) {
            if (organization instanceof Organization_Doctor) {
                org = organization;
                System.out.println("****" + org);
                break;
            }
        }
        org.getWQ().getWorkRequestList().add(request);
        acc.getWorkQueue().getWorkRequestList().add(request);
        // equiporg.getWorkQueue().getWorkRequestList().add(request);
        System.out.println("****** " + org.getOrgName());
        System.out.println("******" + enter.getOrgName());
        System.out.println("**** " + ntk.getNetwork_Name());
        for (Network network : eco.getNetworks()) {

            if (ntk.getNetwork_Name().equals(this.ntk.getNetwork_Name())) {
                for (EnterPrise ent : ntk.getDirectoEnterpri().getEnterpList()) {
                    System.out.println("****" + ent.getOrgName());
                    System.out.println("******" + ent.getEnterprise_type());
                    for (Organization organization : ent.getOrgaDirectory().getOrganizations()) {
                        System.out.println("***** Organizatio Name:" + organization.getOrgName());
                        if (organization.getOrgName().equals("Equipment Organization")) {
                            System.out.println("True");
                            System.out.println("***** organization Name" + organization.getOrgName());
                            organization.getWQ().getWorkRequestList().add(request);
                        }
                    }
                }

            }
            acc.getWorkQueue().getWorkRequestList().add(request);
            populateWorkTable();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnReqActionPerformed

    private void cmbEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEqActionPerformed

    private void populateWorkTable() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        DefaultTableModel model = (DefaultTableModel) tblMedEq.getModel();

        model.setRowCount(0);
        for (WorkRequest request : doctorOrg.getWQ().getWorkRequestList()) {
            Object[] row = new Object[9];

            row[0] = ((HealthcareEquipmentWorkRequest) request);
            String urgencyLevel = ((HealthcareEquipmentWorkRequest) request).getUrgencyLevel();
            row[1] = urgencyLevel;
            int quantity = ((HealthcareEquipmentWorkRequest) request).getQuantity();
            row[2] = quantity;
            row[3] = request.getSender();
            row[4] = ((HealthcareEquipmentWorkRequest) request).getReceiver();
            row[5] = request.getStatus();

            String expectedArrivalTime = ((HealthcareEquipmentWorkRequest) request).getExpectedArrivalTime();

            row[6] = request.getRequestDate();
            row[7] = ((HealthcareEquipmentWorkRequest) request).getActualprice();
            row[8] = ((HealthcareEquipmentWorkRequest) request).getLoanedprice();

            model.addRow(row);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRef;
    private javax.swing.JButton btnReq;
    private javax.swing.JComboBox cmbEq;
    private javax.swing.JComboBox cmbUrgency;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMedEq;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblUrgency;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblMedEq;
    private javax.swing.JSpinner txtQuantity;
    // End of variables declaration//GEN-END:variables

}
