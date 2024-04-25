package Nomor2.Utils;

import Nomor2.Handphone.Camera;
import Nomor2.Handphone.Laptop;
import Nomor2.Handphone.Product;
import Nomor2.Handphone.Smartphone;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Product p = new Product();
        // Laptop l = new Laptop(null, 0, 0);

        // System.out.println(p instanceof Laptop);

        ArrayList<Product> listProduk = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean lanjut = true;

        do {
            Tampilan.menu();
            String menu = sc.nextLine();

            switch (menu) {
                case "1":
                    Product produk = new Product();
                    produk.aProduct();
                    Tampilan.pilihan();
                    String a = sc.nextLine();

                    switch (a) {
                        case "1":
                            Smartphone smartphone = new Smartphone(produk.getBrand(), produk.getSeriesNumber(),
                                    produk.getPrice());
                            smartphone.aSmartphone();
                            listProduk.add(smartphone);
                            break;
                        case "2":
                            Laptop laptop = new Laptop(produk.getBrand(), produk.getSeriesNumber(), produk.getPrice());
                            laptop.aLaptop();
                            listProduk.add(laptop);
                            break;
                        case "3":
                            Camera camera = new Camera(produk.getBrand(), produk.getSeriesNumber(), produk.getPrice());
                            camera.aCamera();
                            listProduk.add(camera);
                            break;
                        default:
                            break;
                    }
                    break;
                case "2":
                    for (int i = 0; i < listProduk.size(); i++) {
                        listProduk.get(i).displayInfo();
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.print("Masukkan nomor seri produk yang ingin di beli : ");
                    int series = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < listProduk.size(); i++) {
                        if (series == listProduk.get(i).getSeriesNumber()) {
                            System.out.println("Anda telah membeli produk : ");
                            listProduk.get(i).displayInfo();
                            listProduk.remove(i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Produk dengan nomor seri tersebut tidak ditemukan");
                    }
                    break;
                case "4":
                    lanjut = false;
                    System.out.println("Terimah kasih sudah berkunjung");
                    break;
                default:
                    break;
            }

        } while (lanjut);
        sc.close();
    }

}
