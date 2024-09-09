package com.clinica.swing.table.modelAction;

import aluno.ifpb.edu.br.JavaSmile.Model.Paciente;
import com.clinica.swing.table.eventAction.EventAction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelAction {
    private Paciente paciente;
    private EventAction event;

}
