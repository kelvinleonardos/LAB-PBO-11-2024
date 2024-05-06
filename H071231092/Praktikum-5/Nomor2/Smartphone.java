package LAB_PBO_2024.Praktikum.Praktikum_05.Nomor2;

class Smartphone extends Product {
    private double ukuranLayar;
    private int kapasitasPenyimpanan;

    public Smartphone(String merek, int nomorSeri, double harga, double ukuranLayar, int kapasitasPenyimpanan) {
        super(merek, nomorSeri, harga);
        this.ukuranLayar = ukuranLayar;
        this.kapasitasPenyimpanan = kapasitasPenyimpanan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
        System.out.println("Kapasitas Penyimpanan: " + kapasitasPenyimpanan + "GB");
    }
}