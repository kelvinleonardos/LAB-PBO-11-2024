public class Smartphone implements Ithink {
    String brand;
    int price;

    public Smartphone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void move(){
        System.out.println("- Smartphone berpindah ");
        System.out.println("- Hp " + this.brand + " di jual dengan harga " + this.price);
    }
}

