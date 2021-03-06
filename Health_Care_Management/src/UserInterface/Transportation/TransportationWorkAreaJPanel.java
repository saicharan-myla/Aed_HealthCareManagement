/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Transportation;

import Code.Account;
import Code.EcoSystem;
import Code.Organization.Organization;
import Code.WorkQueue.TransportationWorkRequest;
import Code.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saich
 */
public class TransportationWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransportationWorkAreaJPanel
     */
 JPanel upperConatiner;
private Account acc;
private Organization org;
private EcoSystem eco;

    public TransportationWorkAreaJPanel(JPanel upperConatiner,Account acc, Organization org, EcoSystem eco) {
        initComponents();
      this.upperConatiner = upperConatiner;
      this.acc = acc;
     this.org = org;
     this.eco = eco;
   populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btnprocessreq = new javax.swing.JButton();
        mainlbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workreqTble = new javax.swing.JTable();
        BtnRef = new javax.swing.JButton();
        BTNB = new javax.swing.JButton();
        BTnA = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        Btnprocessreq.setText("Process request");
        Btnprocessreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnprocessreqActionPerformed(evt);
            }
        });

        mainlbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mainlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/transport.png"))); // NOI18N
        mainlbl.setText("TRANSPORTATION WORK AREA");

        workreqTble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Name", "Sender", "Status", "Message", "Haste"
            }
        ));
        jScrollPane1.setViewportView(workreqTble);

        BtnRef.setText("Refresh");
        BtnRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefActionPerformed(evt);
            }
        });

        BTNB.setText("<< Back");
        BTNB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBActionPerformed(evt);
            }
        });

        BTnA.setText("Assign");
        BTnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTnAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(mainlbl))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(BTNB)
                        .addGap(43, 43, 43)
                        .addComponent(BTnA)
                        .addGap(51, 51, 51)
                        .addComponent(BtnRef, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(Btnprocessreq)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNB)
                    .addComponent(BTnA)
                    .addComponent(BtnRef)
                    .addComponent(Btnprocessreq))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnprocessreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnprocessreqActionPerformed
        // TODO add your handling code here:
        int selectedRow = workreqTble.getSelectedRow();
        if (selectedRow < 0){JOptionPane.showMessageDialog(null, "Please select a row!");
}TransportationWorkRequest request = (TransportationWorkRequest)workreqTble.getValueAt(selectedRow, 0);
request.setStatus("Processing");
CardLayout layout = (CardLayout) upperConatiner.getLayout();
upperConatiner.add("ProcessRequest", new UserInterface.Transportation.ProcessRequestJPanel(upperConatiner,request));
layout.next(upperConatiner);
    }//GEN-LAST:event_BtnprocessreqActionPerformed

    private void BtnRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefActionPerformed
        populateTable();
    }//GEN-LAST:event_BtnRefActionPerformed

    private void BTNBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBActionPerformed
        upperConatiner.remove(this);
        CardLayout layout = (CardLayout) upperConatiner.getLayout();
        layout.previous(upperConatiner);
    }//GEN-LAST:event_BTNBActionPerformed

    private void BTnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTnAActionPerformed
        int selectedRow = workreqTble.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        TransportationWorkRequest request = (TransportationWorkRequest)workreqTble.getValueAt(selectedRow, 0);
        request.setReceiver(acc);
        request.setStatus("Assigned");
    }//GEN-LAST:event_BTnAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNB;
    private javax.swing.JButton BTnA;
    private javax.swing.JButton BtnRef;
    private javax.swing.JButton Btnprocessreq;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mainlbl;
    private javax.swing.JTable workreqTble;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      DefaultTableModel model = (DefaultTableModel)workreqTble.getModel();
        model.setRowCount(0);
        for(WorkRequest request : org.getWQ().getWorkRequestList()){
            Object[] row = new Object[7];
            row[0] = ((TransportationWorkRequest) request);
            row[1] = request.getSender().getEmp().getEName();
            row[2] = ((TransportationWorkRequest) request).getEquipmentinfo();
            row[3] = ((TransportationWorkRequest) request). getHospitalName();
            row[4] = ((TransportationWorkRequest) request). getUrgency();
            row[5] = request.getStatus();
            row[6] = request.getRequestDate();
            model.addRow(row);
        }
      
    }
}
