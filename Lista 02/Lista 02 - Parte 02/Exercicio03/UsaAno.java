//Neemias Silva Amaro

public class UsaAno {
    public static void main(String[] args){

        Ano ano = new Ano();
        
        ano.setAno(1889);

		System.out.println("Ano" + ano.getAno());
        if(ano.ehBissexto()){
            System.out.println("Ano Bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }
		

    }

}