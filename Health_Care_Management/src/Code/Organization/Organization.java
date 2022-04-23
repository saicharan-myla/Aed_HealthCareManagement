/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Organization;

import Code.Directory_Employee;
import java.util.ArrayList;

/**
 *
 * @author pridh
 */
public abstract class Organization {

    private String orgName;
    private WorkQueue wq;
    private Directory_Employee empDir;
    private UserAccountDirectory userAccDir;
    private int orgId;
    private static int c;

    private HealthcareEquipmentWorkRequest eqReq;
    ArrayList<DoctorPrescription> prescriptions;

    public enum OrganizationType {
        Admin("Admin Organization"), Doctor("Doctor Organization"), Operations("Operations Organization"),
        Pharmacy("Pharmacy Organization"), Supplier("Supplier Organization"), MedicalEquipment("Equipment Organization"),
        Transport("Transportation Organization");

        private String v;

        private OrganizationType(String v) {
            this.v = v;
        }

        public String getValue() {
            return v;
        }

    }
    public Organization(String orgName) {
        this.orgName = orgName;
        wq = new WorkQueue();
        empDir = new Directory_Employee();
        userAccDir = new UserAccountDirectory();
        orgId = c;
        prescriptions = new ArrayList<DoctorPrescription>();
        ++c;
    }


    public abstract ArrayList<Role> getRole();

    public UserAccountDirectory getUserAccDir() {
        return userAccDir;
    }

    public int getOrgId() {
        return orgId;
    }

    public Directory_Employee getEmpDir() {
        return empDir;
    }
    
    public void setEmpDir(Directory_Employee empDir) {
        this.empDir = empDir;
    }
    
    public String getOrgName() {
        return orgName;
    }
    public WorkQueue getWQ() {
        return wq;
    }
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public void setWQ(WorkQueue wq) {
        this.wq = wq;
    }


    @Override
    public String toString() {
        return orgName;
    }
}