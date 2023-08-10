package com.github.Frederico03.ufg.poo.t17.aeroporto;

public class Lugares {
    private Passageiros passageiros;

    public boolean estaOcupado() {
        return passageiros != null;
    }

    public void ocupar(Passageiros passageiro) {
        passageiros = passageiro;
    }

    public void desocupar() {
        passageiros = null;
    }
}
