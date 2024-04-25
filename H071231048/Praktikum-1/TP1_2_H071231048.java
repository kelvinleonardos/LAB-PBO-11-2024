import java.util.Scanner;

public class TP1_2_H071231048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Judul Film: ");
        String judulFilm = scanner.nextLine();
        judulFilm = judulFilm.toLowerCase();
        String hasil = MengubahKapital(judulFilm);
        System.out.println(hasil);
        scanner.close();
    }
    public static String MengubahKapital(String input){
        StringBuilder x = new StringBuilder(input.length());
        String[] kata = input.split(" ");
        
        for (String k : kata){
            if (k.length() > 0){
                x.append(Character.toUpperCase(k.charAt(0)))
                       .append(k.substring(1))
                       .append(" ");
                    }
                }
                return x.toString();
            }
        }
