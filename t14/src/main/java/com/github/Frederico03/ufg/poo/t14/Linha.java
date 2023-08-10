package com.github.Frederico03.ufg.poo.t14;

public class Linha {
    private Elemento[] elemento;

    public Linha(int coluna) {
        this.elemento = new Elemento[coluna];
    }

    public void adicionarElemento(int coluna, int valor) {
        elemento[coluna] = new Elemento(valor);
    }
}
