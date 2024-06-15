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
# Listas Ligadas

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
# Pilha
conceito

  Pilha é uma estrutura de dados ordenada onde o último elemento inserido 
  será o primeiro a ser retirado (LIFO - last in first out / FILO - first in last out).
  
  A extremidade por onde é feita a inserção e remoção de elementos é denominada top.
|[3]|  
|[2]|
|[1]|
|[0]|
