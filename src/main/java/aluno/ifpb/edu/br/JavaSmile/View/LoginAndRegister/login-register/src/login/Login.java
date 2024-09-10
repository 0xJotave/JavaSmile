/*
 * Copyright 2024 Pedro Paulo Delgado Alves
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The software licensed under the Apache License, Version 2.0 is further
 * subject to the Commons Clause License Condition v1.0.
 */

package login;

import aluno.ifpb.edu.br.JavaSmile.Controller.GoogleAuthExample;
import aluno.ifpb.edu.br.JavaSmile.Controller.LoginAndRegisterController;
import com.clinica.home.HomeDash;
import lombok.Data;
import swing.EventLogin;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

@Data
public class Login extends login.PanelCustom {
    private swing.Button button1;
    private javax.swing.JButton button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private swing.Password password1;
    private swing.TextField textField3;
    private login.JCheckBoxCustom jCheckBoxCustom2;
    private EventLogin event;
    LoginAndRegisterController controller;
    
    public Login() {
        initComponents();
        setAlpha(1);
        controller = new LoginAndRegisterController();
    }
    public void setEventLogin(EventLogin event) {
        this.event = event;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new swing.Button();
        password1 = new swing.Password();
        textField3 = new swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button2 = new javax.swing.JButton();
        jCheckBoxCustom2 = new login.JCheckBoxCustom();

        setBackground(new java.awt.Color(242, 242, 242));
        setPreferredSize(new java.awt.Dimension(300, 370));

        button1.setBackground(new java.awt.Color(0, 21, 34));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("LOGIN");
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

        password1.setForeground(new java.awt.Color(76, 76, 76));
        password1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        password1.setHint("Senha");
        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });

        textField3.setForeground(new java.awt.Color(76, 76, 76));
        textField3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textField3.setHint("Nome de usuário");
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 76, 76));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel2.setForeground(new java.awt.Color(76, 76, 76));
        jLabel2.setText("Ou entre com ");

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/google.png"))); // NOI18N
        button2.setContentAreaFilled(false);
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        jCheckBoxCustom2.setBackground(new java.awt.Color(0, 21, 34));
        jCheckBoxCustom2.setText("Salvar informações de Login");
        jCheckBoxCustom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCustom2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(password1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(40, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jCheckBoxCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBoxCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(36, Short.MAX_VALUE))
        );
    }

    private void jCheckBoxCustom2ActionPerformed(ActionEvent evt) {
    }

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
    }

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    }

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        GoogleAuthExample googleAuth = new GoogleAuthExample(event);
        try {
            boolean deletarCredenciais = !jCheckBoxCustom2.isSelected();
            googleAuth.authenticateWithGoogle(deletarCredenciais);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro na autenticação com google");
        }
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_button1ActionPerformed
        String nomeUsuario = textField3.getText();
        String senha = new String(password1.getPassword());

        controller.carregarAssistentes();

        if (controller.getAssistentes() != null) {
            boolean loginValido = controller.getAssistentes().stream().anyMatch(
                    assistente -> assistente.getNomeUsuario().equals(nomeUsuario) &&
                            assistente.getSenha().equals(senha));

            if (loginValido) {
                if (event != null) {
                    textField3.setText("");
                    password1.setText("");
                    HomeDash homeDash = new HomeDash();
                    homeDash.setVisible(true);
                    event.loginDone();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Nome de Usuário ou Senha Incorretos");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum Assistente encontrado ou erro " +
                    "nos Dados!");
        }
    }
}
