import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Média: %.2f%n", media);

        scanner.close();
    }
}
