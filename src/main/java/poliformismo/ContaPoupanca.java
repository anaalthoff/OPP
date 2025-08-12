package poliformismo;

public class ContaPoupanca extends Conta {

    private double juros;

    public ContaPoupanca() {
        this(0, 0);
    }

    public ContaPoupanca(double saldo, double juros) {
        super(saldo);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void setDeposito(double valor) {
        super.setSaldo(super.getSaldo() + valor);
    }

    public double getSaldo() {
        return super.getSaldo() + juros;
    }
}
