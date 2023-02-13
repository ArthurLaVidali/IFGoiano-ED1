import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sm, qtdade, preco, vp, vd;

        Scanner scan1 = new Scanner(System.in);
        System.out.println("entre com o salário minimo: ");
        sm = scan1.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("entre com a quantidade em quilowatt: ");
        qtdade = scan2.nextDouble();

        preco = sm / 700;
        vp = preco * qtdade;
        vd = vp * 0.9;

        System.out.println("O preço do quilowatt e "+preco+" valor a ser pago: "+vp+" valor com desconto; "+vd);
    }
}