public class MatrizSomaParImpar {
    public static void main(String[] args) {
        int[][] MAT = new int[5][10];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                MAT[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("Soma dos elementos de cada linha e paridade:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 10; j++) {
                somaLinha += MAT[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": Soma = " + somaLinha + ", Paridade = " + (somaLinha % 2 == 0 ? "Par" : "Ímpar"));
        }

        System.out.println("\nSoma dos elementos de cada coluna e paridade:");
        for (int j = 0; j < 10; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += MAT[i][j];
            }
            System.out.println("Coluna " + (j + 1) + ": Soma = " + somaColuna + ", Paridade = " + (somaColuna % 2 == 0 ? "Par" : "Ímpar"));
        }
    }
}
