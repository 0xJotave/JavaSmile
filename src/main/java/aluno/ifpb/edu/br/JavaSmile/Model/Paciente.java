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

/*
* Essa classe representa o Paciente, possuindo nome, idade, peso, altura e contato.
* Utilizado para criar as consultas.
*/

import com.clinica.swing.table.eventAction.EventAction;
import com.clinica.swing.table.modelAction.ModelAction;
import com.clinica.swing.table.modelProfile.ModelProfile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Paciente implements Serializable {

    // Atributes
    private String nome;
    private String contato;
    private int idade;
    private double peso;

    public Object[]toRowTable(EventAction event) {
        return new Object[]{new ModelProfile(nome), contato, idade, peso, new ModelAction(this, event)};
    }
}

