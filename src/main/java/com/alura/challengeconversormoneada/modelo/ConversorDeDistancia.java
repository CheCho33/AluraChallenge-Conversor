package com.alura.challengeconversormoneada.modelo;

import javax.swing.*;

public class ConversorDeDistancia {

    public String TITULO1 = "Conversor de Distancia";
    public String TITULO2 = "Seleccione el tipo de distancia";
    public String TITULO3 = "Ingrese la distancia que desea convertir";
    public String seleccionMetodoconversion;
    public String resultado;
    public String cantidadConvertir;
    public Double escala;

    public String[] METODOCONVERSION  = { "Kilometros a Millas", "Millas a Kilometros"};

    public String conversion() {
        seleccionMetodoconversion = (String) JOptionPane.showInputDialog(null, this.TITULO2,
                this.TITULO1, JOptionPane.INFORMATION_MESSAGE, null, METODOCONVERSION, METODOCONVERSION[0]);

        if (seleccionMetodoconversion == METODOCONVERSION[0]) {
            cantidadConvertir = JOptionPane.showInputDialog(TITULO3);
            escala = 0.621371;
            FuncionConversora funcionConversora = new FuncionConversora(cantidadConvertir, this.escala, 0.0);

            resultado = "La distancia en millas es: " + funcionConversora.toString() + " Millas";

        } else if (seleccionMetodoconversion == METODOCONVERSION[1]) {
            cantidadConvertir = JOptionPane.showInputDialog(TITULO3);
            escala= 1.60934;
            FuncionConversora funcionConversora = new FuncionConversora(cantidadConvertir, this.escala, 0.0);

            resultado =  "La distancia en Kilometros es: " + funcionConversora.toString() + " Millas";
        }

        return resultado;

    }
}
