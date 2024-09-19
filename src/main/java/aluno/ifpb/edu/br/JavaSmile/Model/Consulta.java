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

import com.clinica.swing.table.eventAction.EventActionConsulta;
import com.clinica.swing.table.modelAction.ModelActionConsulta;
import com.clinica.swing.table.modelProfile.ModelProfileConsulta;
import lombok.*;
import java.io.Serializable;


/*
* Essa classe representa as Consultas, possuindo atributos como Paciente, Procedimento, Dentista e Horario (com Data),
* além de ser responsável por exibir as informações citadas.
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Consulta implements Serializable {

    // Atributes
    private String paciente;
    private String procedimento;
    private String dentista;
    private String horario;

    public Object[]toRowTable(EventActionConsulta event) {
        return new Object[]{new ModelProfileConsulta(paciente), dentista, procedimento, horario, new ModelActionConsulta(this, event)};
    }

}










