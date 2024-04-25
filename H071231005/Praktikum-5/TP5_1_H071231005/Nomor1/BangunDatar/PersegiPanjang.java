package Nomor1.BangunDatar;

import java.util.Scanner;

import Nomor1.utils.Tampilan;

public class PersegiPanjang extends BangunDatar {
    public PersegiPanjang(double panjang, double lebar){
    super.setPanjang(panjang);
    super.setLebar(lebar);
    }

    @Override
    double HitungLuas(){
        return this.getPanjang() * this.getLebar();

    }

    @Override
    double HitungKeliling(){
        return (2 * this.getPanjang()) + (2 * this.getLebar());
    }

    static void DispalyInfo(){
        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Masukkan panjang");
        System.out.print("> ");
    }

    public static void runPersegiPanjang(){
        Scanner ip = new Scanner(System.in);

        PersegiPanjang.DispalyInfo();
        int Panjang = ip.nextInt();
        ip.nextLine();

        System.out.println("Masukkan lebar");
        System.out.print("> ");
        int Lebar = ip.nextInt();
        ip.nextLine();
        PersegiPanjang persegiPanjang = new PersegiPanjang(Panjang, Lebar);

        Tampilan.HBD();
        int Hitung = ip.nextInt();
        double result = 0;
        switch (Hitung){
            case 1:
                result = persegiPanjang.HitungLuas();
                System.out.println("Luas persegi panjang = " + result);
                break;
            case 2:
                result = persegiPanjang.HitungKeliling();
                System.out.println("Keliling persegi panjang = " + result);
                break;
            default:
                break;
        }

        ip.close();
        }
}
