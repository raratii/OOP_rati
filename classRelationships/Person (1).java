package classRelationships;

public class Person {
    private String name;
    // Field untuk menyimpan nama, 'private' agar hanya bisa diakses di dalam kelas ini.

    public Person(String name) {
        this.name = name;
    }
    // Constructor untuk menginisialisasi nama saat objek Person dibuat.

    public String getName() {
        return name;
    }
    // Method untuk mendapatkan nilai dari field 'name'.
}
