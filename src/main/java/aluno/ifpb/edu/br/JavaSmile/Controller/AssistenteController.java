package aluno.ifpb.edu.br.JavaSmile.Controller;

import aluno.ifpb.edu.br.JavaSmile.Model.*;
import lombok.Data;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class AssistenteController {


    // Criação de Paciente, Procedimentos, Consulta, Dentista
    public Paciente criarPaciente(String nome, String contato, int idade, double peso) throws IOException {
        Paciente paciente = Paciente.builder()
                .nome(nome)
                .contato(contato)
                .idade(idade)
                .peso(peso)
                .build();
        return paciente;
    }

    public Procedimento criarProcedimento(String nome, double valor) throws IOException {
        Procedimento procedimento = Procedimento.builder()
                .tratamento(nome)
                .valor(valor)
                .build();
        return procedimento;
    }

    public Consulta criarConsulta(String paciente, String procedimento,
                                  String dentista, String horario) throws IOException {
        Consulta consulta = Consulta.builder()
                .paciente(paciente)
                .procedimento(procedimento)
                .dentista(dentista)
                .horario(horario)
                .build();
        return consulta;
    }
}
