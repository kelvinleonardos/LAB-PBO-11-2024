class TP2_2_H071231005 {
    int id;
    String namaProduk;
    int stok;
    double harga;

    public TP2_2_H071231005(int id, String namaProduk, int stok, double harga) {
        this.id = id;
        this.namaProduk = namaProduk;
        this.stok = (stok < 0) ? 0 : stok;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isAvailable() {
        return stok > 0;
    }


    public static void main(String[] args) {
        TP2_2_H071231005 produk1 = new TP2_2_H071231005(13, "Buku", 10, 4500.00);
 

        System.out.println("=====Informasi Produk =====");
        System.out.println("ID Produk       : " + produk1.getId());
        System.out.println("Nama Produk     : " + produk1.getNamaProduk());
        System.out.println("Stok            : " + produk1.getStok());  
        System.out.println("Harga           : " + produk1.getHarga());
        System.out.println("Stok Tersedia   : " + (produk1.isAvailable() ? "Ya" : "Tidak"));

    }
}