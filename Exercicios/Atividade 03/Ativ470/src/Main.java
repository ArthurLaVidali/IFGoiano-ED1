import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        boolean ehPrimo = true;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (numero == 1) {
            ehPrimo = false;
        }

        if (ehPrimo) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        input.close();
    }
}
