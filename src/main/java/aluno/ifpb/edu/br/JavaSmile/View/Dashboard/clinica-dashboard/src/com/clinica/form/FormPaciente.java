package com.clinica.form;

import aluno.ifpb.edu.br.JavaSmile.Controller.FormPacienteController;
import aluno.ifpb.edu.br.JavaSmile.Controller.JsonUtil;
import aluno.ifpb.edu.br.JavaSmile.Model.Paciente;
import com.clinica.dialog.Message;
import com.clinica.main.HomeDash;
import com.clinica.model.ModelPaciente;
import com.clinica.swing.table.eventAction.EventAction;
import java.io.IOException;
import java.util.List;

public class FormPaciente extends javax.swing.JPanel {

    FormPacienteController controller;
        
    public FormPaciente() throws IOException {
        initComponents();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
        controller = new FormPacienteController();
        controller.carregarPacientes();
        initData();
    }

    private void initData() throws IOException {
        initTableData();
    }

    private void initTableData() throws IOException {
        EventAction eventAction = new EventAction() {
           @Override
           public void delete(Paciente paciente) throws IOException {
               controller.deletarPaciente(paciente);
            }

           @Override
           public void update(Paciente paciente) {
                
           }
        };
        for (Paciente paciente : controller.getPacientes()) {
            table1.addRow(paciente.toRowTable(eventAction));
        }

    }

    public void refreshTable() throws IOException {
        table1.clearTable();
        initTableData();
    }

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
        button1 = new com.clinica.swing.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.clinica.swing.table.Table();

        setBackground(new java.awt.Color(239, 239, 239));
        setPreferredSize(new java.awt.Dimension(750, 650));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(734, 500));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Dados do Paciente");

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/icon/adicionar.png"))); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Contato", "Idade", "Peso", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 563, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
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

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        AdicionarPacienteFrame adicionarPaciente = new AdicionarPacienteFrame();
        adicionarPaciente.setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.clinica.swing.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static com.clinica.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
