
public class Main {
    public static void main(String[] args) {
        
        Pitbul pitbul = new Pitbul(3, 1);
        SiberianHusky siberianHusky = new SiberianHusky(7, 9);
        Bulldog bulldog = new Bulldog(6, 9);
        GermanShepherd germanShepherd = new GermanShepherd(8, 9);

        Smartphone smartphone = new Smartphone(100000, "Vivo");
        Car car = new Car(10, "Tosca/blue", 3000);

       garis();
       pitbul.move();
       pitbul.describe();
       garis();
       siberianHusky.move();
       siberianHusky.describe();
       garis();
       bulldog.move();
       bulldog.describe();
       garis();
       germanShepherd.move();
       germanShepherd.describe();
       garis();

       smartphone.move();
       garis();
       car.move();
       garis();
    }

    private static void garis() {
        System.out.println("=============================================================================================");
    }

    
}
