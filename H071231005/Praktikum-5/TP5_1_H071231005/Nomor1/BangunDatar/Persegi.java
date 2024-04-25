package Nomor1.BangunDatar;

import java.util.Scanner;

import Nomor1.utils.Tampilan;

public class Persegi extends BangunDatar {
    public Persegi(double sisi){
        super.setPanjang(sisi);
    }

    @Override
    double HitungLuas(){
        return this.getPanjang() * this.getPanjang();
    }

    @Override
    double HitungKeliling(){
        return 4 * this.getPanjang();

    }

    static void DispalyInfo(){
        System.out.println("=== PERSEGI ===");
        System.out.println("Masukkan sisi");
        System.out.print("> ");
    }


    public static void runPersegi(){
        Scanner sc = new Scanner(System.in);
        Persegi.DispalyInfo();

        int inpSisi = sc.nextInt();
        sc.nextLine();
        Persegi persegi = new Persegi(inpSisi);

        Tampilan.HBD();
        int inpHitung = sc.nextInt();
        double result = 0;
        switch (inpHitung){
            case 1:
                result = persegi.HitungLuas();
                System.out.println("Luas persegi = " + result);
                break;
            case 2:
                result = persegi.HitungKeliling();
                System.out.println("Keliling persegi = " + result);
                break;
            default:
                break;
        }


        sc.close();
    }
}
