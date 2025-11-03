package inheritance;

public class Student extends Person {
    // 'extends Person' menandakan bahwa Student mewarisi field dan method dari Person.
    private String studentId;
    // Field tambahan yang hanya ada di kelas Student.
    public Student(String name, int age, String studentId) {
        super(name, age);
        // Memanggil constructor dari superclass (Person) untuk menginisialisasi name dan age.
        this.studentId = studentId;
        // Menginisialisasi field milik Student.
    }
    public String getStudentId() {
        return this.studentId;
    }
    // Method tambahan yang spesifik untuk kelas Student.
}
