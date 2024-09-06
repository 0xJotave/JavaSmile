package com.clinica.swing.table.action;

import com.clinica.form.EditarProcedimentoFrame;
import static com.clinica.form.FormConsultas.tableConsulta2;
import com.clinica.form.FormProcedimento;
import static com.clinica.form.FormProcedimento.tableProcedimento2;
import com.clinica.swing.table.modelAction.ModelActionProcedimento;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ActionProcedimento extends javax.swing.JPanel {

    
    public ActionProcedimento(ModelActionProcedimento data) {
        
        EditarProcedimentoFrame editar = new EditarProcedimentoFrame();
        initComponents();
        
        cmdEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //data.getEvent().update(data.getProcedimento());
                editar.setVisible(true);
            }
        });
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int selectedRow = tableProcedimento2.getSelectedRow();
                if (selectedRow >= 0 && selectedRow < tableProcedimento2.getRowCount()) {
                    try {
                        data.getEvent().delete(data.getProcedimento());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    ((DefaultTableModel) tableProcedimento2.getModel()).removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha válida para deletar.");
                }
            }
        });
    }
    
    private void removeSelectedRow(){
        DefaultTableModel model = (DefaultTableModel) FormProcedimento.tableProcedimento2.getModel();
        int[] selectedRows = FormProcedimento.tableProcedimento2.getSelectedRows();
        for (int i = selectedRows.length - 1; i >= 0; i--) {
            model.removeRow(selectedRows[i]);
        }
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
                .addContainerGap()
                .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
