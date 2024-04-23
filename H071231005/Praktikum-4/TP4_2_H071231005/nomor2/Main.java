package nomor2;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============================================");
        Handphone hp1 = new Handphone();
        hp1.setMerk("Vivo");
        hp1.setModel("V19");
        hp1.setHarga(300000);
        hp1.setTahunProduksi(2021);
        hp1.setDeskripsi("\nBagus Untuk main game\nram 8g \npenyimpanan 128gb");

        hp1.displayInfo();
        System.out.println("===============================================");

        Handphone hp2 = new Handphone("Realme", "Note 10 Pro", 400000, 2020, "\nBagus Untuk penggunaan dalam jangka yang lama\nram 8g \npenyimpanan 128gb");
        hp2.displayInfo();
        System.out.println("===============================================");

        // hp2.displayInfo();
        // hp2.getMerk();
        // hp2.getModel();
        // hp2.getHarga();
        // hp2.getTahunProduksi();
        // hp2.getDeskripsi();
  
        SelfUtils.displaySelfData();
        System.out.println("===============================================");
    }

 

    

}
