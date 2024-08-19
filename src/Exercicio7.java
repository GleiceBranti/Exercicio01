public class Exercicio7 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) { // Verifica se o número é múltiplo de 3
                int resultadoInt = i / 2;
                double resultadoDouble = i / 2.0;


                System.out.println("Número: " + i);
                System.out.println("Resultado da divisão por 2 (tipo int): " + resultadoInt);
                System.out.println("Resultado da divisão por 2 (tipo double): " + resultadoDouble);
                System.out.println();
            }
        }
    }
}

