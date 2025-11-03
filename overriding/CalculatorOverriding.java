package overriding;

public class CalculatorOverriding {

    public String getType() {
        return "Generic Calculator";
    }
    // Method yang akan di-override oleh subclass.

    public double divide(double a, double b) {
        if (b == 0) {
            return Double.NaN; // Not a Number
        }
        return a / b;
    }
    // Method pembagian versi standar, mengembalikan NaN jika dibagi nol.
    public static class ScientificCalculator extends CalculatorOverriding {

        @Override
        public String getType() {
            return "Scientific Calculator";
        }
        // Meng-override method getType() untuk memberikan implementasi spesifik.

        @Override
        public double divide(double a, double b) {
            if (b == 0) {
                return Double.POSITIVE_INFINITY;
            }
            return a / b;
        }
        // Meng-override method divide() untuk menangani pembagian dengan nol secara berbeda.
    }
}