/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Doctor;

import Code.Account;
import Code.DocPrescription;
import Code.EnterPrise;
import Code.Organization.Organization;
import Code.Organization.Organization_Doctor;
import Code.Organization.Organization_Pharmacy;
import Code.PrescriptionList;
import Code.WorkQueue.DoctorWorkRequest;
import Code.WorkQueue.PharmacyWorkRequest;
import Code.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saich
 */
public class PrescriptionJPanel extends javax.swing.JPanel {
private PrescriptionList prescribedlist;
private Organization_Doctor doctororg;
private EnterPrise enter;
private JPanel uppercontainer;
private DocPrescription docpres;
private DoctorWorkRequest docreq;
private Account ua;



    /**
     * Creates new form PrescriptionJPanel
     */
    public PrescriptionJPanel(
JPanel upperContainer, PrescriptionList prescribedList, Account ua
, EnterPrise enter, Organization_Doctor doctororg) {



        initComponents();
this.uppercontainer = upperContainer;
this.ua = ua;
this.enter = enter;
this.doctororg = doctororg;


populateWorkReqTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        medicationLbl = new javax.swing.JLabel();
        headerLbl = new javax.swing.JLabel();
        medicationCmbBox = new javax.swing.JComboBox<>();
        nameLbl = new javax.swing.JLabel();
        timesLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        timesSpin = new javax.swing.JSpinner();
        ageLbl = new javax.swing.JLabel();
        forLbl = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        forSpin = new javax.swing.JSpinner();
        sexLbl = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        sexCmbBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        diagnosisLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jScrollPane2.setViewportView(jTextField1);

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backBtn.setText("<<BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        medicationLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        medicationLbl.setText("Medication:");

        headerLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(0, 102, 102));
        headerLbl.setText("Doctor Prescription");

        medicationCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please selcet--", "Paracetomol", "Crocin", "Synthroid", "Crestor", "Ventolin", "Esomeprazole", "Insulin", "Infliximab", "Fluticasone", "Rusovastatin", "Januvia(diabetes)", "Lantus(diabetes)", "Abilify(psychosis, depression)", "Symbicort(asthma)", "Tamiflu(influenza)", "Cialis(erectile dysrunction)", "Viagra(erectile dysrunction)", "Suboxone(opiate addiction)", " " }));

        nameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLbl.setText("Name:");

        timesLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timesLbl.setText("Times a Day:");

        ageLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ageLbl.setText("Age:");

        forLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        forLbl.setText("For:");

        sexLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sexLbl.setText("Sex:");

        saveBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        saveBtn.setText("SAVE PRESCRIPTION");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        sexCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please selcet--", "Male", "Female" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medical Name", "Toatal Quantity", "Reciever"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        diagnosisLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diagnosisLbl.setText("Diagnosis:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(headerLbl)
                                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sexLbl)
                                        .addGap(65, 65, 65))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(diagnosisLbl)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(sexCmbBox, 0, 253, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(medicationLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(medicationCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(timesLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timesSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(forLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(forSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(663, 663, 663)
                        .addComponent(saveBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(headerLbl)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sexLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(sexCmbBox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(diagnosisLbl)
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medicationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medicationCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timesSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(saveBtn)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(backBtn)
                .addGap(665, 665, 665))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        uppercontainer.remove(this);
        CardLayout crd = (CardLayout) uppercontainer.getLayout();
        crd.previous(uppercontainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        DocPrescription p = new DocPrescription();

        p.setDiagnosis(jTextField1.getText());

        p.setDrug(medicationCmbBox.getSelectedItem().toString());

        p.setTotal_days((Integer) timesSpin.getValue());

        p.setFrequency_day((Integer) forSpin.getValue());
        p.setName_Netk(enter.getOrgName());
        String age = ageTxt.getText();
        boolean flag = true;
        try {
            Integer.parseInt(age);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Age should be an integer!");
            flag = false;
        }

        if (p.getDiagnosis().equals("")) {
            JOptionPane.showMessageDialog(null, " Diagnosis cannot be empty!");
            flag = false;
        } else if (nameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Patient name cannot be empty!");
            flag = false;

        }
        if (flag == true) {
            doctororg.addPrescription(p);

            PharmacyWorkRequest request = new PharmacyWorkRequest();

            request.setMedicationName(medicationCmbBox.getSelectedItem().toString());
            request.setQuantity(((Integer) timesSpin.getValue()) * ((Integer) forSpin.getValue()));
            request.setSender(ua);
            request.setStatus("Sent");

            JOptionPane.showMessageDialog(null, "Prescription added successfully");

            System.out.println("****" + enter.getOrgName());
            Organization org = null;

            for (Organization organization : enter.getOrgaDirectory().getOrganizations()) {
                if (organization instanceof Organization_Pharmacy) {
                    org = organization;
                    System.out.println("****" + org);
                    break;
                }
            }
            if (org != null) {

                org.getWQ().getWorkRequestList().add(request);
                ua.getWorkQueue().getWorkRequestList().add(request);
            }

            populateWorkReqTable();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel diagnosisLbl;
    private javax.swing.JLabel forLbl;
    private javax.swing.JSpinner forSpin;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> medicationCmbBox;
    private javax.swing.JLabel medicationLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox<String> sexCmbBox;
    private javax.swing.JLabel sexLbl;
    private javax.swing.JLabel timesLbl;
    private javax.swing.JSpinner timesSpin;
    // End of variables declaration//GEN-END:variables

    private void populateWorkReqTable() {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        System.out.println("+++++"+ ua.getWorkQueue());
    
     for (WorkRequest request : ua.getWorkQueue().getWorkRequestList()) {
            try {
            Object[] row = new Object[4];
            String medication = ((PharmacyWorkRequest) request).getMedicationName();
            System.out.println("****" + medication);
            row[0] = (PharmacyWorkRequest) request;
            int quantity = ((PharmacyWorkRequest) request).getQuantity();
            row[1] = quantity;
            row[2] = request.getReceiver();
            String result = request.getStatus();
            row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            catch (ClassCastException ignored) {System.out.println("eeror at adding row");}

        }
    }
}
