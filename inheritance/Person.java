package inheritance;

public class Person {
    private String name;
    private int age;
    // Fields untuk menyimpan data. Dibuat 'private' untuk enkapsulasi.
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Constructor untuk menginisialisasi objek Person.
    public String getInfo() {
        return this.name + " (" + this.age + " years old)";
    }
    // Method untuk mengembalikan informasi tentang orang tersebut.
}
