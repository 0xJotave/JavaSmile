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

package com.clinica.home;

import com.clinica.component.Header;
import com.clinica.component.Menu;
import com.clinica.event.EventMenuSelected;
import com.clinica.form.FormConsultas;
import com.clinica.form.Form_Home;
import com.clinica.form.FormProcedimento;
import com.clinica.form.FormPaciente;
import com.clinica.form.MainForm;
import java.io.IOException;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

import javax.swing.*;


public class HomeDash extends javax.swing.JFrame {
    
    private MigLayout layout;
    private Menu menu;
    private Header header;
    private MainForm main;
    private Animator animator;
    private javax.swing.JLayeredPane bg;
    
    public HomeDash() {
        initComponents();
        init();
    }
    
    private void init() {
        layout = new MigLayout("fill", "0[]0[100%, fill]0", "0[fill, top]0");
        bg.setLayout(layout);
        menu = new Menu();
        header = new Header();
        main = new MainForm();
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int menuIndex, int subMenuIndex) throws IOException {
                System.out.println("Menu Index: " + menuIndex + " SubMenu Index " + subMenuIndex);                
                switch (menuIndex) {
                    case 0:
                        if(subMenuIndex == 0){
                            main.showForm(new Form_Home());
                        }   break;
                    case 1:
                        if(subMenuIndex == 0) {
                            main.showForm(new FormPaciente());
                        }   break;
                    case 2:
                        if(subMenuIndex == 0) {
                            main.showForm(new FormProcedimento());
                        }   break;
                    case 3:
                        if(subMenuIndex == 0) {
                            main.showForm(new FormConsultas());
                        }   break;
                    case 4:
                        if(subMenuIndex == 0) {
                            logout();
                            break;
                        }
                    default:
                        break;
                }
            }                        
        });        
        menu.initMenuItem();
        bg.add(menu, "w 230!, spany 2");
        bg.add(header, "h 50!, wrap");
        bg.add(main, "w 100%, h 100%");  
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if(menu.isShowMenu()) {
                    width = 60 + (170 * (1f - fraction));
                }else {
                    width = 60 + (170 * fraction);
                }
                layout.setComponentConstraints(menu, "w " + width + "!, spany2");
                menu.revalidate();
            }
            
            @Override
            public void end() {
                menu.setShowMenu(!menu.isShowMenu());
                menu.setEnableMenu(true);
            }
        };
        animator = new Animator(500, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);
        //header.addMenuEvent(new ActionListener() {
            //@Override
            //public void actionPerformed(ActionEvent ae) {
               // if(!animator.isRunning()) {
                //    animator.start();
                //}
                //menu.setEnableMenu(false);
                //if(menu.isShowMenu()) {
                //    menu.hideallMenu();
               // }
           // }
        //});
        // Inicia com o form
        main.showForm(new Form_Home());
    }

    public void logout() {
        System.out.println("Usuario fez logout.");
        System.exit(0);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(239, 239, 239));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

}
