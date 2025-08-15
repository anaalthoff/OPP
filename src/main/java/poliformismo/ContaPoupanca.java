package poliformismo;

public class ContaPoupanca extends Conta {

    private double saldo;
    private double juros;

    public ContaPoupanca() {
        this("", 0, 0);
    }

    public ContaPoupanca(String nome, double saldo, double juros) {
        super(nome);
        this.saldo = saldo;
        this.juros = juros;
    }

    public double getSaldo() {
        return saldo + juros;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void setDeposito(double valor) {
        saldo += valor;
    }

}
