import java.util.Scanner;

public class caso5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o dado da posição " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Insira a chave de busca:");
        int chave = scanner.nextInt();

        boolean chaveEncontrada = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                System.out.println("Chave encontrada na posição: " + (i + 1));
                chaveEncontrada = true;
                break;
            }
        }

        if (!chaveEncontrada) {
            System.out.println("Chave não encontrada!");
        }

        scanner.close();
    }
}
