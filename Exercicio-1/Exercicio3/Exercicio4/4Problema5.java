import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];

        int quantidadePares = 0;
        int quantidadeImpares = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[quantidadePares] = numeros[i];
                quantidadePares++;
            } else {
                impares[quantidadeImpares] = numeros[i];
                quantidadeImpares++;
            }
        }

        System.out.println("Números pares:");

        for (int i = 0; i < quantidadePares; i++) {
            System.out.println(pares[i]);
        }

        System.out.println("Números ímpares:");

        for (int i = 0; i < quantidadeImpares; i++) {
            System.out.println(impares[i]);
        }

        scanner.close();
    }
}