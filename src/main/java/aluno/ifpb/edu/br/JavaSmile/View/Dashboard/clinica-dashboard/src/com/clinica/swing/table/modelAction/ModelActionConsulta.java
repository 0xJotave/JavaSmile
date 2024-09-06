package com.clinica.swing.table.modelAction;

import aluno.ifpb.edu.br.JavaSmile.Model.Paciente;
import com.clinica.model.ModelConsulta;
import com.clinica.swing.table.eventAction.EventActionConsulta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelActionConsulta {

    private String paciente;
    private EventActionConsulta event;
}
