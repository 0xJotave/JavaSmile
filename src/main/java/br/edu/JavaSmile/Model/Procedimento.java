package br.edu.JavaSmile.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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
    private String nome;
    private double valor;

}
