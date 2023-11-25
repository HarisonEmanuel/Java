import java.util.Scanner;

public class MaiorMenorValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE; 

        int valor;

        while (true) {
            System.out.print("Digite um valor inteiro positivo (ou um valor negativo para sair): ");
            valor = scanner.nextInt();

            if (valor < 0) {
                break; 
            }

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }

        if (maior != Integer.MIN_VALUE) {
            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }

        scanner.close();
    }
}
