import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

class Product {
    String merek;
    int nomorseri;
    double harga;

    public Product(String merek, int nomorseri, double harga) {
        this.merek = merek;
        this.nomorseri = nomorseri;
        this.harga = harga;
    }

    public void show_detail() {
        System.out.println("----------- Detail " + merek + " -----------");
        System.out.println("----------------------");
        System.out.println("Merek: " + merek);
        System.out.println("----------------------");
        System.out.println("Nomor Seri: " + nomorseri);
        System.out.println("----------------------");
        System.out.println("Harga: " + harga);
        System.out.println("----------------------");
    }
}


class Smartphone extends Product {
    double screensize;
    int storagecapacity;

    public Smartphone(String merek, int nomorseri, double harga, double screensize, int storagecapacity) {
        super(merek, nomorseri, harga);
        this.screensize = screensize;
        this.storagecapacity = storagecapacity;
    }

    @Override
    public void show_detail() {
        super.show_detail();
        System.out.println("Ukuran Layar: " + screensize + " inch");
        System.out.println("----------------------");
        System.out.println("Kapasitas Penyimpanan: " + storagecapacity + " GB");
        System.out.println("----------------------");
        System.out.println("\n");
    }
}


class Camera extends Product {
    int resolution;
    String lensType;

    public Camera(String merek, int nomorseri, double harga, int resolution, String lensType) {
        super(merek, nomorseri, harga);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    @Override
    public void show_detail() {
        super.show_detail();
        System.out.println("Resolusi: " + resolution + " MP");
        System.out.println("----------------------");
        System.out.println("Jenis Lensa: " + lensType);
        System.out.println("----------------------");
        System.out.println("\n");
    }
}


class Laptop extends Product {
    int ramSize;
    String prosesorType;

    public Laptop(String merek, int nomorseri, double harga, int ramSize, String prosesorType) {
        super(merek, nomorseri, harga);
        this.ramSize = ramSize;
        this.prosesorType = prosesorType;
    }

    @Override
    public void show_detail() {
        super.show_detail();
        System.out.println("Ukuran RAM: " + ramSize + " GB");
        System.out.println("----------------------");
        System.out.println("Jenis Prosesor: " + prosesorType);
        System.out.println("----------------------");
        System.out.println("\n");
    }
}



public class Soal2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> productslist = new ArrayList<>();
        while(true){
            System.out.println("-----------MENU-----------");
            System.out.println("1. Tambah produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.println("--------------------------");
            System.out.print("> ");
            String userinput;;   

            userinput = scan.nextLine();
            
            switch (userinput) {
                case "1":
                    String Nama;
                    int nomorseri;
                    double harga;
                    


                    try {
                        System.out.println("-----------Tambah produk-----------");
                        System.out.print("Masukan nama produk: ");
                        Nama = scan.nextLine();
                        if (Nama.isEmpty()) {
                            System.out.println("Nama produk tidak boleh kosong!");
                            continue;
                        }
                        System.out.print("Masukan nomorseri produk: ");
                        nomorseri = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Masukan harga produk: ");
                        harga = scan.nextDouble();
                        scan.nextLine();
                        System.out.println("-----------Masukan tipe produk-----------");
                        System.out.println("1.Smartphone");
                        System.out.println("2.Leptop");
                        System.out.println("3.Camera");
                        int tipeproduk = scan.nextInt();
                        scan.nextLine();


                        switch (tipeproduk) {
                            case 1:
                                System.out.print("Masukan Screen Size: ");
                                int screensize = scan.nextInt();
                                scan.nextLine();
                                System.out.print("Masukan Storage Capacity: ");
                                int capacity = scan.nextInt();
                                scan.nextLine();
                                    Smartphone phone = new Smartphone(Nama, nomorseri, harga, screensize, capacity);
                                    productslist.add(phone);
                                    break;
                            case 2:
                                System.out.print("Masukan Ram Capacity: ");
                                int ram = scan.nextInt();
                                scan.nextLine();
                                System.out.print("Masukan Procecor type: ");
                                String prosesorType = scan.nextLine();
                                    Laptop leptop = new Laptop(Nama, nomorseri, harga, ram, prosesorType);
                                    productslist.add(leptop);
                                    break;
                            case 3:
                                System.out.print("Masukan Resolusi camera: ");
                                int resolution = scan.nextInt();
                                scan.nextLine();
                                System.out.print("Masukan Lens type: ");
                                String lensType = scan.nextLine();
                                    Camera cam = new Camera(Nama, nomorseri, harga, resolution, lensType);
                                    productslist.add(cam);
                                    break;
                            default:
                                System.out.println("Invalid choice");
                                    break;
                        }

                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        break;
                    }
                    break;

                case "2" :
                    for (Product produk : productslist) {
                        produk.show_detail();
                    }
                    break;

                case "3":
                    System.out.print("Masukan nomor seri item yang ingin anda beli: ");
                    int userchoiceo = scan.nextInt();
                    scan.nextLine();
                    for (Product produk : productslist) {
                        if(produk.nomorseri == userchoiceo){
                            System.out.println("Anda telah membeli");
                            produk.show_detail();
                            break;
                        }
                    }


                break;
            case "4":
                System.out.println("Terima kasih sudah mengunkan program ini");
                System.exit(0);


                default:
                System.out.println("Invalid input");
                    continue;
            }

        }


    }
}