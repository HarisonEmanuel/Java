import java.util.Scanner;

public class SepararParImpar {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] pares;
        int[] impares;
        
        int countPares = 0;
        int countImpares = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        pares = new int[countPares];
        impares = new int[countImpares];

        int indexPares = 0;
        int indexImpares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares[indexPares] = numero;
                indexPares++;
            } else {
                impares[indexImpares] = numero;
                indexImpares++;
            }
        }

        System.out.println("Números originais:");
        imprimirVetor(numeros);

        System.out.println("\nNúmeros pares:");
        imprimirVetor(pares);

        System.out.println("\nNúmeros ímpares:");
        imprimirVetor(impares);

        scanner.close();
    }

    private static void imprimirVetor(int[] vetor) {
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
