import java.util.Stack;
import java.util.Scanner;

public class LojaComPilha {
    public static void main(String[] args) {
        Stack<String> produtos = new Stack<>(); // Cria uma pilha para armazenar produtos.
        Scanner scanner = new Scanner(System.in); // Inicializa um scanner para entrada do usuário.
        int opcao;

        do {
            System.out.println("1. Adicionar produto"); // Opção para adicionar um produto à pilha.
            System.out.println("2. Remover produto"); // Opção para remover o último produto adicionado à pilha.
            System.out.println("3. Mostrar produtos na pilha"); // Opção para exibir todos os produtos na pilha.
            System.out.println("0. Sair"); // Opção para sair do programa.
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário.

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String produto = scanner.next();
                    produtos.push(produto); // Adiciona o produto à pilha.
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    if (!produtos.isEmpty()) {
                        String produtoRemovido = produtos.pop(); // Remove o último produto adicionado à pilha.
                        System.out.println("Produto removido: " + produtoRemovido);
                    } else {
                        System.out.println("A pilha está vazia. Nenhum produto para remover.");
                    }
                    break;
                case 3:
                    System.out.println("Produtos na pilha: " + produtos); // Exibe todos os produtos na pilha.
                    break;
                case 0:
                    System.out.println("Saindo do programa. Obrigado!"); // Mensagem de saída do programa.
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente."); // Mensagem para opção inválida.
            }
        } while (opcao != 0);

        scanner.close(); // Fecha o scanner para evitar vazamentos de recursos.
    }
}