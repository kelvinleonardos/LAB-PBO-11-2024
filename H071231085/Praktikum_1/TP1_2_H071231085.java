

import java.util.Scanner;

public class TP1_2_H071231085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan judul film:");
        String inputan  =scanner.nextLine();

        String outputan = ubahKapital(inputan);
        System.out.println(outputan);

        scanner.close();
    }

    public static String ubahKapital(String inputan){
        String[] kataKata = inputan.split(" ");
        StringBuilder hasil = new StringBuilder();
        // perulNGan
        for(String kata : kataKata){
            if(!kata.isEmpty()){
                String keKapital = kata.substring(0,1).toUpperCase()+kata.substring(1).toLowerCase();
                hasil.append(keKapital).append(" ");    
            }
        }
        return hasil.toString().trim();
    }   
}
