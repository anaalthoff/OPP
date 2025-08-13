package poliformismo;

class Gato extends Mamifero {
    public Gato() {
        super(2, 2);
    }

    public String miar() {
        return "MAMIFERO: VOLUME SOM: " + getVolumeSom() + " SOM: MIAU";
    }
}