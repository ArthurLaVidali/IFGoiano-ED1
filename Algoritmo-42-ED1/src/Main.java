import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double angulo, rang;

        Scanner scan = new Scanner(System.in);
        System.out.println("digite um angulo em graus: ");
        angulo = scan.nextDouble();

        rang = angulo * 3.14 / 180;
        System.out.println("seno: "+Math.sin(rang));
        System.out.println("cosseno: "+Math.cos(rang));
        System.out.println("tangente: "+Math.tan(rang));
        System.out.println("co-secante: "+1/Math.sin(rang));
        System.out.println("secante: "+1/Math.cos(rang));
        System.out.println("cotangente: "+1/Math.tan(rang));

    }
}