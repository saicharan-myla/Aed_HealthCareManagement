/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author saich
 */
public class Network {

   private Directory_Enterprise directoEnterpri;
   private String Network_Name;
    
  

public Network(){
  directoEnterpri= new Directory_Employee();

}

    public String getNetwork_Name() {
        return Network_Name;
    }

    public void setNetwork_Name(String Network_Name) {
        this.Network_Name = Network_Name;
    }

    public Directory_Enterprise getDirectoEnterpri() {
        return directoEnterpri;
    }

    public void setDirectoEnterpri(Directory_Enterprise directoEnterpri) {
        this.directoEnterpri = directoEnterpri;
    }

}
