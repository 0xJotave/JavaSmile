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

import aluno.ifpb.edu.br.JavaSmile.Model.Assistente;
import lombok.Data;

import java.io.IOException;
import java.util.List;

@Data
public class LoginAndRegisterController {
    List<Assistente> assistentes;

    public void carregarAssistentes() throws IOException {
        assistentes = JsonUtil.carregarAssistentes();
    }

    public Assistente criarAssistente(String nome, String email, String senha, String nomeUsuario) throws IOException {
        carregarAssistentes();
        Assistente assistente = Assistente.builder()
                .nome(nome)
                .email(email)
                .senha(senha)
                .nomeUsuario(nomeUsuario)
                .build();

        getAssistentes().add(assistente);
        JsonUtil.salvarDados(getAssistentes(), "assistentes.json");
        return assistente;
    }
}
