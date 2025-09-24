

public class SequentialSearch {

    // Method untuk sequential search
    public int[] sequentialSearch(int[] arr, int target) {
        int iterations = 0;

        for (int i = 0; i < arr.length; i++) {
            iterations++;
            if (arr[i] == target) {
                return new int[] { i, iterations };
            }
        }
        return new int[] { -1, iterations };
    }
}
