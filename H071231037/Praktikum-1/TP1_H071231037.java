import java.util.Scanner;
public class TP1_H071231037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan = ");
        
        int counterDesimal = 0;
        int counterBulat = 0;
       
        try {
           
            int n = scanner.nextInt();
            System.out.print("Masukkan " + n + " Bilangan = ");
            for (int i = 0; i < n; i++) {
                
                float bilanganBulatDanDesimal = scanner.nextFloat();
                if (bilanganBulatDanDesimal >= 0.999999 && bilanganBulatDanDesimal <= 1.000001) {
                    counterDesimal++;
                }
                else if (bilanganBulatDanDesimal % 1 == 0) {
                    counterBulat++;
                }
                else{
                    counterDesimal++;
                }
            }
            
            
            System.out.println("Jumlah bilangan bulat yang ada = " + counterBulat);
            System.out.println("Jumlah bilangan desimal yang ada = " + counterDesimal);
        } catch (Exception e) {
            System.out.println("Input harus berupa bilangan.");
        } scanner.close();
    }
        
}

