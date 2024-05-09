import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int n1;

        System.out.println("Informe um número inteiro:");
        n1 = numero.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("O número " + n1 + " é par.");
        } else {
            System.out.println("O número " + n1 + " é ímpar.");
        }

    }
}
