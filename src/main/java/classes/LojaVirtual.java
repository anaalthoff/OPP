package classes;

// Classe LojaVirtual herda de Loja
public class LojaVirtual extends Loja {

    private String website;

    public LojaVirtual(String nome, String endereco, String website) {
        super(nome, endereco);
        this.website = website;
    }

    public void falarChatbot() {
        System.out.println("Chatbot da loja virtual " + getNome() + " diz: 'Olá! Em que posso ajudar hoje?'");
    }
}
