import java.util.Scanner;

public class Caso3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPositivos = 0;

        while (true) {
            System.out.println("Insira um número:");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero > 0) {
                contadorPositivos++;
            }
        }

        System.out.println("Quantidade de positivos: " + contadorPositivos);
        scanner.close();
    }
}
