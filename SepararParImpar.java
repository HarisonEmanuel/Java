public class SepararParImpar {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] pares;
        int[] impares;
        
        int countPares = 0;
        int countImpares = 0;

        Scanner scanner = new Scanner(System.in);

        // Solicita entrada do usuário para preencher o array 'numeros'
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Conta a quantidade de números pares e ímpares no array 'numeros'
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        // Inicializa arrays 'pares' e 'impares' com tamanhos apropriados
        pares = new int[countPares];
        impares = new int[countImpares];

        int indexPares = 0;
        int indexImpares = 0;

        // Preenche os arrays 'pares' e 'impares' com os números correspondentes
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares[indexPares] = numero;
                indexPares++;
            } else {
                impares[indexImpares] = numero;
                indexImpares++;
            }
        }

        // Imprime os resultados
        System.out.println("Números originais:");
        imprimirVetor(numeros);

        System.out.println("\nNúmeros pares:");
        imprimirVetor(pares);

        System.out.println("\nNúmeros ímpares:");
        imprimirVetor(impares);

        scanner.close();
    }

    // Método auxiliar para imprimir os elementos de um vetor
    private static void imprimirVetor(int[] vetor) {
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
