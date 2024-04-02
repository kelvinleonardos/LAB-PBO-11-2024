package LAB_PBO_2024.Praktikum.Praktikum_02;

public class Nomor2 {
    //atribute produk
    public static class Produk {
        private int id;
        private String nama;
        private int stok;
        private double harga;

    //Method untuk mendapat ID produk
    public int getId() {
        return id;
    }

    //Method untuk mendapatkan nama produk
    public String getNama() {
        return nama;
    }

    //Method untuk mendapatkan stok produk
    public int getStok() {
        return stok;
    } 

    //Method untuk mendapatkan harga produk
    public double getHarga() {
        return harga;
    }

    //Method untuk mengecek ketersediaan produk
    public boolean apakahTersedia() {
        return stok > 0;
    }

    public static void main(String[] args) {
        //Membuat objek produk
        Produk produk = new Produk();

        produk.id = 1;
        produk.nama = "Pulpen";
        produk.stok = -1;
        produk.harga = 10000;

        //Menampilkan informasi produk
        System.out.println("Info Produk:");
        System.out.println("ID:" + produk.getId());
        System.out.println("Nama:" + produk.getNama());
        System.out.println("Stok:" + produk.getStok());
        System.out.println("Harga:" + produk.getHarga());


        //Melakukan cek tersedia stok produk
        if (produk.apakahTersedia()) {
            System.out.println("Produk tersedia");
        } else {
            System.out.println("Produk tidak tersedia");
        }
    }

    }
}
