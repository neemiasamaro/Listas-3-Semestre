//Neemias Silva Amaro

import java.util.Scanner;

public class Exercicio11 {
    
    static int menor (int numero , int outroNumero){
        return Math.min(numero, outroNumero);
    }
    
    public static void main(String[] args) {

        Scanner leia = new Scanner( System.in );

        int numero = 0;
        int outro = 0;
        char op;
        do{
            System.out.print("Entre com um valor inteiro: ");
            numero = leia.nextInt();
            outro += numero;
            System.out.print("Inserir outro [S/N]: ");
            op = leia.next().charAt(0);
        }while(op == 's');
        System.out.println("\nO menor valor eh: " + menor(menor (numero,outro),outro));

        leia.close();
    }
}