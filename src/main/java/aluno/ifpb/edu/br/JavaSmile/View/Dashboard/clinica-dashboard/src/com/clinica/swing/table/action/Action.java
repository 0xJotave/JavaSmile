package com.clinica.swing.table.action;

import aluno.ifpb.edu.br.JavaSmile.Controller.FormPacienteController;
import aluno.ifpb.edu.br.JavaSmile.Model.Paciente;
import com.clinica.form.AdicionarPacienteFrame;
import com.clinica.form.EditarPacienteFrame;

import static com.clinica.form.FormPaciente.table1;

import com.clinica.form.FormPaciente;
import com.clinica.swing.table.modelAction.ModelAction;
import lombok.Data;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Action extends javax.swing.JPanel {
    private com.clinica.swing.Button cmdDelete;
    private com.clinica.swing.Button cmdEdit;
    FormPacienteController controller = new FormPacienteController();
    private String contatoNovoPaciente;

    public Action(ModelAction data) throws IOException {
        EditarPacienteFrame editar = new EditarPacienteFrame();

        initComponents();
        cmdEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                editar.setVisible(true);
            }
        });
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    controller.carregarPacientes();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                int selectedRow = table1.getSelectedRow();

                // Verifica se a célula está sendo editada e para a edição
                if (table1.getCellEditor() != null) {
                    table1.getCellEditor().stopCellEditing();
                }

                // Verifica se a linha selecionada é válida
                if (selectedRow >= 0 && selectedRow < table1.getRowCount()) {
                    try {
                        ((DefaultTableModel) table1.getModel()).removeRow(selectedRow);
                        data.getPaciente().setContato(controller.getPacientes().get(selectedRow).getContato());
                        contatoNovoPaciente = data.getPaciente().getContato();
                        for (Paciente paciente : controller.getPacientes()) {
                            if (paciente.getContato().equals(contatoNovoPaciente)) {
                                data.setPaciente(paciente);
                            }
                        }
                        if (data.getEvent() != null) {
                            controller.deletarPaciente(data.getPaciente());
                            System.out.println("Deletou " + contatoNovoPaciente);
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

        cmdEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/icon/edit.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
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
}
