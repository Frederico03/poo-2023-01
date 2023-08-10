package com.github.Frederico03.ufg.poo.t17.lanchonete;

import java.util.List;

public class Item {
    private Sanduiche sanduiche;
    private Bebida bebidas;
    private List<Detalhes> detalhes;

    public Item(Sanduiche sanduiche, Bebida bebidas, List<Detalhes> detalhe) {
        this.sanduiche = sanduiche;
        this.bebidas = bebidas;
        detalhes = detalhe;
    }

    public Sanduiche getSanduiche() {
        return sanduiche;
    }
    public Bebida getBebida() {
        return bebidas;
    }
    public List<Detalhes> getDetalhes() {
        return detalhes;
    }
}
