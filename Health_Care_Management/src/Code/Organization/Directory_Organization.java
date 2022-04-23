/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Organization;

import Code.Organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author pridh
 */
public class Directory_Organization {
    
    private ArrayList<Organization> organizations;
    public Directory_Organization() {
        organizations = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(ArrayList<Organization> organizations) {
        this.organizations = organizations;
    }
    
    public Organization addOrg(OrganizationType t) {

        Organization org = null;
        if (OrganizationType.Doctor.getValue().equalsIgnoreCase(t.getValue())) {
            org = new DoctorOrganization();
            organizations.add(org);
        } else if (OrganizationType.Pharmacy.getValue().equalsIgnoreCase(t.getValue())) {
            org = new PharmacyOrganization();
            organizations.add(org);
        } else if (OrganizationType.Supplier.getValue().equalsIgnoreCase(t.getValue())) {
            org = new SupplierOrganization();
            organizations.add(org);
        } else if (OrganizationType.MedicalEquipment.getValue().equalsIgnoreCase(t.getValue())) {
            org = new EquipmentHandlingOrganization();
            organizations.add(org);
        } else if (OrganizationType.Transport.getValue().equalsIgnoreCase(t.getValue())) {
            org = new TransportOrganization();
            organizations.add(org);
        }
        return org;
    }
}
