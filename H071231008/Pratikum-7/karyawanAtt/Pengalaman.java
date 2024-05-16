package karyawanAtt;


import java.util.Scanner;

public class Pengalaman extends Kehidupan{
    String jenisPekerjaan;

    @Override
    public void prosesKehidupan() {
        System.out.println("Pengalaman sedang diproses...");
    }

    public static void jenisPengalaman(Scanner sc) {
        System.out.println("Pengalaman Sebelunya:");
        System.out.println("1.Freelancer \n2. Magang \n3. Pekerja Tetap \n4.Tidak ada");
        
    }

    public static void freelancer(Karyawan user) {
        user.pengalaman.setJenisPekerjaan("Freelancer");
    }

    public static void magang(Karyawan user) {
        user.pengalaman.setJenisPekerjaan("Magang");
    }

    public static void pekerjaTetap(Karyawan user) {
        user.pengalaman.setJenisPekerjaan("Pekerja Tetap");
    }

    public static void tidakada(Karyawan user) {
        user.pengalaman.setJenisPekerjaan("Tidak Ada");
    }

    public String getJenisPekerjaan() {
        return jenisPekerjaan;
    }
    public void setJenisPekerjaan(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }
}

