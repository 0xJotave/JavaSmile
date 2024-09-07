package com.clinica.swing.table.action;

import com.clinica.form.EditarConsultaFrame;
import com.clinica.form.FormConsultas;
import static com.clinica.form.FormConsultas.tableConsulta2;
import com.clinica.swing.table.modelAction.ModelActionConsulta;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class ActionConsulta extends javax.swing.JPanel {
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
                System.out.println("Clicou deletar");
                int selectedRow = tableConsulta2.getSelectedRow();
                if (selectedRow >= 0 && selectedRow < tableConsulta2.getRowCount()) {
                    try {
                        data.getEvent().delete(data.getConsulta());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    ((DefaultTableModel) tableConsulta2.getModel()).removeRow(selectedRow);
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
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.clinica.swing.Button cmdDelete;
    private com.clinica.swing.Button cmdEdit;
    // End of variables declaration//GEN-END:variables
}
