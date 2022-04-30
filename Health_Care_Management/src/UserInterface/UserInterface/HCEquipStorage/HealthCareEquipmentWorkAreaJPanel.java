/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.UserInterface.HCEquipStorage;

import Code.Account;
import Code.EcoSystem;
import Code.EnterPrise;
import Code.Network;
import Code.Organization.Organization;
import Code.WorkQueue.HealthcareEquipmentWorkRequest;
import Code.WorkQueue.WorkRequest;
import Code.WorkQueue.TransportationWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saich
 */
public class HealthCareEquipmentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HealthCareEquipmentWorkAreaJPanel
     */

private JPanel upperContainer;
private EcoSystem eco;
private Account acc;
private Organization org ;
private Network ntk;
private Organization transportOrg;
private EnterPrise enter;
    public HealthCareEquipmentWorkAreaJPanel(JPanel uppercontainer,EcoSystem eco, Account acc,Organization org, Network ntk ) {
        initComponents();

   this.upperContainer = uppercontainer;
this.eco = eco;
this.acc = acc;
this.org = org;
this.ntk = ntk;
populateHealthCareReqTbl();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNAssignment = new javax.swing.JButton();
        Btnback = new javax.swing.JButton();
        ProcessRequestBTN = new javax.swing.JButton();
        ViewReqStatusBTn = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        MainLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        BTNAssignment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BTNAssignment.setText("ASSIGN TO ME");
        BTNAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAssignmentActionPerformed(evt);
            }
        });

        Btnback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btnback.setText("<<Back");
        Btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnbackActionPerformed(evt);
            }
        });

        ProcessRequestBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ProcessRequestBTN.setText("PROCESS REQUEST>>>");
        ProcessRequestBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessRequestBTNActionPerformed(evt);
            }
        });

        ViewReqStatusBTn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ViewReqStatusBTn.setText("VIEW REQUEST STATUS>>");
        ViewReqStatusBTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewReqStatusBTnActionPerformed(evt);
            }
        });

        BtnRefresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnRefresh.setText("Refresh");

        MainLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MainLbl.setForeground(new java.awt.Color(0, 102, 102));
        MainLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainLbl.setText("REQUESTS FROM HOSPITALS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EQUIPMENT NAME", "URGENCY LEVEL", "QUANTITY", "SENDER", "RECIEVER", "REQUEST SENT Y/N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(591, 591, 591)
                        .addComponent(MainLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(Btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(BTNAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(317, 317, 317)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ViewReqStatusBTn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProcessRequestBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ProcessRequestBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewReqStatusBTn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BTNAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAssignmentActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
        }

        HealthcareEquipmentWorkRequest request = (HealthcareEquipmentWorkRequest)jTable1.getValueAt(selectedRow, 0);
        request.setReceiver(acc);
        request.setStatus("Pending");
        request.setTransportrequestStatus("N");

        populateHealthCareReqTbl();        // TODO add your handling code here:
    }//GEN-LAST:event_BTNAssignmentActionPerformed

    private void BtnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnbackActionPerformed
        upperContainer.remove(this);
        CardLayout layout = (CardLayout) upperContainer.getLayout();
        layout.previous(upperContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnbackActionPerformed

    private void ProcessRequestBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessRequestBTNActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }

        HealthcareEquipmentWorkRequest request = (HealthcareEquipmentWorkRequest)jTable1.getValueAt(selectedRow, 0);
        System.out.println("hello");
        request.setStatus("Request sent to transport department for delivery");
        TransportationWorkRequest transportrequest=new TransportationWorkRequest();
        transportrequest=new TransportationWorkRequest();
     transportrequest.setSender(acc);

        transportrequest.setHospitalName(request.getHospitalName());

        transportrequest.setUrgency(request.getUrgencyLevel());
        transportrequest.setStatus("Sent");
        transportrequest.setEquipmentinfo(("Name: "+request.getEquipmentName())+","+ "Qauntity: " +( request.getQuantity()));
        request.setExpectedArrivalTime(request.getMessage());
        request.setTransportrequestStatus("Y");
        if(ntk.getNetwork_Name().equals(this.ntk.getNetwork_Name())){
            for(EnterPrise enterprise :ntk.getDirectoEnterpri().getEnterpList() ){
                System.out.println("****" +enterprise.getOrgName());
                System.out.println("******"+enterprise.getEnterprise_type());
                for(Organization organization:enterprise.getOrgaDirectory().getOrganizations()){
                    System.out.println("***** Organization Name:" +organization.getOrgName());
                    if(organization.getOrgName().equals("Transportation Organization")){
                        System.out.println("True");
                        System.out.println("***** organization Name"+organization.getOrgName());
                        JOptionPane.showMessageDialog(null, "A Notification has been sent to concerned Transport Department "
                            + "The request id is : "+transportrequest.getUniqueId());
                        int requestId=transportrequest.getUniqueId();
                        System.out.println("***" +requestId);
                        transportrequest.setRequestId(requestId);
                        acc.getWorkQueue().getWorkRequestList().add(transportrequest);
                        organization.getWQ().getWorkRequestList().add(transportrequest);

                    }

                }
            }

            CardLayout layout = (CardLayout) upperContainer.getLayout();
            upperContainer.add("ProcessRequest", new ViewTransportationRequestJPanel(upperContainer,acc));
            layout.next(upperContainer);

        }
        else{
            CardLayout layout = (CardLayout) upperContainer.getLayout();
            upperContainer.add("ProcessRequest", new ViewTransportationRequestJPanel(upperContainer,acc));
            layout.next(upperContainer);

        }
        // populateTransportWorkRequest();
        // TODO add your handling code here:
    }//GEN-LAST:event_ProcessRequestBTNActionPerformed

    private void ViewReqStatusBTnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewReqStatusBTnActionPerformed
        CardLayout layout = (CardLayout) upperContainer.getLayout();
        upperContainer.add("ProcessRequest", new ViewTransportationRequestJPanel(upperContainer,acc));
        layout.next(upperContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_ViewReqStatusBTnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAssignment;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JButton Btnback;
    private javax.swing.JLabel MainLbl;
    private javax.swing.JButton ProcessRequestBTN;
    private javax.swing.JButton ViewReqStatusBTn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void populateHealthCareReqTbl() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

      DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        System.out.println(org.getWQ().getWorkRequestList().size());
        for(WorkRequest request : org.getWQ().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0]=((HealthcareEquipmentWorkRequest) request);
            String urgencyLevel = ((HealthcareEquipmentWorkRequest) request).getUrgencyLevel();
            int quantity = ((HealthcareEquipmentWorkRequest) request).getQuantity();
            row[1] = urgencyLevel;
            row[2]=quantity;
            row[3]=request.getSender().getUsrnm();
            
            row[4]=request.getReceiver().getUsrnm();
            
            model.addRow(row);
        }
}
}




 /*public void populateTransportWorkRequest(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        Object row[]=new Object[4];
        for(WorkRequest request : acc.getWorkQueue().getWorkRequestList()){
            row[0]=((TransportationWorkRequest) request);
            row[1]=request.getReceiver();
            row[2]=request.getStatus();
            row[3]=((TransportationWorkRequest)request).getTime();
        }
        
    }
    }*/


