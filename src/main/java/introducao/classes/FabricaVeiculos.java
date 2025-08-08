package introducao.classes;

public class FabricaVeiculos {

    // Atributos
    private String tipoDoVeiculo;
    private String modelo;

    // Construtor
    public FabricaVeiculos() {
        this.tipoDoVeiculo = "";
        this.modelo = "";
    }

    public FabricaVeiculos(String tipoDoVeiculo, String modelo) {
        this.tipoDoVeiculo = tipoDoVeiculo;
        this.modelo = modelo;
    }

    public FabricaVeiculos(String tipoDoVeiculo) {
        this.tipoDoVeiculo = tipoDoVeiculo;
        this.modelo = "";
    }

    // Método fabricaCarro
    public Veiculo fabricaCarro() {
        return new Veiculo(tipoDoVeiculo, modelo, "vermelho", 4);
    }

    // Método fabricaMoto
    public Veiculo fabricaMoto() {
        return new Veiculo(tipoDoVeiculo, modelo, "azul", 2);
    }

    // Método fabricaCaminhao
    public Veiculo fabricaCaminhao() {
        return new Veiculo(tipoDoVeiculo, modelo, "preto", 6);
    }

    // Getter e Setter para o modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
