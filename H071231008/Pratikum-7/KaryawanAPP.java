import java.util.Scanner;

import audio.Audio;
import karyawanAtt.*;
import utils.*;
import java.util.ArrayList;


public class KaryawanAPP {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

    // Method menampilkan Menu Utama
    private static void tampilkanMenu() {
        Start.Line("=", 50);
        System.out.println(" ".repeat(9) + "Aplikasi Manajemen Data Karyawan" + " ".repeat(9));
        Start.Line("=", 50);
        
        System.out.println("Data Karyawan:");
        System.out.println("a. Tambah Data Karyawan");
        System.out.println("b. Tampilkan Detail Karyawan");
        System.out.println("c. Keluar");
        Start.Line("=", 50);
    }

    private static void gajiSebelum(Karyawan karyawan) {
        double inGaji = Input.inputAngkaUser(sc, "Gaji Sebelumnya : ");
        karyawan.setGaji((inGaji + 1000000));
    }

    private static void checkKelulusan(Karyawan karyawan) {
        boolean kelulusan = false;
        if (karyawan.pendidikan.getTingkatPendidikan() > 2 && karyawan.projek.getBanyakProjek() > 4 && karyawan.getUmur() >= 18 && karyawan.getOrga() != null) {
            kelulusan = true;
        } 

        if (kelulusan) {
            Start.Line("=", 50);
            System.out.println(" ".repeat(14) + "SELAMAT ANDA DITERIMA" + " ".repeat(15));
            Start.Line("=", 50);
            Audio.playAudio("C:\\Users\\ASUS\\OneDrive\\Documents\\RavenlyRepo\\TP7\\src\\audio\\Congratulation.wav");
            daftarKaryawan.add(karyawan);
        } else {
            Start.Line("=", 50);
            System.out.println(" ".repeat(10) + "KARYAWAN TIDAK MEMENUHI SYARAT" + " ".repeat(10));
            Start.Line("=", 50);
            Audio.playAudio("C:\\Users\\ASUS\\OneDrive\\Documents\\RavenlyRepo\\TP7\\src\\audio\\FailedSound.wav");
        }
    }

    // Method Main (Run Terminal)
    public static void main(String[] args) {
        while (true) {
            Start.clear();
            tampilkanMenu();
            String inOpsi = Input.inputStringUser(sc, "Pilih opsi (a-c): ").toLowerCase();

            switch (inOpsi) {
                case "a":
                    Start.clear();
                    runTambahDataKaryawan();
                    break;
                case "b":
                    Start.clear();
                    runTampilkanDetailKaryawan();
                    break;
                case "c":
                    Start.Line("=", 50);
                    System.out.println(" Terima Kasih Telah Menggunakan Aplikasi Karyawan");
                    Start.Line("=", 50);
                    Audio.playAudio("C:\\Users\\ASUS\\OneDrive\\Documents\\RavenlyRepo\\TP7\\src\\audio\\Congratulation.wav");
                    System.exit(0);
                default:
                    Start.Line("=", 50);
                    Start.Line("~", 50);
                    System.out.println(" ".repeat(18) + "Invalid input" + " ".repeat(19));
                    Start.Line("~", 50);
                    Audio.playAudio("C:\\Users\\ASUS\\OneDrive\\Documents\\RavenlyRepo\\TP7\\src\\audio\\Akh.wav");
                    break;
            }
        }
    }

    // Method menjalankan opsi Tambah Data Karyawan
    private static void runTambahDataKaryawan() {
        Start.Line("-", 50);
        System.out.println(" ".repeat(15) + "Tambah Data Karyawan" + " ".repeat(15));
        Start.Line("-", 50);
        Karyawan karyawan = new Karyawan();

        String inNama = Input.inputStringUser(sc, "Masukkan Nama: ");
        karyawan.setNama(inNama);
        int inUmur = (int) Input.inputAngkaUser(sc, "Masukkan Umur: ");
        karyawan.setUmur(inUmur);

        karyawan.keluarga.checkStatus(sc);

        // Pengalaman
        System.out.println("Pengalaman sebelumnya: ");
        System.out.println("1. Freelancer \n2. Magang \n3. Pekerja tetap \n4. Tidak ada");
        int inPengalaman;
        
        do {
            inPengalaman = (int) Input.inputAngkaUser(sc, "Input : ");
            
            if (inPengalaman < 1 || inPengalaman > 4) {
                Start.Line("~", 50);
                System.out.println("Invalid Input: Silakan Input angka 1 hingga 4");
                Start.Line("~", 50);
            }
        } while (inPengalaman < 1 || inPengalaman > 4);

        switch (inPengalaman) {
            case 1:
                Pengalaman.freelancer(karyawan);
                gajiSebelum(karyawan);
                break;
            case 2:
                Pengalaman.magang(karyawan);
                gajiSebelum(karyawan);
                break;
            case 3:
                Pengalaman.pekerjaTetap(karyawan);
                gajiSebelum(karyawan);
                break;
            case 4:
                Pengalaman.tidakada(karyawan);
                break;
        }
        
        // Pendidikan
        String inPendidikan = Input.inputPendidikanUser(sc, "Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3) : ").toUpperCase();
        karyawan.pendidikan.masaPendidikan(inPendidikan);

        // Projek
        System.out.println("Projek IT :");
        System.out.println("1. Minimal 4 \n2. Minimal 8 \n3. Minimal 12 \n4. Lebih dari 15");
        int inProjek;

        do {
            inProjek = (int) Input.inputAngkaUser(sc, "Input : ");
            
            if (inProjek < 1 || inProjek > 4) {
                Start.Line("~", 50);
                System.out.println("Invalid Input: Silakan Input angka 1 hingga 4");
                Start.Line("~", 50);
            }
        } while (inProjek > 4);

        switch (inProjek) {
            case 1:
                karyawan.projek.setBanyakProjek(4);
                break;
            case 2:
                karyawan.projek.setBanyakProjek(8);
                break;
            case 3:
                karyawan.projek.setBanyakProjek(12);
                break;
            case 4:
                karyawan.projek.setBanyakProjek(15);
                break;
        }

        // organisasi
        System.out.println("Sejarah Berorganisasi: ");
        System.out.println("PILIHAN\n1.\tOsis\n2.\tMPK\n3.\tPramuka\n4.\tPencinta Hutan ");
        String orga = sc.nextLine();
        Organisasi satu = new Organisasi();
        switch (orga) {
            case "1":
                satu.setSejarahOrganisasi("OSIS");
                
                break;

            case "2":
            satu.setSejarahOrganisasi("MPK");
                
                break;
            
            
            
            case "3":
            satu.setSejarahOrganisasi("Pramuka");

                break;

            
            case "4":
            satu.setSejarahOrganisasi("Pencinta Hutan");

                break;
        
            default:
                break;
        }
        karyawan.setOrga(satu);


        System.out.print("Pangalaman sedang diproses");
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nPendidikan Terakhir : " + inPendidikan);
        System.out.println("Jumlah Projek IT : " + karyawan.projek.getBanyakProjek());

        checkKelulusan(karyawan);
    }

    // Method menjalankan opsi Tampilkan Data Karyawan
    private static void runTampilkanDetailKaryawan() {
        Start.Line("-", 50);
        System.out.println(" ".repeat(17) + "Detail Karyawan" + " ".repeat(18));
        Start.Line("-", 50);
        if (daftarKaryawan.isEmpty()) {
            Start.Line("~", 50);
            System.out.println(" ".repeat(8) + "Belum ada karyawan yang diundang" + " ".repeat(8));
            Start.Line("~", 50);
        } else {
            for (Karyawan karyawan : daftarKaryawan) {
                karyawan.displayInfo();
                System.out.println();
            }
            Start.Line("-", 50);
        }
    }
}
