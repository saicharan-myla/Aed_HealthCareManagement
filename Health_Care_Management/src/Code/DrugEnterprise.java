/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import Code.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author saich
 */
public class DrugEnterprise extends EnterPrise {
    
private WorkQueue equiptaskqueue;

public DrugEnterprise(String name){

super(name,EnterPrise.EntType.Pharmacy);
equiptaskqueue = new WorkQueue();

}
// override 
@Override
public ArrayList<Role>SupportedRole(){


return null;
}


















}
