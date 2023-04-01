import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];

        // Recebe os números do usuário e armazena no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            vetor[i] = input.nextInt();
        }

        // Verifica a ordenação do vetor
        String ordenacao = verificaOrdenacao(vetor);
        System.out.println(ordenacao);

        input.close();
    }

    public static String verificaOrdenacao(int[] vetor) {
        boolean crescente = true;
        boolean decrescente = true;

        // Verifica se o vetor está ordenado de forma crescente
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i+1]) {
                crescente = false;
                break;
            }
        }

        // Verifica se o vetor está ordenado de forma decrescente
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] < vetor[i+1]) {
                decrescente = false;
                break;
            }
        }

        // Retorna o resultado da verificação
        if (crescente) {
            return "ORDENAÇÃO CRESCENTE";
        } else if (decrescente) {
            return "ORDENAÇÃO DECRESCENTE";
        } else {
            return "NÃO ESTÁ ORDENADO";
        }
    }
}
