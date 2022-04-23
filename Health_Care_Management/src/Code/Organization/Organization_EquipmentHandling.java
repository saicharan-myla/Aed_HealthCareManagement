/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Organization;

import java.util.ArrayList;

/**
 *
 * @author pridh
 */
public class Organization_EquipmentHandling extends Organization {

    public Organization_EquipmentHandling() {
        super(Organization.OrganizationType.MedicalEquipment.getValue());
    }
    
    
    @Override 
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new MedicalEquipmentRole());
        return list;
    }
}
