package LAB_PBO_2024.Tugas.Tugas_01;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = Double.parseDouble(scanner.nextLine());
            
            double luas = 3.14 * jariJari * jariJari;
            
            System.out.printf("Luas lingkaran adalah: %.2f\n", luas);
        } catch (NumberFormatException e) {
            System.out.println("Masukkan harus berupa angka!");
        }
        
        scanner.close();
    }
}

