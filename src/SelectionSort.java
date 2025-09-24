

public class SelectionSort {

    // Method untuk melakukan selection sort dengan batas iterasi tertentu
    public int[] selectionSort(int[] arr, int maxIterations) {
        if (maxIterations < 0) {
            return arr;
        }

        int n = arr.length;
        int iterations = 0;

        for (int i = 0; i < n - 1 && iterations < maxIterations; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            iterations++;
        }
        return arr;
    }
}
