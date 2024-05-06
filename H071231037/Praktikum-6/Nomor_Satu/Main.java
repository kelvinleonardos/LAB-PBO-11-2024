package Nomor_Satu;
public class Main {
    public static void main(String[] args) {
        
        Pitbull pitbull = new Pitbull();
        SiberianHusky siberianHusky = new SiberianHusky();
        Bulldog bulldog = new Bulldog();
        GermanShepherd germanShepherd = new GermanShepherd();

        System.out.println("Pitbull:");
        pitbull.move();
        pitbull.move();
        pitbull.describe();
        System.out.println();

        System.out.println("Siberian Husky:");
        siberianHusky.move();
        siberianHusky.describe();
        System.out.println();

        System.out.println("Bulldog:");
        bulldog.move();
        bulldog.describe();
        System.out.println();

        System.out.println("German Shepherd:");
        germanShepherd.move();
        germanShepherd.describe();


      
    }
}
