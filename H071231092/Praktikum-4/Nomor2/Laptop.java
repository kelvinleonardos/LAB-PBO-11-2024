package LAB_PBO_2024.Praktikum.Praktikum_04.Nomor2;

public class Laptop {
    String merk, model, deskripsi; 
    double harga; 
    int tahunProduksi;


    public Laptop() {
    }

    public Laptop(String merk, String model, String deskripsi, double harga, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
    }

    public void displayInfo() {
        System.out.println("Informasi : ");
        System.out.println("Merk : " + merk);
        System.out.println("Model :  " + model);
        System.out.println("Deskrpsi : " + deskripsi);
        System.out.println("Harga :  " + harga + "jt");
        System.out.println("Tahun Produksi :  " + tahunProduksi);
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getModel() {
        return model;
    }

    public String getMerk() {
        return merk;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public double getHarga() {
        return harga;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    
}
