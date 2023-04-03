import java.util.Scanner;

public class InvertePalavras {

    public static String invertePalavras(String str) {
        Pilha pilha = new Pilha();
        String novaStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ' || i == str.length() - 1) {
                if (i == str.length() - 1) {
                    pilha.push(c);
                }
                while (!pilha.isEmpty()) {
                    novaStr += pilha.pop();
                }
                novaStr += c;
            } else {
                pilha.push(c);
            }
        }
        return novaStr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase para inverter as palavras:");
        String str = scanner.nextLine();
        String novaStr = invertePalavras(str);
        System.out.println(novaStr);
        scanner.close();
    }
}