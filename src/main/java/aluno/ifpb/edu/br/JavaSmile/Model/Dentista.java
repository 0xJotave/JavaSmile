package aluno.ifpb.edu.br.JavaSmile.Model;

import aluno.ifpb.edu.br.JavaSmile.Controller.JsonUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.IOException;
import java.io.Serializable;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;


/*
* - Essa classe representa o Dentista
* - Responsável por calcular o salário, registrar consultas e ver as consultas que estão marcadas para
*   ele
*/
@SuperBuilder
@NoArgsConstructor
@Data
public class Dentista extends Funcionario implements Serializable {

    // Atributes
//    private String especialidade;
//    private double salario;
//    private List<ConsultaDTO> consultasMarcadas;
//    private List<ConsultaDTO> consultasRealizadas;
//
//    // Marca a consulta pro dentista
//    public void marcarConsulta(ConsultaDTO consulta) throws IOException {
//        consultasMarcadas.add(consulta);
//        JsonUtil.salvarDados(Clinica.getInstance().getDentistaLista(), "dentistas.json");
//    }
//
//    // Realiza a consulta, retirando ela das marcadas e adicionando nas realizadas
//    public void realizarConsulta(Consulta consulta) throws IOException {
//        var consultaDTO = new ConsultaDTO().criarConsultaDTO(consulta);
//        consultasMarcadas.remove(consultaDTO);
//        consultasRealizadas.add(consultaDTO);
//        JsonUtil.salvarDados(Clinica.getInstance().getDentistaLista(), "dentistas.json");
//    }



}

