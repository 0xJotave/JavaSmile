package com.clinica.form.viewUtil;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitaCaracteres extends PlainDocument {

    public enum TipoEntrada {
        NUMEROINTEIRO, NOME, EMAIL, HORARIO;
    }

    private int qtdCaracteres;
    private TipoEntrada tpEntrada;

    public LimitaCaracteres(int qtdCaracteres, TipoEntrada tpEntrada) {
        this.qtdCaracteres = qtdCaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        if (string == null || getLength() == qtdCaracteres) {
            return;
        }
        int totalCarac = getLength() + string.length();
        //filtro dos caracteres
        String regex = "";
        switch (tpEntrada) {
            case NUMEROINTEIRO: regex = "[^0-9]"; break;
            case NOME: regex = "[^\\p{IsLatin} ]"; break;
            case EMAIL: regex = "[^\\p{IsLatin}@.\\-_][^0-9]"; break;
            case HORARIO: regex = "[^0-9:]"; break;
        }
        //substituindo
        string = string.replaceAll(regex, "");

        if(totalCarac <= qtdCaracteres) {
            super.insertString(i, string, as);
        } else {
            String nova = string.substring(0, qtdCaracteres);
            super.insertString(i, nova, as);
        }
    }
}
