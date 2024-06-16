package dataStructure;

// Árvore Binária de Origem (Binary Source Tree)
public class BST {

    // Raiz da árvore
    public Node root;

    // Classe interna para representar os nós da árvore
    public class Node {
        public int value; // Valor armazenado no nó
        public Node left; // Referência para o filho esquerdo
        public Node right; // Referência para o filho direito

        // Construtor para inicializar o valor do nó
        public Node(int value) {
            this.value = value;
        }
    }

    // Método para inserir um valor na árvore
    public void insert(int value) {
        if (root == null) {
            // Se a raiz for nula, cria um novo nó e o define como raiz
            root = new Node(value);
        } else {
            // Caso contrário, insere o valor na posição correta
            insert(root, value);
        }
    }

    // Método privado recursivo para inserir um valor na árvore
    private void insert(final Node root, final int value) {
        if (root == null) return;
        if (value == root.value) return; // Não insere valores duplicados
        if (value > root.value) {
            if (root.right == null) {
                // Se não houver filho direito, cria um novo nó à direita
                root.right = new Node(value);
            } else {
                // Caso contrário, chama recursivamente para a subárvore direita
                insert(root.right, value);
            }
        } else {
            if (root.left == null) {
                // Se não houver filho esquerdo, cria um novo nó à esquerda
                root.left = new Node(value);
            } else {
                // Caso contrário, chama recursivamente para a subárvore esquerda
                insert(root.left, value);
            }
        }
    }

    // Método para realizar a travessia em ordem (E-R-D)
    public void inOrder() {
        inOrder(root);
    }

    // Método privado recursivo para a travessia em ordem
    private void inOrder(final Node node) {
        if (node == null) return;
        inOrder(node.left); // Visita a subárvore esquerda
        System.out.println(node.value); // Visita o nó atual
        inOrder(node.right); // Visita a subárvore direita
    }

    // Método para verificar se um valor existe na árvore
    public boolean contains(int value) {
        return contains(root, value);
    }

    // Método privado recursivo para verificar se um valor existe na árvore
    private boolean contains(final Node root, final int value) {
        if (root == null) return false; // Valor não encontrado
        if (root.value == value) return true; // Valor encontrado
        if (value > root.value) {
            return contains(root.right, value); // Procura na subárvore direita
        } else {
            return contains(root.left, value); // Procura na subárvore esquerda
        }
    }

    // Método para encontrar o valor mínimo a partir de um nó dado
    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left; // Continua até encontrar o nó mais à esquerda
        }
        return currentNode.value;
    }

    // Método para deletar um nó com um valor específico
    public void deleteNode(int value) {
        root = deleteNode(root, value);
    }

    // Método privado recursivo para deletar um nó
    private Node deleteNode(final Node root, final int value) {
        if (root == null) return null;

        if (value < root.value) {
            root.left = deleteNode(root.left, value); // Procura na subárvore esquerda
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value); // Procura na subárvore direita
        } else {
            // Caso em que o nó é encontrado
            if (root.left == null && root.right == null) {
                return null; // Nó sem filhos
            } else if (root.left == null) {
                return root.right; // Nó com um filho direito
            } else if (root.right == null) {
                return root.left; // Nó com um filho esquerdo
            } else {
                // Nó com dois filhos
                int minValue = minValue(root.right); // Encontra o menor valor na subárvore direita
                root.value = minValue; // Substitui o valor do nó pelo menor valor encontrado
                root.right = deleteNode(root.right, minValue); // Deleta o nó com o menor valor
            }
        }
        return root;
    }

    // Método main para testar a árvore
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(37);
        tree.insert(66);
        tree.insert(42);
        tree.insert(11);
        tree.insert(72);
        tree.insert(8);
        tree.insert(17);

        // Imprimindo em ordem
        System.out.println("######################");
        System.out.println("Imprimindo em ordem:");
        System.out.println("-----------------");
        tree.inOrder();
        System.out.println("######################");

        // Este número existe?
        System.out.println("######################");
        System.out.println("-----------------");
        System.out.println("Tem o número 11?");
        System.out.println(tree.contains(11));
        System.out.println("-----------------");
        System.out.println("######################");
        System.out.println("-----------------");
        System.out.println("Tem o número 99?");
        System.out.println(tree.contains(99));
        System.out.println("-----------------");
        System.out.println("######################");

        // Removendo nó
        System.out.println("######################");
        System.out.println("-----------------");
        System.out.println("Remova o 66 e imprima");
        tree.deleteNode(66);
        tree.inOrder();
        System.out.println("-----------------");
        System.out.println("######################");
    }
}
