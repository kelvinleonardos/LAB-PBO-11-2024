package LAB_PBO_2024.Praktikum.Praktikum_06;

public class Car implements Move {
    int totalFowardGear, maxSpeed;
    String color;

    Car(int totalFowardGear, String color, int maxSpeed) {
        this.totalFowardGear = totalFowardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}
