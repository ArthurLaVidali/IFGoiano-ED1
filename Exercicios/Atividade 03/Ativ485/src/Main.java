import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dados do primeiro vetor
        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho = sc.nextInt();

        int[] vetorInteiros = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            vetorInteiros[i] = sc.nextInt();
        }

        // Leitura dos dados do segundo vetor
        char[] vetorCaracteres = new char[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o caractere " + (i+1) + ": ");
            vetorCaracteres[i] = sc.next().charAt(0);
        }

        // Impressão dos caracteres
        for (int i = 0; i < tamanho; i++) {
            int n = vetorInteiros[i];
            char c = vetorCaracteres[i];

            for (int j = 0; j < n; j++) {
                System.out.print(c);
            }

            System.out.println();
        }

        sc.close();
    }
}
