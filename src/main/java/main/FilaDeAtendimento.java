package main;  // Define o pacote principal

import dataStructure.Queue;  // Importa a classe Queue do pacote dataStructure

import java.util.Random;  // Importa a classe Random para gerar números aleatórios

public class FilaDeAtendimento {
    public static void main(String[] args) {
        int n = 5;  // Número de clientes a serem atendidos
        var random = new Random();  // Cria uma instância da classe Random
        int cliente = random.nextInt(101);  // Gera um número aleatório entre 0 e 100 para o primeiro cliente
        Queue queue = new Queue(cliente);  // Cria uma nova fila e adiciona o primeiro cliente
        System.out.println("Chegou o cliente: " + cliente);  // Imprime o cliente que chegou

        // Simula a chegada dos próximos clientes
        for(int i = 2; i <= n; i++) {
            cliente = random.nextInt(101);  // Gera um número aleatório entre 0 e 100 para o próximo cliente
            System.out.println("Chegou o cliente: " + cliente);  // Imprime o cliente que chegou
            queue.enqueue(cliente);  // Adiciona o cliente à fila
        }

        // Atendimento dos clientes
        var node = queue.dequeue();  // Remove o primeiro cliente da fila
        while (node != null) {
            System.out.println("Atendido o cliente: " + node.getValue());  // Imprime o cliente atendido
            node = queue.dequeue();  // Remove o próximo cliente da fila
        }
    }
}
