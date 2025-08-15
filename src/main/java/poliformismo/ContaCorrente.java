package poliformismo;

public class ContaCorrente extends Conta {

    private double saldo;
    private double taxaServico;

    public ContaCorrente() {
        this("", 0, 0);
    }

    public ContaCorrente(String nome, double saldo, double taxaServico) {
        super(nome);
        setSaldo(saldo);
        setTaxaServico(taxaServico);
    }

    public double getSaldo() {
        return saldo - taxaServico;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    public void setDeposito(double valor) {
        saldo += valor;
    }

}
