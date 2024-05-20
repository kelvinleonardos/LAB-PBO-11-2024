package Tugas_one;

import java.util.Scanner;

public class Projek extends Karyawan {
    Scanner scanner = new Scanner(System.in);
    String projek;

    void cekProjek(Main mainInstance) {
        System.out.println("Projek IT:");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih dari 15");
        System.out.print("Input:");
        projek = scanner.nextLine();

        if (projek.equals("1")) {
            System.out.println("Tidak memenuhi syarat.");
            System.exit(0);
            Main.playSound("Tugas_one/rejected.wav");
        } else {
            System.out.println("Memenuhi syarat.");
            System.out.print("Masukkan Gaji:");
            mainInstance.gaji = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan jabatan: ");
            mainInstance.jabatan = scanner.nextLine();

            
            Main.playSound("Tugas_one/congrats.wav");
        }
    }
}
