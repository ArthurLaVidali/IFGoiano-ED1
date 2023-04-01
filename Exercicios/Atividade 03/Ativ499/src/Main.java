import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("MENU:");
            System.out.println("1 - Preencher o vetor");
            System.out.println("2 - Ordenar o vetor");
            System.out.println("3 - Imprimir o vetor");
            System.out.println("4 - Sair");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    preencherVetor(vetor, scanner);
                    break;
                case 2:
                    Arrays.sort(vetor);
                    System.out.println("Vetor ordenado!");
                    break;
                case 3:
                    imprimirVetor(vetor);
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        } while (opcao != 4);
    }

    private static void preencherVetor(int[] vetor, Scanner scanner) {
        System.out.println("Digite " + vetor.length + " números inteiros para preencher o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    private static void imprimirVetor(int[] vetor) {
        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1) + " - " + vetor[i]);
        }
    }
}
