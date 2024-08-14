import java.util.Scanner;

public class Caso4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int A = scanner.nextInt();

        System.out.println("Insira o valor de B:");
        int B = scanner.nextInt();

        for (int i = A; i <= B; i++) {
            if (i % 2 != 0) {
                System.out.println("É impar: " + i);
            }
        }
        scanner.close();
    }
}
