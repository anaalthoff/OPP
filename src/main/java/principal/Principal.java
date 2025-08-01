package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o que deseja testar:");
        System.out.println("1 - Calculadora");
        System.out.println("2 - Data");
        System.out.println("3 - Funcionário");
        System.out.println("4 - Rádio");
        System.out.println("5 - Retângulo");
        System.out.println("6 - Triângulo");
        System.out.println("7 - Veículo");
        System.out.println("8 - Associação Unidirecional Pessoa e Endereço");
        System.out.println("9 - Associação Bilateral Cliente e Conta Bancária");
        System.out.println("10 - Herança Gerente e Funcionário");
        System.out.println("11 - Herança Loja Física e Virtual");
        System.out.println("12 - Herança Tecnico e Jogador");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha) {
            case 1:
                PrincipalCalculadora.main(args);
                break;
            case 2:
                PrincipalData.main(args);
                break;
            case 3:
                PrincipalFuncionario.main(args);
                break;
            case 4:
                PrincipalRadio.main(args);
                break;
            case 5:
                PrincipalRetangulo.main(args);
                break;
            case 6:
                PrincipalTriangulo.main(args);
                break;
            case 7:
                PrincipalVeiculo.main(args);
                break;
            case 8:
                PrincipalAssociacaoPessoaEndereco.main(args);
                break;
            case 9:
                PrincipalAssociacaoBilateralClienteConta.main(args);
                break;
            case 10:
                PrincipalHerancaGerenteFuncionario.main(args);
                break;
            case 11:
                PrincipalHerancaLoja.main(args);
                break;
            case 12:
                PrincipalHerancaCampeonato.main(args);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
