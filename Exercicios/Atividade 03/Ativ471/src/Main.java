import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o dividendo: ");
        int dividendo = input.nextInt();
        System.out.print("Digite o divisor: ");
        int divisor = input.nextInt();

        if (divisor > dividendo) {
            System.out.println("INVALIDO. Digite um divisor menor que o dividendo.");
        } else if (dividendo % divisor != 0) {
            System.out.println("Nenhuma vez.");
        } else {
            int vezesDivisivel = 0;
            while (dividendo % divisor == 0) {
                vezesDivisivel++;
                dividendo /= divisor;
            }
            System.out.println(divisor + " é divisível " + vezesDivisivel + " vezes pelo número.");
        }

        input.close();
    }
}
