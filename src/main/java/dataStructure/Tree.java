package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }

        public boolean isLeaf() {
            return (this.left == null) && (this.right == null);
        }
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node newNode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node currentNode = queue.remove();
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                } else {
                    queue.add(currentNode.left);
                }
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                } else {
                    queue.add(currentNode.right);
                }
            }
        }
    }

    // Método Pré Ordem (R-E-D) Raíz - Esquerda - Direita
    public void preOrder() {
        preOrder(root);
    }

    // Método Pré Ordem nó (R-E-D) Raíz - Esquerda - Direita
    public void preOrder(Node node) {
        if (node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    // Método Em Ordem (E-R-D) Esquerda - Raíz - Direita
    public void inOrder() {
        inOrder(root);
    }

    // Método Em Ordem nó (E-R-D) Esquerda - Raíz - Direita
    public void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    // Método Pós Ordem (E-D-R) Esquerda - Direita - Raíz
    public void postOrder() {
        postOrder(root);
    }

    // Método Pós Ordem nó (E-D-R) Esquerda - Direita - Raíz
    public void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }

    // Método (BFS) Busca em Largura (profundidade)
    public void BFS() {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);

            System.out.println(node.value);
        }
    }




    // Criando aqui mesmo o método main
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(37);
        tree.insert(11);
        tree.insert(66);
        tree.insert(8);
        tree.insert(17);
        tree.insert(42);
        tree.insert(72);

        System.out.println("######################");
        System.out.println("Pré Ordem");
        System.out.println("----------");
        tree.preOrder();
        System.out.println("######################");

        System.out.println("######################");
        System.out.println("Em Ordem");
        System.out.println("----------");
        tree.inOrder();
        System.out.println("######################");

        System.out.println("######################");
        System.out.println("Pós Ordem");
        System.out.println("----------");
        tree.postOrder();
        System.out.println("######################");

        System.out.println("######################");
        System.out.println("BSF");
        System.out.println("----------");
        tree.BFS();
        System.out.println("######################");
    }
}
