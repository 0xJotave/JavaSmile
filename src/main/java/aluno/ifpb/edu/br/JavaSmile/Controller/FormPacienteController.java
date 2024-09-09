package aluno.ifpb.edu.br.JavaSmile.Controller;

import aluno.ifpb.edu.br.JavaSmile.Model.Paciente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.IOException;
import java.util.List;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormPacienteController {
    List<Paciente> pacientes;

    public void carregarPacientes() throws IOException {
        pacientes = JsonUtil.carregarPacientes();
    }

    public Paciente criarPaciente(String nome, String contato, int idade, double peso) throws IOException {
        carregarPacientes();
        Paciente paciente = Paciente.builder()
                .nome(nome)
                .contato(contato)
                .idade(idade)
                .peso(peso)
                .build();

        getPacientes().add(paciente);
        JsonUtil.salvarDados(getPacientes(), "pacientes.json");
        return paciente;
    }

    public void deletarPaciente(Paciente paciente) throws IOException {
        carregarPacientes();
        getPacientes().remove(paciente);
        JsonUtil.salvarDados(getPacientes(), "pacientes.json");
    }

    public void atualizarPaciente(int rowIndex, String nomeNovo, String contatoNovo, int idadeNova,
                                  double pesoNovo) throws IOException {
        carregarPacientes();

        Paciente pacienteAtual = getPacientes().get(rowIndex);
        Paciente pacienteAtualizado = Paciente.builder()
                .nome(nomeNovo)
                .contato(contatoNovo)
                .idade(idadeNova)
                .peso(pesoNovo)
                .build();

        getPacientes().set(rowIndex, pacienteAtualizado);
        JsonUtil.salvarDados(getPacientes(), "pacientes.json");
        System.out.println(pacienteAtual.getNome() + " passou pra" + pacienteAtualizado.getNome());
    }
}
