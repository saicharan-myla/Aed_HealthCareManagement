/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.UsrAcc;

import Code.Employee;
import Code.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author saich
 */
public class Direc_UsrAccnt {

public ArrayList<UsrAccnt> usrList = new ArrayList();
public Direc_UsrAccnt(){


usrList = new ArrayList();



}

public UsrAccnt Checkuser(String name, String pwd){

for(UsrAccnt ur : usrList){

if (ur.getUsrname().equals(name) && ur.getPwd().equals(pwd)){
return ur;
}

}
return null;

}


public boolean  checkUserNameUniq (String name){

for(UsrAccnt ur : usrList){

if (ur.getUsrname().equals(name)){return false;}


}
return true;

}


public UsrAccnt createAccount(String name, String pwd, Employee emp, Role role){


UsrAccnt ur = new UsrAccnt();
ur.setEmp(emp);
ur.setPwd(pwd);
ur.setRole(role);
ur.setUsrname(name);
usrList.add(ur);
return ur;

}
    
}
