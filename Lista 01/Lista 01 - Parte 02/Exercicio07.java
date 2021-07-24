//Neemias Silva Amaro

import java.util.Scanner;

public class Exercicio07 {
    
    static int menor ( int n1, int n2){
        if(n1 < n2)
            return n1;
        else 
            return n2;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        int numero1, numero2;

        System.out.print("Entre com um numero inteiro: ");
        numero1 = leia.nextInt();
        System.out.print("Entre com outro numero inteiro: ");
        numero2 = leia.nextInt();
        System.out.println("\nO menor eh : " + menor ( numero1, numero2) );

        leia.close();
    }
    
}