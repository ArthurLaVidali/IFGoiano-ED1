import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um angulo em graus: ");
        Double ang = scan.nextDouble();

        Double radianos = ang * (Math.PI / 180.0);

        System.out.println("Graus: "+ang+" Radianos: "+radianos);
    }
}