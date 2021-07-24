// Neemias Silva Amaro

package Exercicio02;

import java.util.Scanner;

public class UsaConta {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Conta conta = new Conta();
        int n;

        System.out.print("Valor da conta: R$ ");
        conta.setConta(leia.nextDouble());
        System.out.print("Quantas pessoas vao pagar: ");
        conta.setQtd(leia.nextInt());
        System.out.print("Pagar os 10%? ( 1 = Pagar || 2 = Nao Apagar): ");
        n = leia.nextInt();
        if(n == 1){
            conta.setPagar(true);
        } else if (n == 2){
            conta.setPagar(false);
        }

        System.out.println("Valor da conta sem os 10%: R$ " + conta.getConta());

        System.out.println("A Qtd. de pessoas para dividir eh: " + conta.getQtd());

        System.out.println("Vai pagar os 10%: " + conta.getPagar());

        System.out.println("Valor final da conta: R$ " + conta.getValorfinal());

        leia.close();
    }
}
