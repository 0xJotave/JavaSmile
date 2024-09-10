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

package com.clinica.form;

import aluno.ifpb.edu.br.JavaSmile.Controller.FormConsultaController;

import aluno.ifpb.edu.br.JavaSmile.Model.Consulta;
import com.clinica.dialog.Message;
import com.clinica.home.HomeDash;
import com.clinica.swing.table.eventAction.EventActionConsulta;
import java.io.IOException;

// Exibir e gerenciar a lista de consultas no sistema.
public class FormConsultas extends javax.swing.JPanel {
    private com.clinica.swing.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public static com.clinica.swing.table.TableConsulta tableConsulta2;
    FormConsultaController controller;

    //Este é o construtor da classe que inicializa a interface gráfica chamando o método initComponents.
    // Ele também configura a tabela de consultas e carrega os dados das consultas utilizando initDataConsulta.
    public FormConsultas() throws IOException {
        initComponents();
        tableConsulta2.fixTable(jScrollPane2);
        setOpaque(false);
        controller = new FormConsultaController();
        controller.carregarConsultas();
        initDataConsulta();
    }
    //Método que inicializa os dados de consulta, chamando o método initTableDataConsulta
    // para carregar as consultas do arquivo JSON.
    private void initDataConsulta() throws IOException {
        initTableDataConsulta();
    }
    //Para cada consulta, o método cria uma linha na tabela, associando um EventActionConsulta
    // que define o comportamento para a exclusão e atualização de consultas.
    private void initTableDataConsulta() throws IOException {
        //define as ações de evento para as consultas.
       EventActionConsulta eventActionCon = new EventActionConsulta() {           
           @Override
           public void delete(Consulta consulta) throws IOException {
           }

           @Override
           public void update(Consulta paciente) {
                
           }
        };
       // adiciona cada consulta na tabela ja configurada as ações
        for (Consulta consulta : controller.getConsultas()) {
            tableConsulta2.addRow(consulta.toRowTable(eventActionCon));

        }
    }


    //era pra exibir uma mensagem usando a classe Message la do pacote dialog.
    private boolean showMessage(String message) {
        Message obj = new Message(HomeDash.getFrames()[0], true);
        obj.showMessage(message);
        return obj.isOk();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableConsulta2 = new com.clinica.swing.table.TableConsulta();
        button1 = new com.clinica.swing.Button();

        setBackground(new java.awt.Color(239, 239, 239));
        setPreferredSize(new java.awt.Dimension(750, 650));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(734, 500));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Dados da Consulta");

        tableConsulta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "Dentista", "Procedimento", "Horario", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableConsulta2);

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/icon/adicionar.png"))); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    button1ActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
    }// </editor-fold>//GEN-END:initComponents

    //botao de adicionar consulta
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_button1ActionPerformed
        AdicionarConsultaFrame adicionarConsulta = new AdicionarConsultaFrame();
        adicionarConsulta.setVisible(true);
    }
}
