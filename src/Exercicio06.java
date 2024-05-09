import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int n1;
        int fatorial = 1;
        String s = "";

        System.out.println("Informe o número desejado no cálculo:");
        n1 = numero.nextInt();
        while (n1 > 1) {
            fatorial *= n1;
            s += n1 + " x " ;
            n1--;
        }
        s += n1;
        System.out.println(s + " = " + fatorial);
    }
}
