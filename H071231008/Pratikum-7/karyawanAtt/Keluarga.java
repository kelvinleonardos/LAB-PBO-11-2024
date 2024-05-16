package karyawanAtt;

import java.util.Scanner;

import utils.Input;
import utils.Start;

public class Keluarga {
    String statusNikah;
    int banyakAnak;

    public void checkStatus(Scanner sc) {
        boolean valid = false;
        while (!valid) {
            String hubungan = Input.inputStringUser(sc, "Status (Nikah/Belum) : ");

            if (hubungan.equalsIgnoreCase("nikah")) {
                this.statusNikah = "Sudah Menikah";
                anak(sc);
                valid = true;
            } else if (hubungan.equalsIgnoreCase("belum")) {
                this.statusNikah = "Belum Menikah";
                valid = true;
            } else {
                Start.Line("~", 50);
                System.out.println(" ".repeat(5) + "Invalid Input: Silakan Input Nikah/Belum" + " ".repeat(5));
                Start.Line("~", 50);
            }
        }
    }

    public void anak(Scanner sc) {
        boolean valid1 = false;
        while (!valid1) {
            this.banyakAnak = (int) Input.inputAngkaUser(sc, "Jumlah Anak : ");
            valid1 = true;
        }
    }
}

