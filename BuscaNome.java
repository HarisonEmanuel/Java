import java.util.Scanner;

public class BuscaNomeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializa um array de strings para armazenar os nomes
        String[] nomes = new String[10];
        
        // Solicita ao usuário inserir 10 nomes
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira o nome #" + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        // Solicita ao usuário digitar um nome para buscar
        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();
        
        // Converte ambos os nomes para minúsculas para ignorar maiúsculas/minúsculas
        nomeBusca = nomeBusca.toLowerCase();
        
        // Verifica se o nome está presente no array usando um loop for-each
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.toLowerCase().equals(nomeBusca)) {
                encontrado = true;
                break;
            }
        }
        
        // Exibe o resultado
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
        
        scanner.close();
    }
}