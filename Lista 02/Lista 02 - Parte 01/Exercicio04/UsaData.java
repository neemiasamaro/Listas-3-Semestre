// Neemias Silva Amaro
    
package Exercicio04;

import java.util.Scanner;

public class UsaData {
    public static void main(String[] args) {
        int dia;
        int mes;
        int ano;

        Data data = new Data();
        Scanner leia = new Scanner (System.in);
        System.out.println("Data:" + data + "\n");

        // Dia
        System.out.print("Insira um dia da semana válido: ");
        dia = leia.nextInt();
        
        if(dia > 0 && dia <= 31){
            data.setDia(dia);
        } else{
            System.out.println("Formato de dia inválido!");
        }


        // Mês
        System.out.print("Insira um mês do ano válido: ");
        mes = leia.nextInt();
        
        if(mes > 0 && mes <= 31){
            data.setMes(mes);
        } else{
            System.out.println("Formato de mês inválido!");
        }


        // Ano
        System.out.print("Insira um ano válido: ");
        ano = leia.nextInt();
        
        if(ano > 1000 && ano <= 3000){
            data.setAno(ano);
        } else{
            System.out.println("Formato de ano inválido!");
        }

        leia.close();

        System.out.print ("[ Data " + data.getDia() + " - " + data.getMes() + " - " + data.getAno() + " ]");

    }
}
