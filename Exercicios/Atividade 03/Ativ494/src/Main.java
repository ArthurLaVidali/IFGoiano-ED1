import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> enderecos = new ArrayList<>();
        ArrayList<String> profissoes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite nome: ");
            nomes.add(scanner.nextLine());
            System.out.print("Digite endereco: ");
            enderecos.add(scanner.nextLine());
            System.out.print("Digite profissao: ");
            profissoes.add(scanner.nextLine());
        }
        ArrayList<String[]> dados = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String[] linha = new String[3];
            linha[0] = nomes.get(i);
            linha[1] = enderecos.get(i);
            linha[2] = profissoes.get(i);
            dados.add(linha);
        }
        Collections.sort(dados, (a, b) -> a[0].compareTo(b[0]));
        for (String[] linha : dados) {
            System.out.printf("%-15s %-15s %s\n", linha[0], linha[1], linha[2]);
        }
    }
}
