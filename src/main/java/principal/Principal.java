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
        System.out.println("13 - Poliformismo Herança e Sobrescrita");
        System.out.println("14 - Poliformismo Herança e Sobrescrita2");
        System.out.println("15 - Tratamento de Execções e Entrada e Saída");
        System.out.println("16 - Tratamento de Execções e Entrada e Saída2");
        System.out.println("17 - Interface gráfica para cálculo de área do triângulo");
        System.out.println("18 - Interface gráfica para cálculo da média do aluno");

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
            case 13:
                PrincipalPoliformismoESobrescrita.main(args);
                break;
            case 14:
                PrincipalPoliformismoESobrescrita2.main(args);
                break;
            case 15:
                PrincipalEntradaESaidaAluno.main(args);
                break;
            case 16:
                PrincipalEntradaESaidaArquivo.main(args);
                break;
            case 17:
                PrincipalInterfaceTriangulo.main(args);
            case 18:
                PrincipalInterfaceAluno.main(args);
            default:
                System.out.println("Opção inválida.");
        }
    }
}
