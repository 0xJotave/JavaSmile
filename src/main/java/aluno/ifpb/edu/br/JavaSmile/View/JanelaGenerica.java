package br.edu.JavaSmile.View;

import javax.swing.*;

/*
 *  Essa classe abstrata é responsável por criar uma base para todas as janelas da aplicação, para assim,
 *  facilitar a criação de novas janelas, seja de dentistas, pacientes, consultas, entre outras.
*/

public abstract class JanelaGenerica {

    // Atributes
    protected JFrame frame;

    // Constructor
    public JanelaGenerica(String titulo, int largura, int altura) {
        frame = new JFrame();
        frame.setSize(largura, altura);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(titulo);
        frame.setLocationRelativeTo(null);
    }

    // Methods
    public void mostrar() {
        frame.setVisible(true);
    }
}
