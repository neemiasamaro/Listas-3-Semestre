//Neemias Silva Amaro

public class Calculadora {

	private int n1;
	private int n2;

	public Calculadora () {
		this.n1 = 0;
		this.n2 = 0;
	}

	public void setNumero1(int n1) {
		this.n1 = n1;
	}
	public void setNumero2(int n2) {
		this.n2 = n2;
	}
	
	public int getNumero1() {
		return n1;
	}

	public int getNumero2() {
		return n2;
	}
	
	public int soma(){
	    return n1 + n2;	
	}

	public int subtrair(){
	    return n1 - n2;	
	}

	public int multiplicar(){
		return n1 * n2;	
	}

	public double dividir(){
		return n1 / n2;	
	}
	

}
