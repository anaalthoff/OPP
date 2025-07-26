package classes;

public class Janela {

    private String titulo;
    private String texto;

    private Botao botaoOk;
    private Botao botaoCancelar;

    private CaixaDeTexto caixaDeTextoLogin;
    private CaixaDeTexto caixaDeTextoSenha;

    public Janela(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;

        this.botaoOk = new Botao("Ok"); // Instanciando um novo botão OK
        this.botaoCancelar = new Botao("Cancelar"); // Instanciando um novo botão Cancelar
        this.caixaDeTextoLogin = new CaixaDeTexto("Login"); // Instanciando uma nova caixa de texto para login
        this.caixaDeTextoSenha = new CaixaDeTexto("Senha"); // Instanciando uma nova caixa de texto para senha
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Botao getBotaoOk() {
        return botaoOk;
    }

    public void setBotaoOk(Botao botaoOK) {
        this.botaoOk = botaoOk;
    }

    public Botao getBotaoCancelar() {
        return botaoCancelar;
    }

    public void setBotaoCancelar(Botao botaoCancelar) {
        this.botaoCancelar = botaoCancelar;
    }

    public CaixaDeTexto getCaixaDeTextoLogin() {
        return caixaDeTextoLogin;
    }

    public void setCaixaDeTextoLogin(CaixaDeTexto caixaDeTextoLogin) {
        this.caixaDeTextoLogin = caixaDeTextoLogin;
    }

    public CaixaDeTexto getCaixaDeTextoSenha() {
        return caixaDeTextoSenha;
    }

    public void setCaixaDeTextoSenha(CaixaDeTexto caixaDeTextoSenha) {
        this.caixaDeTextoSenha = caixaDeTextoSenha;
    }
}
