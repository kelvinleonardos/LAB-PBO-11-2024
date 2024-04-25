// import UsiaPejuang;

public class Pejuang {
    // Atribut
    String nama;
    int kekuatan;
    int kesehatan;
    UsiaPejuang usia = new UsiaPejuang(2000);

    public UsiaPejuang getUsia() {
        return usia;
    }
    public void setUsia(UsiaPejuang usia) {
        this.usia = usia;
    }
    public Pejuang(){}
    // Constructor 
    public Pejuang(String nama, int kekuatan, int kesehatan, UsiaPejuang usia) {
        this.nama = nama;
        this.kekuatan = kekuatan;
        this.kesehatan = kesehatan;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKekuatan() {
        return kekuatan;
    }

    public void setKekuatan(int kekuatan) {
        this.kekuatan = kekuatan;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // // Getter dan setter untuk atribut tahun lahir
    // public int getTahunLahir() {
    //     return tahunLahir;
    // }

    // public void setTahunLahir(int tahunLahir) {
    //     this.tahunLahir = tahunLahir;
    // }

    public int hitungUsia() {
        int tahunSekarang = 2024; 
        return usia.hitungUsia(tahunSekarang); 
    }

    // Method 
    public void serang(Pejuang lawan) {
        System.out.println("                               ");
        System.out.println(nama + " menyerang " + lawan.nama + " dengan kekuatan " + kekuatan + "!");
        lawan.kesehatan -= kekuatan;
        if (lawan.kesehatan <= 0) {
            System.out.println(lawan.nama + " telah kalah dalam pertarungan!");
            System.exit(0); 
        } else if (lawan.kesehatan == kesehatan) {
            System.out.println("Lawan seimbang");
        }
    }

    // Method 
    public void periksaKesehatan() {
        System.out.println("                      ");
        System.out.println("Kesehatan " + nama + ": " + kesehatan);
        if (this.kesehatan >= 0) {
            System.out.println("\nPertarungan Masih Berlanjut!!!");
        }
    }

    // Method 
    public void latihan() {
        System.out.println("                      ");
        kekuatan += 5;
        System.out.println(nama + " melakukan latihan dan meningkatkan kekuatan menjadi " + kekuatan);
    }

    // Method 
    public void istirahat() {
        System.out.println("                      ");
        kesehatan += 10;
        System.out.println(nama + " beristirahat dan memulihkan kesehatan menjadi " + kesehatan);
    }

    // Method 
    public void infoPejuang() {
        System.out.println("\nNama\t: " + nama);
        System.out.println("Kekuatan\t: " + kekuatan);
        System.out.println("Kesehatan\t: " + kesehatan);
        System.out.println("Usia Pejuang\t: " + hitungUsia());
    }

    public static void main(String[] args) {
        UsiaPejuang usiapejuang1 = new UsiaPejuang();
        usiapejuang1.setTahunLahir(1999);
        UsiaPejuang usiapejuang2 = new UsiaPejuang();
        usiapejuang2.setTahunLahir(2004);
        
        // Membuat objek pejuang
        Pejuang pejuang1 = new Pejuang();
        pejuang1.setNama("Bambang");
        pejuang1.setKekuatan(50);
        pejuang1.setKesehatan(100);
        pejuang1.setUsia(usiapejuang1);
        
    
        Pejuang pejuang2 = new Pejuang();
        pejuang2.setNama("Joko");
        pejuang2.setKekuatan(30);
        pejuang2.setKesehatan(100);
        // pejuang2.setUsia(usiapejuang2);
    
        // Menampilkan info pejuang
        pejuang1.infoPejuang();
        pejuang2.infoPejuang();
        
    
        // Memanggil method serang
        pejuang1.serang(pejuang2);
        pejuang2.periksaKesehatan();
    
        // Memanggil method latihan
        pejuang2.latihan();
    
        // Memanggil method istirahat
        pejuang1.istirahat();
    
        // Memanggil method serang
        pejuang2.serang(pejuang1);
        pejuang1.periksaKesehatan();
        pejuang2.periksaKesehatan();
    
        // Menampilkan info pejuang
        pejuang1.infoPejuang();
        pejuang2.infoPejuang();
    }
}    