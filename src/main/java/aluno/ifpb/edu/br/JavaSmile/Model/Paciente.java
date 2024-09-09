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

