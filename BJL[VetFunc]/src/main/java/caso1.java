import java.util.Scanner;

public class caso1 {

    public static int maiorNumero(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else if (num2 > num1) {
            return num2;
        } else {
            System.out.println("Os números são iguais");
            return num1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int numero2 = scanner.nextInt();

        int resultado = maiorNumero(numero1, numero2);

        if (numero1 != numero2) {
            System.out.println("O maior é: " + resultado);
        }

        scanner.close();
    }
}
