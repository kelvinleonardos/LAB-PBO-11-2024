package LAB_PBO_2024.Praktikum.Praktikum_05.Nomor2;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    private ArrayList<Product> products = new ArrayList<>();

    public void tambahProduk(Product product) {
        products.add(product);
    }

    public void tampilkanSemuaProduk() {
        if (products.isEmpty()) {
            System.out.println("Belum ada produk.");
        } else {
            for (Product product : products) {
                product.displayInfo();
                System.out.println();
            }
        }
    }

    public boolean beliProduk(int nomorSeri) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).nomorSeri == nomorSeri) {
                products.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main toko = new Main();

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print("\n>>> Pilih menu (1-4): ");
            try {
                pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan nama produk: ");
                        scanner.nextLine();
                        String merek = scanner.nextLine();
                        System.out.print("Masukkan nomor seri: ");
                        int nomorSeri = scanner.nextInt();
                        if (toko.checkSerialNumber(nomorSeri)) {
                            System.out.println("Nomor seri sudah ada.");
                            break;
                        }
                        System.out.print("Masukkan harga: ");
                        double harga = scanner.nextDouble();
                        System.out.println("Pilih tipe produk:");
                        System.out.println("1. Smartphone");
                        System.out.println("2. Laptop");
                        System.out.println("3. Kamera");
                        System.out.print("Tipe produk (1-3): ");
                        int tipeProduct = scanner.nextInt();
                        switch (tipeProduct) {
                            case 1:
                                System.out.print("Masukkan ukuran layar (inci): ");
                                double ukuranLayar = scanner.nextDouble();
                                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                                int kapasitasPenyimpanan = scanner.nextInt();
                                toko.tambahProduk(new Smartphone(merek, nomorSeri, harga, ukuranLayar, kapasitasPenyimpanan));
                                break;
                            case 2:
                                System.out.print("Masukkan ukuran RAM (GB): ");
                                int ukuranRam = scanner.nextInt();
                                System.out.print("Masukkan tipe prosesor: ");
                                scanner.nextLine();
                                String tipeProcessor = scanner.nextLine();
                                toko.tambahProduk(new Laptop(merek, nomorSeri, harga, ukuranRam, tipeProcessor));
                                break;
                            case 3:
                                System.out.print("Masukkan resolusi (MP): ");
                                int resolusi = scanner.nextInt();
                                System.out.print("Masukkan tipe lensa: ");
                                scanner.nextLine();
                                String tipeLensa = scanner.nextLine();
                                toko.tambahProduk(new Camera(merek, nomorSeri, harga, resolusi, tipeLensa));
                                break;
                            default:
                                System.out.println("Tipe produk tidak valid!");
                        }
                        break;
                    case 2:
                        System.out.println("Daftar Produk");
                        toko.tampilkanSemuaProduk();
                        break;
                    case 3:
                        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                        int beliSerial = scanner.nextInt();
                        if (toko.beliProduk(beliSerial)) {
                            System.out.println("Anda telah berhasil membeli produk.");
                        } else {
                            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
                        } 
                        break;
                    case 4:
                        System.out.println("Terima Kasih");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid! Silakan pilih lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Anda salah Input! Harap masukkan nomor.");
                scanner.next();
                pilihan = 0;
            }
        } while (pilihan != 4);

        scanner.close();
    }
    
    public boolean checkSerialNumber(int nomorSeri) {
        for (Product product : products) {
            if (product.nomorSeri == nomorSeri) {
                return true;
            }
        }
        return false;
    }
}
