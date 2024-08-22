package br.edu.JavaSmile.Controller;

import br.edu.JavaSmile.Model.Clinica;

import java.io.IOException;

public class ClinicaController {

    public void salvar(Clinica clinica) throws IOException {
        JsonUtil.salvarDados(clinica);
    }

    public Clinica carregar() throws IOException {
        return JsonUtil.carregarDados();
    }
}
