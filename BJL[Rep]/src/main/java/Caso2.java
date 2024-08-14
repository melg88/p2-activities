import java.util.Scanner;

public class Caso2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int A = scanner.nextInt();

        System.out.println("Insira o valor de B:");
        int B = scanner.nextInt();

        System.out.println("Série numérica:");

        for (int i = A + 1; i < B; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
