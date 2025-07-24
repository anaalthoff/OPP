package classes;

public class Cliente2 {

    // Atributos
    private String nome;
    private String cpf;
    private int idade;
    private int qtdeContas;

    // Cria o link
    private ContaBancaria2[] contas;

    // Construtores
    public Cliente2() {
        this.nome = "";
        this.cpf = "";
        this.idade = 0;
        this.qtdeContas = 0;
        this.contas = new ContaBancaria2[5]; // máximo de 5 contas
    }

    public Cliente2(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.qtdeContas = 0;
        this.contas = new ContaBancaria2[5]; // máximo de 5 contas
    }

    // Gets
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public int getQtdeContas() {
        return qtdeContas;
    }

    // Sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setQtdeContas(int qtdeContas) {
        this.qtdeContas = qtdeContas;
    }

    // Método para vincular conta
    public void vincularConta(ContaBancaria2 conta) {
        if (this.qtdeContas < 5) {
            this.contas[this.qtdeContas] = conta;
            this.qtdeContas++;
            conta.setTitular(this);
        } else {
            System.out.println("O titular já possui o máximo de contas vinculadas.");
        }
    }

    // Método para calcular o total dos saldos das contas
    public double getTotalContas() {
        double total = 0.0;
        for (int i = 0; i < this.qtdeContas; i++) {
            total += this.contas[i].getSaldo();
        }
        return total;
    }

    // Getters e Setters para as contas
    public ContaBancaria2[] getContas() {
        return contas;
    }

    public void setContas(ContaBancaria2[] contas) {
        this.contas = contas;
    }
}
