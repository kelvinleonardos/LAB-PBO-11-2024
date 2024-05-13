package Tugas_one;

import javax.sound.sampled.*;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Karyawan {
    Scanner scanner = new Scanner(System.in);
    Pengalaman pengalaman = new Pengalaman();
    Pendidikan pendidikan = new Pendidikan(); 
    Projek projek = new Projek();
    Keluarga keluarga = new Keluarga();
    ArrayList<String> yangStrings = new ArrayList<String>();

    ArrayList<Integer> yangIntegers = new ArrayList<Integer>();
    boolean syarat = false;
    
public static void playSound(String filename) {
    try {
        File file = new File(filename);
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        e.printStackTrace();
    }
}

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Main utama = new Main();
        utama.menuUtama();
        
    }

    void tambahKaryawan(){
        yangStrings.add(nama);
        yangStrings.add(jabatan);
        yangIntegers.add(umur);
        yangIntegers.add(gaji);
        yangStrings.add(keluarga.cekNikah);
    }
    
    void tampilkanDetailKaryawan(){
        int size = Math.min(yangStrings.size(), yangIntegers.size());
        if(yangIntegers.isEmpty()){
            System.out.println("============================================"); 
            System.out.println("Data kosong");
            System.out.println("============================================"); 
        }else if(yangStrings.isEmpty()){
            System.out.println("============================================"); 
            System.out.println("Data kosong");
            System.out.println("============================================"); 
        }
        
        for(int i = 0 ; i < size; i+= 2 ){
            System.out.println("============================================"); 
            System.out.println("Detail karyawan : ");
            System.out.println("Nama : " + yangStrings.get(i));
            System.out.println("Jabatan: " + yangStrings.get(i + 1)); 
            System.out.println("Umur: " + yangIntegers.get(i));
            System.out.println("Gaji: " + yangIntegers.get(i + 1));
            System.out.println("Status menikah : " + yangStrings.get(i + 2) );
            System.out.println("============================================");    
        }
    }
    



    
    void menuUtama() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        while (true) {
            System.out.println("Data Karyawan:");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String pilihan = scanner.nextLine(); 
    
            switch (pilihan) {
                case "a":
                case "A":
                case " a":
                case " A":
                    detailKaryawan(); 
                    
                    pengalaman.jumlahPekerjaanSebelumnya();
                    pengalaman.jumlahOrganisasi();
                    pendidikan.cekPendidikan();
                    projek.cekProjek(this); 
                    keluarga.cekMenikah();
                    tambahKaryawan(); 
                    break;
    
                case "b":
                case "B":
                case " b":
                case " B":
                    tampilkanDetailKaryawan();
                    break;
                    
                case "c":
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih opsi yang sesuai.");
            }
        }
    }
    
}