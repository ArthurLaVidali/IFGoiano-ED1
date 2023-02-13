import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int data, dia, mes, ano, ndata;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite data no formato DDMMAA: ");
        data = scan.nextInt();

        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;
        ndata = mes*10000 + dia*100 + ano;

        System.out.println("DIA: "+dia);
        System.out.println("MES: "+mes);
        System.out.println("ANO: "+ano);
        System.out.println("DATA NO FORMATO MMDDAA: "+ndata);
        System.out.println(" ");

    }
}