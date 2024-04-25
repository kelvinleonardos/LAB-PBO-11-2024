package Nomor1.utils;

import java.util.Scanner;

import Nomor1.BangunDatar.Lingkaran;
import Nomor1.BangunDatar.Persegi;
import Nomor1.BangunDatar.PersegiPanjang;
import Nomor1.BangunDatar.Trapesium;
import Nomor1.BangunRuang.Balok;
import Nomor1.BangunRuang.Bola;
import Nomor1.BangunRuang.Kubus;
import Nomor1.BangunRuang.Tabung;

public class Main {

    public static void main(String[] args) {
        runApp();   
    }

    static void runApp(){
        Scanner ip = new Scanner(System.in);
        Tampilan.DispalyInfo();
        int Tipe = ip.nextInt();
        ip.nextLine();
        switch (Tipe){
            case 1:
                runBangunRuang();
                break;
            case 2:
                runBangunDatar();
                break;
            default:
                System.out.println("Maaf, input data dengan benar");
                runApp();
                break;
        }

        ip.close();
    }

    static void runBangunRuang(){
        Scanner ip = new Scanner(System.in);

        System.out.println("=".repeat(20));
        System.out.print("Pilih bangunan (nomor) \n> ");
        int Bangunan = ip.nextInt();
        switch (Bangunan){
            case 1:
                Kubus.runKubus();
                break;
            case 2:
                Balok.runBalok();
                break;
            case 3:
                Bola.runBola();
                break;
            case 4:
                Tabung.runTabung();
                break;
            default:
                break;
        }

        ip.close();
    }

    static void runBangunDatar(){
        Scanner ip = new Scanner(System.in);

        System.out.println("=".repeat(20));
        System.out.print("Pilih bangunan (nomor) \n> ");
        int Bangunan = ip.nextInt();
        switch(Bangunan){
            case 5:
                Persegi.runPersegi();
                break;
            case 6:
                PersegiPanjang.runPersegiPanjang();
                break;
            case 7:
                Lingkaran.runLingkaran();
                break;
            case 8:
                Trapesium.runTrapesium();
                break;
            default:
                break;
        }

        ip.close();
    }
}

