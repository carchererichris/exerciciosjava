import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;

        System.out.println("Informe o primeiro número:");
        n1 = numero.nextInt();

        System.out.println("Informe o segundo número:");
        n2 = numero.nextInt();

        if (n1 != n2) {
            if (n1 > n2) {
                System.out.println("O número " + n1 + " é maior que " + n2 + " .");
            } else {
                System.out.println("O número " + n1 + " é menor que " + n2 + " .");
            }
        } else {
            System.out.println("Os números informados são iguais.");
        }
    }
}
