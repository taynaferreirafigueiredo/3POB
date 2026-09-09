import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        long fatorial = 1;

        System.out.print("Digite um número: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial: " + fatorial);

        scanner.close();
    }
}