package testes;

public class Devoto {

    public Devoto(Religiao religiao) {
        religiao.novoDevoto(this);
    }
}

// REFLEXÃO: isso não quebra o encapsulamento
// que deveria existir em religião?
// Esta é uma autodeclaração