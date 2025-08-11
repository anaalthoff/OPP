package poliformismo;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Triangulo() {
        this("", 0, 0);
    }

    public Triangulo(String cor, double base, double altura) {
        super(cor);
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

    public double getArea() {
        return ((getBase() * getAltura()) / 2.0);
    }
}
