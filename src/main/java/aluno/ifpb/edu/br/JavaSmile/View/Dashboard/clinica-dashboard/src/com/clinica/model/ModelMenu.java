package com.clinica.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.Icon;

@Data
@NoArgsConstructor
public class ModelMenu {
    private Icon icon;
    private String menuName;
    private String[] subMenu;

    public ModelMenu(Icon icon, String menuName, String... subMenu) {
        this.icon = icon;
        this.menuName = menuName;
        this.subMenu = subMenu;
    }
}
