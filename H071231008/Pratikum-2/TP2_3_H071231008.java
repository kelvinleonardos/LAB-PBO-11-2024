class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        if (height <= 0 || width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Tinggi, lebar, dan panjang harus positif.");
        }
        return height * width * length;
    }
}

public class Soal3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 5;
        cuboid.width = 4;
        cuboid.length = 6;

        try {
            System.out.println(String.format("Volume = %.2f", cuboid.getVolume()));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

