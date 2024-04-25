import java.util.Scanner;

public class TP1_5_H071231048 {
    public static void main(String[] args) {
        try {
            int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan Angka Yang Mau di Cari : ");
            int angka = scanner.nextInt();
            scanner.close();
            boolean a = false;

            for (int i = 0; i <array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == angka) {
                        String output = String.format("found %d at [%d][%d]", angka, i, j);
                        System.out.println(output);
                        a = true;
                        break;
                    }
                }   
                if (a) {
                    break;
                }
            }
        }catch(Exception e){
            System.out.println("Coba Lagi");
        }
    }
    
}

