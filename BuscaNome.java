import java.util.Scanner;

public class BuscaNome {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome #" + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

        // Fecha o scanner
        scanner.close();
    }
}
