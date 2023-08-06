package com.alura.challengeconversormoneada.modelo;

public class ValidarValor {

    public Boolean validacion = false;

    public Boolean validarSoloNumero(String cadena){

        validacion = cadena.matches("\\d+");

        return validacion;

    }

}
