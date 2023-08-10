package com.github.Frederico03.ufg.poo.t14;

public class Coluna {
    private Elemento[] elementos;

    public Coluna(int linha) {
        this.elementos = new Elemento[linha];
    }

    public void adicionarElemento(int linha, int valor) {
        elementos[linha] = new Elemento(valor);
    }
}

