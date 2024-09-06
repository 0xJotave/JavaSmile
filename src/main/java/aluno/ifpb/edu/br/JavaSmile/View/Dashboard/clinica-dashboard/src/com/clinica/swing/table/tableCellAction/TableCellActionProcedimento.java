package com.clinica.swing.table.tableCellAction;

import com.clinica.swing.table.action.ActionProcedimento;
import com.clinica.swing.table.modelAction.ModelActionProcedimento;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableCellActionProcedimento extends DefaultCellEditor {

    private ModelActionProcedimento data;

    public TableCellActionProcedimento() {
        super(new JCheckBox());
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) {
        data = (ModelActionProcedimento) o;
        ActionProcedimento cell = new ActionProcedimento(data);
        cell.setBackground(new Color(239, 244, 255));
        return cell;
    }

    //  This method to pass data to cell render when focus lose in cell
    @Override
    public Object getCellEditorValue() {
        return data;
    }
}
