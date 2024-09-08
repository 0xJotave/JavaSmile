package com.clinica.model;

import com.clinica.swing.table.eventAction.EventActionConsulta;
import com.clinica.swing.table.modelAction.ModelActionConsulta;
import com.clinica.swing.table.modelProfile.ModelProfileConsulta;

//Classe que armazena os dados de uma consulta e usada por outras classes
// para exibir ou usar essas informações em componentes visuais como tabelas.
public class ModelConsulta {
            
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDentista() {
        return dentista;
    }

    public void setDentista(String dentista) {
        this.dentista = dentista;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }        
    
    public ModelConsulta(String nome, String dentista, String procedimento, String horario) {
        this.nome = nome;
        this.dentista = dentista;
        this.procedimento = procedimento;
        this.horario = horario;
    }
    
    public ModelConsulta() {        
    }    
    
    private String nome;
    private String dentista;
    private String procedimento;
    private String horario;
    

}
