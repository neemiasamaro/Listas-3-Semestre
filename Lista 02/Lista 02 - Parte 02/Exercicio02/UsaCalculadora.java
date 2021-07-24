//Neemias Silva Amaro

public class UsaCalculadora {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        calc.setNumero1(2);
		calc.setNumero2(2);

		System.out.println("Numero 1: " + calc.getNumero1());
		System.out.println("Numero 2: " + calc.getNumero2());
		System.out.println("Soma: " + calc.soma());
		System.out.println("Subtracao: " + calc.subtrair());
        System.out.println("Multiplicacao: " + calc.multiplicar());
		System.out.println("Divisao: " + calc.dividir());

    }

}