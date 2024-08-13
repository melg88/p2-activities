import java.util.Scanner;

public class Caso4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro valor:");
        int numero1 = scanner.nextInt();

        System.out.println("Insira o segundo valor:");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            int multiplicacao = numero1 * numero2;
            System.out.println("Multiplicação: " + multiplicacao);
        } else if (numero1 > numero2) {
            int subtracao = numero1 - numero2;
            System.out.println("Subtração: " + subtracao);
        } else {
            int soma = numero1 + numero2;
            System.out.println("Soma: " + soma);
        }

        scanner.close();
    }
}
