package com.alura.challengeconversormoneada.modelo;

import javax.swing.*;

public class AplicacionConversora {

    private String resultado = "";
    private String TITULO1 = "Herramienta de conversion";
    private String TITULO2 = "Seleccione el tipo de conversor";
    private  String seleccionTipoConversor;

    private String[] tiposConversores  = { "Conversor de Moneda", "Conversor de Temperatura", "Conversor de Distancia"};

    private ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();
    private ConversorDeDistancia conversorDeDistancia = new ConversorDeDistancia();

    public void Inicio(){

        seleccionTipoConversor =(String) JOptionPane.showInputDialog(null, TITULO2,
                TITULO1, JOptionPane.INFORMATION_MESSAGE, null, tiposConversores, tiposConversores[0]);

        if (seleccionTipoConversor == tiposConversores[0]){
            resultado = conversorDeMoneda.conversion();

        } else if (seleccionTipoConversor == tiposConversores[1]) {
            resultado= conversorDeDistancia.conversion();

        } else {
            resultado= conversorDeDistancia.conversion();
        }

        System.out.println(resultado);

        JOptionPane.showMessageDialog(null,  this.resultado);

    }



}
