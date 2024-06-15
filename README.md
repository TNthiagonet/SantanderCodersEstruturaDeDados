# Santander Coders Estrutura de Dados
- Instrutor: João Carlos Sousa do Vale
- Aluno: EuzinhoMesmisViss (ThiagoNET)

-------------------------------------------------------------------------------------------
# Introdução à estruturas de dados
  Como desenvolvedores de software, à nossa principal preocupação é a resolução de problemas computacionais. E para resolver esses problemas computacionais, a ferramenta que a gente utiliza é a construção de algoritmos.

- Os algoritmos são compostos por: Instruções + Dados, responsáveis por armazenar as informações necessárias para o processamento da nossa solução.

- Tipos de Dados - Java
             Primitivos                          Não Primitivos

              INTEIROS                               CLASSES
           ----------------                      ---------------         
           byte (8 bits)                        STRING     ARRAY/VETOR         
           short (16 bits)
           int (32 bits)                        MÉTODOS    ATRIBUTOS
           ong (64 bits)

           PONTO FLUTUANTE
           ----------------
           float (32 bits)
           double (64 bits)
  
           CARACTER
           ----------------
           char, 16 bits, sem sinal
  
           BOOLEANO
           ----------------
           boolean, true / false
-------------------------------------------------------------------------------------------
# LISTAS LIGADAS
[0] - [1] - [2] - [3] -...

- 1 Adicionar item
  a) No início (prepend)
  b) No fim (append)
  c) Em uma determinada posição (insert)

- 2 ALer item
  a) No início (getHead)
  b) No fim (getTail)
  c) Em uma determinada posição (get)

- 3 Remover item
  a) No início (removeFirst)
  b) No fim (removeLast)
  c) Em uma determinada posição (delete)

- 4 Imprimir

- Operações "opcionais":
1 - Tamanho atual (getLenght)
2 - Está vazia? (isEmpty)
3 - Esvaziar lista (makeEmpty)
                              
# Vantagens
1 - Estrutura dinâmica;
2 - Utilização da memória;
3 - Utilizado na construção de outras estruturas
# Desvantagem
1 - Acesso sequêncial;
2 - Complexidade de implementação

-------------------------------------------------------------------------------------------
# PILHA
conceito

  Pilha é uma estrutura de dados ordenada onde o último elemento inserido 
  será o primeiro a ser retirado (LIFO - last in first out / FILO - first in last out).
  
  A extremidade por onde é feita a inserção e remoção de elementos é denominada top.
|[3]|  
|[2]|
|[1]|
|[0]|

# Principais operações
1 - Adicionar item (push)
2 - Remover item (pop)
3 - Ler topo (getTop)
4 - Imprimir (print)

# Operação opcional
1 - Altura da pilha (getHeight)

# Detalhes finais
1 - Estrutura dinâmica;
2 - Eficiente na resolução de problemas LIFO;
3 - Simplicidade de implementação;
-------------------------------------------------------------------------------------------

# FILAS
conceito

  Fila é uma estrutura de dados ordenada onde o primeiro elemento inserido será o 
primeiro a ser retirado
  (FIFO - first in first ou / LILO - last in last out).
  
  A Fila possui duas extremidades: uma por onde é feita a inserção de elementos (fim da fila)
e a outra por onde é feita a remoção de elementos (início da fila).

# Funciona igual a fila de um banco
será atendido, inserido, removido: quem chegou primeiro

- Diversos problemas podem ser solucionados através de uma fila
  * Escalonamento de tarefas por ordem de chegada;
  * Tempo de espera de clientes em call center;
  * Definição do número de caixas de supermercado;

- Principais operações de uma FILA
  * 1- Adicionar item (queue)
  * 2- Remover item (dequeue)
  * 3- Imprimir (print)
- Operação opcional:
  * 1- Primeiro da fila (getFirst)
  * 2- Último da fila (getLast)
  * 3- Tamanho da fila (getLenght)

# Exercício feito (FilaDeAtendimento[simulador])
Imagine que você está desenvolvendo um sistema de atendimento ao cliente para uma loja.
Crie um programa Java que simule a fila de atendimento, onde os clientes entram na fila e são atendidos um por um.

# Exercício para praticar depois

 * Agora, implemente uma fila que utiliza um array / vetor como estrutura de armazenamento!!!
-------------------------------------------------------------------------------------------

# Arvores
conceito

Funciona igual á uma árvore genealógica

- Árvore Genérica (Família Tradicional)
  
Ex. onde:   A    é pai de: B, C e D

também pode ser avô de: E, F, G e H







