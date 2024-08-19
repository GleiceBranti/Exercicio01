import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        String[] diasDaSemana = {
                "Domingo",
                "Segunda-feira",
                "Terça-feira",
                "Quarta-feira",
                "Quinta-feira",
                "Sexta-feira",
                "Sábado"
        };


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 0 a 6: ");
        int numero = scanner.nextInt();


        scanner.close();

        if (numero >= 0 && numero <= 6) {
            System.out.println("O dia da semana é: " + diasDaSemana[numero]);
        } else {
            System.out.println("Número inválido! Por favor, insira um número entre 0 e 6.");
        }
    }
}
