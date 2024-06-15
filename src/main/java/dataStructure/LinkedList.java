package dataStructure;
// java 17
public class LinkedList {
    // Lista ligada - 3 campos principais (cabeça, cauda e tamanho)
    private Node head; // cabeça da lista
    private Node tail; // cauda da lista
    private int length; // tamanho da lista

    // Classe interna que representa um nó
    class Node {
        // Informação que quero armazenar
        String data;
        // Próximo nó na lista
        Node next;

        // Construtor do nó que recebe o dado a ser armazenado
        Node(String data) {
            this.data = data;
        }
    }

    // Construtor da LinkedList que recebe o dado inicial
    public LinkedList(String data) {
        // Inicializa o tamanho da lista
        length = 1;
        // Cria um novo nó com o dado fornecido
        Node newNode = new Node(data);
        // Inicializa cabeça e cauda para apontar para o único nó da lista
        head = newNode;
        tail = newNode;
    }

    // Método para obter a cabeça da lista
    public void getHead() {
        // Se a lista estiver vazia
        if (this.head == null) {
            System.out.println("Lista vazia");
        } else {
            // Caso contrário, imprime o valor armazenado na cabeça
            System.out.println("Head: " + head.data);
        }
    }

    // Método para obter a cauda da lista
    public void getTail() {
        // Se a lista estiver vazia
        if (this.tail == null) {
            System.out.println("Lista vazia");
        } else {
            // Caso contrário, imprime o valor armazenado na cauda
            System.out.println("Tail: " + tail.data);
        }
    }

    // Método para obter o tamanho da lista
    public void getLength() {
        // Imprime o tamanho da lista
        System.out.println("Length: " + this.length);
    }

    // Método para esvaziar a lista
    public void makeEmpty() {
        // Define cabeça e cauda como nulas
        head = null;
        tail = null;
        // Redefine o tamanho da lista para 0
        length = 0;
    }

    // Método para imprimir todos os elementos da lista
    public void print() {
        // Adicionando caracteres informando que o método foi chamado
        System.out.println("##############################");
        // Criando nó temporário que começa na cabeça da lista
        Node temp = this.head;
        // Enquanto o nó temporário não for nulo
        while (temp != null) {
            // Imprime o dado do nó atual
            System.out.println(temp.data);
            // Avança para o próximo nó
            temp = temp.next;
        }
        // Adicionando caracteres informando que o método foi chamado
        System.out.println("##############################");
    }

    // Método para adicionar um elemento ao final da lista
    public void append(String data) {
        // Cria um novo nó com o dado fornecido
        Node newNode = new Node(data);
        // Se a lista estiver vazia
        if (length == 0) {
            // Inicializa cabeça e cauda para apontar para o novo nó
            head = newNode;
            tail = newNode;
        } else {
            // Caso contrário, adiciona o novo nó ao final da lista
            tail.next = newNode;
            // Atualiza a cauda para o novo nó
            tail = newNode;
        }
        // Incrementa o tamanho da lista
        length++;
    }

    // Método para remover o último elemento da lista
    public Node removeLast() {
        // Se a lista estiver vazia, retorna nulo
        if (length == 0) return null;

        // Cria um nó temporário para percorrer a lista
        Node pre = head;
        // Cria um nó temporário para armazenar o último nó
        Node temp = null;

        // Enquanto o próximo nó não for a cauda
        while (pre.next != tail) {
            // Avança para o próximo nó
            pre = pre.next;
        }
        // Armazena o nó atual da cauda
        temp = tail;
        // Atualiza a cauda para o penúltimo nó
        tail = pre;
        // Remove a referência para o último nó
        tail.next = null;
        // Decrementa o tamanho da lista
        length--;

        // Se a lista estiver vazia após a remoção
        if (length == 0) {
            // Define cabeça e cauda como nulas
            head = null;
            tail = null;
        }
        // Retorna o nó removido
        return temp;
    }

    // Método para adicionar um elemento ao início da lista
    public void prepend(String data) {
        // Cria um novo nó com o dado fornecido
        Node newNode = new Node(data);
        // Se a lista estiver vazia
        if (length == 0) {
            // Inicializa cabeça e cauda para apontar para o novo nó
            head = newNode;
            tail = newNode;
        } else {
            // Caso contrário, insere o novo nó no início da lista
            newNode.next = head;
            head = newNode;
        }
        // Incrementa o tamanho da lista
        length++;
    }

    // Método para remover o primeiro elemento da lista
    public Node removeFirst() {
        // Se a lista estiver vazia, retorna nulo
        if (length == 0) return null;
        // Armazena o nó atual da cabeça
        Node temp = head;
        // Atualiza a cabeça para o próximo nó
        head = head.next;
        // Remove a referência do nó removido
        temp.next = null;
        // Decrementa o tamanho da lista
        length--;

        // Se a lista estiver vazia após a remoção
        if (length == 0) {
            // Define cabeça e cauda como nulas
            head = null;
            tail = null;
        }
        // Retorna o nó removido
        return temp;
    }

    // Método para obter o nó em uma posição específica
    public Node get(int index) {
        // Se o índice for inválido, retorna nulo
        if (index < 0 || index >= length) return null;
        // Cria um nó temporário para percorrer a lista
        Node temp = head;
        // Avança até a posição desejada
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        // Retorna o nó na posição desejada
        return temp;
    }

    // Método para atualizar o valor de um nó em uma posição específica
    public boolean set(int index, String data) {
        // Obtém o nó na posição desejada
        Node temp = get(index);
        // Se o nó existir
        if (temp != null) {
            // Atualiza o dado do nó
            temp.data = data;
            // Retorna verdadeiro indicando sucesso
            return true;
        }
        // Se o nó não existir, retorna falso
        return false;
    }

    // Método para inserir um nó em uma posição específica
    public boolean insert(int index, String data) {
        // Se o índice for inválido, retorna falso
        if (index < 0 || index > length) return false;
        // Se for inserido na posição inicial
        if (index == 0) {
            // Chama o método prepend
            prepend(data);
            return true;
        }
        // Se for inserido na posição final
        if (index == length) {
            // Chama o método append
            append(data);
            return true;
        }

        // Cria um novo nó com o dado fornecido
        Node newNode = new Node(data);
        // Obtém o nó na posição anterior à desejada
        Node temp = get(index - 1);
        // Faz o novo nó apontar para o próximo nó do anterior
        newNode.next = temp.next;
        // Faz o nó anterior apontar para o novo nó
        temp.next = newNode;
        // Incrementa o tamanho da lista
        length++;
        // Retorna verdadeiro indicando sucesso
        return true;
    }

    // Método para remover um nó de uma posição específica
    public Node remove(int index) {
        // Se o índice for inválido, retorna nulo
        if (index < 0 || index >= length) return null;
        // Se for removido da posição inicial, chama o método removeFirst
        if (index == 0) return removeFirst();
        // Se for removido da posição final, chama o método removeLast
        if (index == length - 1) return removeLast();

        // Obtém o nó na posição anterior à desejada
        Node prev = get(index - 1);
        // Armazena o nó a ser removido
        Node temp = prev.next;
        // Faz o nó anterior apontar para o próximo do nó removido
        prev.next = temp.next;
        // Remove a referência do nó removido
        temp.next = null;
        // Decrementa o tamanho da lista
        length--;
        // Retorna o nó removido
        return temp;
    }

    // Método main para testar a lista ligada
    public static void main(String[] args) {
        // Criando a lista com um elemento inicial
        LinkedList list = new LinkedList("elemento 1");
        // Adicionando elementos ao final da lista
        list.append("elemento 2");
        list.append("elemento 3");
        // Adicionando elemento ao início da lista
        list.prepend("elemento 0");

        // Removendo elemento da posição 2
        list.remove(2);
        // Imprimindo a lista
        list.print();

        // Inserindo elemento na posição 3 (descomentado para teste)
        // list.insert(3, "elemento 2.5");

        // Imprimindo o elemento de índice 2 (descomentado para teste)
        // System.out.println(list.get(2).data);

        // Removendo e imprimindo o primeiro elemento (descomentado para teste)
        // System.out.println(list.removeFirst().data);

        // Removendo e imprimindo o último elemento (descomentado para teste)
        // System.out.println(list.removeLast().data);

        // Imprimindo a lista
        // list.print();

        // Atualizando o elemento na posição 1 (descomentado para teste)
        // list.set(1, "elemento 0.5");
        // Imprimindo a lista
        // list.print();

        // Chamando métodos para obter informações da lista
        list.getHead();
        list.getTail();
        list.getLength();
        // Imprimindo a lista
        list.print();
    }
}
