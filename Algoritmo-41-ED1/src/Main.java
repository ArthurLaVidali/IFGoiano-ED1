import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d, mp;

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Entre com 1 numero: ");
        a = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Entre com 2 numero: ");
        b = scan2.nextInt();

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Entre com 3 numero: ");
        c = scan3.nextInt();

        Scanner scan4 = new Scanner(System.in);
        System.out.println("Entre com 4 numero: ");
        d = scan4.nextInt();

        mp = (a*1 + b*2 + c*3 + d*4) / 10;
        System.out.println("media ponderada: "+mp);
    }
}