package com.github.Frederico03.ufg.poo.t17.aeroporto;

import java.util.ArrayList;
import java.util.List;
public class Aeroporto {
    private List<Operação> operação;

    public Aeroporto() {
        operação = new ArrayList<>();
    }

    public void adicionarOperação(Operação operação) {
        this.operação.add(operação);
    }

    public List<Operação> getOperacoes() {
        return operação;
    }
}
