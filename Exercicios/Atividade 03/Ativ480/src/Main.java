import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        if (ehCapicua(numero)) {
            System.out.println("O número " + numero + " é capicua.");
        } else {
            System.out.println("O número " + numero + " não é capicua.");
        }
        input.close();
    }

    public static boolean ehCapicua(int numero) {
        int numeroInvertido = 0;
        int resto, aux = numero;
        while (aux > 0) {
            resto = aux % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            aux = aux / 10;
        }
        return numeroInvertido == numero;
    }
}
