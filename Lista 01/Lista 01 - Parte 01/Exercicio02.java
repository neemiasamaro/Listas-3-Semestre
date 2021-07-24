//Neemias Silva Amaro

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		Scanner leia = new Scanner ( System.in );
		double numero;

		System.out.print("Entre com um numero: ");
		numero = leia.nextDouble();
	
        System.out.println("\n" + (! isZero(numero)?"Nao" : "") + " eh zero");
		leia.close();
	}
	
	static boolean isZero ( double numero ){
		return (numero == 0.0);
	}
	
}