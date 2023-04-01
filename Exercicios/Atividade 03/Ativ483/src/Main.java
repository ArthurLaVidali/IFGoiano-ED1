import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos dos vetores: ");
        int n = input.nextInt();
        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];
        System.out.println("Digite os elementos do primeiro vetor:");
        lerVetor(vetor1, input);
        System.out.println("Digite os elementos do segundo vetor:");
        lerVetor(vetor2, input);
        int produto = produtoEscalar(vetor1, vetor2);
        System.out.println("O produto escalar dos vetores é: " + produto);
        input.close();
    }

    public static void lerVetor(int[] vetor, Scanner input) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
        }
    }

    public static int produtoEscalar(int[] vetor1, int[] vetor2) {
        if (vetor1.length != vetor2.length) {
            throw new IllegalArgumentException("Os vetores devem ter o mesmo tamanho.");
        }
        int produto = 0;
        for (int i = 0; i < vetor1.length; i++) {
            produto += vetor1[i] * vetor2[i];
        }
        return produto;
    }
}
