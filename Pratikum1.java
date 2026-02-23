public class Pratikum1 {
    // Atribut [cite: 32]
    String nama;
    String nim;
    String kelas;
    double ipk; 

    // Konstruktor Default [cite: 138]
    public Pratikum1() {
    }

    // Konstruktor Berparameter [cite: 140]
    public Pratikum1(String nm, String nim, double ipk, String kls) {
        this.nama = nm; // [cite: 141]
        this.nim = nim; // [cite: 142]
        this.ipk = ipk; // [cite: 143]
        this.kelas = kls; // [cite: 144]
    }

    // Method tampilkanInformasi [cite: 39]
    void tampilkanInformasi() {
        System.out.println("Nama  : " + nama); // [cite: 40]
        System.out.println("NIM   : " + nim); // [cite: 40]
        System.out.println("Kelas : " + kelas); // [cite: 46]
        System.out.println("IPK   : " + ipk); // [cite: 43]
        System.out.println("---------------------");
    }

    // Method ubahKelas [cite: 49]
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru; // [cite: 51]
    }

    // Method updateIPK dengan validasi (Pertanyaan No. 4) 
    void updateIPK(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) { // 
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0"); // [cite: 87]
        }
    }

    // Method nilaiKinerja (Pertanyaan No. 5) [cite: 55, 88]
    String nilaiKinerja() {
        if (ipk >= 3.5) { // [cite: 56]
            return "Kinerja sangat baik"; // [cite: 57]
        } else if (ipk >= 3.0) { // [cite: 58]
            return "Kinerja baik"; // [cite: 59]
        } else if (ipk >= 2.0) { // [cite: 60]
            return "Kinerja cukup"; // [cite: 61]
        } else {
            return "Kinerja kurang"; // [cite: 63]
        }
    }
}