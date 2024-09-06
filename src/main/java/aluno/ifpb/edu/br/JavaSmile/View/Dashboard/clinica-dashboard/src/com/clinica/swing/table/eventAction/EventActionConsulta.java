package com.clinica.swing.table.eventAction;

import aluno.ifpb.edu.br.JavaSmile.Model.Consulta;
import com.clinica.model.ModelConsulta;

import java.io.IOException;


public interface EventActionConsulta {
        
    public void delete(Consulta paciente) throws IOException;
    
    public void update(ModelConsulta paciente);
    
}
