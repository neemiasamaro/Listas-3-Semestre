// Neemias Silva Amaro

package Exercicio02;

public class Conta {
    // Atributos
    private double  conta;
    private int     qtd;
    private boolean pagar;
    private double valorfinal;

    // Metodos
    // Construtor
    public Conta(){
        this.conta = .0;
        this.qtd = 0;
        this.pagar = false;
        this.valorfinal = 0.0;
    }
    // Setter's
    public void setConta(double conta){
        if(conta > 0.0 && conta < 300.00){
            this.conta = conta;
        }
    }

    public void setQtd (int qtd){
        if(qtd > 0 && qtd < 10){
            this.qtd = qtd;
        }
    }

    public boolean setPagar(boolean pagar){
        if(pagar != true || pagar != false){
           this.pagar = pagar;
           return true;
        } else  
            return false;

    }

    public void setValorfinal(double valorfinal){
        if(pagar){
            valorfinal = (conta + (conta * 0.1));
        } else {
            valorfinal = conta;
        }

    }
    // Getter's
    public double getConta() {
        return this.conta;
    }

    public int getQtd() {
        return this.qtd;
    }

    public boolean getPagar() {
        return this.pagar;
    }
    
    public double getValorfinal(){
        if(pagar){
            return valorfinal = conta + (conta * 0.1);
        } else {
            return valorfinal = conta;
        }
    }
    // Demais metodos

    @Override
    public String toString() {
        return "[ Valor sem 10%: R$" + conta + 
                ", Qtd. de pessoas: " + qtd + 
                ", Pagar 10%: " + pagar + 
                ", Valor Final: R$" + valorfinal + " ]";
    }
}
