package principal;

import introducao.classes.Retangulo;
import java.util.Scanner;

public class PrincipalRetangulo {

    public static void main(String args[]) {
        //Objeto para a entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Declara e instancia um objeto chamado ret da classe Retangulo;;
        Retangulo ret = new Retangulo(4, 2);
        
        // Recupera a base do objeto ret
        System.out.println(ret.getBase());
        // Recupera a altura do objeto ret
        System.out.println(ret.getAltura());
        
        // Recupera a área a objeto ret
        System.out.println(ret.getArea());
        
        // Modifica o atributo base do objeto ret
        ret.setBase(3);
        
        // Modifica o atributo altura do objeto ret
        ret.setAltura(4);
    }
}
