package login;


import aluno.ifpb.edu.br.JavaSmile.Controller.JsonUtil;
import aluno.ifpb.edu.br.JavaSmile.Model.Assistente;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class Register extends PanelCustom {

    
    public Register() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textField1 = new swing.TextField();
        textField2 = new swing.TextField();
        textField3 = new swing.TextField();
        password1 = new swing.Password();
        button1 = new swing.Button();

        setBackground(new java.awt.Color(1, 24, 39));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastre-se");

        textField1.setForeground(new java.awt.Color(242, 242, 242));
        textField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textField1.setHint("Nome");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        textField2.setForeground(new java.awt.Color(242, 242, 242));
        textField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textField2.setHint("Email");
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });

        textField3.setForeground(new java.awt.Color(242, 242, 242));
        textField3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textField3.setHint("Nome de usuário");
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });

        password1.setForeground(new java.awt.Color(242, 242, 242));
        password1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        password1.setHint("Senha");

        button1.setBackground(new java.awt.Color(242, 242, 242));
        button1.setForeground(new java.awt.Color(76, 76, 76));
        button1.setText("Cadastrar");
        button1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N


        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    button1ActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        String nome = textField1.getText();
        String email = textField2.getText();
        String nomeUsuario = textField3.getText();
        String senha = new String(password1.getPassword());

        List<Assistente> assistentes = JsonUtil.carregarAssistentes();

        boolean usuarioExiste = assistentes.stream().anyMatch(a -> a.getNomeUsuario().equals(nomeUsuario));
        boolean emailExiste = assistentes.stream().anyMatch(a -> a.getEmail().equals(email));
        if (usuarioExiste) {
            JOptionPane.showMessageDialog(this, "Este nome de usuário já está em uso!");
        } else if (emailExiste) {
            JOptionPane.showMessageDialog(this, "Este email já está em uso!");
        } else {
            Assistente assistente = Assistente.builder()
                    .nome(nome)
                    .email(email)
                    .nomeUsuario(nomeUsuario)
                    .senha(senha)
                    .build();

            assistentes.add(assistente);
            JsonUtil.salvarDados(assistentes, "assistentes.json");

            System.out.println("Assistente criado: " + assistente.getNomeUsuario());

            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            password1.setText("");

            LoginAndRegister parent = (LoginAndRegister) SwingUtilities.getAncestorOfClass(LoginAndRegister.class, this);
            if (parent != null) {
                parent.showLogin(true);
            }
        }
     }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private javax.swing.JLabel jLabel1;
    private swing.Password password1;
    private swing.TextField textField1;
    private swing.TextField textField2;
    private swing.TextField textField3;
    // End of variables declaration//GEN-END:variables
}
