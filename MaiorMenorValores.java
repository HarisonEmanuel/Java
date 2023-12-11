import java.util.Scanner;

public class MaiorMenorValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE; // Variável para armazenar o maior valor inserido.
        int menor = Integer.MAX_VALUE; // Variável para armazenar o menor valor inserido.

        int valor;

        while (true) {
            System.out.print("Digite um valor inteiro positivo (ou um valor negativo para sair): ");
            valor = scanner.nextInt();

            if (valor < 0) {
                break; // Encerra o loop quando um valor negativo é inserido.
            }

            if (valor > maior) {
                maior = valor; // Atualiza o maior valor se o valor atual for maior.
            }

            if (valor < menor) {
                menor = valor; // Atualiza o menor valor se o valor atual for menor.
            }
        }

        if (maior != Integer.MIN_VALUE) {
            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi informado."); // Exibido se nenhum valor positivo for inserido.
        }

        scanner.close();
    }
}
