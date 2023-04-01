import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 3;

        for (int i = 0; i < 3; i++){
            System.out.println("Digite um numero: ");
            int num = scan.nextInt();
            int doubleNum = num + num;
            System.out.println("Dobro: "+doubleNum);
        }
    }
}