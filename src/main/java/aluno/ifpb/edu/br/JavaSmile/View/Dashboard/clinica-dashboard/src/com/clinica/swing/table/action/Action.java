package com.clinica.swing.table.action;

import aluno.ifpb.edu.br.JavaSmile.Model.Clinica;
import com.clinica.form.EditarPacienteFrame;
import static com.clinica.form.FormConsultas.tableConsulta2;
import com.clinica.form.FormPaciente;
import static com.clinica.form.FormPaciente.table1;
import com.clinica.swing.table.modelAction.ModelAction;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Action extends javax.swing.JPanel {


    public Action(ModelAction data) throws IOException {
        Clinica clinica = Clinica.getInstance();
        EditarPacienteFrame editar = new EditarPacienteFrame();
        initComponents();        
        cmdEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //data.getEvent().update(data.getPaciente());
                editar.setVisible(true);                
            }
        });
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                
                int selectedRow = table1.getSelectedRow();
                if (selectedRow >= 0 && selectedRow < table1.getRowCount()) {
                    try {
                        data.getEvent().delete(data.getPaciente());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    ((DefaultTableModel) table1.getModel()).removeRow(selectedRow);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.clinica.swing.Button cmdDelete;
    private com.clinica.swing.Button cmdEdit;
    // End of variables declaration//GEN-END:variables
}
