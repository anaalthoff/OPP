package introducao.classes;

import introducao.interfaces.ITriangulo;

public class Triangulo implements ITriangulo {

    //Atributos
    private double altura;
    private double base;

    // Construtor sem parâmetros
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    // Construtor com parâmetros
    public Triangulo(double altura, double base) {
        this.base = base;
        this.altura = altura;
    }

    //gets e sets
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Calcula a área
    public double getArea() {
        return (getBase() * getAltura() / 2);
    }
}
