package classRelationships;

public class Employee extends Person {
    // 'extends Person' menandakan bahwa Employee adalah turunan dari Person (Inheritance).

    public Employee(String name) {
        super(name);
    }
    // Constructor ini memanggil constructor dari superclass (Person) untuk menginisialisasi nama.
}
