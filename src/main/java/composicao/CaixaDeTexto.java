package composicao;

public class CaixaDeTexto {

    private String texto;

    public CaixaDeTexto() {
        this("");
    }

    public CaixaDeTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
