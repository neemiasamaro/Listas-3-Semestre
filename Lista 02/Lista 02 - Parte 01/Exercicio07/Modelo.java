//Neemias Silva Amaro

package Exercicio07;

public class Modelo {

    private int mobo;
    private int cpu[] = new int[3];
    private int mmr;
    private int hd[] = new int[3];
    private int monitor[] = new int[2];
    private int total;

    public Modelo(int[] op) {
        this.mobo = 800;

        this.cpu[0] = 700;
        this.cpu[1] = 830;
        this.cpu[2] = 910;

        this.mmr = 350;

        this.hd[0] = 300;
        this.hd[1] = 420;
        this.hd[2] = 500;

        this.monitor[0] = 320;
        this.monitor[1] = 520;

        this.total = 0;
    }

    public void calcular(int[] op) {

        if (op[0] == 1) {
            this.total += this.mobo;
        }

        
        if (op[1] == 1) {
            this.total += this.cpu[0];
        } else if (op[1] == 2) {
            this.total += this.cpu[1];
        } else if (op[1] == 3) {
            this.total += this.cpu[2];
        }
        
        this.total += this.mmr * op[2];
        
        if (op[3] == 1) {
            this.total += this.hd[0];
        } else if (op[3] == 2) {
            this.total += this.hd[1];
        } else if (op[3] == 3) {
            this.total += this.hd[2];
        }
        
        if (op[4] == 1) {
            this.total += this.monitor[0];
        } else if (op[4] == 2) {
            this.total += this.monitor[1];
        }
        


        System.out.println("Valor total das peças: R$"+this.total);
    }

}