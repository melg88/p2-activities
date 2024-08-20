import java.util.Scanner;

public class caso2 {

    public static boolean ehOMaiorNumero(int[] numeros) {
        int primeiro = numeros[0];
        int segundo = numeros[1];
        int terceiro = numeros[2];

        if (primeiro > segundo && primeiro > terceiro && primeiro != segundo && primeiro != terceiro) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        System.out.println("Insira o primeiro número:");
        numeros[0] = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        numeros[1] = scanner.nextInt();

        System.out.println("Insira o terceiro número:");
        numeros[2] = scanner.nextInt();

        if (ehOMaiorNumero(numeros)) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }

        scanner.close();
    }
}
