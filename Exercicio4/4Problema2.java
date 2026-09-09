import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for (int i = 1; i < 10; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
                posicaoMaior = i;
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
                posicaoMenor = i;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Índice do maior: " + posicaoMaior);

        System.out.println("Menor valor: " + menor);
        System.out.println("Índice do menor: " + posicaoMenor);

        scanner.close();
    }
}