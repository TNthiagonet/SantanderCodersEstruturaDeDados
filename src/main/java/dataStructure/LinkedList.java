package dataStructure;
// java 17
public class LinkedList {
    //# Lista ligada - 3 campos principais (cabeça, calda e tamanho)
    private Node head; //cabeça
    private Node tail; //calda
    private int length; //tamanho_da_lista

    //# Nó
    class Node {
        //informação que quero armazenar
        String data;
        //tod0 nó aponta para um proximo nó (next)
        Node next;

        Node(String data) {
            this.data = data;
        }
    }
    //# Construtor #
    public  LinkedList(String data) {
        // tamanho
        length = 1;
        // tanto a cabeça quanto a calda será um nó que irá passar a informação para o construtor
        Node newNode = new Node(data);
        // cabeça e a calda apontam para o unico nó da lista
        head = newNode;
        tail = newNode;
    }
    //# Método cabeça
    public void getHead() {
        // Se a cabeça estiver vazia
        if (this.head == null) {
            System.out.println("Lista vazia");
            // caso contrario vou imprimir o valor armazenado nesses nós
        } else {
            System.out.println("Head: " + head.data);
        }
    }
    //# Método calda
    public void getTail() {
        // Se a calda estiver vazia
        if (this.tail == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Tail: " + tail.data);
        }
    }

    //# Método tamanho
    public void getLength() {
        // retorna o tamanho da lista
        System.out.println("Length: " + this.length);
    }
    // Método de tornar esta lista vazia
    public void makeEmpty() {
        // É só pegar os 2 nós e apontar pra null
        head = null;
        tail = null;
        // Não esquecer de indicar que o tamanho da lista agora é: 0
        length = 0;
    }
    //# Método print
    public void print() {
        // adicionando caracteres informando que ele foi chamado
        System.out.println("##############################");
        // Criando nó de leitura (temporário) que vai inicializar pela cabeça da lista
        Node temp = this.head;
        // enquanto esse nó temporário for diferente de vazio ou de nulo
        while (temp != null) {
            // vou imprimir aquele elemento
            System.out.println(temp.data);
            // e como eu navego?, basta navegar item a item sempre para o próximo nó
            temp = temp.next;
        }
        // adicionando caracteres informando que ele foi chamado
        System.out.println("##############################");

    }
    //# Método append (sem retorno)
    public void append(String data) {
        // essa informação vai ser armazenada em um nó
        Node newNode = new Node(data);
        // se a lista estiver vazia (se o tamanho for igual a 0)
        if (length == 0 ) {
            // tanto a cabeça quanto a calda vão apontar pra esse novo nó
            head = newNode;
            tail = newNode;
        // se não - eu faço a operação e cima da calda
        } else {
            // o proximo elemento da calda vai ser um novo elemento
            tail.next = newNode;
            // não esqueça que agora o ultimo elemento vai ser igual ao novo nó
            tail = newNode;
        }
        // e incremento o tamanho da lista
        length++;
    }
    //# Método remover do final da lista
    public Node removeLast() {
        // se a lista estiver vazia, retorne nulo
        if (length == 0) return null;
        // identificando o penultimo elemento da lista
        Node pre = head;
        // nó temporário
        Node temp = null;
        // enquanto meu leitor chamado pre for diferente do final da lista (ultimo elemento)
        while (pre.next != tail) {
            // vou ter que navegar na lista
            pre = pre.next;
            // quando ele sair do while significa que ele encontrou o penultimo elemento
        }
        // antes de movimentar a calda, o que vai ser removido vai ser o que esta armazenado na calda
        temp = tail;
        // quando ele encontra o penultimo elemento
        tail = pre;
        // antes de apagar ele vai armazenar
        // o ultimo vai ser igual ao penultimo e o proximo do ultimo vai ser vazio
        tail.next = null;
        // diminuindo o tamanho da lista, já que fiz a remoção
        length--;
        // e se esse tamanho for agora zerado
        if (length == 0) {
            // ou seja, a lista s[o tinha um elemento
            head = null;
            // a cabeça da lista e a sua calda são nulas
            tail = null;
        }
        // e vou retornar temp
        return temp;
    }
    //# Método prepend (Adiciona no início da lista)
    public void prepend(String data) {
        // criamos um nó com esse novo valor
        Node newNode = new Node(data);
        // se o tamanho da lista for igual a zero
        if (length == 0) {
            // ta to o primeiro quanto o ultimo elemento ser[a representado pelo novo nó
            head = newNode;
            tail = newNode;
        // se não
        } else {
            // O next vai ser o inicio da lista atual
            newNode.next = head;
            // e o inicio da lista vai ser o novo nó
            head = newNode;
        }
        // não esquecer de incrementar o tamanho atual
        length++;
    }
    //# Método remover First - remove o primeiro item da lista
    public Node removeFirst() {
        // se a lista for vazia retorne null
        if (length == 0) return null;
        // criando nó leitor temporário que vai ser o primeiro elemento
        Node temp = head;
        // depois o segundo elemento vai se tormar o primeiro
        head = head.next;
        // desplugo o ex primeiro elemento
        temp.next = null;
        // e diminuo o tamanho da quantidade de elementos da lista
        length--;

        // se o length for zero após a remoção
        if (length == 0) {
            // por segurança, tanto a cabeça quanto a calda tem que ser null
            head = null;
            tail = null;
        }
        // aqui eu retorno o temp
        return temp;
    }
    //# Método get (qualquer posição)
    public Node get(int index) {
        // se o índice for menor que zero ou maior igual ao tamanho da lista retorne nulo
        if (index < 0 || index >= length) return null;
        // Criando nó temporário
        Node temp = head;
        // começando da posição 0 até a posição index
        for(int i = 0; i<index; i++) {
            temp = temp.next;
        }
        // e vou retornar a variável
        return temp;
    }
    //# Método "bonus" set
    public boolean set(int index, String data) {
        // criar nó temporário
        Node temp = get(index);
        // se esse nó existir
        if (temp != null) {
            // o novo valor vai ser igual ao valor que recebi como parâmetro
            temp.data = data;
            // e retornar verdade
            return true;
        }
        // se não conseguir vou retornar
        return false;
    }

    //# Método insert, booleano, com indice e valor
    public boolean insert(int index, String data) {
        // se o indice tiver inváido
        if (index < 0 || index >= length) return false;
        // se inserir na posição inicial
        if (index == 0) {
            // basta chamar o método prepend
            prepend(data);
            // retorne verdadeiro
            return true;
        }
        // se o indice for igual ao tamanho da lista
        if (index == length) {
            // ele quer inserir no final da lista
            append(data);
            return true;
        }

        // Caso contrario vou criar um nó
        Node newNode = new Node(data);
        // vou pegar a posição naquele indice
        Node temp = get(index - 1);
        // novo nó vai apontar para quem o elemento anterior está apontando
        newNode.next = temp.next;
        // e o elemento anterior vai começar a apontar para o novo nó
        temp.next = newNode;
        // e vamos aumentar o length
        length++;
        // e retorno verdade
        return true;
    }
    //# Método  remover de uma posição específica
    public  Node remove(int index) {
        // se o infice for menor do que zero ou indice maior igual a lista, retorne nullo
        if (index < 0 || index >= length) return null;
        // se o indice for a primeira posição vou retornar o removeFirst
        if (index == 0) return removeFirst();
        // se o indice for a ultima posição vou retornar o removeLast
        if (index == length -1) return removeLast();

        // caso contrario, vou ter o elemento anterior
        Node prev = get(index - 1);
        // vou criar um nó temporário que vai ser o próximo do anterior
        Node temp = prev.next;
        // e vamos fazer a manipulação dos apontadores

        // o proximo do anterior vai ser o proximo de quem eu quero remover
        prev.next = temp.next;
        // então se eu quero remover o 3 o proximo do 2 tem que ser o 4
        temp.next = null;
        // o tamanho da lista vai diminuir
        length--;

        // retorna temporario que esta armazenando o 3
        return temp;
    }


    // # Criando Método Main aqui mesmo para testar
    public static void main(String[] args) {
        // Criando propria lista aqui
        LinkedList list = new LinkedList("elemento 1");
        list.append("elemento 2");
        list.append("elemento 3");
        list.prepend("elemento 0");

        list.remove(2);
        list.print();

//        list.insert(3, "elemento 2.5");

        // imprimir o elemento de indice 2
//        System.out.println(list.get(2).data);

//        System.out.println(list.removeFirst().data);
//        System.out.println(list.removeLast().data);
//       list.print();

//       list.set(1, "elemento 0.5");
//        list.print();

        // chamar os métodos
        list.getHead();
        list.getTail();
        list.getLength();
        list.print();
    }

}
