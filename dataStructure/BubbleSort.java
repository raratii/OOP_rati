package dataStructure;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] inputArray, int iterations) {
        // Membuat salinan dari array input untuk menghindari modifikasi array asli.
        int[] arr = Arrays.copyOf(inputArray, inputArray.length);
        int n = arr.length;

        // Jika iterasi negatif, kembalikan array asli tanpa perubahan.
        if (iterations < 0) {
            return arr;
        }

        // Batasi jumlah iterasi maksimal hingga n-1, karena setelah itu array pasti sudah terurut.
        int effectiveIterations = Math.min(iterations, n - 1);

        // Loop untuk setiap pass/iterasi
        for (int i = 0; i < effectiveIterations; i++) {
            boolean swapped = false;
            // Loop untuk membandingkan elemen yang bersebelahan
            for (int j = 0; j < n - i - 1; j++) {
                // Jika elemen saat ini lebih besar dari elemen berikutnya, tukar.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Jika tidak ada pertukaran dalam satu pass, array sudah terurut.
            // Kita bisa keluar dari loop lebih awal.
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
