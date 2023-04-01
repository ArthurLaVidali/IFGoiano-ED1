import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        char c = input.next().charAt(0);
        if (isConsoante(c) == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        input.close();
    }

    public static int isConsoante(char c) {
        if (Character.isLetter(c) && !isVogal(c)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean isVogal(char c) {
        char[] vogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char vogal : vogais) {
            if (c == vogal) {
                return true;
            }
        }
        return false;
    }
}
