public class Car implements Ithink {
    String colour;
    int totalForwardGear;
    int maxSpeed;

    public Car(String colour, int totalForwardGear, int maxSpeed){
        this.colour = colour;
        this.totalForwardGear = totalForwardGear;
        this.maxSpeed = maxSpeed;
    }
    public void move(){
        System.out.println("- Mobil sedang beraksrasi ");
        System.out.println("- Mobil " + this.colour + " memiliki forward gear sejumlah " + this.totalForwardGear + " memiliki top speed " + this.maxSpeed);
    }
}
