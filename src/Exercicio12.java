import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int quilometragemTotal = 0;
        int litrosTotal = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite a quilometragem dirigida com o tanque cheio (km): ");
            int quilometragem = scanner.nextInt();

            System.out.print("Digite a quantidade de combustível consumido  (litros): ");
            int litros = scanner.nextInt();
            double consumoKmPorLitro = (litros != 0) ? (double) quilometragem / litros : 0.0;


            System.out.printf("Consumo para o tanque atual: %.2f km/l%n", consumoKmPorLitro);

            quilometragemTotal += quilometragem;
            litrosTotal += litros;


            System.out.print("Deseja inserir dados para outro tanque? (s/n): ");
            char resposta = scanner.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                continuar = false;
            }
        }


        scanner.close();

        System.out.printf("Quilometragem total combinada: %d km%n", quilometragemTotal);
        System.out.printf("Total de litros consumidos: %d litros%n", litrosTotal);

        if (litrosTotal > 0) {
            double consumoMedioGeral = (double) quilometragemTotal / litrosTotal;
            System.out.printf("Consumo médio geral: %.2f km/l%n", consumoMedioGeral);
        } else {
            System.out.println("Nenhum combustível foi consumido, não é possível calcular o consumo médio geral.");
        }
    }
}

