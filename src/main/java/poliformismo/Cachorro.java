package poliformismo;

public class Cachorro extends Mamifero {

    public Cachorro() {
        super(3, 3);
    }

    public String latir() {
        return "MAMIFERO: VOLUME SOM: " + getVolumeSom() + " SOM: AU";
    }
}
