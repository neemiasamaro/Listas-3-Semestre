//Neemias Silva Amaro

package Exercicio05;

public class Raiz {
    int a;
    int b;
    int c;
    int delta;

    public Raiz () {
        a = 0;
        b = 0;
        c = 0;
        delta = 0;
    }

    public void setA ( int a) {
        this.a = a;
    }

    public void setB ( int b) {
        this.b = b;
    }

    public void setC ( int c) {
        this.c = c;
    }

    public void Calculo(){
        this.delta = ((b*b) - (4*a*c));
    }

    public int Delta(){
        return delta;
    }
}