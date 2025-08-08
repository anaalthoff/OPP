package principal;

import introducao.classes.Radio;
import java.util.Scanner;

public class PrincipalRadio {

    public static void main(String args[]) {
        //Objeto para a entrada de dados
        Scanner scanner = new Scanner(System.in);
             
        // Realiza a leitura do volume inicial do rádio
        System.out.println("Digite o volume inicial:");
        int volumeInicial = scanner.nextInt();
        
        // Declara e instancia um objeto chamado soni da classe Radio
        Radio soni = new Radio(volumeInicial);
        
        // Aumenta o volume em dois pontos
        soni.aumentaVolume();
        soni.aumentaVolume();
        
        // Mostra o volume
        System.out.println(soni.getVolume());
        
        // Diminui o volume em dois pontos
        soni.diminuiVolume();
        soni.diminuiVolume();
        
        // Mostra o volume
        System.out.println(soni.getVolume());
    }
}
