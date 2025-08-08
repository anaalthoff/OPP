package composicao;

public class Botao {

    private String texto;

    public Botao() {
        this("");
    }

    public Botao(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
