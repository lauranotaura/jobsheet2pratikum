public class Latihan2 { // Cukup satu deklarasi class saja
    // Atribut
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // Konstruktor Default
    public Latihan2() {
    }

    // Konstruktor Berparameter
    public Latihan2(String id, String nama, boolean status, int tahun, String keahlian) {
        this.idDosen = id;
        this.nama = nama;
        this.statusAktif = status;
        this.tahunBergabung = tahun;
        this.bidangKeahlian = keahlian;
    }

    // Method untuk menampilkan informasi lengkap
    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("------------------------------------");
    }

    // Method untuk mengatur status aktif
    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status dosen " + nama + " sekarang: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    // Method untuk menghitung masa kerja
    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    // Method untuk mengubah bidang keahlian
    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
} // Satu kurung kurawal penutup untuk class Latihan2