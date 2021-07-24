// Neemias Silva Amaro

package Exercicio01;

public class UsaLampada {
    
    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();

        System.out.println( lampada + "\n");

        lampada.setMarca("Osram");
        lampada.setModelo("Tubular");
        lampada.setTipo("Incandescente");
        lampada.setStatus(false);


        System.out.println("A marca da lampada eh: " + lampada.getMarca());

        System.out.println("O modelo da lampada eh: " + lampada.getModelo());

        System.out.println("O tipo da lampada eh: " + lampada.getTipo());

        System.out.println("A lampada está (True = Ligada || False = Desligada): " + lampada.getStatus());

    }
}
