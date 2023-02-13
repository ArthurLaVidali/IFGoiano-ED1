import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num, base, logaritmo;

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Entre com o logaritmando: ");
        num = scan1.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Entre com a base: ");
        base = scan2.nextDouble();

        logaritmo = Math.log(num) / Math.log(base);

        System.out.println("logaritmo de "+num+" na base "+base+" e "+logaritmo);
    }
}