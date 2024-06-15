// A pilha é formada de nós, é representada por baixo dos panos por uma LinkedList
package dataStructure;

public class Stack {

    // Preciso de um nó topo
    private Node top;
    // Preciso da altura da pilha
    private int height;

    // como toda lista que se preze, vamos de nós
    public class Node {
        // que vai armazenar o valor
        int value;
        // que vai armazenar, apontar para  o proximo nó
        Node next;

        // Construtor pra receber o valor do nó
        Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    // Recebe um valor inicial
    public Stack(int value) {
        // valor vai ser armazenado no nó
        Node newNode = new Node(value);
        // esse nó vai ser o topo da pilha
        top = newNode;
        // altura da pilha começa com 1
        height = 1;
    }

    //# Método getTop
    public void getTop() {
        // Se a pilha estiver vazia
        if (top == null) {
            System.out.println("Pilha vazia");
        } else {
            // Caso contrário, imprime o valor do topo da pilha
            System.out.println("Topo: " + top.value);
        }
    }

    //# Método Altura
    public void getHeight() {
        // Imprime a altura da pilha
        System.out.println("Altura: " + height);
    }

    //# Método print
    public void print() {
        // Adicionando caracteres informando que ele foi chamado
        System.out.println("##############################");
        // Criando nó de leitura (temporário) que vai inicializar pelo topo da pilha
        Node temp = top;
        // Enquanto esse nó temporário for diferente de vazio ou de nulo
        while (temp != null) {
            // Vou imprimir aquele elemento
            System.out.println(temp.value);
            // E como eu navego? Basta navegar item a item sempre para o próximo nó
            temp = temp.next;
        }
        // Adicionando caracteres informando que ele foi chamado
        System.out.println("##############################");
    }
    //# Método push recebe o valor que eu quero inserir
    public void push(int value) {
        // esse valor vai ser no novo nó
        Node newNode = new Node(value);
        // se a pilha tiver vazia, se altura for zero
        if (height == 0) {
            // significa que meu topo vai ser esse novo nó
            top = newNode;
        // caso contrario
        } else {
            // digo que o proximo elemento desse novo nó é o topo
            newNode.next = top;
            // e o topo vai virar, apontar para esse novo nó
            top = newNode;
        }
        // não esquecer de incrementar a altura
        height++;
    }
    //# Método de remoção - retorna um nó e vai se chamar pop
    public Node pop() {
        // se minha pilha estiver vazia ele não vai retornar nada
        if (height == 0) return null;
        // Caso contrario, vou criar o leitor temp, que vai ser meu top
        Node temp = top;
        // meu top vai apontar para a proxima posição
        top = top.next;
        // e vou desplugar o meu temp, com next vazio
        temp.next = null;
        // não esquecer de decrementar a altura da pilha
        height--;

        // vou retornar o valor que foi desplugado, removido
        return temp;



    }

    // Criando método main aqui mesmo para testar
    public static void main(String[] args) {
        // Criando a pilha com um elemento inicial
        Stack myStack = new Stack(2);

        // Chamando os métodos para exibir o topo e a altura da pilha
//        myStack.getTop();
//        myStack.getHeight();

        // Imprimindo a pilha
//        myStack.print();

        // Depois de imprimir vou inserir o elemento com valor 1
        myStack.push(1);
        // Imprimindo a pilha
//        myStack.print();
        // Chamando os métodos para exibir o topo e a altura da pilha
//        myStack.getTop();
//        myStack.getHeight();
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop() == null);




    }
}
