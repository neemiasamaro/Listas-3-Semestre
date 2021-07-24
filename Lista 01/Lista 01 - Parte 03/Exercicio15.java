//Neemias Silva Amaro

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner leia = new Scanner ( System.in );
        int celsius,fahr;
        char op;
        do{
            System.out.print("[C]Celsius,[F]Fahrenheit e [S]Sair: ");
            op =leia.next().charAt(0);

            switch(op){

                case 'C':
                    System.out.print("Entre com a temperatura: ");
                    celsius = leia.nextInt();
                    System.out.println("Saída: " + fahrenheit(celsius));
                    break;

                case 'F':
                    System.out.print("Entre com a temperatura: ");
                    fahr = leia.nextInt();
                    System.out.println("Saída: " + celsius(fahr));
                    break;

                case 'S':
                    break;

                default:
                    System.out.println("Opcao Invalida!!");
                    break;
            }
        }while(op != 'S');
        leia.close();
    }

    static int fahrenheit (int celsius ){
        return ((9*celsius/5)+32);
    }

    static int celsius (int fahr ){
        return (5*(fahr-32)/9);
    }
}
