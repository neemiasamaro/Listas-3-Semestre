//Neemias Silva Amaro

import java.util.Scanner;

public class Exercicio12 {
    
    static int dado(int numero){
        return numero = (int)(Math.random() * 6 ) + 1;
    }
    
    public static void main(String[] args) {

        Scanner leia = new Scanner ( System.in );
        char op = 's';
        int numero = 0;
        do{
            System.out.print("Jogar o dado [S/N]: ");
            op = leia.next().charAt(0);
            System.out.println("\nSaiu: " + dado(numero));
        }while(op == 's');

        leia.close();
    }
}