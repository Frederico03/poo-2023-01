package com.github.Frederico03.ufg.poo.t17.lanchonete;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
        private List<Sanduiche> sanduiches;
    public Lanchonete(List<Sanduiche> sanduiche) {
        if(sanduiches.size() > 0) {
            sanduiches = sanduiche;
        }else{
            System.out.println("Não há sanduíches");
        }
    }
    public List<Sanduiche> getSanduiches() {
        return sanduiches;
    }
    public void servirSanduiche(Sanduiche sanduiche) {
        sanduiches.add(sanduiche);
    }
}
