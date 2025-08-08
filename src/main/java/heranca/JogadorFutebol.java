package heranca;

// Classe JogadorFutebol herda de Jogador
public class JogadorFutebol extends Jogador {

    int numeroCamisa;

    public JogadorFutebol(String nome, int idade, String posicao, int numeroCamisa) {
        super(nome, idade, posicao);
        this.numeroCamisa = numeroCamisa;
    }

    public void exibirNumeroCamisa() {
        System.out.println("Número da Camisa: " + numeroCamisa);
    }
}
