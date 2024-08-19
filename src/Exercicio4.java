import java.util.Scanner;

public class Exercicio4{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();

        scanner.close();

        double quilometros = converterMilhasParaQuilometros(milhas);


        System.out.println(milhas + " milhas é igual a " + quilometros + " quilômetros.");
    }

    public static double converterMilhasParaQuilometros(double milhas) {
        final double CONVERSAO_MILHAS_PARA_KM = 1.609;
        return milhas * CONVERSAO_MILHAS_PARA_KM;
    }
}
