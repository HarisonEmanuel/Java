import java.util.Stack;
import java.util.Scanner;

public class LojaComPilha {
    public static void main(String[] args) {
        Stack<String> produtos = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Mostrar produtos na pilha");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String produto = scanner.next();
                    produtos.push(produto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    if (!produtos.isEmpty()) {
                        String produtoRemovido = produtos.pop();
                        System.out.println("Produto removido: " + produtoRemovido);
                    } else {
                        System.out.println("A pilha está vazia. Nenhum produto para remover.");
                    }
                    break;
                case 3:
                    System.out.println("Produtos na pilha: " + produtos);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
