package Nomor_Dua;

public class Main {
    public static void main(String[] args) {
        Samsung s21 = new Samsung(512, 218, 1200000, "SD 999", "Samsung");
        s21.showInfo();
        s21.move();

        System.out.println(" ");

        Lamborghini avendatorars = new Lamborghini(1000000, "Carbon", 600, "Black");

        System.out.println(" ");
        avendatorars.move();
        avendatorars.showInfo();
    }
}
