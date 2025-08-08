package introducao.classes;

public class Veiculo {

    // Atributos
    private String tipoDoVeiculo;
    private String modelo;
    private String cor;
    private int numeroDeRodas;

    // Construtor
    public Veiculo() {
        this.tipoDoVeiculo = "";
        this.modelo = "";
        this.cor = "";
        this.numeroDeRodas = 0;
    }

    public Veiculo(String tipoDoVeiculo, String modelo, String cor, int numeroDeRodas) {
        this.tipoDoVeiculo = tipoDoVeiculo;
        this.modelo = modelo;
        this.cor = cor;
        this.numeroDeRodas = numeroDeRodas;
    }

    // Getters e Setters
    public String getTipoDoVeiculo() {
        return tipoDoVeiculo;
    }

    public void setTipoDoVeiculo(String tipoDoVeiculo) {
        this.tipoDoVeiculo = tipoDoVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDeRodas() {
        return numeroDeRodas;
    }

    public void setNumeroDeRodas(int numeroDeRodas) {
        this.numeroDeRodas = numeroDeRodas;
    }

    // Método toString para representação textual do Veiculo
    public String toString() {
        return "Tipo: " + tipoDoVeiculo + ", Modelo: " + modelo + ", Cor: " + cor + ", Rodas: " + numeroDeRodas;
    }
}
