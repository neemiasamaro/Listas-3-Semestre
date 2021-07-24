// Neemias Silva Amaro

package Exercicio06;

import java.util.Scanner;

public class UsaData {

    public static void main(String[] args){
    Data dat;
    Scanner leia = new Scanner(System.in);

    System.out.print("Digite o dia: ");
    int dia1 = leia.nextInt();
    System.out.print("Digite o mes: ");
    int mes1 = leia.nextInt();
    System.out.print("Digite o ano: ");
    int ano1 = leia.nextInt();
    
    System.out.print("Digite o dia: ");
    int dia2 = leia.nextInt();
    System.out.print("Digite o mes: ");
    int mes2 = leia.nextInt();
    System.out.print("Digite o ano: ");
    int ano2 = leia.nextInt();
    
    dat = new Data(dia1,mes1,ano1,dia2,mes2,ano2);
    dat.dataMostrar(); 
    leia.close();

    }
}