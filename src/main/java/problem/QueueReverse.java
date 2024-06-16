package problem;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReverse {

    // Método para reverter os primeiros k elementos da fila
    public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k) {
        // Chama o método recursivo para inverter os primeiros k elementos
        solveQueue(queue, k);

        // Calcula o número de elementos que não foram invertidos
        int n = queue.size() - k;

        // Move os elementos não invertidos para o final da fila
        while (n-- > 0) {
            int element = queue.remove();  // Remove o elemento do início da fila
            queue.add(element);  // Adiciona o elemento no final da fila
        }

        return queue;  // Retorna a fila invertida
    }

    // Método recursivo para inverter os primeiros k elementos da fila
    private static void solveQueue(Queue<Integer> queue, int k) {
        if (k == 0) return;  // Caso base: quando k chega a zero, encerra a recursão

        int element = queue.remove();  // Remove o elemento do início da fila
        solveQueue(queue, k - 1);  // Chama recursivamente para inverter os próximos elementos
        queue.add(element);  // Adiciona o elemento no final da fila após a recursão
    }

    public static void main(String[] args) {
        // Cria uma fila e adiciona elementos
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int k = 3;  // Define o valor de k para inverter os primeiros k elementos

        // Chama o método para reverter os primeiros k elementos e imprime o resultado
        System.out.println(reverseFirstK(queue, k));
    }

}
