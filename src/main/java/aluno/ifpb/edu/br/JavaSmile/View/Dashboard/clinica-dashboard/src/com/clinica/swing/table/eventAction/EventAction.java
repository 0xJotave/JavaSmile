package com.clinica.swing.table.eventAction;

import aluno.ifpb.edu.br.JavaSmile.Model.Paciente;
import java.io.IOException;


public interface EventAction {
        
    public void delete(Paciente paciente) throws IOException;
    
    public void update(Paciente paciente);
}
