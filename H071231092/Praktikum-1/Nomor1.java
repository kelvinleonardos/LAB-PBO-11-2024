package LAB_PBO_2024.Tugas.Tugas_01;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        try {
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Masukkan bilangan bulat positif untuk jumlah input.");
                return;
            }

            String[] angka = new String[n];

            for (int i = 0; i < n; i++) {
                angka[i] = scanner.next();
            }

            int[] menghitung = menghitungDecimalInterger(angka);

            System.out.println(menghitung[0] + " Bilangan Desimal");
            System.out.println(menghitung[1] + " Bilangan Bulat");
        } catch (Exception e) {
            System.out.println("Invalid input. Tolong input angka.");
        } finally {
            scanner.close();
        }
    }

    public static int[] menghitungDecimalInterger(String[] angka) {
        int desimalHitung = 0;
        int integerHitung = 0;

        for (String numStr : angka) {
            if (numStr.endsWith(".0")) {
                desimalHitung++;
            } else {
                try {
                    double num = Double.parseDouble(numStr);
                    if (num % 1 == 0) {
                        integerHitung++;
                    } else {
                        desimalHitung++;
                    }
                } catch (NumberFormatException e) {
                    // Skip invalid numbers
                    continue;
                }
            }
        }

        return new int[]{desimalHitung, integerHitung};
    }
}