package com.clinica.form;

import static com.clinica.form.FormPaciente.table1;

import aluno.ifpb.edu.br.JavaSmile.Controller.FormPacienteController;
import aluno.ifpb.edu.br.JavaSmile.Model.Paciente;
import com.clinica.swing.table.eventAction.EventAction;
import lombok.Data;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;

@Data
public class EditarPacienteFrame extends javax.swing.JFrame {
    private com.clinica.swing.Button button1;
    private com.clinica.swing.Button button2;
    private javax.swing.JTextField contatoField;
    private javax.swing.JLabel contatoLabel;
    private javax.swing.JTextField idadeField;
    private javax.swing.JLabel idadeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField pesoField;
    private javax.swing.JLabel pesoLabel;
    private com.clinica.swing.Button salvarButton;
    private FormPacienteController controller;
    private EventAction eventAction;
    private boolean editado;

    public EditarPacienteFrame() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        controller = new FormPacienteController();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        contatoLabel = new javax.swing.JLabel();
        idadeLabel = new javax.swing.JLabel();
        idadeField = new javax.swing.JTextField();
        pesoLabel = new javax.swing.JLabel();
        salvarButton = new com.clinica.swing.Button();
        jLabel1 = new javax.swing.JLabel();
        pesoField = new javax.swing.JTextField();
        contatoField = new javax.swing.JTextField();
        button1 = new com.clinica.swing.Button();
        button2 = new com.clinica.swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        nomeLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nomeLabel.setText("Nome");

        nomeField.setBackground(new java.awt.Color(250, 250, 250));
        nomeField.setForeground(new java.awt.Color(51, 51, 51));

        contatoLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        contatoLabel.setText("Contato");

        idadeLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        idadeLabel.setText("Idade");

        idadeField.setBackground(new java.awt.Color(246, 246, 246));
        idadeField.setDisabledTextColor(new java.awt.Color(225, 225, 225));
        idadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeFieldActionPerformed(evt);
            }
        });

        pesoLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        pesoLabel.setText("Peso");

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
        jLabel1.setText("Dados do Paciente");

        pesoField.setBackground(new java.awt.Color(246, 246, 246));
        pesoField.setDisabledTextColor(new java.awt.Color(225, 225, 225));
        pesoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoFieldActionPerformed(evt);
            }
        });

        contatoField.setBackground(new java.awt.Color(250, 250, 250));
        contatoField.setForeground(new java.awt.Color(51, 51, 51));

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/icon/fechar.png"))); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/icon/logo60x60.png"))); // NOI18N

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
                                                .addGap(54, 54, 54)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(contatoLabel)
                                                        .addComponent(nomeLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(contatoField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(136, 136, 136)
                                                .addComponent(idadeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(idadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9)
                                                .addComponent(pesoLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(salvarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
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
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(contatoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(contatoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idadeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pesoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pesoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void idadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeFieldActionPerformed
    }

    private void pesoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoFieldActionPerformed
    }

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_salvarButtonActionPerformed
        String nomeNovo = nomeField.getText();
        String contatoNovo = contatoField.getText();
        int idadeNova = Integer.parseInt(idadeField.getText());
        double pesoNovo = Double.parseDouble(pesoField.getText());
        int rowIndex = table1.getSelectedRow();

        controller.atualizarPaciente(rowIndex, nomeNovo, contatoNovo, idadeNova, pesoNovo);
        Paciente pacienteAtualizado = controller.getPacientes().get(rowIndex);

        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.removeRow(rowIndex);
        model.insertRow(rowIndex, pacienteAtualizado.toRowTable(eventAction));

        nomeField.setText("");
        contatoField.setText("");
        idadeField.setText("");
        pesoField.setText("");
        JOptionPane.showMessageDialog(this, "Paciente editado com sucesso!");
        dispose();

    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        dispose();
    }
}