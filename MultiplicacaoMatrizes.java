import java.util.Scanner;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz A: ");
        int linhasA = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz A: ");
        int colunasA = scanner.nextInt();

        System.out.print("Digite o número de linhas da matriz B: ");
        int linhasB = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz B: ");
        int colunasB = scanner.nextInt();

        if (colunasA != linhasB) {
            System.out.println("As matrizes não podem ser multiplicadas. O número de colunas de A deve ser igual ao número de linhas de B.");
            scanner.close();
            return;
        }

        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];
        int[][] matrizC = new int[linhasA][colunasB];

        System.out.println("Digite os elementos da matriz A:");
        preencherMatriz(scanner, matrizA);

        System.out.println("Digite os elementos da matriz B:");
        preencherMatriz(scanner, matrizB);

        multiplicarMatrizes(matrizA, matrizB, matrizC);

        System.out.println("Matriz resultante C (A x B):");
        exibirMatriz(matrizC);

        scanner.close();
    }

    private static void preencherMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    private static void multiplicarMatrizes(int[][] matrizA, int[][] matrizB, int[][] matrizC) {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizB.length; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
    }

    private static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
