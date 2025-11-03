package polymorphism;

public class Rectangle extends Shape {
    // Rectangle adalah turunan dari Shape.

    private double width;
    private double height;
    // Fields untuk menyimpan lebar dan tinggi persegi panjang.

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // Constructor untuk menginisialisasi objek Rectangle.

    @Override
    public double getArea() {
        return this.width * this.height;
    }
    // Implementasi spesifik dari getArea() untuk persegi panjang.
}
