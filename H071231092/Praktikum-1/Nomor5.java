package LAB_PBO_2024.Tugas.Tugas_01;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan satu bilangan: ");
            int bilangan = scanner.nextInt();

            boolean ditemukan = false;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == bilangan) {
                        System.out.printf("Found %d at [%d][%d]\n", bilangan, i, j);
                        ditemukan = true;
                        break;
                    }
                }
                if (ditemukan) break;
            }
            if (!ditemukan) System.out.println(bilangan + " tidak ditemukan dalam array.");
        } catch (Exception e) {
            System.out.println("Masukkan harus berupa angka!");
        } finally {
            scanner.close();
        }
    }
}

