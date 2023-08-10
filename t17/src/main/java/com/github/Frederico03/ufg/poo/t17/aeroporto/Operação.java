package com.github.Frederico03.ufg.poo.t17.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Operação {
    private Aeroporto aeroporto;
    private List<Voos> voos;
    private String tipo;
    private int data;
    private int hora;

    public Operação(Aeroporto aeroporto, String tipo, int data, int hora) {
        this.aeroporto = aeroporto;
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
        voos = new ArrayList<>();
    }

    public void adicionarVoos(Voos voo) {
        voos.add(voo);
    }
    public List<Voos> getVoos() {
        return voos;
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
    }

    public String getTipo() {
        return tipo;
    }

    public int getData() {
        return data;
    }

    public int getHora() {
        return hora;
    }
}
