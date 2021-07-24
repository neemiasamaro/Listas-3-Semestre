// Neemias Silva Amaro

package Exercicio01;

public class Lampada{
    // Atributos
    private String marca;
    private String modelo;
    private String tipo;
    private boolean status;
    
    // Metodos
    // Construtor
    public Lampada(){
        this.marca = "Philips";
        this.modelo = "Bulbo";
        this.tipo = "LED";
        this.status = true;
    }

    // Setter's
    public void setMarca(String marca){
        if(!marca.equals("")){
            this.marca = marca;
        }
    }

    public void setModelo(String modelo){
        if(!modelo.equals("")){
            this.modelo = modelo;
        }
    }

    public void setTipo(String tipo){
        if(!tipo.equals("")){
            this.tipo = tipo;
        }
    }

    public void setStatus(boolean status){
        if(status != true || status != false){
            this.status = status;
        }
    }

    // Getter's'
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public boolean getStatus(){
        return this.status;
    }
    
    // Demais metodos
    @Override
    public String toString() {
        return "[ Marca: " + marca + 
                ", Modelo: " + modelo + 
                ", Tipo: " + tipo + 
                ", Status: " + status + " ]";
    }  
}