package com.github.Frederico03.ufg.poo.t17.lanchonete;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> item;
    private Garconete garconete;

    public Pedido(Garconete garconete) {
        item = new ArrayList<>();
        this.garconete = garconete;
    }

    public void adicionarItem(Item item) {
        this.item.add(item);
    }

    public Garconete getGarconete() {

    }
}
