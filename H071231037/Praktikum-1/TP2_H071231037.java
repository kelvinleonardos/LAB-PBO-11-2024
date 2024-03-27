import java.util.Scanner;
public class TP2_H071231037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Judul Film = ");
        String kalimat = scanner.nextLine();
        scanner.close();
            
        String[] arrKata = kalimat.split(" ");
            
        for (int i = 0; i < arrKata.length; i++) {
            arrKata[i] = KapHurufPertama(arrKata[i]);
        }
        String output = String.join(" ", arrKata);
        System.out.println("Hasil: " + output);
       
    }
    
    public static String KapHurufPertama(String kata) {
        if (kata == null ) {
            return kata;
        }else{
            return Character.toUpperCase(kata.charAt(0)) + kata.substring(1).toLowerCase();
        }
        
    }
}   