package com.clinica.swing.table.action;

import aluno.ifpb.edu.br.JavaSmile.Controller.FormConsultaController;
import aluno.ifpb.edu.br.JavaSmile.Controller.FormPacienteController;
import aluno.ifpb.edu.br.JavaSmile.Model.Consulta;
import aluno.ifpb.edu.br.JavaSmile.Model.Paciente;
import com.clinica.form.EditarConsultaFrame;
import com.clinica.form.FormConsultas;
import static com.clinica.form.FormConsultas.tableConsulta2;
import static com.clinica.form.FormPaciente.table1;

import com.clinica.swing.table.modelAction.ModelActionConsulta;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

//essa classe é usada pela TableConsulta para fornecer os botões de edição e deleção para cada consulta na tabela.
public class ActionConsulta extends javax.swing.JPanel {
    //recebe o objeto ModelActionConsulta que tem os dados e eventos.
    private com.clinica.swing.Button cmdDelete;
    private com.clinica.swing.Button cmdEdit;
    FormConsultaController controller = new FormConsultaController();
    private String horarioNovoConsulta;

    public ActionConsulta(ModelActionConsulta data) throws IOException {
        EditarConsultaFrame editar = new EditarConsultaFrame();
        initComponents();
        cmdEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //data.getEventConsulta().update(data.getPaciente());
                editar.setVisible(true);
            }
        });
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    controller.carregarConsultas();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                int selectedRow = tableConsulta2.getSelectedRow();

                // Verifica se a célula está sendo editada e para a edição
                if (tableConsulta2.getCellEditor() != null) {
                    tableConsulta2.getCellEditor().stopCellEditing();
                }

                // Verifica se a linha selecionada é válida
                if (selectedRow >= 0 && selectedRow < tableConsulta2.getRowCount()) {
                    try {
                        ((DefaultTableModel) tableConsulta2.getModel()).removeRow(selectedRow);
                        data.getConsulta().setHorario(controller.getConsultas().get(selectedRow).getHorario());
                        horarioNovoConsulta = data.getConsulta().getHorario();
                        for (Consulta consulta : controller.getConsultas()) {
                            if (consulta.getHorario().equals(horarioNovoConsulta)) {
                                data.setConsulta(consulta);
                            }
                        }
                        if (data.getEvent() != null) {
                            controller.deletarConsulta(data.getConsulta());
                            System.out.println("Deletou " + horarioNovoConsulta);
                        } else {
                            System.err.println("EventAction não está configurado.");
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha válida para deletar.");
                }
            }
        });
    }
    

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(230, 230, 230));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdDelete = new com.clinica.swing.Button();
        cmdEdit = new com.clinica.swing.Button();

        cmdDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/icon/delete.png"))); // NOI18N
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/icon/edit.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
    }

}
