package dataStructure;

import java.util.Arrays;

public class SelectionSort {
    public int[] selectionSort(int[] inputArray, int iterations) {
        // Membuat salinan dari array input untuk menghindari modifikasi array asli.
        int[] arr = Arrays.copyOf(inputArray, inputArray.length);
        int n = arr.length;

        // Jika iterasi negatif, kembalikan salinan array tanpa perubahan.
        if (iterations < 0) {
            return arr;
        }

        // Batasi jumlah iterasi maksimal hingga n-1, karena setelah itu array pasti sudah terurut.
        int effectiveIterations = Math.min(iterations, n - 1);

        // Loop untuk setiap pass/iterasi
        for (int i = 0; i < effectiveIterations; i++) {
            // Asumsikan elemen pertama dari bagian yang belum terurut adalah yang terkecil
            int minIndex = i;

            // Loop untuk mencari elemen terkecil di sisa array yang belum terurut
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Tukar elemen terkecil yang ditemukan dengan elemen pertama dari
            // bagian yang belum terurut (posisi i)
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
