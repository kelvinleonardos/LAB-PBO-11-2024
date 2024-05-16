package utils;

public class Start {
    public static void Line(String line, int panjang) {
        System.out.println(line.repeat(panjang));
    }

    public static void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Error clearing the console");
        }
    }
}