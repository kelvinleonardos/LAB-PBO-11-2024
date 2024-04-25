class Mahasiswa {
    String nama;
    String nim;
    String alamat;

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat;
    }
}

class Alamat {
    String jalan;
    String kota;

    public String getAlamat() {
        return jalan + ", " + kota;
    }
}


public class TP4_H071231037 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Nurussamawati 4";
        alamat.kota = "Parepare";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat.getAlamat(); 
        mahasiswa.nama = "Mohammad Alief Hasyani";
        mahasiswa.nim = "H071231037";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}
