package aluno.ifpb.edu.br.JavaSmile.Controller;

import aluno.ifpb.edu.br.JavaSmile.Model.Assistente;
import lombok.Data;

import java.io.IOException;
import java.util.List;

@Data
public class LoginAndRegisterController {
    List<Assistente> assistentes;

    public void carregarAssistentes() throws IOException {
        assistentes = JsonUtil.carregarAssistentes();
    }

    public Assistente criarAssistente(String nome, String email, String senha, String nomeUsuario) throws IOException {
        carregarAssistentes();
        Assistente assistente = Assistente.builder()
                .nome(nome)
                .email(email)
                .senha(senha)
                .nomeUsuario(nomeUsuario)
                .build();

        getAssistentes().add(assistente);
        JsonUtil.salvarDados(getAssistentes(), "assistentes.json");
        return assistente;
    }
}
