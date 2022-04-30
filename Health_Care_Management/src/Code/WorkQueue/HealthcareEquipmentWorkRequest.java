/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.WorkQueue;

/**
 *
 * @author 16176
 */
public class HealthcareEquipmentWorkRequest extends WorkRequest {
    private float actual_price;
    private float loaned_price;
    private String equipment_Name;
    private String expectedArrival_Time;
    private String urgency_Level;
    private String hospita_lName;
    private int quantity_1;
    private String network_1;
    private String transport_requestStatus;

    public float getActualprice() {
        return actual_price;
    }

    public void setActualprice(float actualprice) {
        this.actual_price = actualprice;
    }

    public float getLoanedprice() {
        return loaned_price;
    }

    public void setLoanedprice(float loanedprice) {
        this.loaned_price = loanedprice;
    }

    public String getEquipmentName() {
        return equipment_Name;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    public void setExpectedArrivalTime(String expectedArrivalTime) {
        this.expectedArrivalTime = expectedArrivalTime;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getTransportrequestStatus() {
        return transportrequestStatus;
    }

    public void setTransportrequestStatus(String transportrequestStatus) {
        this.transportrequestStatus = transportrequestStatus;
    }
    
    @Override
    public String toString(){
        return this.equipmentName;
    }
    
}
