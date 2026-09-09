import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int quantidade = 0;
        int soma = 0;
        double media;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        while (numero >= 0) {

            soma = soma + numero;
            quantidade = quantidade + 1;

            System.out.print("Digite outro número: ");
            numero = scanner.nextInt();
        }

        if (quantidade > 0) {
            media = (double) soma / quantidade;

            System.out.println("Quantidade: " + quantidade);
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }

        scanner.close();
    }
}
