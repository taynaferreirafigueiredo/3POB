import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int pares = 0;
        int impares = 0;

        System.out.print("Digite o primeiro número: ");
        a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        b = scanner.nextInt();

        for (int i = a; i <= b; i++) {

            if (i % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}