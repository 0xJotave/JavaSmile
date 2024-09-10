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
        private List<Consulta> consultas;

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
