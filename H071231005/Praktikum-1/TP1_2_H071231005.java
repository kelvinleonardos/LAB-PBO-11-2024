import java.util.Scanner;

public class TP1_2_H071231005 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        boolean inputValid = false;

        while (!inputValid) {
            try {
                System.out.print("Masukkan Judul Film: ");
                String kata = ip.nextLine();
                kata = kata.toLowerCase();
                String[] pisah = kata.split(" ");
                for (int i = 0; i < pisah.length; i++) {
                    pisah[i] = Character.toUpperCase(pisah[i].charAt(0)) + pisah[i].substring(1);
                }
                String hasil = String.join(" ", pisah);
                System.out.println(hasil);
                inputValid = true; // Input valid, keluar dari loop
            } catch (Exception e) {
                System.out.println("Inputan tidak ada, masukkan ulang.");
            }
        }

        ip.close();
    }
}
