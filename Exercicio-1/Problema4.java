import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double base;
        double altura;
        double area;
        double perimetro;

        System.out.print("Digite a base: ");
        base = scanner.nextDouble();

        System.out.print("Digite a altura: ");
        altura = scanner.nextDouble();

        area = base * altura;

        perimetro = 2 * (base + altura);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

        scanner.close();
    }
}