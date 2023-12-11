import java.util.Scanner;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as dimensões da matriz A
        System.out.print("Digite o número de linhas da matriz A: ");
        int linhasA = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz A: ");
        int colunasA = scanner.nextInt();

        // Solicita as dimensões da matriz B
        System.out.print("Digite o número de linhas da matriz B: ");
        int linhasB = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz B: ");
        int colunasB = scanner.nextInt();

        // Verifica se as matrizes podem ser multiplicadas
        if (colunasA != linhasB) {
            System.out.println("As matrizes não podem ser multiplicadas. O número de colunas de A deve ser igual ao número de linhas de B.");
            scanner.close();
            return;
        }

        // Inicializa as matrizes A, B e C
        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];
        int[][] matrizC = new int[linhasA][colunasB];

        // Preenche a matriz A
        System.out.println("Digite os elementos da matriz A:");
        preencherMatriz(scanner, matrizA);

        // Preenche a matriz B
        System.out.println("Digite os elementos da matriz B:");
        preencherMatriz(scanner, matrizB);

        // Realiza a multiplicação das matrizes A e B, armazenando o resultado em C
        multiplicarMatrizes(matrizA, matrizB, matrizC);

        // Exibe a matriz resultante C (A x B)
        System.out.println("Matriz resultante C (A x B):");
        exibirMatriz(matrizC);

        // Fecha o scanner
        scanner.close();
    }

    // Método para preencher uma matriz com valores fornecidos pelo usuário
    private static void preencherMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para multiplicar duas matrizes e armazenar o resultado em uma terceira matriz
    private static void multiplicarMatrizes(int[][] matrizA, int[][] matrizB, int[][] matrizC) {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizB.length; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
    }

    // Método para exibir uma matriz
    private static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
