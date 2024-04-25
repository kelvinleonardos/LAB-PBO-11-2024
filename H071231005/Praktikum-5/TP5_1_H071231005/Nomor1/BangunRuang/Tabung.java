package Nomor1.BangunRuang;

import java.util.Scanner;

import Nomor1.utils.Tampilan;

public class Tabung extends BangunRuang {
    public Tabung(double jariJari, double tinggi){
        this.setJariJari(jariJari);
        this.setTinggi(tinggi);
    }

    @Override
    double HitungLuasPermukaan(){
        double luasAlas = Math.PI* (this.getJariJari() * this.getJariJari());
        double luasSelimut = 2 * Math.PI * this.getJariJari() * this.getTinggi();
        return 2 * luasAlas + luasSelimut;
    }

    @Override
    double HitungVolume(){
        return Math.PI * (this.getJariJari() * this.getJariJari()) * this.getTinggi();
    }

    static void DispalyInfo(){
        System.out.println("=== TABUNG ===");
        System.out.println("Masukkan jari-jari");
        System.out.print("> ");
    }

    public static void runTabung(){
        Scanner ip = new Scanner(System.in);

        Tabung.DispalyInfo();
        int JariJari = ip.nextInt();
        ip.nextLine();

        System.out.println("Masukkan tinggi");
        System.out.print("> ");
        int Tinggi = ip.nextInt();
        ip.nextLine();
        Tabung tabung = new Tabung(JariJari, Tinggi);

        Tampilan.HBR();
        int Hitung = ip.nextInt();
        double result = 0;
        switch (Hitung){
            case 1:
                result = tabung.HitungLuasPermukaan();
                System.out.println("Luas permukaan tabung = " + result);
                break;
            case 2:
                result = tabung.HitungVolume();
                System.out.println("Volume tabung = " + result);
                break;
            default:
            break;
        }

        ip.close();
    }
}
