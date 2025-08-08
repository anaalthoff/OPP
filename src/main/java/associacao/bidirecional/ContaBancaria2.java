package associacao.bidirecional;

import associacao.bidirecional.Cliente2;

public class ContaBancaria2 {

    // Atributos
    private int numero;
    private int agencia;
    private double saldo;
    private double limite;

    // Cria o link
    private Cliente2 titular;

    // Construtor
    public ContaBancaria2(int numero, int agencia) {
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

    public Cliente2 getTitular() {
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

    // Ativa o link
    public void setTitular(Cliente2 titular) {
        this.titular = titular;
    }

    // Métodos
    public void abrirConta(Cliente2 titular, double saldoInicial, double limite) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.limite = limite;
        titular.vincularConta(this);
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
