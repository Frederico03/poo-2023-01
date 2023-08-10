package com.github.Frederico03.ufg.poo.t17.computador;

import java.util.ArrayList;
import java.util.List;

public class Placamae extends Dispositivo{
    private List<CPU> cpus;

    public Placamae(String modelo) {
        super(modelo);
        cpus = new ArrayList<>();
    }

    public void adicionaCpu(CPU cpu) {
        cpus.add(cpu);
    }
}
