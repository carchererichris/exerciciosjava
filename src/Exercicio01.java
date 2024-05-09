import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
         int numero = 0;

        System.out.println("Digite um número:");
        numero = leitura.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("O número informado é zero");
        }
    }
}
