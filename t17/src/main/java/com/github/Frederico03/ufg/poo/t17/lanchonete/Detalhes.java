package com.github.Frederico03.ufg.poo.t17.lanchonete;

public class Detalhes {
    private String descricao;
    private String acompanhamento;

    public Detalhes(String descricao, String acompanhamento) {
        this.descricao = descricao;
        this.acompanhamento = acompanhamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }
}
