import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quoc, rest, val1, val2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o dividendo: ");
        val1 = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Entre com o divisor: ");

        val2 = scan2.nextInt();

        quoc = val1 / val2;
        rest = val1 % val2;

        System.out.println("Dividendo: "+val1);
        System.out.println("Divisor: "+val2);
        System.out.println("Quociente: "+quoc);
        System.out.println("Resto: "+rest);

    }
}