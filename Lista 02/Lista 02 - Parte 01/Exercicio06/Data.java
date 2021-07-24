// Neemias Silva Amaro

package Exercicio06;

public class Data {
    int dia1, dia2;
    int mes1, mes2;
    int ano1, ano2;
    int diferenca;

    public Data(int dia1, int mes1, int ano1, int dia2, int mes2, int ano2) {
        this.dia1 = dia1;
        this.mes1 = mes1;
        this.ano1 = ano1;
        
        this.dia2 = dia2;
        this.mes2 = mes2;
        this.ano2 = ano2;
    }

    public void dataMostrar(){
        if(dia1 == dia2 && mes1 == mes2 && ano1 == ano2){
            System.out.println("Datas iguais.");
        }   
        if(ano2>ano1){
            diferenca = ((ano2 - ano1)*365)+((mes2 - mes1)*31)+(dia2 - dia1);
            System.out.println("Segunda data foi maior: "+this.dia2+"/"+this.mes2+"/"+this.ano2+
            "\nDias de diferença : "+ diferenca);
        }
        if(ano1>ano2){
            diferenca = ((ano1 - ano2)*365)+((mes1 - mes2)*31)+((dia1 - dia2)*1);
            System.out.println("Primeira data foi maior: "+this.dia1+"/"+this.mes1+"/"+this.ano1+
            "\nDias de diferença : "+ diferenca);
            
        }
    }
}