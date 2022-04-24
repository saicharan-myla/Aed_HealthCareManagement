/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Role;

import Code.EnterPrise;
import javax.swing.JPanel;
import Code.Network;
import Code.Organization.Organization;

/**
 *
 * @author pridh
 */
public class Role_MedicalEquipment extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EnterPrise enterprise, EcoSystem business,Network network) {
        return new HealthcareEquipmentWorkAreaJPanel(userProcessContainer, business, account,  organization,network);
    }


    @Override
    public String toString() {
        return "Medical Equipment Role";
    }
}
