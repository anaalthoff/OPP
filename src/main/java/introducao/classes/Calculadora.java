package introducao.classes;

import introducao.interfaces.ICalculadora;

public class Calculadora implements ICalculadora {

    //Atributos 
    private double numero1;
    private double numero2;

    //Construtor sem parâmetros
    public Calculadora() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    //Construtor com parâmetros
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Get de numero1
    public double getNumero1() {
        return numero1;
    }

    //Get de numero2
    public double getNumero2() {
        return numero2;
    }

    //Set de numero1
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    //Set de numero2
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //Métodos get´s das operações
    //Get Soma
    public double getSoma() {
        return (getNumero1() + getNumero2());
    }

    //Get Diferenca
    public double getDiferenca() {
        return (getNumero1() - getNumero2());
    }

    //Get Produto
    public double getProduto() {
        return (getNumero1() * getNumero2());
    }

    //Get Quociente
    public double getQuociente() {
        return (getNumero1() / getNumero2());
    }
}
