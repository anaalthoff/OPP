package poliformismo;

public class Conta {

    private double saldo;

    public Conta() {
        this(0);
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
