//Neemias Silva Amaro

import java.util.Scanner;

public class Exercicio10 {
    
    static int maior (int n1 , int n2){
        return Math.max(n1, n2);
    }


    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        int numero1 , numero2 , numero3;

        System.out.print("Entre com o primeiro numero inteiro: ");
        numero1 = leia.nextInt();
        System.out.print("Entre com o segundo numero inteiro: ");
        numero2 = leia.nextInt();
        System.out.print("Entre com o terceiro numero inteiro: ");
        numero3 = leia.nextInt();

        System.out.println("\nO maior eh : " + maior ( maior (numero1, numero2) , numero3) );

        leia.close();
    }
}
