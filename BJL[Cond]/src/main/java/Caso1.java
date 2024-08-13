import java.util.Scanner;

public class Caso1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior é: " + numero2);
        } else {
            System.out.println("Os números são iguais");
        }
        scanner.close();
    }
}
