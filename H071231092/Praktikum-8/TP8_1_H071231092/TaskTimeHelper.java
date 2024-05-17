package TP8_1_H071231092;

import java.util.Random;

public class TaskTimeHelper {
    public static int getWaktuEksekusi() {
        Random angkaRandom = new Random();
        int angka = angkaRandom.nextInt(6) + 1;
        return angka;
    }
}