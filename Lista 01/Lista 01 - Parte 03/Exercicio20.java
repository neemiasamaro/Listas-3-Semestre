// Neemias Silva Amaro

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print("***** CALCULO DE MDC *****\n");
        System.out.print("Entre com um valor: ");
        int n1 = leia.nextInt();
        System.out.print("Entre com outro valor: ");
        int n2 = leia.nextInt();

        mdc(n1,n2);
        leia.close();

    }

    static void mdc(int n1, int n2) {
        int resto = 0;
        while (n2 != 0) {
            resto = n1 % n2;
            n1 = n2;
            n2 = resto;
        }
        System.out.println("\nMDC: "+n1);
    }
}