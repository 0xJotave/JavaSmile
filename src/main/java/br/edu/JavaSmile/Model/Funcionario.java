package br.edu.JavaSmile.Model;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/*
* - Essa classe abstrata que representa o Funcionário
* - Apenas passa atributos passa as filhas
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Funcionario implements Serializable {

    // Atributes
    private String nome;
    private String email;
    private String senha;
    private String nomeUsuario;

}


