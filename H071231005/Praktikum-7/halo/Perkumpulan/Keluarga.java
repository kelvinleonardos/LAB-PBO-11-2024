package halo.Perkumpulan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Keluarga {
    String statuss;
    Scanner ip = new Scanner(System.in);

    public void status() {
        boolean valid = false;
        while (!valid) {
            try{
                System.out.print("Apakah sudah menikah? (y/t): ");
                String input = ip.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("y")){
                    this.statuss = "Sudah Menikah";
                    valid = true;
                }else if (input.equalsIgnoreCase("t")){
                    this.statuss = "Belum Menikah";
                    valid = true;
                }else{
                    System.out.println("Inputan hanya (y/t)");
                }
            }catch (InputMismatchException e) {
                System.out.println("Inputan tidak valid");
                ip.nextLine(); 
            }
        } 
    }
   
}
