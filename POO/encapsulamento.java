package POO;

public class encapsulamento {
    public static void main(String[] args) {
        /* Encapsulamento é um dos quatro pilares da programação orientada a objetos (POO), 
        juntamente com herança, polimorfismo e abstração. 
        Ele se refere à prática de restringir o acesso direto aos dados de um objeto e 
        fornecer métodos públicos para interagir com esses dados.

        Benefícios do encapsulamento:
        1. Proteção de Dados: Impede que dados internos sejam acessados ou modificados diretamente, 
        garantindo a integridade do objeto.
        2. Controle de Acesso: Permite definir quais partes do código podem acessar ou modificar os dados.
        3. Manutenção Facilitada: Mudanças na implementação interna não afetam o código externo que usa o objeto.
        4. Abstração: Esconde os detalhes complexos da implementação, expondo apenas o necessário.

        Como implementar o encapsulamento em Java:
        - Use modificadores de acesso (private, protected, public) para controlar a visibilidade dos membros da classe.
        - Declare os atributos da classe como private para restringir o acesso direto.
        - Forneça métodos públicos (getters e setters) para permitir o acesso controlado aos atributos.

        Exemplo:
        */

        class Pessoa {
            private String nome;
            private int idade;

            public Pessoa(String nome, int idade) {
                this.nome = nome;
                this.idade = idade;
            }

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public int getIdade() {
                return idade;
            }

            public void setIdade(int idade) {
                this.idade = idade;
            }
        }

        // Uso da classe Pessoa com encapsulamento
        Pessoa pessoa = new Pessoa("João", 25);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Modificando os atributos usando setters
        pessoa.setNome("Maria");
        pessoa.setIdade(22);
    }
}
