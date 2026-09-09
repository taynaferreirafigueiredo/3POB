import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        scanner.close();
    }
}