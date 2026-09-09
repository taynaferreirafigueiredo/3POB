import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorHora;
        double horasTrabalhadas;
        double salarioBruto;
        double desconto;
        double salarioLiquido;

        System.out.print("Digite o valor da hora: ");
        valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = scanner.nextDouble();

        salarioBruto = valorHora * horasTrabalhadas;

        desconto = salarioBruto * 0.10;

        salarioLiquido = salarioBruto - desconto;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}