package Nomor1.BangunRuang;

import java.util.Scanner;

import Nomor1.utils.Tampilan;

public class Kubus extends BangunRuang {
    public Kubus(double sisi){
        this.setPanjang(sisi);
    }

    @Override
    double HitungLuasPermukaan(){
       return 6 * (this.getPanjang() * this.getPanjang());
    }

    @Override
    double HitungVolume(){
        return this.getPanjang() * this.getPanjang() * this.getPanjang();
    }

    static void DispalyInfo(){
        
        System.out.println("=== KUBUS ===");
        System.out.println("Masukkan Sisi");
        System.out.print("> ");
    }
    public static void runKubus(){
        Scanner ip = new Scanner(System.in);

        Kubus.DispalyInfo();
        double Sisi = ip.nextDouble();
        ip.nextLine();
        Kubus kubus = new Kubus(Sisi);

        Tampilan.HBR();
        int Hitung = ip.nextInt();
        double result = 0;
        switch (Hitung) {
            case 1:
                result = kubus.HitungLuasPermukaan();
                System.out.println("Luas permukaan Kubus = " + result);
                break;
            case 2:
                result = kubus.HitungVolume();
                System.out.println("Volume Kubus = " + result);
                break;
            default:
                break;
        }

        ip.close();
    }
}
