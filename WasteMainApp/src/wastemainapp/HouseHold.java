/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wastemainapp;

import java.io.Serializable;

/**
 *
 * @author huynhlehoang
 */
public class HouseHold extends Entity implements Serializable{
    private String contact;

    public HouseHold(String contact, String name, String eircode, String description) {
        super(name, eircode, description);
        this.contact = contact;
    }  
    
    
    public HouseHold(){
        
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Contact: " + contact);
    }
}
