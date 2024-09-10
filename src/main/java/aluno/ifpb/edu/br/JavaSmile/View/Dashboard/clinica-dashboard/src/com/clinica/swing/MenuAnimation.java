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

package com.clinica.swing;

import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class MenuAnimation {
    
    private final MigLayout layout;
    private final MenuItem menuItem;
    private Animator animator;
    private boolean open;
    
    public MenuAnimation(MigLayout layout, Component component) {
        this.layout = layout;
        this.menuItem = (MenuItem)component;
        initAnimator(component, 200);
    }
    
    public MenuAnimation(MigLayout layout, Component component, int duration) {
        this.layout = layout;
        this.menuItem = (MenuItem)component;
        initAnimator(component, duration);
    }
    
    private void initAnimator(Component component, int duration) {
        int height = component.getPreferredSize().height;
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                float h;
                if(open){
                    h = 40 + ((height - 40) * fraction);
                    menuItem.setAlpha(fraction);
                }
                else {
                    h = 40 + ((height - 40) * (1f - fraction));
                    menuItem.setAlpha(1f - fraction);
                }
                layout.setComponentConstraints(menuItem, "h " + h + "!");
                component.revalidate();
                component.repaint();
            }
        };
        animator = new Animator(duration, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
    }
    
    public void openMenu(){
        open = true;
        animator.start();
    }
    public void closeMenu() {
        open = false;
        animator.start();
    }
}
