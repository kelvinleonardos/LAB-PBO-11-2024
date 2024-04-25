package Nomor1.BangunDatar;

import java.util.Scanner;
import Nomor1.utils.Tampilan;

public class Trapesium extends BangunDatar {
    private double sisi3, sisi4;

    public double getSisi3() {
        return sisi3;
    }

    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }

    public double getSisi4() {
        return sisi4;
    }

    public void setSisi4(double sisi4) {
        this.sisi4 = sisi4;
    }

    public Trapesium(double sisi1AB, double sisi2BC, double sisi3CD, double sisi4DA){
        super.setPanjang(sisi1AB);
        super.setLebar(sisi2BC);
        this.setSisi3(sisi3CD);
        this.setSisi4(sisi4DA);
    }

    @Override
    double HitungLuas(){
        return(this.getPanjang() + this.getSisi3()) * this.getLebar() / 2;
    }

    @Override
    double HitungKeliling(){
        return this.getPanjang() + this.getLebar() + this.getSisi3() + this.getSisi4();
    }

    public static void runTrapesium(){
        Scanner ip = new Scanner(System.in);

        System.out.println("=== TRAPESIUM ===");
        System.out.println("Masukkan sisi 1 (AB)");
        System.out.print("> ");
        int Sisi1 = ip.nextInt();
        ip.nextLine();

        System.out.println("Masukkan sisi 2 (BC)");
        System.out.print("> ");
        int Sisi2 = ip.nextInt();
        ip.nextLine();

        System.out.println("Masukkan sisi 3 (CD)");
        System.out.print("> ");
        int Sisi3 = ip.nextInt();
        ip.nextLine();

        System.out.println("Masukkan sisi 4 (DA)");
        System.out.print("> ");
        int Sisi4 = ip.nextInt();
        ip.nextLine();

        Trapesium trapesium = new Trapesium(Sisi1, Sisi2, Sisi3, Sisi4);

        Tampilan.HBD();
        int Hitung = ip.nextInt();
        double result = 0;
        switch (Hitung){
            case 1:
                result = trapesium.HitungLuas();
                System.out.println("Luas trapesium = " + result);
                break;
            case 2:
                result = trapesium.HitungKeliling();
                System.out.println("Keliling trapesium = " + result);
                break;
            default:
                break;
        }

        ip.close();
    }
}
