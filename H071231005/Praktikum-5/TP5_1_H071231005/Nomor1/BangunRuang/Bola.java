package Nomor1.BangunRuang;

import java.util.Scanner;

import Nomor1.utils.Tampilan;

public class Bola extends BangunRuang {
    public Bola(double jariJari){
        this.setJariJari(jariJari);
    }

    @Override
    double HitungLuasPermukaan(){
        return 4 * Math.PI * (this.getJariJari() * this.getJariJari());

    }

    @Override
    double HitungVolume(){
        return(4/3) * Math.PI * (this.getJariJari() * this.getJariJari() * this.getJariJari());
    }

    static void DispalyInfo(){
        System.out.println("=== BOLA ===");
        System.out.println("Masukkan jari-jari");
        System.out.print("> ");
    }

    public static void runBola(){
        Scanner ip = new Scanner(System.in);
        Bola.DispalyInfo();
        int JariJari = ip.nextInt();
        ip.nextLine();
        Bola bola = new Bola(JariJari);

        Tampilan.HBR();
        int Hitung = ip.nextInt();
        double result = 0;
        switch (Hitung){
            case 1:
                result = bola.HitungLuasPermukaan();
                System.out.println("Luas permukaan bola = " + result);
                break;
            case 2:
                result = bola.HitungVolume();
                System.out.println("Volume bola = " + result);
                break;
            default:
                break;
        }

        ip.close();

    }
}
