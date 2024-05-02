package LAB_PBO_2024.Praktikum.Praktikum_06;

class GermanShepherd extends Dog {
    GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 2;
        System.out.println("German Shepherd bergerak ke kanan menjadi posisi" + this.position);
    }

    @Override
    public void Describe() {
        System.out.println("Struktur tubuh yang agak memanjang, proporsional, berotot, dan memiliki struktur tulang yang solid.");
    }
}
