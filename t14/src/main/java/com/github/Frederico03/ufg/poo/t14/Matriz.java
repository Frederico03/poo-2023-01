package com.github.Frederico03.ufg.poo.t14;

public class Matriz {
    private int linha;
    private int coluna;
    private Elemento[][] elemento;

    public Matriz(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        this.elemento = new Elemento[linha][coluna];
    }

    public void adicionarElemento(int linha, int coluna, int valor) {
        Elemento elemento = new Elemento(valor);
        this.elemento[linha][coluna] = elemento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                sb.append(elemento[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
