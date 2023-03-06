import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        while (true){
            System.out.println("1- Imprime o comprimento da frase");
            System.out.println("2- Imprime os dois primeiros e os dois ultimos caracteres da frase");
            System.out.println("3- Imprima a frase espelhada");
            System.out.println("4- Termina o algoritmo");

            int opcao = scan.nextInt();

            if(opcao == 1) {

                System.out.println("Digite uma frase: ");
                String frase1 = scan2.nextLine();
                System.out.println("O numero de caracteres da frase é: " + frase1.length());
            }
            if(opcao == 2) {
                System.out.println("Digite uma frase: ");
                String frase2 = scan2.nextLine();
                String ultimos2 = frase2.substring(frase2.length() - 2);
                System.out.println("Os dois primeiros caracteres da frase é: " + frase2.substring(0, 2));
                System.out.println("Os dois ultimos caracteres da frase é: " + ultimos2);
            }
            if(opcao == 3) {
                System.out.println("Digite uma frase: ");
                String frase3 = scan2.nextLine();

                StringBuilder sb = new StringBuilder(frase3);
                String fraseEspelhada = sb.reverse().toString();
                System.out.println("A frase espelhada é: " + fraseEspelhada);
            }
            if(opcao == 4) {
                break;
            }

            else System.out.println("Opção invalida, digite uma opção valida.");


        }
    }
}