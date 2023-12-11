public class InsertionSort {

    // Método para ordenar um array usando o algoritmo Insertion Sort.
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Move os elementos maiores que a chave para a direita.
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    // Método para imprimir os elementos de um array.
    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Array original:");
        printArray(array);

        // Chama o método insertionSort para ordenar o array.
        insertionSort(array);

        System.out.println("Array ordenado:");
        printArray(array);
    }
}
