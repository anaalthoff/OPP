package classes;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa() {
        this("", 0);
    }

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Cria o link: navegabilidade ocorre de pessoa para endereço, portanto pessoa 'enxerga' endereço
    public Endereco endereco; //Nome do Link

    //Inicializa a variável endereco
    public Endereco getEndereco() {
        return endereco;
    }

    //Ativa o link
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
