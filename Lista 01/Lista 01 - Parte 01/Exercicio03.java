//Neemias Silva Amaro

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		Scanner leia = new Scanner ( System.in );
		double numero;

		System.out.print("Entre com um numero: ");
		numero = leia.nextDouble();

        System.out.println("\n" + (! isPositivo(numero)?"Negativo" : "Positivo"));

        System.out.println("\n" + (! isZero(numero)?"Nao" : "") + " eh zero");
		leia.close();
	
    }
	
	static boolean isPositivo ( double numero){
		return (numero >= 0.0);
	}

    static boolean isZero (double numero){
        return (numero == 0.0);
    }
}