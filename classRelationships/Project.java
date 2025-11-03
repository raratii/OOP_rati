package classRelationships;

public class Project {
    private String projectName;
    private Employee leader;
    // Hubungan Asosiasi: Project 'memiliki' seorang Employee sebagai leader.

    public Project(String projectName, Employee leader) {
        this.projectName = projectName;
        this.leader = leader;
    }
    // Constructor untuk menginisialisasi nama proyek dan pemimpinnya.

    public String getLeaderName() {
        return leader.getName();
    }
    // Method untuk mendapatkan nama dari objek leader.
}
