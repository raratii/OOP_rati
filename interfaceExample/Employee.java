package interfaceExample;

public class Employee implements Payable {
    // 'implements Payable' berarti kelas Employee berjanji untuk menyediakan
    // implementasi untuk semua method yang ada di interface Payable.

    private double salary;
    // Field untuk menyimpan gaji karyawan.

    public Employee(double salary) {
        this.salary = salary;
    }
    // Constructor untuk menginisialisasi gaji saat objek Employee dibuat.

    @Override
    public double getPaymentAmount() {
        return this.salary;
    }
    // Implementasi konkret dari method getPaymentAmount() yang diwajibkan oleh interface Payable.
    // Method ini mengembalikan nilai gaji karyawan.
}
