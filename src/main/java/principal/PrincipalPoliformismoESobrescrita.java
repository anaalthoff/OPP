package principal;

import poliformismo.Circulo;
// import poliformismo.FiguraGeometrica;
import poliformismo.ICalculo;
import poliformismo.Triangulo;

public class PrincipalPoliformismoESobrescrita {

    public static void main(String[] args) {

        //Testa um Triangulo que implementa ICalculo
        ICalculo triangulo = new Triangulo("verde", 2, 3);
        System.out.println("A area do triangulo e = " + triangulo.getArea());

        //Testa um Circulo que implementa ICalculo
        ICalculo circulo = new Circulo("amarelo", 2);
        System.out.println("A area do circulo e = " + circulo.getArea());

        //Cria um desenho de ICalculo com objetos do tipo  Triângulo e círculo
        ICalculo desenho[] = new ICalculo[4];
        desenho[0] = new Triangulo("verde", 2, 3);
        desenho[1] = new Circulo("amarelo", 2);
        desenho[2] = new Triangulo("azul", 4, 2);
        desenho[3] = new Circulo("branco", 3);

        //Calcula a área total dos objetos
        double total = 0;
        for (int i = 0; i < 4; i++) {
            total = total + desenho[i].getArea();
        }
        System.out.println("A área total das figuras e = " + total);
    }
}
