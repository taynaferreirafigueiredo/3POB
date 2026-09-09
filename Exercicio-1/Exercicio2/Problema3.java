import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double media;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("Média: %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Aprovado.");
        } else if (media >= 5.0) {
            System.out.println("Em Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        scanner.close();
    }
}