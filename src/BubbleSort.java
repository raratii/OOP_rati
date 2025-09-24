
public class BubbleSort {

    // Method untuk melakukan bubble sort dengan batas iterasi tertentu
    public int[] bubbleSort(int[] arr, int maxIterations) {
        if (maxIterations < 0) {
            return arr;
        }

        int n = arr.length;
        int iterations = 0;

        for (int i = 0; i < n - 1 && iterations < maxIterations; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            iterations++;
        }
        return arr;
    }
}
