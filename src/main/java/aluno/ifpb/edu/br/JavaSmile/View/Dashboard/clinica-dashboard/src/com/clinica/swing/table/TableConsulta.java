package com.clinica.swing.table;

import com.clinica.swing.scrollbar.ScrollBarCustom;
import com.clinica.swing.table.action.ActionConsulta;
import com.clinica.swing.table.modelAction.ModelActionConsulta;
import com.clinica.swing.table.modelProfile.ModelProfileConsulta;
import com.clinica.swing.table.profile.ProfileConsulta;
import com.clinica.swing.table.tableCellAction.TableCellActionConsulta;
import java.awt.Color;
import java.awt.Component;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
// Essa classe exibe os dados de ModelConsulta e ações relacionadas as consultas
// tipo editar e deletar.
// Define como os dados são renderizados e manipulados na interface.
public class TableConsulta extends JTable {

    public TableConsulta() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false); //impede reordenar as colunas.
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 == 4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        }); //centraliza o texto na quarta coluna.
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean focus, int i, int i1) {
                if (o instanceof ModelProfileConsulta) {
                    // Exibe dados do perfil de contula(nome, dentista, etc).
                    ModelProfileConsulta data = (ModelProfileConsulta) o;
                    //painel customizado <no design coloquei so "NAME" aí pode ate ver que fica como
                    //se fosse um panel por cima da tabela e nele fica o nome.
                    ProfileConsulta cell = new ProfileConsulta(data);
                    if (selected) {
                        cell.setBackground(new Color(239, 244, 255));
                    } else {
                        cell.setBackground(Color.WHITE);
                    }
                    return cell;

                } else if (o instanceof ModelActionConsulta) {
                    //Renderiza os botões de ação editar e deletar para cada linha.
                    ModelActionConsulta data = (ModelActionConsulta) o;
                    ActionConsulta cell = null;
                    try {
                        cell = new ActionConsulta(data);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    if (selected) {
                        cell.setBackground(new Color(239, 244, 255));
                    } else {
                        cell.setBackground(Color.WHITE);
                    }
                    return cell;
                } else {
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, focus, i, i1);
                    setBorder(noFocusBorder);
                    com.setForeground(new Color(102, 102, 102));
                    if (selected) {
                        com.setBackground(new Color(239, 244, 255));
                    } else {
                        com.setBackground(Color.WHITE);
                    }
                    return com;
                }
            }
        }); //Renderiza o que cada coluna recebe de acordo com o tipo de dado.
    }

    //diz qual editor vai ser usado para células,
    // aí pra coluna de ações usa tablecellactionconsulta
    @Override
    public TableCellEditor getCellEditor(int row, int col) {
        if (col > 0) {
            return new TableCellActionConsulta();
        } else {
            return super.getCellEditor(row, col);
        }
    }

    //adiciona uma nova linha à tabela com os dados da consulta.
    public void addRow(Object[] row) {
        DefaultTableModel mod = (DefaultTableModel) getModel();
        mod.addRow(row);
    }
    //muda so o scroll de subir e descer, tipo cor e tal.
    public void fixTable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
}
