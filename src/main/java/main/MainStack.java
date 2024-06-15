package main;

import dataStructure.Stack;

public class MainStack {
    public static void main(String[] args) {

        // Array de números a serem invertidos
        int[] numeros = {5, 4, 3, 2, 1};

        // Chama o método para inverter os números usando uma pilha
        inverter(numeros);

    }

    // Método para inverter os números usando uma pilha
    private static void inverter(final int[] numeros) {

        // Cria uma pilha com o primeiro número do array como o topo inicial
        Stack stack = new Stack(numeros[0]);

        // Insere todos os números do array na pilha
        for (int i = 0; i < numeros.length; i++) {
            stack.push(numeros[i]);
        }

        // Remove os números da pilha e imprime na ordem inversa até que a pilha esteja vazia
        var node = stack.pop();
        while (node != null) {
            System.out.println(node.getValue()); // Imprime o valor do nó atual da pilha
            node = stack.pop(); // Move para o próximo nó da pilha
        }

    }
}
