package com.clinica.swing.scrollbar;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;


public class ScrollBarCustom extends JScrollBar {
    
    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setForeground(new Color(105, 105, 105));
        setUnitIncrement(20);
        setOpaque(false);
    }

    
    
}
