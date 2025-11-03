package classesnObjects; // Pastikan package ini sesuai dengan nama direktorinya

public class Car {
    // Fields/Atribut dibuat private untuk enkapsulasi
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public String getCarInfo() {
        // Menggunakan String.format untuk membuat string yang lebih rapi dan mudah dibaca
        return String.format("%s %s (%d)", this.brand, this.model, this.year);
    }
}
