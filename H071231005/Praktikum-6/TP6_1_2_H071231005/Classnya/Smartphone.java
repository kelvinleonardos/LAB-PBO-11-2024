class Smartphone implements Move {
    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move(){
        System.out.println("Handphone Berpindah");
    }
}
