import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldo, nsaldo;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o saldo: ");
        saldo = scan.nextDouble();

        nsaldo = saldo * 1.01;
        System.out.println("o novo saldo e: "+nsaldo);
    }
}