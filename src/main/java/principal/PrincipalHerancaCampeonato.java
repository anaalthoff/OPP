package principal;

import classes.JogadorFutebol;
import classes.TecnicoFutebol;
import java.util.Scanner;

public class PrincipalHerancaCampeonato {

    public static void main(String[] args) {
        //Objeto para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados para criar um jogador de futebol
        System.out.println("Digite o nome do jogador:");
        String nomeJogador = scanner.nextLine();

        System.out.println("Digite a idade do jogador:");
        int idadeJogador = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Digite a posição do jogador:");
        String posicaoJogador = scanner.nextLine();

        System.out.println("Digite o número da camisa do jogador:");
        int numeroCamisaJogador = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        JogadorFutebol jogador = new JogadorFutebol(nomeJogador, idadeJogador, posicaoJogador, numeroCamisaJogador);

        // Entrada de dados para criar um técnico de futebol
        System.out.println("\nDigite o nome do técnico:");
        String nomeTecnico = scanner.nextLine();

        System.out.println("Digite a idade do técnico:");
        int idadeTecnico = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Digite o cargo do técnico:");
        String cargoTecnico = scanner.nextLine();

        System.out.println("Digite o estilo do técnico:");
        String estiloTecnico = scanner.nextLine();

        TecnicoFutebol tecnico = new TecnicoFutebol(nomeTecnico, idadeTecnico, cargoTecnico, estiloTecnico);

        scanner.close();

        // Exibindo informações do jogador e do técnico
        System.out.println("\nInformações do jogador:");
        jogador.exibirInformacoes();
        jogador.exibirPosicao();
        jogador.exibirNumeroCamisa();

        System.out.println("\nInformações do técnico:");
        tecnico.exibirInformacoes();
        tecnico.exibirCargo();
        tecnico.exibirEstilo();
    }
}
