package Nomor1.BangunRuang;

import java.util.Scanner;

import Nomor1.utils.Tampilan;

public class Balok extends BangunRuang {
    public Balok( double panjang, double lebar, double tinggi) {
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
    }

    @Override
    double HitungLuasPermukaan(){
        return 2 * ((this.getPanjang() * this.getLebar()) + (this.getLebar() * (this.getTinggi()) + (this.getTinggi() * this.getPanjang())));
 
    }

    @Override
    double HitungVolume(){
        return this.getPanjang() * this.getLebar() * this.getTinggi();
        
    }

    static void DispalyInfo(){
        System.out.println("=== BALOK ===");
        System.out.println("Masukkan Panjang");
        System.out.print("> ");
    }

    public static void runBalok(){
        Scanner ip = new Scanner(System.in);

        Balok.DispalyInfo();
        int Panjang = ip.nextInt();
        ip.nextLine();

        System.out.println("Masukkan Lebar");
        System.out.print("> ");
        int Lebar = ip.nextInt();
        ip.nextLine();

        System.out.println("Masukkan Tinggi");
        System.out.print("> ");
        int Tinggi = ip.nextInt();
        ip.nextLine();

        Balok balok = new Balok(Panjang, Lebar, Tinggi);

        Tampilan.HBR();
        int Hitung = ip.nextInt();
        double result = 0;
        switch (Hitung){
            case 1:
                result = balok.HitungLuasPermukaan();
                System.out.println("Luas permukaan balok = " + result);
                break;
            case 2: 
                result = balok.HitungVolume();
                System.out.println("Volume balok = " + result);
                break;
            default:
                break;
        }

        ip.close();
    }
}
