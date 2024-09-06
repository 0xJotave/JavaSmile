package com.clinica.swing.table.modelProfile;

public class ModelProfileProcedimento {

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public ModelProfileProcedimento(String tratamento) {
        this.tratamento = tratamento;
    }

    public ModelProfileProcedimento() {
    }

    private String tratamento;
}
