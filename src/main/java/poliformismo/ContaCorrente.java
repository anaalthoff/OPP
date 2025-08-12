package poliformismo;

public class ContaCorrente extends Conta {

    private double taxaServico;

    public ContaCorrente() {
        this(0, 0);
    }

    public ContaCorrente(double saldo, double taxaServico) {
        super(saldo);
        setTaxaServico(taxaServico);
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    public void setDeposito(double valor) {
        super.setSaldo(super.getSaldo() + valor);
    }

    public double getSaldo() {
        return super.getSaldo() - taxaServico;
    }
}
