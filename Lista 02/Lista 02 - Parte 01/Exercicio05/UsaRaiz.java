//Neemias Silva Amaro

package Exercicio05;

import java.util.Scanner;

public class UsaRaiz {

    public static void main(String[] args){

    Scanner leia = new Scanner( System.in );
    Raiz raiz = new Raiz();

    System.out.print("Digite o valor de A: ");
    raiz.setA(leia.nextInt());
    System.out.print("Digite o valor de B: ");
    raiz.setB(leia.nextInt());
    System.out.print("Digite o valor de C: ");
    raiz.setC(leia.nextInt());
    
    raiz.Calculo();
    System.out.println(raiz.Delta());
    leia.close();
    }
}