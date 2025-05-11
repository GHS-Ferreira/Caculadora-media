	import java.util.Scanner;

public class CalculadoraMedia {
    public static double calcularMedia(double a, double b) {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double media = calcularMedia(num1, num2);

        System.out.println("A média é: " + media);

        scanner.close();
    }
}
