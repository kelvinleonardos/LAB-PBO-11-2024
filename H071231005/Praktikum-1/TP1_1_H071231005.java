import java.util.Scanner;

public class TP1_1_H071231005 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int panjang = ip.nextInt();
        int bilanganBulat = 0;
        int bilanganDesimal = 0;

        try {
            for (int i = 0; i < panjang; i++) {
                String input = ip.next();
                double angka = Double.parseDouble(input);

                if (input.endsWith(".0")) {
                    bilanganDesimal++;
                } else if (angka % 1 == 0) {
                    bilanganBulat++;
                } else {
                    bilanganDesimal++;
                }
            }
        } catch (Exception e) {
            System.out.println("Input bukan angka.");
        }

        System.out.println(bilanganBulat + " Bilangan Bulat");
        System.out.println(bilanganDesimal + " Bilangan Desimal");
        ip.close();
    }
}

    

