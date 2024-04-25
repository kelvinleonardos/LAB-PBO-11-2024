package Praktikum_2;

import java.util.Scanner;

class Cuboid{
    double height;
    double widht;
    double length;
    
    double getVolume(){
    //Lengkapi
        return height * widht * length;
    }
}
public class TP2_3_Kevin{
    public static void main(String[] args) {
         Scanner inputan = new Scanner(System.in);
         Cuboid balok = new Cuboid();
    //Lengkapi
         balok.height = inputan.nextDouble();
         balok.widht = inputan.nextDouble();
        balok.length = inputan.nextDouble();
        System.out.printf("Volume = %.2f", balok.getVolume());
        inputan.close();
    }
}