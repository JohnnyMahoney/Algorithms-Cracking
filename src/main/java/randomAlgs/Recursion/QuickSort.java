package randomAlgs.Recursion;

public class QuickSort {

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(arr, start, end);

            quickSort(arr, start, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = (start - 1);
        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        int swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {9, 7, 5, 4, 3, 1};
        quickSort(arr, 0, arr.length - 1);

        for (int a : arr) {
            System.out.println(a);
        }
    }
}
