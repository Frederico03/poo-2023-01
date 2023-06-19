package testes;

public class Prova{
    private byte numQuestoes; 

    public byte getNumQuestoes(){
        return numQuestoes;
    }

    public void setNumQuestoes(byte n){
        if(n>0){
            numQuestoes = n;
        }

    }
}