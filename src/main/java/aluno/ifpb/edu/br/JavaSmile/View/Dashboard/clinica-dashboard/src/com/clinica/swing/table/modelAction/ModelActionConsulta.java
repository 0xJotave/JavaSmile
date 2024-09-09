package com.clinica.swing.table.modelAction;

import aluno.ifpb.edu.br.JavaSmile.Model.Consulta;
import com.clinica.swing.table.eventAction.EventActionConsulta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//encapsula as ações possíveis em uma consulta.
//essa classe é usada para passar os dados da consulta e ações associadas
// a essa consulta (ex: editar e deletar) para outras classes.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelActionConsulta {

    private Consulta consulta;
    private EventActionConsulta event; //interface pra gerenciar os eventos de ação (editar e deletar).
}
