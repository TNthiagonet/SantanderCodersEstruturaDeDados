package implementation;

// Interface que representa um supermercado
public interface Supermarket {

    // Adiciona um item ao supermercado
    void add(final String item);

    // Imprime a lista de itens do supermercado
    void print();

    // Remove um item do supermercado com base no índice especificado
    void delete(final int index);
}
