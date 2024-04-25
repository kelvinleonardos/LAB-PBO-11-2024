package Nomor2.Handphone;

public class Camera extends Product{
    int resolution;
    String lensType;

    public Camera(String brand, int seriesNumber, double price) {
        super(brand, seriesNumber, price);
    }
    // this merujuk ke atribut atau metod yang ada di keslanya sendiri
    // super biasanya di pake untuk masukan atribut di kelas atasnya, merujuk ke kelas atasnya (merujuk ke atribut atau kelas parent)

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Resolution : " + this.resolution  + "MP");
        System.out.println("Lens Type : " + this.lensType);
    }

    public void aCamera(){
        System.out.print("Masukkan Resolution Produk (MP) : ");
        this.resolution = ip.nextInt();
        ip.nextLine();
        System.out.print("Masukkan Type lensa : ");
        this.lensType = ip.nextLine();
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getLensType() {
        return lensType;
    }

    public void setLensType(String lensType) {
        this.lensType = lensType;
    }
}
