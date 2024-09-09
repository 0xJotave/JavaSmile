package aluno.ifpb.edu.br.JavaSmile.Controller;

import aluno.ifpb.edu.br.JavaSmile.Model.Consulta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormConsultaController {
    List<Consulta> consultas;

    public void carregarConsultas() throws IOException {
        consultas = JsonUtil.carregarConsultas();
    }

    public Consulta criarConsulta(String paciente, String procedimento, String dentista,
                                  String horario) throws IOException {
        carregarConsultas();
        Consulta consulta = Consulta.builder()
                .paciente(paciente)
                .procedimento(procedimento)
                .dentista(dentista)
                .horario(horario)
                .build();

        getConsultas().add(consulta);
        JsonUtil.salvarDados(getConsultas(), "consultas.json");
        return consulta;
    }

    public void deletarConsulta(Consulta consulta) throws IOException {
        carregarConsultas();
        getConsultas().remove(consulta);
        JsonUtil.salvarDados(getConsultas(), "consultas.json");
    }

    public void atualizarConsulta(int rowIndex, String paciente, String procedimento,
                                      String dentista, String horario) throws IOException {
        carregarConsultas();
        Consulta consultaAtual = getConsultas().get(rowIndex);
        Consulta consultaAtualizada = Consulta.builder()
                .paciente(paciente)
                .procedimento(procedimento)
                .dentista(dentista)
                .horario(horario)
                .build();

        getConsultas().set(rowIndex, consultaAtualizada);
        JsonUtil.salvarDados(getConsultas(), "consultas.json");
        System.out.println(consultaAtual.getHorario() + " passou pra " + consultaAtualizada.getHorario());
    }
}
