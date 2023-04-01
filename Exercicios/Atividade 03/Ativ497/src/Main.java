import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        // Recebe os dados do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o número %d: ", i+1);
            vetor[i] = sc.nextInt();
        }

        // Ordena o vetor
        Arrays.sort(vetor);

        // Recebe o número a ser buscado
        System.out.print("\nDigite o número a ser buscado: ");
        int chave = sc.nextInt();

        // Busca binária
        int posicao = buscaBinaria(vetor, chave);

        // Verifica se o número foi encontrado
        if (posicao == -1) {
            System.out.println("\nNúmero não encontrado no vetor.");
        } else {
            System.out.println("\nNúmero encontrado na posição " + posicao + " do vetor.");
        }
    }

    public static int buscaBinaria(int[] vetor, int chave) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == chave) {
                return meio;
            } else if (vetor[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        // Se o número não foi encontrado, retorna -1
        return -1;
    }
}
