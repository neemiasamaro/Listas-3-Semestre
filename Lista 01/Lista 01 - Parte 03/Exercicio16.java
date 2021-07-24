//Neemias Silva Amaro

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner leia = new Scanner ( System.in );
        int celsius = 0, fahr = 0, kelvin = 0;
        char op;
        do{
            System.out.print("[C]Celsius, [F]Fahrenheit, [K]Kelvin e [S]Sair: ");
            op =leia.next().charAt(0);

            switch(op){

                case 'C':
                    System.out.print("Entre com a temperatura: ");
                    celsius = leia.nextInt();
                    System.out.println("F: " + fahrenheit(celsius) + "\nK: " + kelvin(celsius));
                    break;

                case 'F':
                    System.out.print("Entre com a temperatura: ");
                    fahr = leia.nextInt();
                    System.out.println("C: " + celsius(fahr) + "\nK: " + kelvinF(fahr));
                    break;

                case 'K':
                    System.out.print("Entre com a temperatura: ");
                    kelvin = leia.nextInt();
                    System.out.println("C: " + celsiusK(kelvin) + "\nF: " + fahrenheitK(kelvin));
                    break;

                case 'S':
                    break;

                default:
                    System.out.println("Opcao Invalida!!\n");
                    break;
            }
            leia.close();
        }while(op != 'S');
    }


    static int fahrenheit (int celsius){
        return ((9*celsius/5)+32);
    }


    static int celsius (int fahr){
        return (5*(fahr-32)/9);
    }


    static int kelvin (int celsius ){
        return (celsius+273);
    }
    

    static int kelvinF(int fahr){
        return ((5*(fahr-32)/9)+273);
    }
    
    static int celsiusK(int kelvin){
        return (kelvin-273);
    }

    static int fahrenheitK(int kelvin){
        return ((9*(kelvin-273)/5)+32);
    }
}