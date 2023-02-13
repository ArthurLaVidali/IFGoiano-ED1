import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, d;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite numero de tres casas: ");
        a = scan.nextInt();

        d = a % 100 / 10;

        System.out.println("algarismo da casa das dezenas: "+d);
    }
}