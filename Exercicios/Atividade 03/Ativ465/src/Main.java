import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite numero 1: ");
        int num1 = scan.nextInt();

        System.out.println("Digite numero 2: ");
        int num2 = scan.nextInt();

        if(num1>num2){
            System.out.println("O numero "+num1+" é maior que o numero "+num2);
        }
        else System.out.println("O numero "+num2+" é maior que o numero "+num1);
    }
}