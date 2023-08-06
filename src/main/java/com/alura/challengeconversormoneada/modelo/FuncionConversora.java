package com.alura.challengeconversormoneada.modelo;

public class FuncionConversora {
    public Double valorInicial;
    public Double multiplicador;
    public Double valorFinal;
    public Double sumando;

    public FuncionConversora(String valorInicial, Double multiplicador, Double sumando) {
        this.valorInicial = Double.parseDouble(valorInicial);
        this.multiplicador = multiplicador;
        this.sumando = sumando;

        this.valorFinal = this.valorInicial * this.multiplicador + this.sumando;
    }

    @Override
    public String toString() {
        return this.valorFinal.toString();
    }
}
