package Nomor2.Handphone;

public class Smartphone extends Product{
    double screenSize;
    int storageCapacity;

    public Smartphone(String brand, int seriesNumber, double price) {
        super(brand, seriesNumber, price);
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Screen size : " + this.screenSize + " inches");
        System.out.println("Storage capacity : " + this.storageCapacity + "GB");
    }
    public void aSmartphone(){
        System.out.print("Masukkan ukuran layar (inci) : ");
        this.screenSize = ip.nextDouble();
        ip.nextLine();
        System.out.print("Masukkan kapasitas penyimpanan (GB) : ");
        this.storageCapacity = ip.nextInt();
        ip.nextLine();

        // sc.close();

    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
