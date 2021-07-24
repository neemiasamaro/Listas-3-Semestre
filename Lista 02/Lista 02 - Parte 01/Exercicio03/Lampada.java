// Neemias Silva Amaro

package Exercicio03;

public class Lampada {

    private int apagada;
    private int meialuz;
    private int acesa;

    public Lampada(){
        this.apagada = 1;
        this.meialuz = 2;
        this.acesa = 3;
    }
    
    public void setApagada(int status){
        if(status == 1){
            this.apagada = 1;
        } else {
            this.apagada = 0;
        }
    }

    public void setMeialuz(int status){
        if(status == 1){
            this.meialuz = 2;
        } else{
            this.meialuz = 0;
        }
    }

    public void setAcesa(int status){
        if(status == 3){
            this.acesa = 3;
        } else{
            this.acesa = 0;
        }
    }

    public int getLampada(int status){
        if(status == 1){
            return this.apagada;
        } else if(status == 2){
            return this.meialuz;
        } else if(status == 3){
            return this.acesa;
        } else {
            return 0;
        }
    }
}
