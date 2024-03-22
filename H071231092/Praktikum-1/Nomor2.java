package LAB_PBO_2024.Tugas.Tugas_01;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        try {
            System.out.println("Masukkan Judul Film: ");
            input = scanner.nextLine();
            System.out.println(Title(input));
        } catch (Exception e) {
            System.out.println("Invalid Input");
        } finally {
            scanner.close();
        }
    }

    public static String Title(String input) {
        input = input.toLowerCase();
        char[] inputArray = input.toCharArray();

        for (int i = 0; i < inputArray.length; i++) {
            if (i == 0 || inputArray[i - 1] == ' ') {
                inputArray[i] = Character.toUpperCase(inputArray[i]);
            }
        }

        return new String(inputArray);
    }
}