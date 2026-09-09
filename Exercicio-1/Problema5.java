import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalSegundos;
        int horas;
        int minutos;
        int segundos;

        System.out.print("Digite o total de segundos: ");
        totalSegundos = scanner.nextInt();

        horas = totalSegundos / 3600;

        minutos = (totalSegundos % 3600) / 60;

        segundos = totalSegundos % 60;

        System.out.println(horas + " hora(s), "
                + minutos + " minuto(s) e "
                + segundos + " segundo(s)");

        scanner.close();
    }
}