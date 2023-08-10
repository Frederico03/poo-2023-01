package com.github.Frederico03.ufg.poo.t17.aeroporto;

public class Voos {
    private Operação operacao;
    private Aviao aviao;
    private Tripulacao tripulacao;

    public Voos(Operação operacao, Aviao aviao, Tripulacao tripulacao) {
        this.operacao = operacao;
        this.aviao = aviao;
        this.tripulacao = tripulacao;
    }

    public Operação getOperacao() {
        return operacao;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public Tripulacao getTripulacao() {
        return tripulacao;
    }
}
