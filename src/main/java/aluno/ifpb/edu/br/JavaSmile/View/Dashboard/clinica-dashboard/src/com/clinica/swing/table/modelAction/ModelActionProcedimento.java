package com.clinica.swing.table.modelAction;

import aluno.ifpb.edu.br.JavaSmile.Model.Procedimento;
import com.clinica.model.ModelProcedimento;
import com.clinica.swing.table.eventAction.EventActionProcedimento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelActionProcedimento {
    private Procedimento procedimento;
    private EventActionProcedimento event;
}
