package com.github.Frederico03.ufg.poo.t17.computador;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador();
        Placamae placamae = new Placamae("ASUS Z390");
        CPU cpu = new CPU("Intel i7");
        Memorias memoria1 = new Memorias("Corsair 8GB");
        Memorias memoria2 = new Memorias("Corsair 8GB");

        computador.adicionarDispositivo(new Teclado("dell mecânico"));
        computador.adicionarDispositivo(new Mouse("ASUS Z390"));

        cpu.adicionarMemoria(memoria1);
        cpu.adicionarMemoria(memoria2);
        placamae.adicionaCpu(cpu);

        computador.ligar();

        System.out.println("CPU: " + cpu.getModelo());
        System.out.println("Memória 1: " + memoria1.getModelo());
        System.out.println("Memória 2: " + memoria2.getModelo());
    }
}
