package poliformismo;

public abstract class Mamifero extends Animal {
    private int volumeSom;

    public Mamifero(int tamanhoPasso, int volumeSom) {
        super(tamanhoPasso);
        this.volumeSom = volumeSom;
    }
    
    public int getVolumeSom() {
        return volumeSom;
    }

    public void setVolumeSom(int volumeSom) {
        this.volumeSom = volumeSom;
    }
    
    public String mover() {
        return "ANIMAL: DESLOCOU " + getTamanhoPasso() + " ANDANDO";
    }

    public String produzirSom() {
        return "MAMIFERO: VOLUME SOM: " + volumeSom;
    }
}