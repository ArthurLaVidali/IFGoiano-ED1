import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];

        // Lê os nomes
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = sc.nextLine();
        }

        // Ordena os nomes usando Bubble Sort
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (nomes[j].compareTo(nomes[j+1]) > 0) {
                    String temp = nomes[j];
                    nomes[j] = nomes[j+1];
                    nomes[j+1] = temp;
                }
            }
        }

        // Imprime os nomes ordenados
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + " - " + nomes[i]);
        }
    }
}
