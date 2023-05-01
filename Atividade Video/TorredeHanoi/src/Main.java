import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos discos deseja utilizar na Torre de Hanoi");
        int qnt = scan.nextInt();   //Recebe quantos discos o usuário deseja utilizar na torre de hanoi
        scan.reset();               //Não é necessário apenas para resetar o scanner

        long timeStart = System.nanoTime(); //Começa a iniciar o tempo para saber quanto tempo irá demorar

        moveTorre(qnt, "Torre1", "Torre2", "Torre3");  //Aqui onde começa a implementação da Torre de Hanoi

        long fimTime = System.nanoTime(); //Encerra o tempo para saber o total demorado para executar a torre de hanoi
        long duracao = (fimTime - timeStart)/1000000; //Como nanoTime calcula o tempo em nanosegundos, a gente vai converter
                                                      //de nanosegundos para milisegundo, dividindo a diferença do tempo start e do fim
                                                      //Para saber o tempo em segundos.

        long horas = duracao / 3600000;               //Neste processo iremos transformar os milisegundos para Horas, para apresentarmos ao usuário
        long minutos = (duracao % 3600000) / 60000;   //Neste momento transformamos os milisegundos para minutos
        long segundos = ((duracao % 3600000) % 60000) / 1000;  //Por fim milisegundos para Segundos

        System.out.println("Foi gasto um total de: "+duracao+" em milisegundos");  //Apresenta ao usuário os resultados em milisegundos
        System.out.println(horas+":"+minutos+":"+segundos);    //Apresenta ao usuário os resultados em horas, minutos e segundos (H:M:S)
        System.out.println("-----------------------------------------------");   //Encerra o código


    }
    //A partir desta linha de código será implementado a Torre de Hanoi
    public static void moveDisco(String movePolo, String movePolo2){

    }

    public static void moveTorre(int altura, String movePolo, String movePolo2, String movePolo3){
        if(altura>=1){
            moveTorre(altura-1, movePolo, movePolo3, movePolo2);
            moveDisco(movePolo, movePolo2);
            moveTorre(altura-1,movePolo3,movePolo2, movePolo);
        }

        else return;
    }

}