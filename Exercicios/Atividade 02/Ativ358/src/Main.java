import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precosCompra = new double[100];
        double[] precosVenda = new double[100];

        // lendo os preços de compra e venda das mercadorias
        for (int i = 0; i < 100; i++) {
            System.out.println("Digite o preço de compra da mercadoria " + (i+1) + ":");
            precosCompra[i] = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite o preço de venda da mercadoria " + (i+1) + ":");
            precosVenda[i] = Double.parseDouble(scanner.nextLine());

            System.out.println(); // pula uma linha
        }

        int lucroMenor10 = 0;
        int lucroEntre10e20 = 0;
        int lucroMaior20 = 0;

        // calculando o lucro e contando quantas mercadorias proporcionam cada faixa de lucro
        for (int i = 0; i < 100; i++) {
            double lucro = ((precosVenda[i] - precosCompra[i]) / precosCompra[i]) * 100;

            if (lucro < 10) {
                lucroMenor10++;
            } else if (lucro <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }
        }

        // imprimindo o resultado
        System.out.println("Quantidade de mercadorias com lucro inferior a 10%: " + lucroMenor10);
        System.out.println("Quantidade de mercadorias com lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Quantidade de mercadorias com lucro superior a 20%: " + lucroMaior20);
    }
}
