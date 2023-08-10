package com.github.Frederico03.ufg.poo.t14;

public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(3, 3);


// Adicionando elementos à matriz
    matriz.adicionarElemento(0, 0, 1);
    matriz.adicionarElemento(0, 1, 2);
    matriz.adicionarElemento(0, 2, 3);
    matriz.adicionarElemento(1, 0, 4);
    matriz.adicionarElemento(1, 1, 5);
    matriz.adicionarElemento(1, 2, 6);
    matriz.adicionarElemento(2, 0, 7);
    matriz.adicionarElemento(2, 1, 8);
    matriz.adicionarElemento(2, 2, 9);

    System.out.println("Matriz: ");
    System.out.println(matriz);
    }
}
