package LAB_PBO_2024.Praktikum.Praktikum_06;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(1000, "Samsung");
        smartphone.move();

        Car car = new Car(6,"Black",200);
        car.move();

        Pitbull pitbull = new Pitbull(0, 60);
        pitbull.move();
        pitbull.Describe();
    }
}
