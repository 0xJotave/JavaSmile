/*
 * Copyright 2024 Pedro Paulo Delgado Alves e João Victor Moura Barbosa
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

import aluno.ifpb.edu.br.JavaSmile.Model.Procedimento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.IOException;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormProcedimentoController {
    private List<Procedimento> procedimentos;

    public void carregarProcedimentos() throws IOException {
        procedimentos = JsonUtil.carregarProcedimentos();
    }

    public Procedimento criarProcedimento(String tratamento, double valor) throws IOException {
        carregarProcedimentos();
        Procedimento procedimento = Procedimento.builder()
                .tratamento(tratamento)
                .valor(valor)
                .build();

        getProcedimentos().add(procedimento);
        JsonUtil.salvarDados(getProcedimentos(), "procedimentos.json");
        return procedimento;
    }

    public void deletarProcedimento(Procedimento procedimento) throws IOException {
        carregarProcedimentos();
        getProcedimentos().remove(procedimento);
        JsonUtil.salvarDados(getProcedimentos(), "procedimentos.json");
    }

    public void atualizarProcedimento(int rowIndex, String tratamentoNovo, double valorNovo) throws IOException {
        carregarProcedimentos();
        Procedimento procedimentoAtual = getProcedimentos().get(rowIndex);
        Procedimento procedimentoAtualizado = Procedimento.builder()
                .tratamento(tratamentoNovo)
                .valor(valorNovo)
                .build();

        getProcedimentos().set(rowIndex, procedimentoAtualizado);
        JsonUtil.salvarDados(getProcedimentos(), "procedimentos.json");
        System.out.println(procedimentoAtual.getTratamento() + " passou pra " + procedimentoAtualizado.getTratamento());
    }
}
