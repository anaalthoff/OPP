
package principal;

import tratamentoDeExcecoesES.Registro;

public class PrincipalEntradaESaidaArquivo {

    public static void main(String[] args) {
        Registro registro = new Registro();

        if (registro.lerDado()) {
            if (registro.validarDado()) {
                registro.imprimirDado();
            } else {
                System.err.println("Dado inválido.");
            }
        } else {
            System.err.println("Falha ao ler o dado do arquivo.");
        }
    }
}