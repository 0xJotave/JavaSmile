/*
 * Copyright 2024 Pedro Paulo Delgado Alves
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

package login;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;
import swing.EventLogin;


public class LoginAndRegister extends javax.swing.JPanel {

    private MigLayout layout;
    private Register register;
    private Login login;
    private Animator animator;
    private boolean isLogin;
    public static Color mainColor = new Color(97, 128, 140);
    
    public void setAnimate(int animate){        
        layout.setComponentConstraints(register, "pos (50%)-290px-" + animate + " 0.5al n n");
        layout.setComponentConstraints(login, "pos (50%)-10px+" + animate + " 0.5al n n");
        if (animate == 30) {
            if (isLogin) {
                setComponentZOrder(login, 0);
            } else {
                setComponentZOrder(register, 0);
            }
        }
        revalidate();
    }

    public LoginAndRegister() {
        initComponents();
        init();
        initAnimator();
    }
    
    private void initAnimator(){
        animator = new Animator(1000, new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction) {
                if(isLogin) {
                    register.setAlpha(fraction);
                    login.setAlpha(1f-fraction);
                } else {
                    register.setAlpha(1f-fraction);
                    login.setAlpha(fraction);
                }
            }
        });
        animator.addTarget(new PropertySetter(this, "animate", 0, 30, 0));
        animator.setResolution(0);
    }
    
    private void init() {
        setBackground(mainColor);
        layout = new MigLayout("fill", "fill", "fill");        
        setLayout(layout);
        register = new Register();
        login = new Login();
        applyEvent(register, false);
        applyEvent(login, true);
        add(register, "pos (50%)-290px 0.5al n n");
        add(login, "pos (50%)-10px 0.5al n n");
        register.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if(SwingUtilities.isLeftMouseButton(me)) {
                    showLogin(false);
                }
            }            
        });
        login.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if(SwingUtilities.isLeftMouseButton(me)) {
                    showLogin(true);
                }
            }            
        });
        
    }
    
    public void showLogin(boolean show){
        if(show!=isLogin) {
            if(!animator.isRunning()) {
                isLogin = show;
                animator.start();
            }
        }
    }
    
    private void applyEvent(JComponent panel, boolean login) {
        for(Component com:panel.getComponents()) {
            com.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent me) {
                    showLogin(login);
                }                
            });
        }
    }
    
    public void setEventLogin(EventLogin event) {
        login.setEventLogin(event);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1150, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
