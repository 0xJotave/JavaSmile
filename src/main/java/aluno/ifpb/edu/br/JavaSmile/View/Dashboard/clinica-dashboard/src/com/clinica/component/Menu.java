package com.clinica.component;

import com.clinica.event.EventMenu;
import com.clinica.event.EventMenuSelected;
import com.clinica.model.ModelMenu;
import com.clinica.swing.MenuAnimation;
import com.clinica.swing.MenuItem;
import com.clinica.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

import lombok.Data;
import net.miginfocom.swing.MigLayout;

@Data
public class Menu extends javax.swing.JPanel {
    private javax.swing.JPanel panel;
    private com.clinica.component.Profile profile1;
    private javax.swing.JScrollPane sp;
    private final MigLayout layout;
    private EventMenuSelected event;
    private boolean enableMenu = true;
    private boolean showMenu = true;

    public boolean isShowMenu() {
        return showMenu;
    }
    public void addEvent(EventMenuSelected event) {
        this.event = event;
    }
    
    public Menu() {
        initComponents();
        setOpaque(false);
        sp.getViewport().setOpaque(false);
        sp.setVerticalScrollBar(new ScrollBarCustom());
        layout = new MigLayout("wrap, fillx, insets0", "[fill]", "[]0[]");
        panel.setLayout(layout);        
    }
    
    public void initMenuItem() {
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/clinica/icon/inicio.png")), "Dashboard", "Home"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/clinica/icon/paciente.png")), "Pacientes", "Listar"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/clinica/icon/procedimentos.png")), "Procedimentos", "Listar"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/clinica/icon/consultas.png")), "Consultas", "Listar"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/clinica/icon/usuario.png")), "Usuário", "Logout"));
    }
    
    private void addMenu(ModelMenu menu) {
        panel.add(new MenuItem(menu, getEventMenu(), event, panel.getComponentCount()), "h 40!");
    }
    
    private EventMenu getEventMenu() {
        return new EventMenu() {
            @Override
            public boolean menuPressed(Component com, boolean open) {
                if(enableMenu) {
                    if(showMenu) {
                        if(open) {
                            new MenuAnimation(layout, com).openMenu();
                        } else {
                            new MenuAnimation(layout, com).closeMenu();
                        }
                        return true;
                    }
                }
                return false;
            }
        };
    }
    
    public void hideallMenu() {
        for(Component com:panel.getComponents()) {
            MenuItem item = (MenuItem)com;
            if(item.isOpen()) {
                new MenuAnimation(layout, com, 500).closeMenu();
                item.setOpen(false);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        profile1 = new com.clinica.component.Profile();

        sp.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        sp.setFocusable(false);

        panel.setOpaque(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        sp.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0, new Color(1, 46,64), 1000, 1000, new Color(173, 216, 230));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }
}
