import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Informe o número desejado para o cálculo: ");
        n1 = valor.nextInt();

        System.out.println("TABUADA DE " + n1);

        for (int i = 0; i < 11; i++) {
            n2 = n1 * i;
            System.out.println(n1 + " x " + i + " = " + n2);
        }
    }
}
