package dataStructure;

import java.util.LinkedList;  // Importa a classe LinkedList, que implementa a interface Queue
import java.util.Queue;      // Importa a interface Queue

public class Tree {

    public Node root;  // Declara a raiz da árvore

    // Classe estática interna que representa um nó na árvore
    public static class Node {
        public int value;  // Valor armazenado no nó
        public Node left;  // Referência para o filho esquerdo
        public Node right; // Referência para o filho direito

        // Construtor da classe Node que inicializa o valor do nó
        public Node(int value) {
            this.value = value;
        }

        // Método que verifica se o nó é uma folha (não tem filhos)
        public boolean isLeaf() {
            return (this.left == null) && (this.right == null);
        }
    }

    // Método para inserir um valor na árvore
    public void insert(int value) {
        if (root == null) {
            // Se a raiz for nula, cria um novo nó e o define como raiz
            root = new Node(value);
        } else {
            // Se a raiz não for nula, cria um novo nó com o valor dado
            Node newNode = new Node(value);
            // Cria uma fila para realizar a travessia em largura na árvore
            Queue<Node> queue = new LinkedList<>();
            // Adiciona a raiz à fila
            queue.add(root);
            // Loop até encontrar uma posição vazia para o novo nó
            while (!queue.isEmpty()) {
                // Remove o nó na frente da fila
                Node currentNode = queue.remove();
                // Verifica se o filho esquerdo do nó atual é nulo
                if (currentNode.left == null) {
                    // Se for nulo, adiciona o novo nó como filho esquerdo e sai do loop
                    currentNode.left = newNode;
                    break;
                } else {
                    // Se não for nulo, adiciona o filho esquerdo do nó atual à fila
                    queue.add(currentNode.left);
                }
                // Verifica se o filho direito do nó atual é nulo
                if (currentNode.right == null) {
                    // Se for nulo, adiciona o novo nó como filho direito e sai do loop
                    currentNode.right = newNode;
                    break;
                } else {
                    // Se não for nulo, adiciona o filho direito do nó atual à fila
                    queue.add(currentNode.right);
                }
            }
        }
    }

    // Criando aqui mesmo o método main
    public static void main(String[] args) {
        // Criando a minha árvore
        Tree tree = new Tree();
        // elemento 1
        tree.insert(1);
        // elemento 2
        tree.insert(2);
        // elemento 3
        tree.insert(3);

        System.out.println(tree.root.value);
        System.out.println(tree.root.left.value);
        System.out.println(tree.root.right.value);

        // deve retornar false
        System.out.println(tree.root.isLeaf());
        // deve retornar true
        System.out.println(tree.root.right.isLeaf());
        // deve retornar true
        System.out.println(tree.root.left.isLeaf());

    }

}
