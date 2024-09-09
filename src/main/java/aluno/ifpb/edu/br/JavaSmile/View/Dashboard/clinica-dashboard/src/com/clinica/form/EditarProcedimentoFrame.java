package com.clinica.form;

import static com.clinica.form.FormConsultas.tableConsulta2;
import static com.clinica.form.FormPaciente.table1;
import static com.clinica.form.FormProcedimento.tableProcedimento2;

import aluno.ifpb.edu.br.JavaSmile.Controller.AssistenteController;
import aluno.ifpb.edu.br.JavaSmile.Controller.JsonUtil;
import aluno.ifpb.edu.br.JavaSmile.Model.Clinica;
import aluno.ifpb.edu.br.JavaSmile.Model.Paciente;
import aluno.ifpb.edu.br.JavaSmile.Model.Procedimento;
import com.clinica.model.ModelProcedimento;
import com.clinica.swing.table.eventAction.EventActionProcedimento;
import com.fasterxml.jackson.databind.JsonMappingException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.List;

public class EditarProcedimentoFrame extends javax.swing.JFrame {
    
    private ProcedimentoCreatedListener onProcedimentoCreated;
     private EventActionProcedimento eventActionProcedimento;
    
    public EditarProcedimentoFrame() {
        initComponents();
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);         
    }


    public interface ProcedimentoCreatedListener {
        void onCreated(Procedimento procedimento);
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tratamentoLabel = new javax.swing.JLabel();
        tratamentoField = new javax.swing.JTextField();
        valorLabel = new javax.swing.JLabel();
        salvarButton = new com.clinica.swing.Button();
        jLabel1 = new javax.swing.JLabel();
        valorField = new javax.swing.JTextField();
        button1 = new com.clinica.swing.Button();
        button2 = new com.clinica.swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        tratamentoLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        tratamentoLabel.setText("Procedimento");

        tratamentoField.setBackground(new java.awt.Color(246, 246, 246));
        tratamentoField.setDisabledTextColor(new java.awt.Color(225, 225, 225));
        tratamentoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tratamentoFieldActionPerformed(evt);
            }
        });

        valorLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        valorLabel.setText("Valor");

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
        jLabel1.setText("Dados do Procedimento");

        valorField.setBackground(new java.awt.Color(246, 246, 246));
        valorField.setDisabledTextColor(new java.awt.Color(225, 225, 225));
        valorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorFieldActionPerformed(evt);
            }
        });

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/icon/fechar.png"))); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/icon/logo60x60.png"))); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valorLabel)
                    .addComponent(tratamentoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tratamentoField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tratamentoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tratamentoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
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

    private void tratamentoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tratamentoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tratamentoFieldActionPerformed

    private void valorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorFieldActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_salvarButtonActionPerformed
        String tratamentoNovo = tratamentoField.getText();
        double valorNovo = Double.parseDouble(valorField.getText());

        int rowIndex = tableProcedimento2.getSelectedRow();
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum procedimento selecionado!");
        }

        AssistenteController assistenteController = new AssistenteController();
        Clinica clinica = Clinica.getInstance();
        List<Procedimento> procedimentoLista = JsonUtil.carregarProcedimentos();

        Procedimento procedimentoAtual = procedimentoLista.get(rowIndex);
        Procedimento procedimentoAtualizado = assistenteController.criarProcedimento(tratamentoNovo,
                valorNovo);

        try {
            JsonUtil.atualizarDados(procedimentoAtual, procedimentoAtualizado);
        } catch (JsonMappingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar procedimento!");
        }

        DefaultTableModel model = (DefaultTableModel) tableProcedimento2.getModel();
        model.removeRow(rowIndex);
        model.insertRow(rowIndex, procedimentoAtualizado.toRowTable(eventActionProcedimento));
        tratamentoField.setText("");
        valorField.setText("");
        JOptionPane.showMessageDialog(this, "Procedimento editado com sucesso!");
        dispose();
        JsonUtil.salvarDados(procedimentoLista, "procedimentos.json");


    }//GEN-LAST:event_salvarButtonActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        
    }//GEN-LAST:event_button2ActionPerformed
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.clinica.swing.Button button1;
    private com.clinica.swing.Button button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private com.clinica.swing.Button salvarButton;
    private javax.swing.JTextField tratamentoField;
    private javax.swing.JLabel tratamentoLabel;
    private javax.swing.JTextField valorField;
    private javax.swing.JLabel valorLabel;
    // End of variables declaration//GEN-END:variables
}