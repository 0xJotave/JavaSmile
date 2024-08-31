package aluno.ifpb.edu.br.JavaSmile.Model;

/*
* Essa classe representa o Paciente, possuindo nome, idade, peso, altura e contato.
* Utilizado para criar as consultas.
*/


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
    private int idade;
    private double peso;
    private double altura;
    private String contato;

}

