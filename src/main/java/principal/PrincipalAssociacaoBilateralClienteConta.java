package principal;

import associacao.bidirecional.Cliente2;
import associacao.bidirecional.ContaBancaria2;

public class PrincipalAssociacaoBilateralClienteConta {

    public static void main(String[] args) {
        Cliente2 cliente = new Cliente2("Ana", "123.456.789-00", 30);
        ContaBancaria2 conta = new ContaBancaria2(1001, 123);
        conta.abrirConta(cliente, 500.0, 1000.0);

        System.out.println(cliente.getNome() + " tem saldo total de R$ " + cliente.getTotalContas());
    }
}
