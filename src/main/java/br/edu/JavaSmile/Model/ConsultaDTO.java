package br.edu.JavaSmile.Model;

import br.edu.JavaSmile.Controller.JsonUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaDTO {
    private String nomePaciente;
    private String nomeProcedimento;
    private String nomeDentista;
    private LocalDateTime horario;

    // Cria uma consulta simplificada, pegando apenas o nome dos objetos
    public static ConsultaDTO criarConsultaDTO (Consulta consulta) throws IOException {
        ConsultaDTO consultaDTO = ConsultaDTO.builder()
                .nomePaciente(consulta.getPaciente().getNome())
                .nomeProcedimento(consulta.getProcedimento().getNome())
                .nomeDentista(consulta.getDentista().getNome())
                .horario(consulta.getHorario())
                .build();
//        Clinica.getInstance().getConsultasDTOLista().add(consultaDTO);
//        JsonUtil.salvarDados(consultaDTO, "consultas.json");
        return consultaDTO;
    }
}
