import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] palavras = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a palavra " + (i+1) + ": ");
            palavras[i] = input.nextLine();
        }

        for (int i = 0; i < 10; i++) {
            String palavra = palavras[i];
            StringBuilder novaPalavra = new StringBuilder();
            int ocorrencias = 0;
            for (int j = 0; j < palavra.length(); j++) {
                if (palavra.charAt(j) == 'a') {
                    novaPalavra.append('*');
                    ocorrencias++;
                } else {
                    novaPalavra.append(palavra.charAt(j));
                }
            }
            System.out.println((i+1) + "- " + novaPalavra.toString());
        }
    }
}
