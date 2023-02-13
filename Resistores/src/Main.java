import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // cria um mapa para associar as cores aos seus valores numéricos
        HashMap<String, Integer> cores = new HashMap<>();
        cores.put("Preto", 0);
        cores.put("Marrom", 1);
        cores.put("Vermelho", 2);
        cores.put("Laranja", 3);
        cores.put("Amarelo", 4);
        cores.put("Verde", 5);
        cores.put("Azul", 6);
        cores.put("Violeta", 7);
        cores.put("Cinza", 8);
        cores.put("Branco", 9);

        // recebe as cores como argumentos da linha de comando
        String[] entrada = args;

        // converte as duas primeiras cores para os seus valores numéricos
        int valor = cores.get(entrada[0]) * 10 + cores.get(entrada[1]);

        // imprime o valor do resistor
        System.out.println(valor);
    }
}