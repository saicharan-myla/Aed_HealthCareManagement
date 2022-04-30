/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.UsrAcc;

import Code.Employee;
import Code.Role.Role;
import Code.WorkQueue.WorkQueue;

/**
 *
 * @author saich
 */
public class UsrAccnt {
    
public String pwd;
public String usrname;
public Employee emp;
public WorkQueue workQueue;
public Role role;

public UsrAccnt(){


workQueue = new WorkQueue();
}

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }










}
