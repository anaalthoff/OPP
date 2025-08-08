package principal;

import introducao.classes.FabricaVeiculos;
import introducao.classes.Veiculo;
import java.util.Scanner;

public class PrincipalVeiculo {

    public static void main(String args[]) {
        //Objeto para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Leitura do tipo de veículo
        System.out.println("Digite o tipo de veículo que deseja fabricar (carro, moto ou caminhao):");
        String tipoVeiculo = scanner.nextLine();

        // Criação da fábrica de veículos com base no tipo informado
        FabricaVeiculos fabrica = new FabricaVeiculos(tipoVeiculo);

        // Definição do modelo
        System.out.println("Digite o modelo do veículo:");
        String modeloVeiculo = scanner.nextLine();
        fabrica.setModelo(modeloVeiculo);

        // Fabricação do veículo
        Veiculo veiculo = null;
        switch (tipoVeiculo) {
            case "carro":
                veiculo = fabrica.fabricaCarro();
                break;
            case "moto":
                veiculo = fabrica.fabricaMoto();
                break;
            case "caminhao":
                veiculo = fabrica.fabricaCaminhao();
                break;
            default:
                System.out.println("Tipo de veículo não reconhecido.");
        }

        // Exibição do veículo fabricado
        if (veiculo != null) {
            System.out.println("Veículo fabricado:");
            System.out.println(veiculo);
        }
    }
}
