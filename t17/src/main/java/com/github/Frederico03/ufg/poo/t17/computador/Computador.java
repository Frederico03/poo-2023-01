package com.github.Frederico03.ufg.poo.t17.computador;

import java.util.ArrayList;
import java.util.List;
public class Computador {
    private List<Dispositivo> dispositivo;

    public Computador() {
        dispositivo = new ArrayList<>();
    }

    public void adicionarDispositivo(Dispositivo dispositivo) {
        this.dispositivo.add(dispositivo);
    }

    public void ligar() {
        System.out.println("Computador está ligado!");
    }
}