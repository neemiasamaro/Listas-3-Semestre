//Neemias Silva Amaro

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner leia = new Scanner ( System.in );
        int tempCelsius;

        System.out.print("Entre com a temperatura em Celsius: ");
        tempCelsius = leia.nextInt();

        System.out.println("\nA temperatura em Fahrenheit é: " + temperatura(tempCelsius));
        leia.close();
    }
    
    static int temperatura(int celsius){
        return ((9*celsius/5)+32);
    }


}