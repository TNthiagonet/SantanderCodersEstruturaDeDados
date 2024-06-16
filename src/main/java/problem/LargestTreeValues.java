package problem;

import dataStructure.Tree; // Importa a classe Tree de outro pacote

import java.util.ArrayList;
import java.util.List;

public class LargestTreeValues {

    // Método para encontrar os maiores valores em cada nível da árvore
    public static List<Integer> largestValues(Tree tree) {
        var list = new ArrayList<Integer>(); // Cria uma lista para armazenar os maiores valores
        solveTree(tree.root, 0, list); // Chama o método recursivo para preencher a lista
        return list; // Retorna a lista de maiores valores
    }

    // Método recursivo para encontrar os maiores valores em cada nível da árvore
    private static void solveTree(final Tree.Node node,
                                  final int level,
                                  final ArrayList<Integer> list) {
        if (node == null) return; // Caso base: se o nó é null, retorna

        // Se estamos visitando o nível pela primeira vez, adicionamos o valor do nó à lista
        if (level == list.size()) {
            list.add(node.value);
        } else {
            // Atualizamos o valor na lista com o maior valor entre o atual e o valor do nó
            list.set(level, Math.max(list.get(level), node.value));
        }

        // Chamadas recursivas para os nós filhos (esquerda e direita)
        solveTree(node.left, level + 1, list); // Visita o filho esquerdo
        solveTree(node.right, level + 1, list); // Visita o filho direito
    }

    public static void main(String[] args) {
        Tree tree = new Tree(); // Cria uma nova árvore
        tree.insert(100); // Insere o valor 100 como raiz

        // Insere valores na árvore
        tree.insert(10);
        tree.insert(5);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(5);

        // Imprime os maiores valores de cada nível da árvore
        System.out.println(largestValues(tree));
    }
}
