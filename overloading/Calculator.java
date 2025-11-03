package overloading;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    // Method 'add' pertama yang menerima dua parameter integer.
    public double add(double a, double b) {
        return a + b;
    }
    // Method 'add' kedua yang di-overload untuk menerima dua parameter double.
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Method 'add' ketiga yang di-overload untuk menerima tiga parameter integer.
}
