package classes;

public class ContaBancaria {

    // Atributos
    private int numero;
    private int agencia;
    private double saldo;
    private double limite;
    private Cliente titular;

    // Construtor
    public ContaBancaria(int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
    }

    // Gets
    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public Cliente getTitular() {
        return titular;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    // Métodos
    public void abrirConta(Cliente titular, double saldoInicial, double limite) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public String mostrarSaldo() {
        return "Saldo da conta: " + getNumero() + " e de R$ " + getSaldo();
    }
}
