import java.util.Arrays;

public class SortingComparison {
    public static void main(String[] args) {
        int[] array = generateRandomArray(1000); // Altere o tamanho do array conforme necessário

        // Clone do array original para manter a consistência nos testes
        int[] arrayInsertionSort = array.clone();
        int[] arraySelectionSort = array.clone();
        int[] arrayBubbleSort = array.clone();
        int[] arrayMergeSort = array.clone();
        int[] arrayHeapSort = array.clone();
        int[] arrayQuickSort = array.clone();

        // Teste de desempenho
        long startTime, endTime;

        startTime = System.nanoTime();
        insertionSort(arrayInsertionSort);
        endTime = System.nanoTime();
        System.out.println("Insertion Sort: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        selectionSort(arraySelectionSort);
        endTime = System.nanoTime();
        System.out.println("Selection Sort: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        bubbleSort(arrayBubbleSort);
        endTime = System.nanoTime();
        System.out.println("Bubble Sort: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        mergeSort(arrayMergeSort, 0, arrayMergeSort.length - 1);
        endTime = System.nanoTime();
        System.out.println("Merge Sort: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        heapSort(arrayHeapSort);
        endTime = System.nanoTime();
        System.out.println("Heap Sort: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        quickSort(arrayQuickSort, 0, arrayQuickSort.length - 1);
        endTime = System.nanoTime();
        System.out.println("Quick Sort: " + (endTime - startTime) + " ns");
    }

    // Métodos de ordenação

    private static void insertionSort(int[] array) {
        // Implementação do Insertion Sort
    }

    private static void selectionSort(int[] array) {
        // Implementação do Selection Sort
    }

    private static void bubbleSort(int[] array) {
        // Implementação do Bubble Sort
    }

    private static void mergeSort(int[] array, int left, int right) {
        // Implementação do Merge Sort
    }

    private static void heapSort(int[] array) {
        // Implementação do Heap Sort
    }

    private static void quickSort(int[] array, int low, int high) {
        // Implementação do Quick Sort
    }

    // Método para gerar um array de inteiros aleatórios
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000); // Números aleatórios entre 0 e 999
        }
        return array;
    }
}