package LAB_PBO_2024.Praktikum.Praktikum_02;

public class Nomor4 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Jl. Bau Mangga";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Nafil";
        mahasiswa.nim = "H071231092";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());

    }
}
