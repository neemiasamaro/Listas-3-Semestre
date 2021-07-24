//Neemias Silva Amaro
 
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner ( System.in );
		double numero;

		System.out.print("Entre com um numero: ");
		numero = leia.nextDouble();
	
		if(isPositivo(numero)){
			System.out.println("\nPositivo");
		}else{
			System.out.println("\nNegativo");
		}
		leia.close();
	}

	static boolean isPositivo ( double numero){
		return (numero >= 0.0);
	}
	
}