package dataStructure;

public class SequentialSearch {
    public int[] sequentialSearch(int[] inputArray, int target) {
        int iterations = 0;

        // Loop melalui setiap elemen dalam array
        for (int i = 0; i < inputArray.length; i++) {
            iterations++; // Setiap perbandingan dihitung sebagai satu iterasi
            if (inputArray[i] == target) {
                // Jika target ditemukan, kembalikan indeks dan jumlah iterasi
                return new int[]{i, iterations};
            }
        }

        // Jika loop selesai dan target tidak ditemukan, kembalikan -1 dan total iterasi
        return new int[]{-1, iterations};
    }
}
