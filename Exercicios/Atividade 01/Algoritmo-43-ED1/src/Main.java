import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num, logaritmo;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o logaritmando: ");
        num = scan.nextDouble();

        logaritmo = Math.log(num) / Math.log(10);

        System.out.println("logaritmo: "+logaritmo);
    }
}