import java.util.Scanner;

class TP1_4_H071231005 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double PI = 3.14;
        try {
            int jari = ip.nextInt();
            double hasil = PI * jari * jari; 
            System.out.printf("%.2f", hasil);
        } catch (Exception e) {
            System.out.println("Input bukan angka.");
            ip.close();
        
        }
    }
}