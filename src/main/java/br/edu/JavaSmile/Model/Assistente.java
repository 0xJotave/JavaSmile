package br.edu.JavaSmile.Model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

/*
* - Essa classe representa o Assistente, ou basicamente o usuário principal
* - Responsável por criar, editar e remover Pacientes, Procedimentos, Consultas e Dentistas
*/
@SuperBuilder
@Data
public class Assistente extends Funcionario {

}

