public class MahasiswaMain01 {
    // Atribut
    String nama;
    String nim;
    String kelas;
    double ipk;

    // Konstruktor Default
    public MahasiswaMain01() {
    }

    // Konstruktor Berparameter
    public MahasiswaMain01(String nm, String nim, double ipk, String kls) {
        this.nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kls;
    }

    // Method tampilkanInformasi
    void tampilkanInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("---------------------");
    }

    // Method ubahKelas
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    // Method updateIPK dengan validasi
    void updateIPK(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
}