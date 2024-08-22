package br.edu.JavaSmile.Controller;

import br.edu.JavaSmile.Model.Clinica;
import br.edu.JavaSmile.Model.Consulta;
import br.edu.JavaSmile.Model.ConsultaDTO;
import br.edu.JavaSmile.Model.Dentista;

import java.io.IOException;
import java.util.ArrayList;

public class DentistaController {
    private ClinicaController clinicaController = new ClinicaController();
    public void registrarConsulta(Dentista dentista, Consulta consulta) throws IOException {
        dentista.getConsultasRealizadas().add(consulta);
        Clinica.getInstance().consultaLista.remove(consulta);
        clinicaController.salvar(Clinica.getInstance());
    }

    public void verConsultasMarcadas(String nomeUsuarioDentista) {
        for (Consulta consulta : Clinica.getInstance().consultaLista) {
            if (consulta.getDentista().equals(nomeUsuarioDentista)) {
                System.out.printf("Consultas marcadas para %s: %n %n", consulta.getDentista().getNome());
                System.out.println("Paciente: " + consulta.getPaciente().getNome());
                System.out.println("Procedimento: " + consulta.getProcedimento().getNome());
                System.out.println("Horário: " + consulta.getHorario());
                System.out.println();
            }
        }
    }
}
