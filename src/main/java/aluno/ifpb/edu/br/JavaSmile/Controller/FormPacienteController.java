/*
 * Copyright 2024 Pedro Paulo Delgado Alves
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The software licensed under the Apache License, Version 2.0 is further
 * subject to the Commons Clause License Condition v1.0.
 */

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
    private List<Paciente> pacientes;

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
