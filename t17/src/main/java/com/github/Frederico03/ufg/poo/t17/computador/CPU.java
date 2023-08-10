package com.github.Frederico03.ufg.poo.t17.computador;

import java.util.ArrayList;
import java.util.List;

public class CPU extends Dispositivo{
    private List<Memorias> memorias;

    public CPU(String modelo) {
        super(modelo);
        memorias = new ArrayList<>();
    }
    public void adicionarMemoria(Memorias memoria) {

        memorias.add(memoria);
    }
}
