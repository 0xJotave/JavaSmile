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

package com.clinica.form;

import javax.swing.ImageIcon;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_Home extends javax.swing.JPanel {

    private ImageIcon[] images;  // Array de imagens para o slideshow
    private int currentImageIndex = 0;  // Índice da imagem atual
    private Timer slideshowTimer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel6;

    public Form_Home() {
        initComponents();
        loadImages();  // Carrega as imagens
        displayInitialImage();  // Exibe a imagem inicial
        startSlideshow();  // Inicia o slideshow
    }

    private void loadImages() {
        
        String[] imagePaths = {
            "com/clinica/icon/dashboard1.png",            
            "com/clinica/icon/dashboard3.png"
        };

        images = new ImageIcon[imagePaths.length];
        for (int i = 0; i < imagePaths.length; i++) {
            java.net.URL imgURL = getClass().getClassLoader().getResource(imagePaths[i]);
            if (imgURL != null) {
                images[i] = new ImageIcon(imgURL);
            } else {
                System.out.println("Erro ao carregar a imagem: " + imagePaths[i]);
            }
        }
    }

    private void displayInitialImage() {
        // Exibe a primeira imagem imediatamente
        if (images.length > 0 && images[0] != null) {
            jLabel3.setIcon(images[0]);
        }
    }

    private void startSlideshow() {
        // Configura o Timer para trocar a imagem a cada 3 segundos (3000 ms)
        slideshowTimer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Incrementa o índice da imagem atual e exibe a próxima imagem
                currentImageIndex = (currentImageIndex + 1) % images.length;
                if (images[currentImageIndex] != null) {
                    jLabel3.setIcon(images[currentImageIndex]);
                }
            }
        });
        slideshowTimer.start();  // Inicia o timer
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 239, 239));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(750, 650));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Dashboard/Home");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(750, 650));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

}
