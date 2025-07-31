package principal;

import java.util.Scanner;
import classes.LojaFisica;
import classes.LojaVirtual;

public class PrincipalHerancaLoja {

    public static void main(String[] args) {
        //Objeto para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Recebendo os dados do usuário para criar a loja física
        System.out.println("Digite o nome da loja física:");
        String nomeLojaFisica = scanner.nextLine();

        System.out.println("Digite o endereço da loja física:");
        String enderecoLojaFisica = scanner.nextLine();

        System.out.println("Digite o número de funcionários da loja física:");
        int numFuncionarios = scanner.nextInt();

        // Criando a loja física
        LojaFisica lojaFisica = new LojaFisica(nomeLojaFisica, enderecoLojaFisica, numFuncionarios);

        // Recebendo os dados do usuário para criar a loja virtual
        scanner.nextLine(); // Consumindo a quebra de linha pendente
        System.out.println("\nDigite o nome da loja virtual:");
        String nomeLojaVirtual = scanner.nextLine();

        System.out.println("Digite o endereço da loja virtual:");
        String enderecoLojaVirtual = scanner.nextLine();

        System.out.println("Digite o website da loja virtual:");
        String websiteLojaVirtual = scanner.nextLine();

        // Criando a loja virtual
        LojaVirtual lojaVirtual = new LojaVirtual(nomeLojaVirtual, enderecoLojaVirtual, websiteLojaVirtual);

        // Exemplo de chamada de métodos herdados e específicos
        lojaFisica.comprarNaLoja("produto físico");
        lojaFisica.receberProduto();
        lojaFisica.falarAtendente();

        lojaVirtual.comprarNaLoja("produto virtual");
        lojaVirtual.receberProduto();
        lojaVirtual.falarChatbot();

        scanner.close();
    }
}
