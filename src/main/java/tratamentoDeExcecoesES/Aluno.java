package tratamentoDeExcecoesES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aluno {

    private double[] notas;
    private String nome;

    public Aluno() {
        this.notas = new double[3];
        this.nome = "";
    }

    public Aluno(String nome, Double[] notas) {
        this.nome = nome;
        this.notas = new double[3];
        for (int i = 0; i < 3; i++) {
            this.notas[i] = notas[i];
        }
    }

    public boolean lerNotas() {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int maxTentativas = 10;
        int notasLidas = 0;

        while (tentativas < maxTentativas && notasLidas < 3) {
            try {
                System.out.print("Insira a nota " + (notasLidas + 1) + ": ");
                double nota = scanner.nextDouble();

                if (nota < 0 || nota > 10) {
                    throw new InputMismatchException("Nota fora da escala 0-10.");
                }

                this.notas[notasLidas] = nota;
                notasLidas++;
            } catch (InputMismatchException e) {
                System.err.println("Entrada inválida. Por favor, insira um número entre 0 e 10.");
                scanner.next(); // limpar o buffer do scanner
                tentativas++;
            }
        }

        return notasLidas == 3;
    }

    public double calcularMedia() {
        if (this.notas == null || this.notas.length != 3) {
            return -1; // média inválida
        }

        double soma = 0;
        for (double nota : this.notas) {
            if (nota < 0 || nota > 10) {
                return -1; // nota inválida encontrada
            }
            soma += nota;
        }

        return soma / 3;
    }

    public void imprimirMedia() {
        double media = calcularMedia();

        if (media == -1) {
            System.err.println("Erro: Média inválida devido a entradas inválidas.");
        } else {
            System.out.printf("A média das notas é: %.2f%n", media);
        }
    }
}
