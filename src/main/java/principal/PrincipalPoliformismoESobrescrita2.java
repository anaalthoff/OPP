package principal;

import poliformismo.Conta;
import poliformismo.ContaCorrente;
import poliformismo.ContaPoupanca;

public class PrincipalPoliformismoESobrescrita2 {

    public static void main(String[] args) {
        //Declara e instância uma conta com o saldo de 2000
        Conta conta = new Conta(2000);
        System.out.println("Saldo conta: " + conta.getSaldo());

        //Declara e instância uma conta corrente com saldo 0 e 30 de taxa de serviço
        ContaCorrente cc = new ContaCorrente(0, 30);
        cc.setDeposito(1000);
        System.out.println("Saldo conta corrente: " + cc.getSaldo());

        //Declara e instância uma conta poupanca com saldo de 200 e 10 de juros
        ContaPoupanca cp = new ContaPoupanca(200, 10);
        cp.setDeposito(1000);
        System.out.println("Saldo conta poupança: " + cp.getSaldo());

        //Declara um vetor de contas
        Conta recursos[] = new Conta[4];
        recursos[0] = cc;
        recursos[1] = cp;
        recursos[2] = new ContaCorrente(1000, 10);
        recursos[3] = new ContaPoupanca(500, 10);

        //Calcula o saldo total das contas
        double total = 0;
        for (int i = 0; i < 4; i++) {
            total = total + recursos[i].getSaldo();
        }

        System.out.println("Saldo total: " + total);
    }
}
