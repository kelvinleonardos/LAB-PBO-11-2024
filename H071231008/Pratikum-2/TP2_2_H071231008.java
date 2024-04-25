import java.util.Scanner;

class Product {

    private int id;
    private String name;
    private int stock;
    private double price;

    public Product(int id, String name, int stock, double price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailableInStock() {
        return stock > 0;
    }

    public void sell(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            System.out.println("\n\n======================================================");
            System.out.println("\t\t" + quantity + " buah " + name + " terjual.");
            System.out.println("======================================================\n\n");
        } else if (quantity > stock) {
            System.out.println("Stok " + name + " tidak mencukupi.");
        } else {
            System.out.println("Jumlah tidak valid.");
        }
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
            System.out.println(quantity + " buah " + name + " ditambah ke stok.");
        } else {
            System.out.println("Jumlah tidak valid.");
        }
    }
}

public class soal2 {
    public static void main(String[] args) {
        // Initialize products
        Product product1 = new Product(101, "Laptop", 10, 1200.50);
        Product product2 = new Product(102, "Smartphone", 20, 800.0);
        Product product3 = new Product(103, "HeadSet", 0, 600.0);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("======================================================");
            System.out.println("\nAvailable Products:");
            System.out.println("ID " + product1.getId() + " " + product1.getName() + " (Stock: " + product1.getStock() + ", Price: Rp" + product1.getPrice() + ")");
            System.out.println("ID " + product2.getId() + " " + product2.getName() + " (Stock: " + product2.getStock() + ", Price: Rp" + product2.getPrice() + ")");
            System.out.println("ID " + product3.getId() + " " + product3.getName() + " (Stock: " + product3.getStock() + ", Price: Rp" + product3.getPrice() + ")");
            System.out.println("\nMasukan ID Product Tujuan (0 untuk keluar dari program):\n");
            System.out.println("======================================================");
            try {
                int productId = scanner.nextInt();

        
            if (productId == 0) {
                System.out.println("Thank you for shopping!");
                break;
            }

            Product selectedProduct = null;
            int quantity = 0;

            if (productId == product1.getId()) {
                selectedProduct = product1;
            } else if (productId == product2.getId()) {
                selectedProduct = product2;
            } else {
                System.out.println("ID Invalid!");
                continue;
            }



            System.out.println("\n\n=============================");
            System.out.println("Jumlah Yang Ingin Anda Beli:");
            System.out.println("=============================\n\n");
            quantity = scanner.nextInt();
            
            if (quantity <= 0) {
                System.out.println("Jumlah tidak valid.");
                continue;
            }
            
            if (selectedProduct != null) {
                selectedProduct.sell(quantity);
            }

        } catch (Exception e) {
            System.out.println("Invalid input");
            return;
        }
        }
        

    }
}
