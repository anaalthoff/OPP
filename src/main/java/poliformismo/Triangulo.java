package poliformismo;

public class Triangulo implements ICalculo {

    private double base;
    private double altura;
    private String cor;

    public Triangulo() {
        this("", 0, 0);
    }

    public Triangulo(String cor, double base, double altura) {
        setCor(cor);
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getArea() {
        return ((getBase() * getAltura()) / 2.0);
    }
}
