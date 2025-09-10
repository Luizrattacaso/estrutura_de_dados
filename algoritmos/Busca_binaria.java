package algoritmos;

public class Busca_binaria {
    public static void main(String[] args) {
        /* A busca binária é um algoritmo eficiente para encontrar um elemento em uma lista ordenada. 
        Ela funciona dividindo repetidamente o intervalo de busca pela metade, 
        comparando o valor do elemento do meio com o valor que está sendo procurado.

        Requisitos:
        - A lista deve estar ordenada previamente.
        
        Passos do algoritmo:
        1. Defina os índices inicial (low) e final (high) da lista.
        2. Enquanto o índice inicial for menor ou igual ao índice final:
           a. Calcule o índice do meio (mid) como a média dos índices inicial e final.
           b. Compare o valor no índice do meio com o valor alvo (target):
              - Se forem iguais, o elemento foi encontrado; retorne o índice do meio.
              - Se o valor no meio for menor que o alvo, ajuste o índice inicial para mid + 1.
              - Se o valor no meio for maior que o alvo, ajuste o índice final para mid - 1.
        3. Se o elemento não for encontrado, retorne -1.

        Complexidade:
        - Tempo: O(log n), onde n é o número de elementos na lista.
        - Espaço: O(1) para a versão iterativa, O(log n) para a versão recursiva devido à pilha de chamadas.

        Exemplo de implementação em Java:
        */

        int array[] = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        int target = 2;

        int index = binarySearch(array, target);

        if (index == -1){
            System.out.printf("Elemento %d não encontrado", target);
        } else {
            System.out.println("Elemento " + target + " encontrado no índice: " + index);
        }

    }
    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int hight = array.length - 1;

        while (low <= hight){
            int middle = low + (hight - low) / 2;
            int value = array[middle];

            System.out.println("middle: "+ value);

            if (value == target) {
                return value;
            } else if (value < target){
                low = middle + 1;
            } else{
                hight = middle - 1;
            }
        }
        return -1; // elemento não encontrado
    }
}
