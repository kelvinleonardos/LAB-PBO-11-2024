package pratikum7.models;

import java.util.Scanner;

public abstract class Kehidupan extends Karyawan {
    Scanner sc = new Scanner(System.in);
    int nilaiPlus = 1;

    public Kehidupan(String name, int salary) {
        super(name, salary);
    }

    public Kehidupan() {
    }

    public abstract void prosesKehidupan();

    public int getNilaiPlus() {
        return nilaiPlus;
    }
}