/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Design;

import Code.Organization.Organization_Admin;
import Code.Product;
import Code.WorkQueue.HealthcareEquipmentWorkRequest;
import Code.WorkQueue.DoctorWorkRequest;
import Schema.WorkQueue.PharmacyWorkRequest;
import java.util.Random;

/**
 *
 * @author saich
 */
public class DataBank {
    public static String [] vaccines = {"Tdap", "HPV", "Pencillin", "Flu", "Varicella", "Hep B", "MMR", "Booster"};
public static String [] organizations = {"Doctor", "Pharmacy", "Supplier", "Transportation", "Equipment"};

public static String [] beginsubstr = {"kr", "ca", "Ra", "Ho", "Lj", "pg", "kre", "lop", "mat"};
public static String [] middlesubstr = {"air", "cal", "Pla", "ghdo", "kal", "hkg", "pokre", "lojop", "mploat"};

public static String [] hospitals = {"Brown Medial","LifeSpan" ,"General Hospitals", "Smile Hospitals", "Cape cod", "Boston Medical", "Brigham"};
public static String [] networks = {"Boston", "Seattle","California"};

public static String []  medicines = {"Synthroid", "Crestor", "Ventolin", "esomeprazole", "insulin", "infliximab", "fluticasone", "rosuvastatin"};

public static String [] equipments  = {"Stethescope", "Thermometer", "Syringe", "Beds", "BP Kits","Oxygen Cylinders","Covid Testing Kits","PulseOxymeters"};

private static Random diff = new Random();



public static String createEquipName() {
        return equipments[diff.nextInt(equipments.length)];
    }

    
    
    public static String createNetwork() {
        return networks[diff.nextInt(networks.length)];
    }

    
    
    public static String createSupplierName() {

        return beginsubstr[diff.nextInt(beginsubstr.length)] + middlesubstr[diff.nextInt(middlesubstr.length)];
    }

    
    
    public static String createPaitentName() {

        return beginsubstr[diff.nextInt(beginsubstr.length)] + middlesubstr[diff.nextInt(middlesubstr.length)];
    }

    
    
    public static String createHospitalName() {
        return hospitals[diff.nextInt(hospitals.length)];
    }

    
    
    public static String createOrganisationName() {
        return organizations[diff.nextInt(organizations.length)];
    }

    
    
    public static String createVaccineName() {
        return vaccines[diff.nextInt(vaccines.length)];

    }

    
    
    public static String createeMedicine() {

        return medicines[diff.nextInt(medicines.length)];
    }


public static Product  MedicineName_SetUp (){

Product rewq = new Product();
rewq.setDrugName(createeMedicine());
return rewq;



}

public static Organization_Admin OrgName_Setup(){

Organization_Admin req = new Organization_Admin();
req.setOrgName(createOrganisationName());
return req;


}

public static HealthcareEquipmentWorkRequest Mede_Req_Setup(){

HealthcareEquipmentWorkRequest need = new HealthcareEquipmentWorkRequest();
need.setEquipmentName(createEquipName());
need.setNetwork(createNetwork());
return need;


}




public static PharmacyWorkRequest SupplierData(){


PharmacyWorkRequest need = new PharmacyWorkRequest();
need.setSupplierName(createSupplierName());
need.setNetwork(createNetwork());
return need;
}


public static  DoctorWorkRequest PatientsInfo(){

DoctorWorkRequest dr = new DoctorWorkRequest();
dr.setHospitalName(createHospitalName());
dr.setPatientName(createPaitentName());
        return dr;
}


public static Product VaccineNameSetup(){

Product drv = new Product();

drv.setVaccineName(createVaccineName());
drv.setHospitalName(createHospitalName());
return drv ;



}



}