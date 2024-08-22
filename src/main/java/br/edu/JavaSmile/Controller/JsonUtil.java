package br.edu.JavaSmile.Controller;

import br.edu.JavaSmile.Model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;

public class JsonUtil {
    private static ObjectMapper objectMapper = new ObjectMapper();

    static  {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.registerModule(new JavaTimeModule());
    }

    public static void salvarDados(Clinica clinica) throws IOException {
        objectMapper.writeValue(new File("dados.json"), clinica);
    }

    public static Clinica carregarDados() throws IOException {
        return objectMapper.readValue(new File("dados.json"), Clinica.class);
    }
}
