package com.github.Frederico03.ufg.poo.t17.aeroporto;

    import java.util.ArrayList;
    import java.util.List;

public class Aviao {
    private List<Lugares> lugares;
    private List<Voos> voos;

    public Aviao() {
        lugares = new ArrayList<>();
        voos = new ArrayList<>();
    }

    public void adicionarLugar(Lugares lugar) {
        lugares.add(lugar);
    }

    public List<Lugares> getLugares() {
        return lugares;
    }

    public void adicionaVoo(Voos voo) {
        voos.add(voo);
    }

    public List<Voos> getVoos() {
        return voos;
    }

}
