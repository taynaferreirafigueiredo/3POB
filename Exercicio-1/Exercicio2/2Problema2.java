import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int anoNascimento;
        int anoAtual;
        int idade;

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();

        idade = anoAtual - anoNascimento;

        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

        scanner.close();
    }
}