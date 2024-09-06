package com.clinica.swing.table.modelProfile;



public class ModelProfileConsulta {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ModelProfileConsulta(String nome) {
        this.nome  = nome;
    }
    
    public ModelProfileConsulta() {        
    }
    
    private String nome;
}
