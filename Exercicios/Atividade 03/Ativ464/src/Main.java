import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um angulo em radianos: ");
        double radianos = scan.nextDouble();

        double ang = radianos *(180 / Math.PI);

        System.out.println("Radianos: "+radianos+" Graus: "+ang);
    }
}