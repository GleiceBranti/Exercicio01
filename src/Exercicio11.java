import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();


        scanner.close();


        imprimirOrdemAlfabetica(palavra1, palavra2);

        informarMaiorPalavra(palavra1, palavra2);
    }


    public static void imprimirOrdemAlfabetica(String palavra1, String palavra2) {

        int comparacao = palavra1.compareTo(palavra2);

        if (comparacao < 0) {

            System.out.println("Ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (comparacao > 0) {

            System.out.println("Ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {

            System.out.println("As palavras são iguais: " + palavra1);
        }
    }


    public static void informarMaiorPalavra(String palavra1, String palavra2) {
        if (palavra1.length() > palavra2.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra1);
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra2);
        } else {
            System.out.println("Ambas as palavras têm o mesmo número de caracteres.");
        }
    }
}

