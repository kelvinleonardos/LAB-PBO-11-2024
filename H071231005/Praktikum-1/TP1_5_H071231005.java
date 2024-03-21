import java.util.Scanner;

class TP1_5_H071231005 {
    public static void main(String[] args) {
        int [][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner ip = new Scanner(System.in);
        try {
            System.out.print("Masukan Nilai yang akan di cari: ");
            int angka = ip.nextInt();
            String hasil = " ";
            boolean a = false;
            for ( int i = 0; i <nums.length; i++){
                for (int j = 0; j < nums[i].length; j++){
                    if (nums[i][j] == angka){
                        a = true;
                        hasil = String.format("Found %d at [%d][%d]",angka,i,j);
                        break;
      
                    }
                    System.out.println("ppp");
                }
                if (a) {
                    break;
                }
            }
            ip.close();
            System.out.print(hasil);

        } catch (Exception e) {
            System.out.println("Input Bukan Angka");

        }

    }


}
