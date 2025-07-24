package classes;

public class Carro {
    private String modelo;
    private Motor motorizacao; // Agregação com a classe Motor

    // Construtores
    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motorizacao = motor;
    }
   
   public String getModelo(){
       return modelo;
   }
   
   public void setModelo(String modelo){
       this.modelo = modelo;
   }
   
   public Motor getMotorizacao(){
       return motorizacao;
   }
   
   public void setMotorizacao(Motor motor){
       this.motorizacao = motor;
   }
}