package main;

import implementation.Supermarket;
import implementation.SupermarketArray;

import java.util.Scanner;

public class MainSupermarket {
    // Define o tamanho da lista do supermercado
    private final static int SIZE = 3;

    public static void main(String[] args) {
        // Cria um objeto Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);
        // Cria uma instância de SupermarketArray com tamanho definido
        Supermarket supermarket = new SupermarketArray(SIZE);
        int opcao;
        do {
            System.out.println("\nLista de Compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção");
            // Lê a opção escolhida pelo usuário
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    // Lê o item a ser inserido na lista
                    String item = scanner.next();
                    // Adiciona o item ao supermercado
                    supermarket.add(item); // Apenas palavras simples são aceitas
                    break;
                case 2:
                    // Lista os itens atualmente no supermercado
                    supermarket.print();
                    break;
                case 3:
                    System.out.println("Digite a posição do item a ser removido: ");
                    // Lê a posição do item a ser removido
                    int index = scanner.nextInt();
                    // Remove o item na posição especificada do supermercado
                    supermarket.delete(index);
                    break;
                case 4:
                    System.out.println("Saindo do programa... ");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 4);

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}
