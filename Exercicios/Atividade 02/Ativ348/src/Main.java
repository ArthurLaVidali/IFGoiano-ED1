import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // criando arrays para armazenar os nomes e notas dos alunos
        String[] nomes = new String[5];
        double[][] notas = new double[5][2];

        // lendo os nomes e notas dos alunos
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "º aluno:");
            nomes[i] = scanner.nextLine();

            System.out.println("Digite a primeira nota do " + (i + 1) + "º aluno:");
            notas[i][0] = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite a segunda nota do " + (i + 1) + "º aluno:");
            notas[i][1] = Double.parseDouble(scanner.nextLine());

            System.out.println(); // pula uma linha
        }

        // calculando as médias dos alunos e imprimindo a listagem
        System.out.println("Listagem de alunos:");
        for (int i = 0; i < 5; i++) {
            double media = (notas[i][0] + notas[i][1]) / 2;

            System.out.println("Aluno: " + nomes[i]);
            System.out.println("Nota 1: " + notas[i][0]);
            System.out.println("Nota 2: " + notas[i][1]);
            System.out.println("Média: " + media);
            System.out.println(); // pula uma linha
        }
    }
}