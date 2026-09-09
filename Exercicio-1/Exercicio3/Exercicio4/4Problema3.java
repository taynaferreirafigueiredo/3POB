import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[8];

        double soma = 0;
        double media;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

            soma = soma + notas[i];
        }

        media = soma / 8;

        System.out.printf("Média da turma: %.2f%n", media);

        System.out.println("Notas acima da média:");

        for (int i = 0; i < 8; i++) {

            if (notas[i] > media) {
                System.out.println(notas[i]);
            }
        }

        scanner.close();
    }
}
