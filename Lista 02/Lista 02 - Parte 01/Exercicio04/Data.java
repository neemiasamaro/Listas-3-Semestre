// Neemias Silva Amaro

package Exercicio04;

public class Data {
    
    //Atributos
    private int dia;
    private int mes;
    private int ano;

    //Métodos
    //Construtor
    public Data(){
        this.dia = 16;
        this.mes = 06;
        this.ano = 2021;
    }
    //Setters
    public void setDia(int dia){
        if(dia != 0){
            this.dia = dia;
        }
    }

    public void setMes(int mes){
        if(mes != 0){
            this.mes = mes;
        }
    }

    public void setAno(int ano){
        if(ano != 0){
            this.ano = ano;
        }
    }
    //Getters
    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }
    //Demais métodos
    @Override
    public String toString() {
        return "[ " + dia + 
               " - " + mes + 
               " - " + ano + " ]";
    } 
}
