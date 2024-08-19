import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        // Criar um objeto Scanner para leitura da entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite algumas letras: ");
        String texto = scanner.nextLine();

        scanner.close();


        Contagem contagem = contarCaracteres(texto);

        System.out.println("Quantidade de vogais: " + contagem.vogais);
        System.out.println("Quantidade de espaços em branco: " + contagem.espacosEmBranco);
        System.out.println("Quantidade de consoantes: " + contagem.consoantes);
    }


    public static Contagem contarCaracteres(String texto) {
        int vogais = 0;
        int espacosEmBranco = 0;
        int consoantes = 0;


        texto = texto.toLowerCase();


        for (char caractere : texto.toCharArray()) {
            if (Character.isWhitespace(caractere)) {
                espacosEmBranco++;
            } else if (isVogal(caractere)) {
                vogais++;
            } else if (Character.isLetter(caractere)) {
                consoantes++;
            }
        }

        return new Contagem(vogais, espacosEmBranco, consoantes);
    }


    private static boolean isVogal(char caractere) {
        return "aeiou".indexOf(caractere) != -1;
    }


    static class Contagem {
        int vogais;
        int espacosEmBranco;
        int consoantes;

        Contagem(int vogais, int espacosEmBranco, int consoantes) {
            this.vogais = vogais;
            this.espacosEmBranco = espacosEmBranco;
            this.consoantes = consoantes;
        }
    }
}
