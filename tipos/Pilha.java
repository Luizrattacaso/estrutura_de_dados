import java.util.Scanner;
import java.util.Stack; //Stack == Pilha

public class Pilha {
    public static void main(String[] args) {

        /* Seguem uma estrutura LIFO(Last in First out).

        Por exemplo, pode ser utilizadA em histórico de navegação
        onde o ultimo site será o topo da nossa pilha

        Funções

        - stack.empty() ---> checa se a pilha esta vazia
        - stack.push(name) ---> A função push adiciona itens na nossa função
        - stack.peek() ---> A função peek retorna o topo da pilha
        - stack.pop() ---> Remove o topo da lista. Se utilizado com o print você imprime e deleta ao mesmo tempo
        - stack.size() ---> length da pilha
        - stack.search(name) ---> Retorna a posição do item na pilha. Se o item não existir retorna -1
        - stack.contains(name) ---> Retorna true ou false se o item existir na pilha

        */

        //exemplo de uso
        Scanner scanner = new Scanner(System.in);

        Stack<String> stack = new Stack<String>(); //cria um objeto do tipo Stack que suporta Strings
        Stack<String> stack2 = new Stack<String>();

        for (int i = 0; i<=5 ; i++){
            System.out.print("Enter a web site: ");
            String name = scanner.nextLine();
            stack.push(name);
        }

        String response = "a";

        while (!response.equalsIgnoreCase("q")) {
            System.out.printf("check your history. Select%n- r to return page%n- n to next page%n- q to quit the history%nResponse: ");
            response = scanner.nextLine();

            if (response.equalsIgnoreCase("r")){
                if (stack.isEmpty()){
                    System.out.println("this is the latest page");
                }
                stack2.push(stack.pop());
                System.out.printf("Actual page: %s", stack.peek());
                System.out.println("%n");
            } else if (response.equalsIgnoreCase("n")){
                if (stack.isEmpty()){
                    System.out.println("this is the most fresh page");
                }
                stack.push(stack2.pop());
                System.out.printf("Actual page: %s", stack.peek());
                System.out.println("%n");
            } else {
                System.out.println("couldn't understand your response");
                break;
            }
        }
        scanner.close();
    }
}