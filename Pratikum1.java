public class Pratikum1 {
  
    String nama;
    String nim;
    String kelas;
    String IPK;

    void tampilkanInformasi( ) {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + IPK);
    }
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;

    }
    void updateIPK(String IPKBaru) {
        IPK = IPKBaru;
    }
    String nilaiKinerja() {
        if (IPK.equals("A")) {
            return "Sangat Baik";
        } else if (IPK.equals("B")) {
            return "Baik";
        } else if (IPK.equals("C")) {
            return "Cukup";
        } else if (IPK.equals("D")) {
            return "Kurang";
        } else if (IPK.equals("E")) {
            return "Sangat Kurang";
        } else {
            return "Nilai IPK tidak valid";
        }
    }

}

  
   