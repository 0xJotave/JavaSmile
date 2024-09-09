package aluno.ifpb.edu.br.JavaSmile.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

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

