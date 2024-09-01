package aluno.ifpb.edu.br.JavaSmile;

import aluno.ifpb.edu.br.JavaSmile.Controller.AssistenteController;
import aluno.ifpb.edu.br.JavaSmile.Model.*;

import java.io.IOException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws IOException {
        // Criar uma instância da Clinica e do Assistente/Usuário
        Clinica clinica = Clinica.getInstance();
        AssistenteController assistenteController = new AssistenteController();

        // Criação dos Pacientes
        Paciente paciente1 = assistenteController.criarPaciente(
                "João",
                18,
                80,
                1.90,
                "joaovmb15@gmail.com"
        );
        Paciente paciente2 = assistenteController.criarPaciente(
                "Pedro",
                29,
                82,
                1.85,
                "pedindogeraa@gmail.com"
        );

        // Criação dos Procedimentos
        Procedimento procedimento1 = assistenteController.criarProcedimento(
            "Extração",
            200
        );

        Procedimento procedimento2 = assistenteController.criarProcedimento(
                "Canal",
                350
        );

        // Criação dos Dentistas
        Dentista dentista1 = assistenteController.criarDentista(
                "Dr. Antonio",
                3000,
                "Cirurgia"
        );

        Dentista dentista2 = assistenteController.criarDentista(
                "Dr. André",
                3000,
                "Ordontologia"
        );

        // Criação dos Horários
        LocalDateTime horario1 = LocalDateTime.of(2024,8,10,8,30);
        LocalDateTime horario2 = LocalDateTime.of(2024,8,10,10,00);
        LocalDateTime horario3 = LocalDateTime.of(2024,8,11,15,10);

        // Criação das Consultas
        Consulta consulta1 = assistenteController.criarConsulta(paciente1, procedimento1, dentista1, horario1);
        Consulta consulta2 = assistenteController.criarConsulta(paciente2, procedimento2, dentista2, horario2);
        Consulta consulta3 = assistenteController.criarConsulta(paciente1, procedimento2, dentista1, horario3);

        // Marcando as consultas para cada dentista
        Clinica.getInstance().registrarConsultaDentista(dentista1, dentista1.getConsultasMarcadas());
        Clinica.getInstance().registrarConsultaDentista(dentista2, dentista2.getConsultasMarcadas());

        dentista2.realizarConsulta(consulta2);
        dentista1.realizarConsulta(consulta3);

        System.out.println(Clinica.getInstance().getAssistentesLista());
    }
}
