package poliformismo;

public abstract class Animal {

    int tamanhoPasso;

    public Animal(int tamanhoPasso) {
        this.tamanhoPasso = tamanhoPasso;
    }

    public Animal() {
        this.tamanhoPasso = 0;
    }

    public int getTamanhoPasso() {
        return tamanhoPasso;
    }

    public void setTamanhoPasso(int tamanhoPasso) {
        this.tamanhoPasso = tamanhoPasso;
    }

    public String mover() {
        return "ANIMAL: DESLOCOU " + tamanhoPasso;
    }

    public abstract String produzirSom();
}
