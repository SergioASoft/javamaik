import java.util.Scanner;

public class ScannerPrueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        Long num1 = scanner.nextLong();
        System.out.println("Ingresa el primer numero: ");
        Long num2 = scanner.nextLong();
        System.out.println("El resultado de la suma es: "+(num1+num2));

        scanner.close();
    }
}
