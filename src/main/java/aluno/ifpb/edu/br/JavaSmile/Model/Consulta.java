package aluno.ifpb.edu.br.JavaSmile.Model;

import com.clinica.swing.table.eventAction.EventActionConsulta;
import com.clinica.swing.table.modelAction.ModelActionConsulta;
import com.clinica.swing.table.modelProfile.ModelProfileConsulta;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/*
* Essa classe representa as Consultas, possuindo atributos como Paciente, Procedimento, Dentista e Horario (com Data),
* além de ser responsável por exibir as informações citadas.
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Consulta implements Serializable {

    // Atributes
    private String paciente;
    private String procedimento;
    private String dentista;
    private String horario;

    public Object[]toRowTable(EventActionConsulta event) {
        return new Object[]{new ModelProfileConsulta(paciente), dentista, procedimento, horario, new ModelActionConsulta(paciente, event)};
    }

}










