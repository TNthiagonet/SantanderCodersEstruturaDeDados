package implementation;

// Implementação da interface Supermarket utilizando um array para armazenar os itens
public class SupermarketArray implements Supermarket {

    // Array para armazenar os itens do supermercado
    private final String[] items;

    // Índice do último item adicionado no array
    private int lastIndex;

    // Construtor que inicializa o array com o tamanho especificado
    public SupermarketArray(final int size) {
        items = new String[size];
        lastIndex = -1; // Inicializa o índice do último item como -1 (indicando que está vazio)
    }

    // Método para adicionar um item ao supermercado
    @Override
    public void add(String item) {
        if (lastIndex == items.length - 1) {
            System.err.println("Lista de supermercado cheia"); // Exibe mensagem se o array estiver cheio
        } else {
            lastIndex++; // Incrementa o índice do último item
            items[lastIndex] = item; // Adiciona o item ao array na posição adequada
        }
    }

    // Método para imprimir a lista de itens do supermercado
    @Override
    public void print() {
        System.out.println("#############################");
        if (lastIndex < 0) {
            System.out.println("Lista de supermercado vazia"); // Exibe mensagem se o array estiver vazio
        }
        for (int i = 0; i <= lastIndex; i++) {
            System.out.println(i + " - " + items[i]); // Imprime cada item do array com seu índice
        }
        System.out.println("#############################");
    }

    // Método para remover um item do supermercado com base no índice especificado
    @Override
    public void delete(int index) {
        if (index >= 0 && index <= lastIndex) {
            shift(index); // Realiza o deslocamento dos itens no array
            lastIndex--; // Decrementa o índice do último item
        } else {
            System.out.println("Índice inválido: " + index); // Exibe mensagem se o índice for inválido
        }
    }

    // Método privado para realizar o deslocamento dos itens no array ao remover um item
    private void shift(final int index) {
        for (int i = index; i < lastIndex; i++) {
            items[i] = items[i + 1]; // Move cada item uma posição para trás no array
        }
    }
}
