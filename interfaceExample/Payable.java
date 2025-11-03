package interfaceExample;

public interface Payable {
    // Interface hanya berisi deklarasi method, tanpa implementasi.
    // Setiap kelas yang mengimplementasikan Payable WAJIB memiliki method ini.

    double getPaymentAmount();
    // Method abstrak yang akan mengembalikan jumlah pembayaran dalam bentuk double.
}
