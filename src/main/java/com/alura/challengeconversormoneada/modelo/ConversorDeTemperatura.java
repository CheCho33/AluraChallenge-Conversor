package com.alura.challengeconversormoneada.modelo;

import javax.swing.*;

public class ConversorDeTemperatura {

    public String TITULO1 = "Conversor de Temperatura";
    public String TITULO2 = "Seleccione el tipo de temperatura";
    public String TITULO3 = "Ingrese la temperatura que desea convertir";
    public String seleccionMetodoconversion;
    public String resultado;
    public String cantidadConvertir;
    public Double escalaMultiplicador;
    public Double escalaSumando;
    public ValidarValor validarValor = new ValidarValor();


    static final String[] METODOCONVERSION  = { "Centigrados a Kelvin", "Centigrados a Kelvin"};

    public String conversion() {
        this.seleccionMetodoconversion = (String) JOptionPane.showInputDialog(null, this.TITULO2,
                this.TITULO1, JOptionPane.INFORMATION_MESSAGE, null, this.METODOCONVERSION, this.METODOCONVERSION[0]);

        if (this.METODOCONVERSION[0].equals(this.seleccionMetodoconversion)) {
            this.cantidadConvertir = JOptionPane.showInputDialog(TITULO3);
            if(!validarValor.validarSoloNumero(this.cantidadConvertir)){
                this.resultado = "Valor no valido";
                return this.resultado;
            }
            this.escalaMultiplicador = 1.8;
            this.escalaSumando = 32.0;
            FuncionConversora funcionConversora = new FuncionConversora(this.cantidadConvertir, this.escalaMultiplicador, this.escalaSumando);

            this.resultado = "La Temperatura en Kelvin es: " + funcionConversora.toString() + " °K";

        } else if (this.METODOCONVERSION[1].equals(this.seleccionMetodoconversion)) {
            this.cantidadConvertir = JOptionPane.showInputDialog(TITULO3);
            if(!validarValor.validarSoloNumero(this.cantidadConvertir)){
                this.resultado = "Valor no valido";
                return this.resultado;
            }
            this.escalaMultiplicador = 0.556;
            this.escalaSumando = (-32.0);
            FuncionConversora funcionConversora = new FuncionConversora(this.cantidadConvertir, this.escalaMultiplicador, this.escalaSumando );

            this.resultado =  "La Temperatura en Centigrados es: " + funcionConversora.toString() + " °C";
        }

        return this.resultado;

    }
}
