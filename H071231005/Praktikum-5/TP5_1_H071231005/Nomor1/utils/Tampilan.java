package Nomor1.utils;

public class Tampilan {


    public static void DispalyInfo(){
        System.out.println("===== BANGUN RUANG =====");
        System.out.println("1. KUBUS \n2. BALOK \n3. BOLA \n4. TABUNG");
        System.out.println("");

        System.out.println("===== BANGUN DATAR =====");
        System.out.println("5. PERSEGI \n6. PERSEGI PANJANG \n7. LINGKARAN \n8. TRAPESIUM");
        System.out.println("");

        System.out.println("=".repeat(20));
        System.out.println("===== TIPE BANGUN RUANGAN =====");
        System.out.println("1. Bangun Ruang \n2. Bangun Datar");
        System.out.println("Pilih tipe bangunan");
        System.out.print("> ");
    }

    public static void HBD(){
        System.out.println("=".repeat(20));
        System.out.println("1. Luas \n2. Keliling");
        System.out.println("Mau hitung apa?");
        System.out.print("> ");
    }

    public static void HBR(){
        System.out.println("=".repeat(20));
        System.out.println("1. Luas permukaan \n2. Volume");
        System.out.println("Mau hitung apa?");
        System.out.print("> ");
    }
}
