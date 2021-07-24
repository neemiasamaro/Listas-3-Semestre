//Neemias Silva Amaro

public class Exercicio18 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if( primo(i) )
                System.out.print(i + " " );
        }    
    }
 
    static boolean primo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}