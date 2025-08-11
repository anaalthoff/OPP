package poliformismo;

public class Circulo extends FiguraGeometrica {

    private double raio;

    public Circulo() {
        this("", 0);
    }

    public Circulo(String cor, double raio) {
        super(cor);
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return (Math.PI * getRaio() * getRaio());
    }
}
