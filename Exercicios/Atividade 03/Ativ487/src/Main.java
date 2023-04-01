import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
        }

        System.out.println("Vetor original: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println((i + 1) + " - " + vetor[i]);
        }

        inverte(vetor, tamanho);

        System.out.println("\nVetor invertido: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println((i + 1) + " - " + vetor[i]);
        }
    }

    public static void inverte(int[] vetor, int tamanho) {
        int aux;
        for (int i = 0; i < tamanho / 2; i++) {
            aux = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = aux;
        }
    }
}
