import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        double valor;
        double area;
        int opcao = 0;
        String titulo;
        titulo = """
                Digite o número referente a opção desejada:
                1 - Calcular área do quadrado
                2 - Calcular área do círculo
                """;

        while (opcao != 1 && opcao != 2) {
            System.out.println(titulo);
            opcao = numero.nextInt();

            if (opcao == 1) {
                System.out.println("Insira o valor de um dos lados do quadrado:");
                valor = numero.nextDouble();
                area = Math.pow(valor, 2);

                System.out.println("A área do quadrado é: " + area);
            } else if (opcao == 2) {
                System.out.println("Insira o valor do raio do círculo:");
                valor = numero.nextDouble();
                area = 3.14 * (Math.pow(valor, 2));

                System.out.println("A área do círculo é: " + area);
            } else {
                System.out.println("Opção Inválida!");
            }
        }
    }
}
