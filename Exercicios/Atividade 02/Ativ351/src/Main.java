import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // criando o vetor para armazenar os nomes
        String[] nomes = new String[5];

        // lendo os nomes e armazenando no vetor
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da " + (i+1) + "ª pessoa:");
            nomes[i] = scanner.nextLine();
        }

        // solicitando o número da pessoa a ser acessada
        System.out.println("Digite o número da pessoa que você deseja acessar (entre 1 e 5):");
        int numeroPessoa = Integer.parseInt(scanner.nextLine());

        // imprimindo o nome da pessoa correspondente ao número digitado
        System.out.println("O nome da " + numeroPessoa + "ª pessoa é: " + nomes[numeroPessoa-1]);
    }
}
