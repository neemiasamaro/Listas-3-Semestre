//Neemias Silva Amaro

import java.util.Scanner;
public class UsaPessoa {

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome ("Neemias Silva Amaro");
		pessoa.setIdade(18);
		pessoa.setAltura(1.71);
        
        System.out.print("Dia do seu aniversario: ");
        int aniversario = leia.nextInt();
        leia.close();
        pessoa.fazAniversario(aniversario);
        
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());


    }

}
