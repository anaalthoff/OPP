package principal;

import classes.Endereco;
import classes.Pessoa;
import java.util.Scanner;

public class PrincipalAssociacaoPessoaEndereco {

    public static void main(String args[]) {
        //Objeto para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Realiza a leitura do nome e idade de uma pessoa
        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade da pessoa:");
        int idade = Integer.parseInt(scanner.nextLine());

        //Declara e instância uma pessoa com o nome e idade lido.
        Pessoa pes1 = new Pessoa(nome, idade);

        //Realiza a leitura do logradouro, numero, bairro e cidade de um endereço
        System.out.println("Digite o logradouro do endereco da pessoa:");
        String logradouro = scanner.nextLine();
        System.out.println("Digite o número do endereco da pessoa:");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o bairro do endereco da pessoa:");
        String bairro = scanner.nextLine();
        System.out.println("Digite a cidade do endereco da pessoa:");
        String cidade = scanner.nextLine();

        //Declara e instância um endereço com os dados lidos
        Endereco end1 = new Endereco(logradouro, numero, bairro, cidade);

        //Associa o endereço a pessoa
        pes1.setEndereco(end1);

        //Mostra os valores dos atributos
        System.out.println(pes1.getNome());
        System.out.println(pes1.getIdade());
        System.out.println(pes1.getEndereco().getLogradouro());
        System.out.println(pes1.getEndereco().getNumero());
        System.out.println(pes1.getEndereco().getBairro());
        System.out.println(pes1.getEndereco().getCidade());
    }
}
