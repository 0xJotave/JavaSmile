package aluno.ifpb.edu.br.JavaSmile.Model;

import aluno.ifpb.edu.br.JavaSmile.Controller.JsonUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<Dentista> dentistaLista;
    private Map<String, List<ConsultaDTO>> consultas;
    private List<Assistente> assistentesLista;

    public static Clinica getInstance() throws IOException {
        if (instance == null) {
            instance = Clinica.builder()
                    .pacientesLista(new ArrayList<>())
                    .procedimentosLista(new ArrayList<>())
                    .dentistaLista(new ArrayList<>())
                    .consultas(new HashMap<String, List<ConsultaDTO>>())
                    .assistentesLista(new ArrayList<>())
                    .build();
        }
        return instance;
    }

    public void registrarConsultaDentista(Dentista dentista, List<ConsultaDTO> consultasDentista) throws IOException {
        consultas.put(dentista.getNome(), consultasDentista);
        JsonUtil.salvarDados(consultas, "consultasPorDentista.json");
    }
}
