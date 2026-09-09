import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();

            if (senha != 2026) {
                System.out.println("Senha Incorreta! Tente novamente.");
            }

        } while (senha != 2026);

        System.out.println("Acesso Permitido!");

        scanner.close();
    }
}