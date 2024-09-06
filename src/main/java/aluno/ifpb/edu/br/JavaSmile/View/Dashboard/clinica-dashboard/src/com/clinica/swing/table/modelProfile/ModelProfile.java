package com.clinica.swing.table.modelProfile;



public class ModelProfile {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public ModelProfile(String name) {
        this.name  = name;
    }
    
    public ModelProfile() {        
    }
    
    private String name;
}
