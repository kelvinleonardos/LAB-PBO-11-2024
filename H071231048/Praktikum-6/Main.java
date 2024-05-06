public class Main{
    public static void main(String[] args) {
    Bulldog dog = new Bulldog(3, 61);

    System.out.println();

    Smartphone app = new Smartphone("Samsung", 5999);
    Car car = new Car ("black", 3, 350);

    System.out.println("\nBerikut deskripsi tentang Bulldog: ");
    dog.descibe();
    dog.move();
    dog.descibe();
    System.out.println();

    System.out.println("Berikut adalah deskripsi Smarphone");
    app.move();
    System.out.println();
    System.out.println("Berikut ada;ah deskripsi Car");
    car.move();



    }

}