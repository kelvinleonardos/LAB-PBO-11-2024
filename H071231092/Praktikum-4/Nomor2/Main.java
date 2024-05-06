package LAB_PBO_2024.Praktikum.Praktikum_04.Nomor2;

public class Main {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
    
        laptop1.setMerk("Asus");
        laptop1.setModel("TUF Gaming 15");
        laptop1.setHarga(12);
        laptop1.setTahunProduksi(2020);
        laptop1.setDeskripsi("Laptop gaming paling termurah");

        laptop1.displayInfo();

        Laptop laptop2 = new Laptop("MackBook","apple","Bagus untuk kerja",15, 2018);

        System.out.println("\nInfomasi : ");
        System.out.println("Merk : " + laptop2.getMerk());
        System.out.println("Model : " + laptop2.getModel());
        System.out.println("Harga : " + laptop2.getHarga());
        System.out.println("Tahun Produksi : " + laptop2.getTahunProduksi());
        System.out.println("Deskripsi : " + laptop2.getDeskripsi());

        SelfUtils.displaySelfData();

    }

    
}
