import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        scanner.close();


        double area = calcularAreaCirculo(raio);
        long areaArredondada = Math.round(area);

        System.out.println("A área do círculo com raio " + raio + " é: " + areaArredondada);
    }


    public static double calcularAreaCirculo(double raio) {
        final double PI = Math.PI; // Valor de PI
        return PI * raio * raio; // Fórmula da área do círculo
    }
}

