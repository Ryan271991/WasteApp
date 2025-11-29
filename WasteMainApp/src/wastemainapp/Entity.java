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
public class Entity implements Serializable {

    protected String name;
    protected String eircode;
    protected String description;
  
    public Entity(){}

    public Entity(String name, String eircode, String description) {
        this.name = name;
        this.eircode = eircode;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEircode() {
        return eircode;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void displayInfo(){
        System.out.println("Eircode: " + this.eircode + " Name: " + this.name + " Description: " + this.description);
    }
}
