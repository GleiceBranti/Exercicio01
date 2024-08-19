import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();


        scanner.close();

        if (ePalindromo(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }
    }


    public static boolean ePalindromo(String palavra) {

        String palavraFormatada = palavra.replaceAll("\\s", "").toLowerCase();
        String palavraInvertida = new StringBuilder(palavraFormatada).reverse().toString();
        return palavraFormatada.equals(palavraInvertida);
    }
}
