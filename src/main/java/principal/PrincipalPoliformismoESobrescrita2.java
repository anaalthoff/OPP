package principal;

// import poliformismo.Conta;
import poliformismo.ContaCorrente;
import poliformismo.ContaPoupanca;
import poliformismo.ISaldo;

public class PrincipalPoliformismoESobrescrita2 {

    public static void main(String[] args) {

        //Testa um ContaCorrente que implementa ISaldo
        ISaldo cc = new ContaCorrente(200, 30);
        System.out.println("Saldo conta corrente:" + cc.getSaldo());

        //Realiza um depósito na conta corrente
        System.out.println("Realizando um depósito em conta corrente");
        cc.setDeposito(50);
        System.out.println("Saldo conta corrente:" + cc.getSaldo());

        //Testa uma ContaPoupanca que implementa ISaldo
        ISaldo cp = new ContaPoupanca(1000, 20);
        System.out.println("Saldo conta poupanca:" + cp.getSaldo());

        //Realiza um depósito na conta poupanca
        System.out.println("Realizando um depósito em conta poupança");
        cp.setDeposito(100);
        System.out.println("Saldo conta poupança:" + cp.getSaldo());

        //Cria um saldo familiar de ISaldo com objetos do tipo ContaCorrente e ContaPoupanca
        ISaldo saldoFamiliar[] = new ISaldo[4];
        saldoFamiliar[0] = new ContaCorrente(2000, 30);
        saldoFamiliar[1] = new ContaPoupanca(1000, 30);
        saldoFamiliar[2] = new ContaCorrente(2000, 30);
        saldoFamiliar[3] = new ContaPoupanca(1000, 30);

        //Calcula saldo familiar
        double total = 0;
        for (int i = 0; i < 3; i++) {
            total = total + saldoFamiliar[i].getSaldo();
        }
        System.out.println("Saldo total:" + total);
    }
}
