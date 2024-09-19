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

package aluno.ifpb.edu.br.JavaSmile.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* - Essa classe representa o Assistente, ou basicamente o usuário principal
* - Responsável por criar, editar e remover Pacientes, Procedimentos, Consultas e Dentistas
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Assistente {
    private String nome;
    private String email;
    private String senha;
    private String nomeUsuario;
}

