/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Transportation;

import Code.Account;
import Code.EcoSystem;
import Code.Organization.Organization;
import Code.WorkQueue.TransportationWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author saich
 */
public class ProcessRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessRequestJPanel
     */
    JPanel upperContainer;
    TransportationWorkRequest request;
private Account acc;
private Organization oga;
private EcoSystem eco;

    public ProcessRequestJPanel(JPanel upperContainer, TransportationWorkRequest request) {
        initComponents();
        this.upperContainer = upperContainer;
 this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etdLbl = new javax.swing.JLabel();
        Timecombox = new javax.swing.JComboBox<>();
        AMPMCmbBox = new javax.swing.JComboBox<>();
        vehiclenumLbl = new javax.swing.JLabel();
        JText1 = new javax.swing.JTextField();
        BtnBack = new javax.swing.JButton();
        BtnNotify = new javax.swing.JButton();
        trpaLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        etdLbl.setText("Expected Time Of Delivery :");

        Timecombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00" }));
        Timecombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimecomboxActionPerformed(evt);
            }
        });

        AMPMCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        vehiclenumLbl.setText("Vehicle Number:");

        JText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JText1ActionPerformed(evt);
            }
        });

        BtnBack.setText("<< Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnNotify.setText("Intimate Hospital through Mail");
        BtnNotify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNotifyActionPerformed(evt);
            }
        });

        trpaLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        trpaLbl.setText("TRANSPORT REQUEST PROCESS AREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vehiclenumLbl)
                            .addComponent(etdLbl)
                            .addComponent(BtnBack))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnNotify)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Timecombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AMPMCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(JText1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(trpaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(trpaLbl)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etdLbl)
                    .addComponent(Timecombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AMPMCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehiclenumLbl)
                    .addComponent(JText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(BtnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(BtnNotify)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TimecomboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimecomboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimecomboxActionPerformed

    private void JText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JText1ActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        upperContainer.remove(this);
        Component[] componentArray = upperContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TransportationWorkAreaJPanel twjp = (TransportationWorkAreaJPanel) component;
        twjp.populateTable();
        CardLayout layout = (CardLayout) upperContainer.getLayout();
        layout.previous(upperContainer);

    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnNotifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNotifyActionPerformed
        request.setTime(Timecombox.getSelectedItem().toString() +" "+ AMPMCmbBox.getSelectedItem().toString()+" "+"VehicleNumber" +JText1.getText());
        String[] to = {"saicharan6118@gmail.com"};
        sendMailToCommunityMember(to,
            "Alert from Transportation department",
            "The delivery details are for the equipment "+request.getEquipmentinfo()+" are" +request.getTime(),
            "doctortesting.test@gmail.com",
            "doctororganization");
        JOptionPane.showMessageDialog(null,"Email sent successfully");

    }//GEN-LAST:event_BtnNotifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AMPMCmbBox;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnNotify;
    private javax.swing.JTextField JText1;
    private javax.swing.JComboBox<String> Timecombox;
    private javax.swing.JLabel etdLbl;
    private javax.swing.JLabel trpaLbl;
    private javax.swing.JLabel vehiclenumLbl;
    // End of variables declaration//GEN-END:variables

    private void sendMailToCommunityMember(String[] to, String Matter, String texts, String from, String pwd) {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           String [] host = {"smtp@gmail.com"};
            Properties props = System.getProperties();
            props.put("mail.smtp.user", from);
            props.put("mail.smtp.port", 674);
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.startttls.enable", "true");
JOptionPane.showMessageDialog(this, "New notification from Transport Department");
     
    }
}
