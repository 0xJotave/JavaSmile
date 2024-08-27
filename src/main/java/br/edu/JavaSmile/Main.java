package br.edu.JavaSmile;

import br.edu.JavaSmile.Controller.AssistenteController;
import br.edu.JavaSmile.Controller.DentistaController;
import br.edu.JavaSmile.Model.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // Criar uma instância da Clinica
        Clinica clinica = Clinica.getInstance();
        AssistenteController assistenteController = new AssistenteController();


        List<ConsultaDTO> consultasDTO = new ArrayList<>();

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

            Procedimento procedimento1 = assistenteController.criarProcedimento(
                "Extração",
                200
        );

        Procedimento procedimento2 = assistenteController.criarProcedimento(
                "Canal",
                350
        );

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

        LocalDateTime horario1 = LocalDateTime.of(2024,8,10,8,30);
        LocalDateTime horario2 = LocalDateTime.of(2024,8,10,10,00);
        LocalDateTime horario3 = LocalDateTime.of(2024,8,11,15,10);

        Consulta consulta1 = assistenteController.criarConsulta(paciente1, procedimento1, dentista1, horario1);
        Consulta consulta2 = assistenteController.criarConsulta(paciente2, procedimento2, dentista2, horario2);
        Consulta consulta3 = assistenteController.criarConsulta(paciente1, procedimento2, dentista1, horario3);

        Clinica.getInstance().registrarConsultaDentista(dentista1, dentista1.getConsultasMarcadas());
        Clinica.getInstance().registrarConsultaDentista(dentista2, dentista2.getConsultasMarcadas());

        dentista1.realizarConsulta(consulta1);

    }
}
