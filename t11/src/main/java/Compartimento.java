package main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Compartimento {
    Livro[] livros = new Livro[3];
    CD[] cds;
    ArrayList<CD> cds2;
    int nCD;

    public void defineTamanhoCD(){
        if(nCD == 2){
            cds = new CD[2];
        }else if(nCD == 4){
            cds = new CD[4];
        }else if(nCD == 7){
            cds = new CD[7];
        }else if(nCD > 7){
            cds2 = new ArrayList<CD>();
        }else{
            System.out.println("A quantidade" + nCD + "de CDs não é válida!");
        }
    }

    public void getNCD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de cd: ");
        nCD = scanner.nextInt();
        scanner.close();
        defineTamanhoCD();  
    }
}
