package br.edu.JavaSmile.Controller;

import br.edu.JavaSmile.Model.*;
import lombok.Data;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
public class AssistenteController {

    // Criação de Paciente, Procedimentos, Consulta, Dentista
    public Paciente criarPaciente(String nome, int idade, double peso, double altura, String contato) throws IOException {
        Paciente paciente = Paciente.builder()
                .nome(nome)
                .idade(idade)
                .peso(peso)
                .altura(altura)
                .contato(contato)
                .build();
        Clinica.getInstance().getPacientesLista().add(paciente);
        JsonUtil.salvarDados(Clinica.getInstance().getPacientesLista(), "paciente.json");
        return paciente;
    }

    public Procedimento criarProcedimento(String nome, double valor) throws IOException {
        Procedimento procedimento = Procedimento.builder()
                .nome(nome)
                .valor(valor)
                .build();
        Clinica.getInstance().getProcedimentosLista().add(procedimento);
        JsonUtil.salvarDados(Clinica.getInstance().getProcedimentosLista(), "procedimento.json");
        return procedimento;
    }

    public Consulta criarConsulta(Paciente paciente, Procedimento procedimento,
                                  Dentista dentista, LocalDateTime horario) throws IOException {
        Consulta consulta = Consulta.builder()
                .paciente(paciente)
                .procedimento(procedimento)
                .dentista(dentista)
                .horario(horario)
                .build();
        dentista.marcarConsulta(new ConsultaDTO().criarConsultaDTO(consulta));
//        ConsultaDTO consultaDTO = new ConsultaDTO().criarConsultaDTO(consulta);
//        JsonUtil.salvarDados(Clinica.getInstance().getConsultasDTOLista(), "consultas.json");
        return consulta;
    }

    public Dentista criarDentista(String nome, double salario, String especialidade) throws IOException {
        Dentista dentista = Dentista.builder()
                .nome(nome)
                .salario(salario)
                .especialidade(especialidade)
                .consultasRealizadas(new ArrayList<>())
                .consultasMarcadas(new ArrayList<>())
                .build();
        Clinica.getInstance().getDentistaLista().add(dentista);
        JsonUtil.salvarDados(Clinica.getInstance().getDentistaLista(), "dentista.json");
        return dentista;
    }

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
