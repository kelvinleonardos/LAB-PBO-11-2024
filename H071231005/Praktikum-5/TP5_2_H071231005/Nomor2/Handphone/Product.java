package Nomor2.Handphone;
import java.util.Scanner;
public class Product {
    String brand;
    int seriesNumber;
    double price;
    Scanner ip = new Scanner(System.in);
    
    public Product() {
    }

    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Brand : " + this.brand);
        System.out.println("Series Number : " + this.seriesNumber);
        System.out.println("Price : $" + this.price);
    }

    public void aProduct(){
        System.out.print("Masukkan Nama Produk : ");
        this.brand = ip.nextLine();
        System.out.print("Masukkan Nomor Seri : ");
        this.seriesNumber = ip.nextInt();
        ip.nextLine();
        System.out.print("Masukkan Harga : ");
        this.price = ip.nextDouble();
        ip.nextLine();
    }

    public Scanner getip() {
        return ip;
    }

    public void setip(Scanner ip) {
        this.ip = ip;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeriesNumber() {
        return this.seriesNumber;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
