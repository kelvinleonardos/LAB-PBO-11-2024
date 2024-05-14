import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    public static ArrayList <Karyawan> daftarKaryawan = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static void main (String[] args){
        tampilanUtama();
    }
    public static void tampilanUtama () { 
        char pilihan;
        do{
            System.out.println("\nData Karyawan: ");
            System.out.println("a. Tambahkan Data Karyawan");
            System.out.println("b. Tampilkan detail karyawan: ");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            pilihan = input.next().charAt(0);

            switch (pilihan) {
                case 'a':
                    tambahDataKaryawan();
                    break;
                case 'b' :
                    tampilkanDataKaryawan();
                    break;
                case 'c' :
                    System.out.println("Terimah kasi");
                default :
                    System.out.println("Data tidak valid");
            }

        }while(pilihan != 'c');
    }

    public static void tambahDataKaryawan(){
        try{
            System.out.println("\nTambahkan Data Karyawan");
            System.out.print("Masukkan Nama : ");
            input.nextLine();
            String nama = input.nextLine();

            System.out.print("Masukkan Umur : ");
            int umur = input.nextInt();
            
            input.nextLine();
            System.out.println("Pengalaman Sebelumya : ");
            System.out.println("1. Freelancer");
            System.out.println("2. Magang");
            System.out.println("3. Pekerja Tetap");
            System.out.println("4. Tidak ada");
            System.out.print("Input : ");
            int Pengalaman = input.nextInt();
            input.nextLine();
            if ( Pengalaman == 4 ){
                System.out.println("Ketua OSIS");
            }else{
            }

            System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3) : ");
            String pendidikan = input.nextLine();

            System.out.println("Projek IT : ");
            System.out.println("1. Minimal 4");
            System.out.println("2. Minimal 8");
            System.out.println("3. Minimal 12");
            System.out.println("4. Minimal 15");
            System.out.print("Input : ");
            int projek = input.nextInt();
            input.nextLine();

            System.out.print("Status keluarga: ");
            String anak = input.nextLine();

            Karyawan karyawan = new Karyawan(nama, umur, anak);
            Pendidikan pendidikan1 = new Pendidikan(pendidikan);
            Pengalaman pengalaman1 = new Pengalaman(Pengalaman);
            Projek projek1 = new Projek(projek);

            if (pendidikan.equalsIgnoreCase("SD") || pendidikan.equalsIgnoreCase("SMP") || projek == 1 || umur < 18){
                System.out.println("Karyawan tidak memenuhi syarat");
                Audio.playAudioLose("wowsound.wav");
            }else{
                System.out.println("Pengalaman sedang diproses.......");
                pendidikan1.pendidikanKaryawan();
                projek1.jumlahProjek();
                System.out.println("===============================");
                System.out.println("Selamat, karyawan diterima!!!");
                System.out.println("===============================");
                daftarKaryawan.add(karyawan);
                Audio.playAudio("sorry.wav");
            }
        }catch (InputMismatchException e) {
            System.out.println("Input harus berupa integer");
            input.nextLine();
        }     
    }

    public static void tampilkanDataKaryawan(){
        if (daftarKaryawan.isEmpty()){ 
            System.out.println("Belum ada data karyawan");
            return;
        }

        for (Karyawan karyawan : daftarKaryawan){
            karyawan.display();
        }
    }
}




