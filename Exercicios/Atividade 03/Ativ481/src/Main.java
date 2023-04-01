import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número na base 10: ");
        int numero = input.nextInt();
        System.out.print("Digite a base de destino (entre 2 e 10): ");
        int base = input.nextInt();
        String resultado = converterBase(numero, base);
        System.out.println("O número " + numero + " na base " + base + " é " + resultado);
        input.close();
    }

    public static String converterBase(int numero, int base) {
        if (base < 2 || base > 10) {
            throw new IllegalArgumentException("A base deve estar entre 2 e 10.");
        }
        String resultado = "";
        while (numero > 0) {
            int resto = numero % base;
            resultado = resto + resultado;
            numero = numero / base;
        }
        return resultado;
    }
}
