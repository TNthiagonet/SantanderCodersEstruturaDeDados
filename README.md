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
.
.
.
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

- ÁRVORES BINÁRIAS

................. Árvore Cheia .............
............................................
........................[A].................
......................./...\................
.....................[B]...[D]..............
.................../....\...................
.................[E]...[F]..................
............................................
............... Árvore não Cheia............
............................................
........................[A].................
......................./...\................
.....................[B]...[D]..............
.................../....\...................
.................[E]...[F]..................
......................../...................
......................[G]...................
............................................
.............. Árvore Perfeita..............
............................................
......................[A]...................
..................../.....\.................
................[B]........[D]..............
............../....\....../....\............
............[E]...[F]...[G]....[H]..........
............................................

# Operação: Travessia

- Pré Ordem
(R-E-D) Raíz - Esquerda - Direita
- Em Ordem  
(E-R-D) Esquerda - Raíz - Direita
- Pós Ordem
(E-D-R) Esquerda - Direita - Raíz

Exemplo: 
.............. Árvore Perfeita...............
.............................................
.....................[37]....................
..................../.....\..................
................[11]........[66].............
............../....\......./....\...........
...........[08]...[17]...[42]....[72]........
.............................................
- Pré Ordem
37, 11, 08, 17, 66, 42, 72
- Em Ordem  (obs. quando não houver elemento a esquerda ele volta para sua raíz)
08, 11, 17, 37, 42, 66, 72
- Pós Ordem
08, 17, 11, 42, 72, 66, 37

  
- Busca em Largura (BFS)
37, 11, 66, 08, 17, 42, 72

- Enquanto a fila possuir elemento:
  * processa item
  * se esquerda não vazia
    inserir item
  * se direita não vazia
    inserir item

-------------------------------------------------------------------------------------------

# Arvore Binária de Busca
conceito

  A Árvore de Busca Binária é uma estrutura de dados de árvore binária, onde todos os nós
da subárvore esquerda possuem valor numérico inferior ao nó raiz e todos os nós da subárvore
direita possuem um valor superior ao nó raíz.
  .............................................
  .....................[37]....................
  ..................../.....\..................
  ................[11]........[66].............
  ............../....\......./....\............
  ...........[08]...[17]...[42]....[72]........
  .............................................
- Operações de Árvore Binária de Busca
  * Principais operações:
  1- Inserir item (insert)
  2- Contém item? (contains)
  3- Remover item (delete)
  
Caso especial: árvore vazia.
Caso especial: elemento existente.


-------------------------------------------------------------------------------------------
# Resolvendo Problemas

- Roteiro

  # 1- Problema: Balanceamento de colchetes em uma expressão
Dada uma string de expressão exp, escreva um programa para examinar se os pares e as ordens
de "{", "}", "(", ")", "[", "]" estão corretos na espressão dada.
          
          inválida                  válida
      2*(3+4+5*[2+3)]           2*(3+4+5*[2+3])
  
               não tão fácil de analizar     
    [2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]

* Solução:Uso de pilhas
  1- Empilhar caracteres de abertura
  2- Ao identificar caracter de fechamento:
     desempilhar e verificar se coincide com a abertura;
  3- Ao final a pilha deve estar vazia.

---------------------------------------------------------------------------------------------
  # 2- Problema: Revertendo os primeiros k elementos de uma fila
Dado um inteiro k e uma fila de inteiros, a tarefa é inverter a ordem dos primeiros k elementos 
da fila, deixando os demais elementos na mesma relativa.

*Exemplos

(1, 2, 3, 4, 5) -> K = 2 (2, 1, 3, 4, 5)
(1, 2, 3, 4, 5) -> K = 4 (4, 3, 2, 1, 5)
    
- Algorítimo:
  
  1- Para os K primeiros elementos:
      desenfileirar elemento x
      reordena (K-1) elementos
      enfileirar elemento x
  2- Para os N-K elementos:
      desenfileirar
      enfileirar



---------------------------------------------------------------------------------------------
  # 3- Problema: Maior valor em cada nível da Árvore Binária
Dada uma árvore binária, encontre o maior valor em cada nível.

..................................................
.....................[37]....................[37].
..................../.....\.......................
................[11]........[66].............[66].
............../....\......./....\.................
...........[08]...[17]...[42]....[72]........[72].
..................................................

- Algorítimo:

  1- Utilize o algorítimo para percorrer a árvore e uma lista auxiliar.
  2- Para cada elemento e seu nível na árvore:
      se a lista possuir o índice = nível, substitua pelo maior valor
      senão adicione na lista

  .............................................
  .....................[37]....................
  ..................../.....\..................
  ................[11]........[66].............
  ............../....\.........................
  ...........[08]...[17].......................
  .............................................

- Lista = [37, 66, 17]

---------------------------------------------------------------------------------------------

# FINALIZANDO ESTRUTURA DE DADOS. 













