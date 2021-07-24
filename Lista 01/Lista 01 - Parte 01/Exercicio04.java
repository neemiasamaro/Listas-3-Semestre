//Neemias Silva Amaro

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
        double a, b, c;

        System.out.println("Valor de a: ");
        a = leia.nextDouble();

        System.out.println("Valor de b: ");
        b = leia.nextDouble();

        System.out.println("Valor de c: ");
        c = leia.nextDouble();

        System.out.println("\nDelta: " + delta( a, b, c));
        leia.close();
    }

    static double delta(double a, double b, double c){
        double conta = (b*b)-4*a*c;
        return conta;
    }
}
