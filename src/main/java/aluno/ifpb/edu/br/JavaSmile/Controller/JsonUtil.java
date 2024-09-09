package aluno.ifpb.edu.br.JavaSmile.Controller;

import aluno.ifpb.edu.br.JavaSmile.Model.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class JsonUtil {
    private static ObjectMapper objectMapper = new ObjectMapper();

    static  {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT); // Deixa o json organizado
        objectMapper.registerModule(new JavaTimeModule()); // Faz com que o json leia LocalDateTime
    }

    public static void salvarDados(Object objeto, String nomeArquivo) throws IOException {
        objectMapper.writeValue(new File(getPath() + File.separator + nomeArquivo), objeto);
    }

    // Verifica se a pasta Json já existe e se não existir, cria uma nova
    public static File getPath() throws IOException {
        File diretorio = new File("jsons");
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }
        return diretorio;
    }

    public static List<Assistente> carregarAssistentes() throws IOException {
        File file = new File(getPath() + File.separator + "assistentes.json");
        if (!file.exists()) {
            return new ArrayList<>();
        }
        return objectMapper.readValue(new File(getPath() + File.separator + "assistentes.json"),
                new TypeReference<List<Assistente>>() {});
    }
    public static List<Paciente> carregarPacientes() throws IOException {
        File file = new File(getPath() + File.separator + "pacientes.json");
        if (!file.exists()) {
            return new ArrayList<>();
        }
        return objectMapper.readValue(new File(getPath() + File.separator + "pacientes.json"),
                new TypeReference<List<Paciente>>() {});
    }
    public static List<Procedimento> carregarProcedimentos() throws IOException {
        File file = new File(getPath() + File.separator + "procedimentos.json");
        if (!file.exists()) {
            return new ArrayList<>();
        }
        return objectMapper.readValue(new File(getPath() + File.separator + "procedimentos.json"),
                new TypeReference<List<Procedimento>>() {});
    }

    public static List<Consulta> carregarConsultas() throws IOException {
        File file = new File(getPath() + File.separator + "consultas.json");
        if (!file.exists()) {
            return new ArrayList<>();
        }
        return objectMapper.readValue(new File(getPath() + File.separator + "consultas.json"),
                new TypeReference<List<Consulta>>() {});
    }

}
