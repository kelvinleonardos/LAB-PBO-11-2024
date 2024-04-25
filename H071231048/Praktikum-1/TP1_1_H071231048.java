import java.util.Scanner;

public class TP1_1_H071231048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilanganbulat = 0;
        int bilangandesimal = 0;

        String inputX = scanner.nextLine(); 

        try {
            
            int x = Integer.parseInt(inputX);

            for (int i = 0; i < x; i++) {
                if (scanner.hasNextInt()) {
                    scanner.nextInt();
                    bilanganbulat++;
                } else if (scanner.hasNextDouble()) {
                    scanner.nextDouble();
                    bilangandesimal++;
                } else {
                    System.out.println("Index ke-" + i + ": Input bukan angka");
                    scanner.next(); 
                }
            }
        } catch (NumberFormatException e) {
               
            System.out.println("Input awal bukan bilangan bulat: " + inputX);
        }

        System.out.println(bilanganbulat + " Bilangan Bulat");
        System.out.println(bilangandesimal + " Bilangan Desimal");
        scanner.close();
    }
}
