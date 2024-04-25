package Nomor1.BangunDatar;

import java.util.Scanner;
import Nomor1.utils.Tampilan;

public class Lingkaran extends BangunDatar {

    public Lingkaran(double jariJari){
        super.setJariJari(jariJari);
    }

    @Override
    double HitungLuas(){
        return Math.PI * this.getJariJari() * this.getJariJari();
    }

    @Override
    double HitungKeliling(){
        double diameter = this.getJariJari() * 2;
        double keliling = Math.PI * diameter;
        return keliling;
    }

    static void DispalyInfo(){
        System.out.println("=== LINGKARAN ===");
        System.out.println("Masukkan jari-jari");
        System.out.print("> ");
    }

    public static void runLingkaran(){
        Scanner ip = new Scanner(System.in);
        
        Lingkaran.DispalyInfo();
        int JariJari = ip.nextInt();
        ip.nextLine();
        Lingkaran lingkaran = new Lingkaran(JariJari);

        Tampilan.HBD();
        int Hitung = ip.nextInt();
        double result = 0;
        switch (Hitung){
            case 1:
                result = lingkaran.HitungLuas();
                System.out.println("Luas lingkaran = " + result);
                break;
            case 2:
                result = lingkaran.HitungKeliling();
                System.out.println("Keliling lingkaran = " + result);
                break;
            default:
                break;
        }

        ip.close();
    }
}
