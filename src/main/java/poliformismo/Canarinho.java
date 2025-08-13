package poliformismo;

class Canarinho extends Ave {
    public Canarinho(int tamanhoPasso, int alturaVoo) {
        super(tamanhoPasso, alturaVoo);
    }

    public String cantar() {
        return "AVE: SOM: PIU";
    }
}