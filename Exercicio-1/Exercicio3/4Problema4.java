import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite o número que deseja buscar: ");
        int x = scanner.nextInt();

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < 6; i++) {

            if (numeros[i] == x) {
                encontrado = true;
                posicao = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado na posição: " + posicao);
        } else {
            System.out.println("Número não encontrado.");
        }

        scanner.close();
    }
}