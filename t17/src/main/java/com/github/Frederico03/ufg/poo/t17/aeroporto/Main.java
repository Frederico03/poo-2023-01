package com.github.Frederico03.ufg.poo.t17.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto();

        Operação operacao1 = new Operação(aeroporto, "Decolagem", 20230809, 1400);
        Operação operacao2 = new Operação(aeroporto, "Aterrissagem", 20230810, 1030);

        aeroporto.adicionarOperação(operacao1);
        aeroporto.adicionarOperação(operacao2);

        Aviao aviao = new Aviao();

        Lugares lugar1 = new Lugares();
        Lugares lugar2 = new Lugares();

        aviao.adicionarLugar(lugar1);
        aviao.adicionarLugar(lugar2);

        Passageiros passageiro1 = new Passageiros("Bilhete123");
        Passageiros passageiro2 = new Passageiros("Bilhete456");

        lugar1.ocupar(passageiro1);
        lugar2.ocupar(passageiro2);

        Copiloto coPiloto = new Copiloto("João");
        Piloto piloto = new Piloto("José");
        Aeromoca aeromoca1 = new Aeromoca("Josefina");
        Aeromoca aeromoca2 = new Aeromoca("Josélia");

        List<Aeromoca> aeromocas = new ArrayList<>();
        aeromocas.add(aeromoca1);
        aeromocas.add(aeromoca2);

        Tripulacao tripulacao = new Tripulacao(coPiloto, piloto, aeromocas);

        Voos voo1 = new Voos(operacao1, aviao, tripulacao);
        Voos voo2 = new Voos(operacao2, aviao, tripulacao);

        operacao1.adicionarVoos(voo1);
        operacao2.adicionarVoos(voo2);

        System.out.println("Informações do Aeroporto:");
        for (Operação operacao : aeroporto.getOperacoes()) {
            System.out.println("Tipo: " + operacao.getTipo());
            System.out.println("Data: " + operacao.getData());
            System.out.println("Hora: " + operacao.getHora());

            for (Voos voo : operacao.getVoos()) {
                System.out.println("Número de Lugares: " + voo.getAviao().getLugares().size());
                System.out.println();
            }
        }
    }
}
