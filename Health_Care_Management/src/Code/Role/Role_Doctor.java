/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Role;

import javax.swing.JPanel;
import Code.Network;
import Code.Organization.Organization;
import Code.Organization.Organization_Doctor;

/**
 *
 * @author pridh
 */
public class Role_Doctor  extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new DoctorWorkAreaJPanel(userProcessContainer,account,(Organization_Doctor)organization,enterprise,business,network);
    }
    
    
    
    @Override
    public String toString() {
        return "Doctor Role";
    }
}
