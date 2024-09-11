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

package main;


import javax.swing.ImageIcon;

import aluno.ifpb.edu.br.JavaSmile.Controller.JsonUtil;
import aluno.ifpb.edu.br.JavaSmile.Model.Assistente;
import aluno.ifpb.edu.br.JavaSmile.Model.Consulta;
import aluno.ifpb.edu.br.JavaSmile.Model.Paciente;
import aluno.ifpb.edu.br.JavaSmile.Model.Procedimento;
import swing.EventLogin;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main extends javax.swing.JFrame {
    private login.LoginAndRegister loginAndRegister1;
    private javax.swing.JPanel main;

    public Main() {
        initComponents();
        setTitle("Java Smile");
        ImageIcon img = new ImageIcon(getClass().getResource("/icon/teste.png"));
        setIconImage(img.getImage());
        EventLogin event = new EventLogin() {
            @Override
            public void loginDone() {
                main.removeAll();
                main.revalidate();
                main.repaint();
                dispose();
            }
        };
        loginAndRegister1.setEventLogin(event);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        loginAndRegister1 = new login.LoginAndRegister();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        main.setMinimumSize(new java.awt.Dimension(1150, 650));
        main.setLayout(new java.awt.BorderLayout());

        loginAndRegister1.setPreferredSize(new java.awt.Dimension(1150, 650));
        main.add(loginAndRegister1, java.awt.BorderLayout.CENTER);

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            Assistente assistente1 = Assistente.builder()
                    .nome("João Victor")
                    .email("joaovmb15@gmail.com")
                    .senha("123")
                    .nomeUsuario("eujotave")
                    .build();
            Assistente assistente2 = Assistente.builder()
                    .nome("Pedro Paulo")
                    .email("pedin@gmail.com")
                    .senha("12345")
                    .nomeUsuario("pedin")
                    .build();

            Paciente paciente1 = Paciente.builder()
                    .nome("Joãozin")
                    .contato("joaozin@gmail.com")
                    .idade(19)
                    .peso(68)
                    .build();
            Paciente paciente2 = Paciente.builder()
                    .nome("Pedin")
                    .contato("pedin@gmail.com")
                    .idade(23)
                    .peso(73)
                    .build();
            Paciente paciente3 = Paciente.builder()
                    .nome("Xerel")
                    .contato("xerel@gmail.com")
                    .idade(60)
                    .peso(90)
                    .build();
            Procedimento procedimento1 = Procedimento.builder()
                    .tratamento("Canal")
                    .valor(800)
                    .build();
            Procedimento procedimento2 = Procedimento.builder()
                    .tratamento("Manutenção")
                    .valor(90)
                    .build();
            Procedimento procedimento3 = Procedimento.builder()
                    .tratamento("Cirurgia")
                    .valor(2500)
                    .build();

            Consulta consulta1 = Consulta.builder()
                    .paciente(paciente1.getNome())
                    .procedimento(procedimento1.getTratamento())
                    .dentista("Dr. Antonio")
                    .horario("07:00")
                    .build();
            Consulta consulta2 = Consulta.builder()
                    .paciente(paciente2.getNome())
                    .procedimento(procedimento2.getTratamento())
                    .dentista("Dr. André")
                    .horario("09:00")
                    .build();
            Consulta consulta3 = Consulta.builder()
                    .paciente(paciente3.getNome())
                    .procedimento(procedimento3.getTratamento())
                    .dentista("Dr. Hugo")
                    .horario("14:30")
                    .build();
            List<Assistente> assistenteList = new ArrayList<>();
            assistenteList.add(assistente1);
            assistenteList.add(assistente2);
            JsonUtil.salvarDados(assistenteList, "assistentes.json");

            List<Consulta> consultaList = new ArrayList<>();
            consultaList.add(consulta1);
            consultaList.add(consulta2);
            consultaList.add(consulta3);
            JsonUtil.salvarDados(consultaList, "consultas.json");

            List<Procedimento> procedimentoList = new ArrayList<>();
            procedimentoList.add(procedimento1);
            procedimentoList.add(procedimento2);
            procedimentoList.add(procedimento3);
            JsonUtil.salvarDados(procedimentoList, "procedimentos.json");

            List<Paciente> pacienteList = new ArrayList<>();
            pacienteList.add(paciente1);
            pacienteList.add(paciente2);
            pacienteList.add(paciente3);
            JsonUtil.salvarDados(pacienteList, "pacientes.json");
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
