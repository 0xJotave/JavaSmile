/*
 * Copyright 2024 Pedro Paulo Delgado Alves e João Victor Moura Barbosa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The software licensed under the Apache License, Version 2.0 is further
 * subject to the Commons Clause License Condition v1.0.
 */

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
