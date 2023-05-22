import java.util.*;

public class SorteioPilhas {
    public static void main(String[] args) {
        Random random = new Random();
        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Stack<Integer> pilha3 = new Stack<>();

        // Fase 1: Sorteio dos números e armazenamento nas pilhas
        for (int i = 0; i < 100; i++) {
            int numeroSorteado = random.nextInt(9) + 1;
            if (numeroSorteado <= 3) {
                pilha1.push(numeroSorteado);
            } else if (numeroSorteado <= 6) {
                pilha2.push(numeroSorteado);
            } else {
                pilha3.push(numeroSorteado);
            }
        }

        // Fase 2: Manipulação das pilhas
        int numerosSorteados = 0;
        while (!pilha1.isEmpty() && !pilha2.isEmpty() && !pilha3.isEmpty() && numerosSorteados < 100) {
            int pilhaSorteada = random.nextInt(3) + 1;
            int numeroTopoPilhaSorteada;

            if (pilhaSorteada == 1 && !pilha1.isEmpty()) {
                numeroTopoPilhaSorteada = pilha1.pop();
            } else if (pilhaSorteada == 2 && !pilha2.isEmpty()) {
                numeroTopoPilhaSorteada = pilha2.pop();
            } else if (pilhaSorteada == 3 && !pilha3.isEmpty()) {
                numeroTopoPilhaSorteada = pilha3.pop();
            } else {
                continue; // A pilha sorteada está vazia, pula para a próxima iteração
            }

            numerosSorteados++;
            System.out.println("Empilhando o número " + numeroTopoPilhaSorteada + " na pilha " + pilhaSorteada);
        }

        // Impressão das pilhas
        System.out.println("\nPilha 1:\tPilha 2:\tPilha 3:");
        int maxPilhaSize = Math.max(Math.max(pilha1.size(), pilha2.size()), pilha3.size());
        for (int i = 0; i < maxPilhaSize; i++) {
            if (i < pilha1.size()) {
                System.out.print(pilha1.elementAt(i) + "\t\t");
            } else {
                System.out.print("\t\t");
            }
            if (i < pilha2.size()) {
                System.out.print(pilha2.elementAt(i) + "\t\t");
            } else {
                System.out.print("\t\t");
            }
            if (i < pilha3.size()) {
                System.out.print(pilha3.elementAt(i));
            }
            System.out.println();
        }

        // Mensagem de encerramento
        if (pilha3.isEmpty()) {
            System.out.println("\nO programa foi encerrado porque a pilha 3 está vazia.");
        } else if (numerosSorteados >= 100) {
            System.out.println("\nO programa foi encerrado após atingir o total de 100 números sorteados.");
        }
    }
}
S
