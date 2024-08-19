import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número : ");
        int numero = scanner.nextInt();

        scanner.close();

        System.out.println("Números primos menores que " + numero + ":");
        for (int i = 2; i < numero; i++) {
            if (ePrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean ePrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
