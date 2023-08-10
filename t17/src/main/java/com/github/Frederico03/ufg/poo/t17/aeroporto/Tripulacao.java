package com.github.Frederico03.ufg.poo.t17.aeroporto;

import java.util.ArrayList;
import java.util.List;
public class Tripulacao {
    private List<Aeromoca> aeromoca;
    private Copiloto copiloto;
    private Piloto piloto;

    public Tripulacao(Copiloto copiloto, Piloto piloto, List<Aeromoca> aeromocas) {
        aeromoca = aeromocas;
        this.copiloto=copiloto;
        this.piloto=piloto;
    }
}
