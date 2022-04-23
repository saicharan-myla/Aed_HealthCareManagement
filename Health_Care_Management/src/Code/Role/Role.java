/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Role;

import Code.Network;
import Code.Organization.Organization;
import javax.swing.JPanel;

/**
 *
 * @author pridh
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"), 
        Doctor("Doctor"),
        Logistics("Logistics"), 
        Pharmacist("Pharmacist");
        
        private String v;

        private RoleType(String v){
            this.v = v;
            }

        public String getRoleValue() {
            return v;
        }

        public void setRoleValue(String v) {
            this.v = v;
        }
        
        @Override 
        public String toString(){
            return v;
        }
    }
    
    public abstract JPanel createWorkArea (JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network);
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
