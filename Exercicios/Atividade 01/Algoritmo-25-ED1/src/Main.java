import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int data, dia, mes, ano;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma data no formato ddmmaa: ");
        data = scan.nextInt();

        dia = data/10000;
        mes = data % 10000 / 100;
        ano = data % 100;

        System.out.println("DIA: "+dia);
        System.out.println("MES: "+mes);
        System.out.println("ANO: "+ano);
    }
}