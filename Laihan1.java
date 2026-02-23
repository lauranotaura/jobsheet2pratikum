public class Laihan1 {
    // Atribut
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    // Konstruktor Default
    public Laihan1() {
    }

    // Konstruktor Berparameter
    public Laihan1(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Method untuk menampilkan informasi lengkap
    void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("---------------------------");
    }

    // Method untuk mengubah SKS
    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS " + nama + " telah diubah menjadi: " + sks);
    }

    // Method untuk menambah jam
    void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jam " + nama + " berhasil ditambah.");
    }

    // Method untuk mengurangi jam dengan pengecekan
    void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Pengurangan berhasil. Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan, jumlah jam tidak mencukupi!");
        }
    }
}