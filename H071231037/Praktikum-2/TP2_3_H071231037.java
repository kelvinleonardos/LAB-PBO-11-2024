class Cuboid{
    double height;
    double width;
    double length;
    
    double getVolume(){
        double volume = length * width * height;
        return volume;
    }
}

public class TP3_H071231037 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.length = 12.0;
        cuboid.width = 12.0;
        cuboid.height = 12.0; 
        System.out.printf("Volume = %.2f%n", cuboid.getVolume());
    }
        


    }

