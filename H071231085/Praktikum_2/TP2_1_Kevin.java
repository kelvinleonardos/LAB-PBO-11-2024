package Praktikum_2;
import java.util.Scanner;

public class TP2_1_Kevin {
    public static void main(String[] args) {
        Scanner inputan=new Scanner(System.in); //untuk ambil inputan
        Person person=new Person(); //untuk pakai class Person

        System.out.print("Nama: ");
        String nama=inputan.nextLine();
        person.setName(nama);
        System.out.print("Umur: ");
        int umur=inputan.nextInt();
        person.setAge(umur);
        System.out.print("Male?: ");
        boolean gender=inputan.nextBoolean();
        person.setGender(gender);


        System.out.println("\nNama: "+person.getName()); //getName() untuk mengembalikan nilai name dari class person
        System.out.println("Umur: "+person.getAge());
        System.out.println("Male?: "+person.getGender());
        inputan.close();
    }
}