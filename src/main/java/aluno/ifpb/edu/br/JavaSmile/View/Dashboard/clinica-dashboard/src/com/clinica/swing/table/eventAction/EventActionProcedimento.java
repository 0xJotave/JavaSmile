package com.clinica.swing.table.eventAction;

import aluno.ifpb.edu.br.JavaSmile.Model.Procedimento;
import com.clinica.model.ModelProcedimento;

import java.io.IOException;

public interface EventActionProcedimento {
    
    public void delete(Procedimento procedimento) throws IOException;

    public void update(ModelProcedimento procedimento);
}
