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
