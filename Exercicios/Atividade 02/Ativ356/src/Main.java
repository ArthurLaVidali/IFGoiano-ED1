import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // criando arrays para armazenar os nomes, notas e situações dos alunos
        String[] nomes = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];
        double[] medias = new double[15];
        String[] situacoes = new String[15];

        // lendo os nomes e notas dos alunos
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o nome do " + (i+1) + "º aluno:");
            nomes[i] = scanner.nextLine();

            System.out.println("Digite a nota da PR1 do " + (i+1) + "º aluno:");
            pr1[i] = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite a nota da PR2 do " + (i+1) + "º aluno:");
            pr2[i] = Double.parseDouble(scanner.nextLine());

            // calculando a média arredondada e a situação do aluno
            medias[i] = Math.round((pr1[i] + pr2[i]) / 2);
            if (medias[i] >= 6) {
                situacoes[i] = "AP";
            } else {
                situacoes[i] = "RP";
            }

            System.out.println(); // pula uma linha
        }

        // imprimindo a listagem dos alunos
        System.out.println("Listagem de alunos:");
        System.out.println("Nome\t\tPR1\tPR2\tMédia\tSituação");
        for (int i = 0; i < 15; i++) {
            System.out.println(nomes[i] + "\t" + pr1[i] + "\t" + pr2[i] + "\t" + medias[i] + "\t" + situacoes[i]);
        }
    }
}
