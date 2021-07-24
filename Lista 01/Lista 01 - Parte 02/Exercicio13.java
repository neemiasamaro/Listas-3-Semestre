//Neemias Silva Amaro

public class Exercicio13 {

    static int dado(int numero){
        return numero = (int)(Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        int numero = 0;
        int n=0;
        double n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
        for(int i = 1;i <= 1000000;i++){
            n = dado(numero);
            switch(n){

                case 1:
                    n1++;
                    break;

                case 2:
                    n2++;
                    break;

                case 3:
                    n3++;
                    break;

                case 4:
                    n4++;
                    break;

                case 5:
                    n5++;
                    break;

                case 6:
                    n6++;
                    break;

                default:
                    break;
            }
        }
        System.out.printf("1: %d - %.2f %%\n",(int)n1,((n1/1000000)*100));
        System.out.printf("2: %d - %.2f %%\n",(int)n2,((n2/1000000)*100));
        System.out.printf("3: %d - %.2f %%\n",(int)n3,((n3/1000000)*100));
        System.out.printf("4: %d - %.2f %%\n",(int)n4,((n4/1000000)*100));
        System.out.printf("5: %d - %.2f %%\n",(int)n5,((n5/1000000)*100));
        System.out.printf("6: %d - %.2f %%\n",(int)n6,((n6/1000000)*100));
    }
}