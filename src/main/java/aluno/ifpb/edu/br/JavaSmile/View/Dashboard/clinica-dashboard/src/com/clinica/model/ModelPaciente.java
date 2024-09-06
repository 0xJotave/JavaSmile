package com.clinica.model;

import com.clinica.swing.table.eventAction.EventAction;
import com.clinica.swing.table.modelAction.ModelAction;
import com.clinica.swing.table.modelProfile.ModelProfile;

public class ModelPaciente {
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
    
    
    public ModelPaciente(String name, String contato, int idade, double peso) {
        this.name = name;
        this.idade = idade;
        this.peso = peso;
        this.contato = contato;
    }
    
    public ModelPaciente() {        
    }
    
    private String name;
    private int idade;
    private double peso;
    private String contato;

}
