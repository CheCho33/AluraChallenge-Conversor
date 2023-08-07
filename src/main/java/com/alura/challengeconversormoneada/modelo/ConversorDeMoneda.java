package com.alura.challengeconversormoneada.modelo;

import javax.swing.*;
import java.util.Objects;


public class ConversorDeMoneda {

    public String TITULO1 = "Conversor de moneda";
    public String TITULO2 = "Seleccione el tipo de moneda";
    public String seleccionMetodoconversion;
    public String resultado;
    public String cantidadConvertir;
    public Double escala;

    public String[] METODOCONVERSION  = { "Pesos a Dolar", "Dolar a Peso"};

    public ValidarValor validarValor = new ValidarValor();

    public String conversion() {
        this.seleccionMetodoconversion = (String) JOptionPane.showInputDialog(null, this.TITULO2,
                this.TITULO1, JOptionPane.INFORMATION_MESSAGE, null, this.METODOCONVERSION, this.METODOCONVERSION[0]);

        if (this.METODOCONVERSION[0].equals(this.seleccionMetodoconversion)) {
            this.cantidadConvertir = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
            if(!validarValor.validarSoloNumero(this.cantidadConvertir)){
                this.resultado = "Valor no valido";
                return this.resultado;
            }

            this.escala = 1/4200.0;
            FuncionConversora funcionConversora = new FuncionConversora(this.cantidadConvertir, this.escala, 0.0);

            this.resultado = "Tienes $" + funcionConversora.toString() + " Dolares";

        } else if (Objects.equals(this.seleccionMetodoconversion, this.METODOCONVERSION[1])) {
            this.cantidadConvertir = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");

            if(!validarValor.validarSoloNumero(this.cantidadConvertir)){
                this.resultado = "Valor no valido";
                return this.resultado;
            }

            escala= 4200.0;
            FuncionConversora funcionConversora = new FuncionConversora(this.cantidadConvertir, this.escala, 0.0);

            this.resultado = "Tienes $" + funcionConversora.toString() + " Pesos";
        }

        return this.resultado;

    }
}
