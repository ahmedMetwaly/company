
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed
 */
class Employee implements Serializable{
    private int ID,hoursWorked,overTimeHours;
    private String name,address,rank;
    private double payment;

    public Employee(int ID, int hoursWorked, int overTimeHours, String name, String address, String rank) {
        this.ID = ID;
        this.hoursWorked = hoursWorked;
        this.overTimeHours = overTimeHours;
        this.name = name;
        this.address = address;
        this.rank = rank;
        payment = (hoursWorked*150)+(overTimeHours*200);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setPayment(int hoursWorked,int overTimeHours) {
        this.payment = (hoursWorked*100)+(overTimeHours*125);
    }
    

    public double getPayment() {
        return payment;
    }
    
    
}
public class data {
    
}
