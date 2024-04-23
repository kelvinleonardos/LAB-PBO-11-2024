package nomor2;

public class Handphone {
    String merk, model;
    double harga;
    int tahunProduksi;
    String deskripsi;
    
    public Handphone(){

    }
    public Handphone(String merk, String model, double harga, int tahunProduksi, String deskripsi){
        this.merk = merk;
        this.model = model;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
        this.deskripsi = deskripsi;
    }

    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public int getTahunProduksi() {
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void displayInfo(){
        System.out.println("merek : " + this.getMerk());
        System.out.println("Model : " + this.getModel());
        System.out.println("harga : " + this.getHarga());
        System.out.println("Tahun Produksi : " + this.getTahunProduksi());
        System.out.println("Deskripsi : " + this.getDeskripsi());
    }



}

