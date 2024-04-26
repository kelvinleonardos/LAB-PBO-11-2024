package LAB_PBO_2024.Praktikum.Praktikum_02;

class Cuboid{
//Atribute
double height;
double widht;
double length;

//Method rumus volume
double getVolume() {
    return length * widht * height;
 }
}
   
public class Nomor3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.length = 50;
        cuboid.widht = 30;
        cuboid.height = 3;
        System.out.printf("Volume = %.2f\n", cuboid.getVolume());
    }
}

