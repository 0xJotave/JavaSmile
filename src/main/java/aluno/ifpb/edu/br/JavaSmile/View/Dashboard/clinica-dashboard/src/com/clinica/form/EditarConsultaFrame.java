package com.clinica.form;

import static com.clinica.form.FormConsultas.tableConsulta2;
import static com.clinica.form.FormPaciente.table1;

import aluno.ifpb.edu.br.JavaSmile.Controller.AssistenteController;
import aluno.ifpb.edu.br.JavaSmile.Controller.JsonUtil;
import aluno.ifpb.edu.br.JavaSmile.Model.Clinica;
import aluno.ifpb.edu.br.JavaSmile.Model.Consulta;
import aluno.ifpb.edu.br.JavaSmile.Model.Paciente;
import aluno.ifpb.edu.br.JavaSmile.Model.Procedimento;
import com.clinica.model.ModelConsulta;
import com.clinica.swing.table.eventAction.EventActionConsulta;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditarConsultaFrame extends javax.swing.JFrame {

    private EventActionConsulta eventActionConsulta;
    
    public EditarConsultaFrame() throws IOException {
        initComponents();
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        preencherPacientesBox();
        preencherProcedimentoBox();
    }

    private void preencherPacientesBox() throws IOException {
        try {
            Clinica clinica = Clinica.getInstance();
            java.util.List<Paciente> pacientes = JsonUtil.carregarPacientes();
            String[] nomesPacientes = pacientes.stream()
                    .map(Paciente::getNome)
                    .toArray(String[]::new);
            pacienteBox.setModel(new javax.swing.DefaultComboBoxModel<>(nomesPacientes));
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar pacientes!");
        }
    }
    private void preencherProcedimentoBox() throws IOException {
        try {
            Clinica clinica = Clinica.getInstance();
            java.util.List<Procedimento> procedimentos = JsonUtil.carregarProcedimentos();
            String[] tratamentosProcedimentos = procedimentos.stream()
                    .map(Procedimento::getTratamento)
                    .toArray(String[]::new);
            procedimentoBox.setModel(new javax.swing.DefaultComboBoxModel<>(tratamentosProcedimentos));
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar procedimentos!");
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pacienteBox) {
            System.out.println(pacienteBox.getSelectedItem());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pacienteLabel = new javax.swing.JLabel();
        dentistaLabel = new javax.swing.JLabel();
        procedimentoLabel = new javax.swing.JLabel();
        horarioLabel = new javax.swing.JLabel();
        salvarButton = new com.clinica.swing.Button();
        jLabel1 = new javax.swing.JLabel();
        horarioField = new javax.swing.JTextField();
        dentistaField = new javax.swing.JTextField();
        button1 = new com.clinica.swing.Button();
        button2 = new com.clinica.swing.Button();
        procedimentoBox = new javax.swing.JComboBox<>();
        pacienteBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        pacienteLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        pacienteLabel.setText("Paciente");

        dentistaLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        dentistaLabel.setText("Dentista");

        procedimentoLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        procedimentoLabel.setText("Procedimento");

        horarioLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        horarioLabel.setText("Horário");

        salvarButton.setBackground(new java.awt.Color(0, 0, 153));
        salvarButton.setForeground(new java.awt.Color(255, 255, 255));
        salvarButton.setText("Atualizar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    salvarButtonActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Dados da Consulta");

        horarioField.setBackground(new java.awt.Color(246, 246, 246));
        horarioField.setDisabledTextColor(new java.awt.Color(225, 225, 225));
        horarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioFieldActionPerformed(evt);
            }
        });

        dentistaField.setBackground(new java.awt.Color(250, 250, 250));
        dentistaField.setForeground(new java.awt.Color(51, 51, 51));

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/icon/fechar.png"))); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/icon/logo60x60.png"))); // NOI18N

        procedimentoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        procedimentoBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        pacienteBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pacienteBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dentistaLabel)
                    .addComponent(pacienteLabel)
                    .addComponent(procedimentoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dentistaField, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(horarioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(procedimentoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pacienteBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pacienteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dentistaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dentistaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procedimentoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(procedimentoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horarioLabel)
                    .addComponent(horarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void horarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horarioFieldActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_salvarButtonActionPerformed
        String dentistaNovo = dentistaField.getText();
        String horarioNovo = horarioField.getText();
        int rowIndex = tableConsulta2.getSelectedRow();
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Nenhuma consulta selecionada!");
        }

        AssistenteController assistenteController = new AssistenteController();
        Clinica clinica = Clinica.getInstance();
        List<Consulta> consultaLista = JsonUtil.carregarConsultas();

        Consulta consultaAtual = consultaLista.get(rowIndex);
        Consulta consultaAtualizada = assistenteController.criarConsulta(pacienteBox.getSelectedItem().toString(),
                dentistaNovo, procedimentoBox.getSelectedItem().toString(),
                horarioNovo);

        try {
            JsonUtil.atualizarDados(consultaAtual, consultaAtualizada);
        } catch (JsonMappingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar consulta!");
        }

        DefaultTableModel model = (DefaultTableModel) tableConsulta2.getModel();
        model.removeRow(rowIndex);
        model.insertRow(rowIndex, consultaAtualizada.toRowTable(eventActionConsulta));
        dentistaField.setText("");
        horarioField.setText("");
        pacienteBox.setSelectedIndex(0);
        procedimentoBox.setSelectedIndex(0);
        JOptionPane.showMessageDialog(this, "Consulta editada com sucesso!");
        dispose();
        JsonUtil.salvarDados(consultaLista, "consultas.json");
        
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        dispose();
    }//GEN-LAST:event_button1ActionPerformed
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.clinica.swing.Button button1;
    private com.clinica.swing.Button button2;
    private javax.swing.JTextField dentistaField;
    private javax.swing.JLabel dentistaLabel;
    private javax.swing.JTextField horarioField;
    private javax.swing.JLabel horarioLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> pacienteBox;
    private javax.swing.JLabel pacienteLabel;
    private javax.swing.JComboBox<String> procedimentoBox;
    private javax.swing.JLabel procedimentoLabel;
    private com.clinica.swing.Button salvarButton;
    // End of variables declaration//GEN-END:variables
}