/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Design;

import Code.Network;
import Code.Organization.Organization;
import Code.Role.Role;
import Code.Role.Role_SystemAdmin;
import java.util.ArrayList;

/**
 *
 * @author saich
 */
public class EcoSystem  extends Organization{
    private static EcoSystem business;
   private ArrayList <Network> Ntwk_List;


public static EcoSystem getInstance(){

if (business == null){
business = new EcoSystem();
}
return business;

}


public EcoSystem (){
super(null);
Ntwk_List = new ArrayList();

}
public Network AddNewNetwork(){

Network net = new Network();
Ntwk_List.add(net);
return net;
}


    public ArrayList<Network> getNtwk_List() {
        return Ntwk_List;
    }
public boolean ifUniqUsrName (String name ){

if (!this.getUserAccDir().uniqueAccountCheck(name)){
return false;}
return true;
}


@Override
public ArrayList <Role> getRole(){

ArrayList<Role> list_roles = new ArrayList<>();
list_roles.add(new Role_SystemAdmin());
return list_roles;


}





}



