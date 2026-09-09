import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("Fahrenheit: %.0f%n", fahrenheit);

        scanner.close();
    }
}