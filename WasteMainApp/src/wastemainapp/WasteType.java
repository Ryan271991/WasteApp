/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wastemainapp;

/**
 *
 * @author huynhlehoang
 */
public class WasteType {
    private String category;
    private String instructions;
    private boolean displayGuide;

    public WasteType(String category, String instructions, boolean displayGuide) {
        this.category = category;
        this.instructions = instructions;
        this.displayGuide = displayGuide;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public boolean isDisplayGuide() {
        return displayGuide;
    }

    public void setDisplayGuide(boolean displayGuide) {
        this.displayGuide = displayGuide;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
