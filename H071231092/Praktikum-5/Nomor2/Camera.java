package LAB_PBO_2024.Praktikum.Praktikum_05.Nomor2;

class Camera extends Product {
    private int resolusi;
    private String tipeLensa;

    public Camera(String merek, int seriesNumber, double price, int resolusi, String tipeLensa) {
        super(merek, seriesNumber, price);
        this.resolusi = resolusi;
        this.tipeLensa = tipeLensa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolusi: " + resolusi + "MP");
        System.out.println("Jenis Lensa: " + tipeLensa);
    }
}