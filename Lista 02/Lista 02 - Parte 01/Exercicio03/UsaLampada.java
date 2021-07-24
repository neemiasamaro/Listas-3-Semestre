// Neemias Silva Amaro

package Exercicio03;

import java.util.Scanner;

public class UsaLampada {
    public static void main(String[] args) {
        
        int status;
        Lampada lampada = new Lampada();
        Scanner leia  = new Scanner(System.in);

        System.out.print("Acender a lâmpada? [ 1 - Apagada, 2 - Meia-luz ou 3 - Acesa]: ");
        status = leia.nextInt();
        switch (status) {
            case 1:
                
                lampada.setApagada(status);

                break;
            case 2:

                lampada.setApagada(status);  

                break;
            case 3:
   
                lampada.setApagada(status); 

                break;

            default:
                
                System.out.println("Valor inválido!");
                
                break;
        }
        leia.close();

        if(lampada.getLampada(status) == 1){
            System.out.println("Lâmpada apagada!");
        }

        if(lampada.getLampada(status) == 2){
            System.out.println("Lâmpada em meia-luz!");
        }
        
        if(lampada.getLampada(status) == 3){
            System.out.println("Lâmpada acesa!");
        }

    }
}
