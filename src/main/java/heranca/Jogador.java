package heranca;

// Classe Jogador herda de Pessoa2
public class Jogador extends Pessoa2 {

    String posicao;

    public Jogador(String nome, int idade, String posicao) {
        super(nome, idade);
        this.posicao = posicao;
    }

    public void exibirPosicao() {
        System.out.println("Posição: " + posicao);
    }
}