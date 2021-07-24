// Neemias Silva Amaro 

import java.util.Scanner;

public class Exercicio19{

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Entre com um valor: ");
        int a = leia.nextInt();
        System.out.print("Entre com outro valor: ");
        int b = leia.nextInt();

        for ( int i = a ; i <= b ; i++ ) {
            if( primo(i) )
                System.out.print(i + " ");
        }    
    
        leia.close();
    }

    static boolean primo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
    
}