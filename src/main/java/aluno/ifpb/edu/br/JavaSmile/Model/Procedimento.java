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
