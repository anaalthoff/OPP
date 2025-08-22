package tratamentoDeExcecoesES;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Registro {

    private int ID;
    private String dado;

    // Construtor sem argumentos
    public Registro() {
        this.ID = new Random().nextInt(100000); // ID aleatório
        this.dado = "";
    }

    // Construtor com argumento String
    public Registro(String dado) {
        this.ID = new Random().nextInt(100000); // ID aleatório
        this.dado = dado.replace('*', 'a');
    }

    // Construtor com argumentos int e String
    public Registro(int ID, String dado) {
        this.ID = ID;
        this.dado = dado.replace('*', 'a');
    }

    // Método para ler dado do arquivo
    public boolean lerDado() {
        try ( Scanner scanner = new Scanner(new File("file.in"))) {
            if (scanner.hasNextLine()) {
                this.dado = scanner.nextLine().replace('*', 'a');
                return true;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro de E/S: " + e.getMessage());
        }
        return false;
    }

    // Método para validar o dado
    public boolean validarDado() {
        return this.dado != null && !this.dado.isEmpty();
    }

    // Método para imprimir dado em um arquivo
    public void imprimirDado() {
        try ( FileWriter writer = new FileWriter("file.out")) {
            writer.write("ID: " + this.ID + "\n");
            writer.write("Dado: " + this.dado + "\n");
        } catch (IOException e) {
            System.err.println("Erro de E/S ao escrever no arquivo: " + e.getMessage());
        }
    }
}
