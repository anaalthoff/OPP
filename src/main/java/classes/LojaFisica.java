package classes;

// Classe LojaFisica herda de Loja
public class LojaFisica extends Loja {

    private int numeroFuncionarios;

    public LojaFisica(String nome, String endereco, int numeroFuncionarios) {
        super(nome, endereco);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void falarAtendente() {
        System.out.println("Atendente da loja física " + getNome() + " diz: 'Posso ajudar em algo?'");
    }
}
