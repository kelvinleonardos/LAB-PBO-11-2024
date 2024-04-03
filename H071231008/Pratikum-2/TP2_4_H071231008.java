class Alamat {
    String alamat;
    String kota;

    public String getAlamat() {
        return alamat+ ", " + kota;
    }
}

class Mahasiswa {
    Alamat alamat;
    String nama;
    String nim;

    public String getAlamat() {
        return alamat.getAlamat();
    }
    
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }


}

public class Soal4 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Andi Riswanda";
        mahasiswa.nim = "H071231008";
        
        Alamat alamat = new Alamat();
        alamat.alamat = "Tamanlanrea Indah";
        alamat.kota = "Makassar";
        mahasiswa.alamat = alamat;

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}
