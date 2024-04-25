import java.util.Scanner;

public class TP1_4_H071231048 {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        try {
            // scanner = new Scanner(System.in); 
            double jarijari = scanner.nextDouble();
            double PI = 3.14; 
            double luas = PI * jarijari * jarijari; 
            System.out.printf("%.2f\n", luas); 
        } catch (Exception e) {
            System.out.println("Coba Lagi Masukkan Angka"); 
        } scanner.close();
    }
}

