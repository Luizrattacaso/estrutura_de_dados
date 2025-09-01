
import java.util.LinkedList;

public class Lista_encadeada {
    public static void main(String[] args) {
        /* Listas encadeadas são estruturas de dados que consistem em uma sequência de elementos, 
        onde cada elemento (nó) contém um valor e uma referência (ou ponteiro) para o próximo nó na
        sequência. Diferente dos arrays, as listas encadeadas não exigem um tamanho fixo e permitem
        inserções e remoções dinâmicas de elementos.

        Pense em uma lista encadeada como uma cadeia de nós, 
        onde cada nó aponta para o próximo nó na sequência.

        A estrutura básica de um nó em uma lista encadeada pode ser representada assim:

        NULL ---> VALOR_1 | PONTEIRO ---> VALOR_2 | PONTEIRO ---> VALOR_3 | PONTEIRO ---> NULL

        caso você queira adicionar um novo valor, você cria um novo nó e ajusta os ponteiros
        para que o novo nó seja inserido na posição correta.


        NULL ---> VALOR_1 | PONTEIRO     VALOR_2 | PONTEIRO     VALOR_3 | PONTEIRO ---> NULL
                                |         (valor excluido)         ^
                                |                                  |
                                -------> NOVO_VALOR | PONTEIRO ----
                                          (valor adicionado)
        
        Tipos de listas encadeadas:
        - Lista simplesmente encadeada: Cada nó aponta para o próximo nó na sequência.
        - Lista duplamente encadeada: Cada nó aponta tanto para o próximo nó quanto para o nó anterior.
        - Lista circular: O último nó aponta de volta para o primeiro nó, formando um ciclo.

        Custos e benefícios:

        - Vantagens: Inserções e remoções são eficientes, especialmente no início da lista. O(1)
        - Desvantagens: Acesso a elementos é menos eficiente, pois requer ler toda a lista a partir do início. O(n)

        Funções comuns em listas encadeadas:

        - add(indice, "obj" ) = Inserção: Adicionar um novo nó em uma posição específica.
        - remove(indice, ou "obj")= Remoção: Remover um nó de uma posição específica.
        - indexOf(""): Encontrar um nó com um valor específico.
        - peekFirst() e peekLast(): Retornar o primeiro ou o último nó sem removê-lo.
        - addFirst() e addLast(): Adicionar um nó no início ou no final da lista.
        - removeFirst() e removeLast(): Remover o primeiro ou o último nó.
        */

        LinkedList<String> lista = new LinkedList<>();
        LinkedList<String> lista2 = new LinkedList<String>();

        //utilizando o push e pop a linked list funciona como uma pilha
        lista.push("A");
        lista.push("B");
        lista.push("C");
        lista.push("D");
        lista.push("E");
        lista.pop();

        System.out.printf("%s ---> linked list = pilha", lista);

        //utilizando add e remove a linked list funciona como uma fila
        lista2.offer("A");
        lista2.offer("B");
        lista2.offer("C");
        lista2.offer("D");
        lista2.offer("E");

        lista2.poll();

        System.out.println(lista2.indexOf("C"));

        System.out.printf("%n%s ---> linked list = fila", lista2);
        
        lista2.clear();
        //exemplo de uso
        System.out.println("%nfila de prioridade%n");

        for (int i = 5; i>=0 ; i--){
            if (i%2==0){
                lista2.addFirst("idoso " + i);
            } else {
                lista2.offer("pessoa " + i);
        }

        System.out.printf("%nfila de prioridade: %s", lista2);
        }
    }
}
