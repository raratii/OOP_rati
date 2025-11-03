package encapsulation;

public class Student {
    private String name;
    // Field 'name' bersifat private, hanya bisa diakses dari dalam kelas ini.

    private int age;
    // Field 'age' bersifat private, hanya bisa diakses dari dalam kelas ini.

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Constructor untuk menginisialisasi nilai awal saat objek Student dibuat.

    public String getName() {
        return this.name;
    }
    // Getter: Method publik untuk mendapatkan nilai dari field 'name'.

    public int getAge() {
        return this.age;
    }
    // Getter: Method publik untuk mendapatkan nilai dari field 'age'.

    public void setAge(int age) {
        this.age = age;
    }
    // Setter: Method publik untuk mengubah nilai dari field 'age'.
}
