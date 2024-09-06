package com.clinica.swing.table.tableCellAction;

import com.clinica.form.FormPaciente;
import com.clinica.swing.table.action.Action;
import com.clinica.swing.table.modelAction.ModelAction;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;


public class TableCellAction extends DefaultCellEditor{
    
    private ModelAction data;
    
    
    public TableCellAction() {
        super(new JCheckBox());
        
    }
    
    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) {
        data = (ModelAction)o;
        Action cell = new Action(data);
        cell.setBackground(new Color(239, 244, 255));
        return cell;
    } 
    
    @Override
    public Object getCellEditorValue() {        
        return data;
    }
    
}
