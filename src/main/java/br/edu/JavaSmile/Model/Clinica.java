package br.edu.JavaSmile.Model;

import br.edu.JavaSmile.Controller.JsonUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/*
* - Esta classe representa a clinica
* - Responsável por guardar os dados dos pacientes, procedimentos, consultas e dentistas
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Clinica implements Serializable {
    public static Clinica instance;
    public List<Paciente> pacientesLista;
    public List<Procedimento> procedimentosLista;
    @JsonIgnore
    public List<Consulta> consultaLista;
    public List<ConsultaDTO> consultasDTOLista;
    public List<Dentista> dentistaLista;

    public static Clinica getInstance() {
        if (instance == null) {
            instance = new Clinica();
        }
        return instance;
    }
}
