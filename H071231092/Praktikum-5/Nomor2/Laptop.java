package LAB_PBO_2024.Praktikum.Praktikum_05.Nomor2;

class Laptop extends Product {
    private int ukuranRam;
    private String tipeProcessor;

    public Laptop(String merek, int seriesNumber, double price, int ukuranRam, String tipeProcessor) {
        super(merek, seriesNumber, price);
        this.ukuranRam = ukuranRam;
        this.tipeProcessor = tipeProcessor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ukuran RAM: " + ukuranRam + "GB");
        System.out.println("Tipe Processor: " + tipeProcessor);
    }
}