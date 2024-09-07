package com.clinica.swing.table.tableCellAction;

import com.clinica.swing.table.action.ActionConsulta;
import com.clinica.swing.table.modelAction.ModelActionConsulta;

import java.awt.Color;
import java.awt.Component;
import java.io.IOException;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;


public class TableCellActionConsulta extends DefaultCellEditor{
    
    private ModelActionConsulta data;
    
    public TableCellActionConsulta() {
        super(new JCheckBox());
    }
    
    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) {
        data = (ModelActionConsulta)o;
        ActionConsulta cell = null;
        try {
            cell = new ActionConsulta(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        cell.setBackground(new Color(239, 244, 255));
        return cell;
    } 
    
    @Override
    public Object getCellEditorValue() {        
        return data;
    }
    
}
