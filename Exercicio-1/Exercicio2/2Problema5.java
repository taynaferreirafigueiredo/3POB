import java.util.Scanner;

public class 2Problema5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Digite o lado A: ");
        a = scanner.nextDouble();

        System.out.print("Digite o lado B: ");
        b = scanner.nextDouble();

        System.out.print("Digite o lado C: ");
        c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }

        } else {
            System.out.println("As medidas não formam um triângulo.");
        }

        scanner.close();
    }
}