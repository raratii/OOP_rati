package polymorphism;

public class Circle extends Shape {
    // Circle adalah turunan dari Shape.
    private double radius;
    // Field untuk menyimpan jari-jari lingkaran.
    public Circle(double radius) {
        this.radius = radius;
    }
    // Constructor untuk menginisialisasi objek Circle dengan jari-jari.
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    // Implementasi spesifik dari getArea() untuk lingkaran.
}
