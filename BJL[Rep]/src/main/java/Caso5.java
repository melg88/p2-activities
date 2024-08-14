import java.util.Scanner;

public class Caso5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int N = scanner.nextInt();

        boolean ehPrimo = true;

        if (N <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(N + " é primo.");
        } else {
            System.out.println(N + " não é primo.");
        }

        scanner.close();
    }
}
