import java.util.ArrayList;
import java.util.Scanner;

public class Produk {
    static String brand;
    static int seriesNumber;
    static double price;
    static ArrayList<Produk> produks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static Produk product1;

    static void displayInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Serial number : " + seriesNumber);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        showMenu();
    }

    static void showMenu() {
        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print(">>> Pilih menu (1-4) : ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahProduk();
                    break;
                case 2:
                    tampilkanProduk();
                    break;
                case 3:
                    beliProduk();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void tambahProduk() {
        System.out.print("Masukkan nama produk : ");
        scanner.nextLine();
        brand = scanner.nextLine();
        System.out.print("Masukkan nomor seri : ");
        seriesNumber = scanner.nextInt();
        System.out.print("Masukkan harga : ");
        price = scanner.nextDouble();

        System.out.println("Pilih tipe produk : ");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera ");
        System.out.print(">>> ");

        int tipeProduk = scanner.nextInt();

        switch (tipeProduk) {
            case 1:
                Smartphone smartphone = new Smartphone();
                System.out.print("Masukkan ukuran layar (inci) : ");
                smartphone.screenSize = scanner.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan (GB) : ");
                smartphone.storageCapacity = scanner.nextInt();
                produks.add(smartphone);
                break;

            case 2:
                Laptop laptop = new Laptop();
                System.out.print("Masukkan RAM : ");
                laptop.ramSize = scanner.nextInt();
                System.out.print("Masukkan prosesor : ");
                scanner.nextLine();
                laptop.processorType = scanner.nextLine();
                produks.add(laptop);
                break;

            case 3:
                Camera camera = new Camera();
                System.out.print("Masukkan resolusi layar : ");
                camera.resolution = scanner.nextInt();
                System.out.print("Masukkan tipe lensa : ");
                scanner.nextLine();
                camera.lensType = scanner.nextLine();
                produks.add(camera);
                break;
        }

        System.out.println("Produk berhasil ditambahkan.");
    }

    static void tampilkanProduk() {
        for (Produk produk : produks) {
            produk.displayInfo();
            if (produk instanceof Smartphone) {
                Smartphone smartphone = (Smartphone) produk;
                System.out.println("Screen Size: " + smartphone.screenSize);
                System.out.println("Storage Capacity: " + smartphone.storageCapacity);
            } else if (produk instanceof Laptop) {
                Laptop laptop = (Laptop) produk;
                System.out.println("RAM Size: " + laptop.ramSize);
                System.out.println("Processor Type: " + laptop.processorType);
            } else if (produk instanceof Camera) {
                Camera camera = (Camera) produk;
                System.out.println("Resolution: " + camera.resolution);
                System.out.println("Lens Type: " + camera.lensType);
            }
            System.out.println();
        }
    }

    public static boolean checkSerialNumber(int serialNumber) {
        for (Produk product : produks) {
            if (product.seriesNumber == serialNumber) {
                return true;
            }
        }
        return false;
    }

    static void beliProduk() {
        System.out.print("Masukkan nomor seri : ");
        int seriesNumber = scanner.nextInt();
        boolean pembelianBerhasil = checkSerialNumber(seriesNumber);
        if (pembelianBerhasil) {
            System.out.println("Anda telah berhasil membeli produk.");
        } else {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
    }
}

class Smartphone extends Produk {
    double screenSize;
    int storageCapacity;
}

class Camera extends Produk {
    int resolution;
    String lensType;
}

class Laptop extends Produk {
    int ramSize;
    String processorType;
}
