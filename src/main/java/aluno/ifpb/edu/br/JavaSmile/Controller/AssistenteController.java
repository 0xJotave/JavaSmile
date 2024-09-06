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

//    public Dentista criarDentista(String nome, double salario, String especialidade) throws IOException {
//        Dentista dentista = Dentista.builder()
//                .nome(nome)
//                .salario(salario)
//                .especialidade(especialidade)
//                .consultasRealizadas(new ArrayList<>())
//                .consultasMarcadas(new ArrayList<>())
//                .build();
//        Clinica.getInstance().getDentistaLista().add(dentista);
//        // Salva a lista de dentistas em um arquivo Json
//        JsonUtil.salvarDados(Clinica.getInstance().getDentistaLista(), "dentistas.json");
//        return dentista;
//    }

    // Remoção de Paciente, Procedimento, Consulta, Dentista

//    public void deletarPaciente(Paciente paciente) throws IOException {
//        Clinica.getInstance().getPacientesLista().remove(paciente);
//        JsonUtil.atualizarDados(paciente, null);
//    }
//
//    public void deletarProcedimento(Procedimento procedimento) throws IOException {
//        Clinica.getInstance().getProcedimentosLista().remove(procedimento);
//        clinicaController.salvar(Clinica.getInstance());
//    }
//
//    public void deletarConsulta(ConsultaDTO consultaDTO) throws IOException {
//        Clinica.getInstance().getConsultasDTOLista().remove(consultaDTO);
//        clinicaController.salvar(Clinica.getInstance());
//    }
//
//    public void deletarDentista(Dentista dentista) throws IOException {
//        Clinica.getInstance().getDentistaLista().remove(dentista);
//        clinicaController.salvar(Clinica.getInstance());
//    }
//
//    // Edição de Paciente, Procedimento, Consulta e Dentista
//    public void editarPaciente(Paciente paciente, String nome, Integer idade,
//                               Double peso, Double altura, String contato) throws IOException {
//        if (Clinica.getInstance().getPacientesLista().contains(paciente)) {
//            if (nome != null) {
//                paciente.setNome(nome);
//            }
//            if (idade != null) {
//                paciente.setIdade(idade);
//            }
//            if (peso != null) {
//                paciente.setPeso(peso);
//            }
//            if (altura != null) {
//                paciente.setAltura(altura);
//            }
//            if (contato != null) {
//                paciente.setContato(contato);
//            }
//            clinicaController.salvar(Clinica.getInstance());
//        } else {
//            System.out.println("Paciente não encontrado");
//        }
//    }
//
//    public void editarProcedimento(Procedimento procedimento, String nome, Double valor) throws IOException {
//        if (Clinica.getInstance().getProcedimentosLista().contains(procedimento)) {
//            if (nome != null) {
//                procedimento.setNome(nome);
//            }
//            if (nome != null) {
//                procedimento.setValor(valor);
//            }
//            clinicaController.salvar(Clinica.getInstance());
//        } else {
//            System.out.println("Procedimento não encontrado!");
//        }
//    }
//
//    public void editarConsulta(ConsultaDTO consultaDTO, String nomePaciente, String nomeProcedimento,
//                               String nomeDentista, LocalDateTime horario) throws IOException {
//        if (Clinica.getInstance().getConsultasDTOLista().contains(consultaDTO)) {
//            if (nomePaciente != null) {
//                consultaDTO.setNomePaciente(nomePaciente);
//            }
//            if (nomeProcedimento != null) {
//                consultaDTO.setNomeProcedimento(nomeProcedimento);
//            }
//            if (nomeDentista != null) {
//                consultaDTO.setNomeDentista(nomeDentista);
//            }
//            if (horario != null) {
//                consultaDTO.setHorario(horario);
//            }
//            clinicaController.salvar(Clinica.getInstance());
//        } else {
//            System.out.println("Consulta não encontrada!");
//        }
//    }
//
//    public void editarDentista(Dentista dentista, String nome, Double salario, String especialidade) throws IOException {
//        if (Clinica.getInstance().getDentistaLista().contains(dentista)) {
//            if (nome != null) {
//                dentista.setNome(nome);
//            }
//            if (salario != null) {
//                dentista.setSalario(salario);
//            }
//            if (especialidade != null) {
//                dentista.setEspecialidade(especialidade);
//            }
//            clinicaController.salvar(Clinica.getInstance());
//        } else {
//            System.out.println("Dentista não encontrado!");
//        }
//    }
}
