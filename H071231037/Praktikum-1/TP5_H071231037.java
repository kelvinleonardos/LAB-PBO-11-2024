import java.util.Scanner;
public class TP5_H071231037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("Masukkan bilangan = ");

        try {
            int angka = scanner.nextInt();
            int i,j;
            boolean found = false;
            
            for ( i = 0; i < nums.length; i++) {
                System.out.println(nums[i].toString());
                for ( j = 0; j < nums.length; j++) {
                    System.out.println(nums[i][j]);
                    if (nums[i][j] == angka) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    System.out.println("Found " + angka + " at [" + i + "][" + j + "]");
                    break;
                }
            }

            if (!found) {
                System.out.println("Angka yang dicari tidak ditemukan.");
            }

        } catch (Exception e) {
            System.out.println("Input tidak valid.");
        } scanner.close();
    }
}
