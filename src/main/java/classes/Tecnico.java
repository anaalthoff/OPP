package classes;

// Classe Tecnico herda de Pessoa2
public class Tecnico extends Pessoa2 {

    String cargo;

    public Tecnico(String nome, int idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }

    public void exibirCargo() {
        System.out.println("Cargo: " + cargo);
    }
}
