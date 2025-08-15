package principal;

import poliformismo.Conta;
import poliformismo.ContaCorrente;
import poliformismo.ContaPoupanca;

public class PrincipalPoliformismoESobrescrita2 {

    public static void main(String[] args) {

        //Declara e instância uma conta no banco do brasil com o saldo de 1000 e 100 de taxa de serviço
        ContaCorrente cc = new ContaCorrente("Banco do Brasil", 1000, 100);
        System.out.println("Saldo " + cc.getNome() + " : " + cc.getSaldo());

        //Realiza um depósito
        System.out.println("Realizando um depósito em ContaCorrente!");
        cc.setDeposito(100);
        System.out.println("Saldo " + cc.getNome() + " : " + cc.getSaldo());

        //Declara e instância uma conta no bradesco com o saldo de 2000 e 10 de juros
        ContaPoupanca cp = new ContaPoupanca("Bradesco", 2000, 10);
        System.out.println("Saldo " + cp.getNome() + " : " + cp.getSaldo());

        //Declara um vetor de contas
        Conta recursos[] = new Conta[4];
        recursos[0] = cc;
        recursos[1] = cp;
        recursos[2] = new ContaCorrente("Bamerindus", 500, 10);
        recursos[3] = new ContaPoupanca("Itau", 2500, 5);

        //Calcula o saldo total das contas
        double total = 0;
        for (int i = 0; i < 4; i++) {
            total = total + recursos[i].getSaldo();
        }
        System.out.println("Saldo total: " + total);
    }
}
