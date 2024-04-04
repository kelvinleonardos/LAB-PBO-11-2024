
     class Cuboid {
        double height;
        double width;
        double length;

        double getVolume() {
            return height * width * length;
        }
    }


class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 50;
        cuboid.width = 3;
        cuboid.length = 30;
        System.out.printf("Volume: %2.f", cuboid.getVolume()); 
    }
}