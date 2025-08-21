
package principal;

import tratamentoDeExcecoesES.Aluno;

public class PrincipalEntradaESaidaAluno {

    public static void main(String[] args) {
        Aluno cal = new Aluno();

        if (!cal.lerNotas()) {
            System.err.println("Erro: Número de tentativa excedido (MAX 10 tentativas)!\n");
        } else {
            cal.imprimirMedia();
        }

    }
}
