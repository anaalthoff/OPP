package heranca;

// Classe base Pessoa
public class Pessoa2 {

    String nome;
    int idade;

    public Pessoa2(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
