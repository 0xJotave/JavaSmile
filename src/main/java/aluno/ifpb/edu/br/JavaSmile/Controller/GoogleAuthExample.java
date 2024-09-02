package aluno.ifpb.edu.br.JavaSmile.Controller;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.oauth2.Oauth2;
import com.google.api.services.oauth2.model.Userinfo;
import form.Home;
import main.Main;
import swing.EventLogin;
import swing.EventLoginImpl;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class GoogleAuthExample {

    private static final String CREDENTIALS_FILE_PATH; // Caminho para o arquivo JSON baixado

    static {
        try {
            CREDENTIALS_FILE_PATH = JsonUtil.getPath() + File.separator + "credentials.json";
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final List<String> SCOPES = Collections.singletonList("https://www.googleapis.com/auth/userinfo.profile");
    private static final String TOKENS_DIRECTORY_PATH = "tokens"; // Diretório para armazenar tokens

    private EventLogin event; // Membro de instância, não estático

    // Construtor para inicializar o event
    public GoogleAuthExample(EventLogin event) {
        this.event = event;
    }

    // Método de instância para autenticação
    public void authenticateWithGoogle() throws IOException {
        final NetHttpTransport HTTP_TRANSPORT = new NetHttpTransport();

        // Carregar o arquivo de credenciais
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new FileReader(CREDENTIALS_FILE_PATH));

        // Configurar o fluxo de autorização
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();

        // Configurar o receptor local para o fluxo de autorização
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();

        // Autenticação
        Credential credential = new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");

        if (credential == null) {
            JOptionPane.showMessageDialog(null, "Falha ao obter credenciais.");
            return;
        }

        // Obter informações do usuário
        Oauth2 oauth2 = new Oauth2.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
                .setApplicationName("Google-OAuthLoginExample")
                .build();
        Userinfo userInfo = oauth2.userinfo().get().execute();

        // Verifica se o login foi bem-sucedido
        if (userInfo != null && userInfo.getId() != null) {
            // Login com Google foi válido
            if (event != null) {
                System.out.println("Login bem sucedido: " + userInfo.getName());
                event.loginDone();
            }
        } else {
            // Tratar falha de autenticação aqui, se necessário
            System.out.println("Falha na autenticação do Google.");
        }
    }

    // Outros métodos de instância podem ser adicionados aqui
}