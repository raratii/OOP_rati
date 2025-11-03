package classRelationships;

public class Department {
    private String departmentName;
    private Manager manager;
    // Hubungan Agregasi: Department 'memiliki' seorang Manager.

    public Department(String name) {
        this.departmentName = name;
    }
    // Constructor untuk menginisialisasi nama departemen.

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    // Method untuk menetapkan manager ke departemen ini.

    public String getManagerName() {
        if (manager != null) {
            return manager.getName();
        }
        return "No manager assigned";
    }
    // Method untuk mendapatkan nama manager, dengan pengecekan jika manager belum
    // ada.
}
