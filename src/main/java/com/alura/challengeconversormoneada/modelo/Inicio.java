package com.alura.challengeconversormoneada.modelo;

import javax.swing.JOptionPane;

public class Inicio {
    public static AplicacionConversora aplicacionConversora = new AplicacionConversora();

    public static void main(String[] args) {

        while (true) {
            aplicacionConversora.Inicio();
            int resp = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

            if (!(resp == 0)) {
                JOptionPane.showMessageDialog(null,  "Programa finalizado");
                break;
            }
        }
    }

}
