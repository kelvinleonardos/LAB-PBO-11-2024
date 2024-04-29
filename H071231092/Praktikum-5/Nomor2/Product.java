package LAB_PBO_2024.Praktikum.Praktikum_05.Nomor2;

class Product {
    protected String merek;
    protected int nomorSeri;
    protected double harga;

    public Product(String merek, int nomorSeri, double harga) {
        this.merek = merek;
        this.nomorSeri = nomorSeri;
        this.harga = harga;
    }

    public void displayInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Nomor Seri: " + nomorSeri);
        System.out.println("Harga: $" + harga);
    }
}