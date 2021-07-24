//Neemias Silva Amaro

package Exercicio08;

import java.util.Scanner; 

public class UsaConversaoDeUnidadesDeArea {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        ConversaoDeUnidadesDeArea converter;
        
        System.out.print("Digite o total em metros: ");
        Double t = leia.nextDouble();
        converter = new ConversaoDeUnidadesDeArea(t);

        System.out.println("Total em pés quadrado: " + converter.mp());
        System.out.println("Total em centimetros quadrados: " + converter.pcq());
        System.out.println("Total em acres: " + converter.pqa());
        System.out.println("Total em milhas quadradas : "+converter.apm());

        leia.close();
    
    }
}