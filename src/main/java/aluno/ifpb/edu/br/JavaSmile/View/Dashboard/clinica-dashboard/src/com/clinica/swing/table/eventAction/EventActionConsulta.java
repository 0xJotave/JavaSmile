package com.clinica.swing.table.eventAction;

import aluno.ifpb.edu.br.JavaSmile.Model.Consulta;

import java.io.IOException;

//define as ações que podem ser realizadas em uma consulta.
//interface implementada para permitir que as ações de edição e
// deleção sejam disparadas pelos botões criados na classe ActionConsulta.
public interface EventActionConsulta {
        
    public void delete(Consulta paciente) throws IOException;
    
    public void update(Consulta paciente);
    
}
