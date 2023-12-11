import java.util.Scanner;

public class BuscaNome {
    public static void main(String[] args) {
        // Inicializando um array para armazenar 10 nomes
        String[] nomes = new String[10];
        Scanner scanner = new Scanner(System.in);

        // Preenchendo o array com nomes fornecidos pelo usuário
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome #" + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Solicitando ao usuário um nome para buscar
        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();

        // Verificando se o nome fornecido está no array
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }

        // Exibindo o resultado da busca
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

        // Fechando o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
