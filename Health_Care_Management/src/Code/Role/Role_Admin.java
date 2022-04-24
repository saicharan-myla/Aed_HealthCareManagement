/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Role;

import Code.EnterPrise;
import Code.Network;
import Code.Organization.Organization;
import javax.swing.JPanel;

/**
 *
 * @author pridh
 */
public class Role_Admin extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EnterPrise enterprise, EcoSystem business,Network network) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    @Override
    public String toString() {
        return "Admin Role";
    }
}
