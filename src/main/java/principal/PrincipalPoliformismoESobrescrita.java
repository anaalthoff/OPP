package principal;

import poliformismo.Circulo;
import poliformismo.FiguraGeometrica;
import poliformismo.Triangulo;

public class PrincipalPoliformismoESobrescrita {

    public static void main(String[] args) {

        //Testa uma figura do tipo triângulo
        FiguraGeometrica figuraTriangulo = new Triangulo("verde", 2, 3);
        System.out.println("A area do triangulo e = " + figuraTriangulo.getArea());

        //Testa uma figura do tipo círculo
        FiguraGeometrica figuraCirculo = new Circulo("amarelo", 2);
        System.out.println("A area do circulo e = " + figuraCirculo.getArea());

        //Cria um desenho com figuras geométricas do tipo triângulo e círculo
        FiguraGeometrica desenho[] = new FiguraGeometrica[4];
        desenho[0] = new Triangulo("verde", 2, 3);
        desenho[1] = new Circulo("amarelo", 2);
        desenho[2] = new Triangulo("azul", 4, 2);
        desenho[3] = new Circulo("branco", 3);

        //Calcula a área total do desenho
        double total = 0;
        for (int i = 0; i < 4; i++) {
            total = total + desenho[i].getArea();
        }
        System.out.println("A área total do desenho e = " + total);
    }
}
