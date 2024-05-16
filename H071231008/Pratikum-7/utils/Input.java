package utils;


import java.util.Scanner;

import audio.Audio;


public class Input {
    // Erorr Handling Input String
    public static String inputStringUser(Scanner sc, String tanya) {
            String input;
            while (true) {
                System.out.print(tanya);
                input = sc.nextLine();

                if (input.trim().isEmpty()) {
                    Start.Line("~", 50);
                    System.out.println(" ".repeat(13) + "Input tidak boleh kosong" + " ".repeat(13));
                    Start.Line("~", 50);
                    Audio.playAudio("C:\\Users\\ASUS\\OneDrive\\Documents\\RavenlyRepo\\TP7\\src\\audio\\Akh.wav");
                } else {
                    if (input.matches(".*\\d.*")) {
                        Start.Line("~", 50);
                        System.out.println(" ".repeat(8) + "Input tidak boleh mengandung angka" + " ".repeat(8));
                        Start.Line("~", 50);
                        Audio.playAudio("C:\\Users\\ASUS\\OneDrive\\Documents\\RavenlyRepo\\TP7\\src\\audio\\Akh.wav");
                    } else {
                        break;
                    }
                }
            }
            return input;
    }

    // Erorr Handling Input Angka
    public static double inputAngkaUser(Scanner sc, String tanya) {
        double angka;
        while (true) {
            System.out.print(tanya);
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                Start.Line("~", 50);
                System.out.println(" ".repeat(13) + "Input tidak boleh kosong" + " ".repeat(13));
                Start.Line("~", 50);
                Audio.playAudio("C:\\Users\\ASUS\\OneDrive\\Documents\\RavenlyRepo\\TP7\\src\\audio\\Akh.wav");
            } else {
                try {
                    angka = Integer.parseInt(input);
                    if (angka <= 0) {
                        Start.Line("~", 50);
                        System.out.println(" ".repeat(3) + "Input Tidak Boleh Negatif ataupun Bernilai 0" + " ".repeat(3));
                        Start.Line("~", 50);
                        Audio.playAudio("C:\\Users\\ASUS\\OneDrive\\Documents\\RavenlyRepo\\TP7\\src\\audio\\Akh.wav");
                    }
                    else{
                        break;
                    }
                } catch (Exception e) {
                    Start.Line("~", 50);
                    System.out.println(" ".repeat(4) + "Terjadi error karena, Inputan harus angka" + " ".repeat(5));
                    Start.Line("~", 50);
                    Audio.playAudio("C:\\Users\\ASUS\\OneDrive\\Documents\\RavenlyRepo\\TP7\\src\\audio\\Akh.wav");
                }
            }
        }
        return angka;
    }

    public static String inputPendidikanUser(Scanner sc, String tanya) {
        String input;
        while (true) {
            System.out.print(tanya);
            input = sc.nextLine().toUpperCase();
            if (input.trim().isEmpty()) {
                Start.Line("~", 50);
                System.out.println(" ".repeat(13) + "Input tidak boleh kosong" + " ".repeat(13));
                Start.Line("~", 50);
                Audio.playAudio("C:\\Users\\ASUS\\OneDrive\\Documents\\RavenlyRepo\\TP7\\src\\audio\\Akh.wav");
            } else {
                if (!input.matches("SD|SMP|SMA|SMK|S1|S2|S3")) {
                    Start.Line("~", 50);
                    System.out.println(" ".repeat(3) + "Input tidak sesuai dengan pilihan pendidikan" + " ".repeat(3));
                    Start.Line("~", 50);
                    Audio.playAudio("C:\\Users\\ASUS\\OneDrive\\Documents\\RavenlyRepo\\TP7\\src\\audio\\Akh.wav");
                } else {
                    break;
                }
            }
        }
        return input;
    }
}

