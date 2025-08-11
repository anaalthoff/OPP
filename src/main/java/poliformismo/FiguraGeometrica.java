package poliformismo;

public class FiguraGeometrica {

    private String cor;

    public FiguraGeometrica() {
        this("");
    }

    public FiguraGeometrica(String cor) {
        setCor(cor);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getArea() {
        return 0;
    }
}
