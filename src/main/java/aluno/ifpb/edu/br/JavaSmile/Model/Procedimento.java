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

import com.clinica.swing.table.eventAction.EventActionProcedimento;
import com.clinica.swing.table.modelAction.ModelActionProcedimento;
import com.clinica.swing.table.modelProfile.ModelProfileProcedimento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.text.DecimalFormat;

/*
* - Essa classe representa o Procedimento
* - Utilizada para criar consultas
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Procedimento implements Serializable {

    // Atributes
    private String tratamento;
    private double valor;

    public Object[] toRowTable(EventActionProcedimento event) {
        DecimalFormat df = new DecimalFormat("R$#,##0.00");
        return new Object[]{new ModelProfileProcedimento(tratamento), df.format(valor), new ModelActionProcedimento(this, event)};
    }
}
