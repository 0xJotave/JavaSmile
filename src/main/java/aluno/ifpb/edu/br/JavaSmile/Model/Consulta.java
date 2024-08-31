package aluno.ifpb.edu.br.JavaSmile.Model;

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
    private Paciente paciente;
    private Procedimento procedimento;
    private Dentista dentista;
    private LocalDateTime horario;
    private boolean realizada;

}










