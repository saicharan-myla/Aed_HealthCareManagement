/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Design;

import Code.EcoSystem;
import Code.Employee;
import Code.Role.Role_SystemAdmin;

/**
 *
 * @author saich
 */
public class ConfigureASystem {


public static EcoSystem configure(){


    EcoSystem eco = EcoSystem.getReferrence();
     Employee employee  = eco.getEmpDir().AddEmployee("NEU");
      UserAccount ua = eco.getUserAccDir().createUserAccount("sps","sps", employee, new Role_SystemAdmin());
return eco;

}
    
}
