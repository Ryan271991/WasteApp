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
public class WasteEntry implements Serializable{
    private String eircode;
    private double weight;
    private String wasteType;
    private String date;

    public WasteEntry(String eircode, double weight, String wasteType, String date) {
        this.eircode = eircode;
        this.weight = weight;
        this.wasteType = wasteType;
        this.date = date;
    }
    
    public WasteEntry (){
        
    }

    public String getEircode() {
        return eircode;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWasteType() {
        return wasteType;
    }

    public void setWasteType(String wasteType) {
        this.wasteType = wasteType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "WasteEntry{" + "eircode=" + eircode + ", weight=" + weight + ", wasteType=" + wasteType + ", date=" + date + '}';
    }
    
    
}
