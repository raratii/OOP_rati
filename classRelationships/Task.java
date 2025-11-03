package classRelationships;

public class Task {
    private String taskName;
    // Field untuk menyimpan nama tugas.

    public Task(String taskName) {
        this.taskName = taskName;
    }
    // Constructor untuk menginisialisasi nama tugas.

    public String getName() {
        return taskName;
    }
    // Method untuk mendapatkan nama tugas.
}
