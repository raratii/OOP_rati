package classRelationships;

public class Manager extends Employee {
    // Manager adalah seorang Employee, jadi kita gunakan inheritance.

    private Task task;
    // Hubungan Komposisi: Manager 'terdiri dari' sebuah Task. Task tidak bisa ada tanpa Manager.

    public Manager(String name) {
        super(name);
    }
    // Memanggil constructor dari superclass (Employee).

    public void setTask(Task task) {
        this.task = task;
    }
    // Method untuk menetapkan tugas kepada manager.

    public String getTaskName() {
        return task.getName();
    }
    // Method untuk mendapatkan nama dari tugas yang dimiliki manager.
}
