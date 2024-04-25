class Produk {
    String nama;
    int stok;
    int harga;
    int quantityInStock;

    
    void cekStok(int jumlahDibeli) {
        if (jumlahDibeli > stok) {
            System.out.println("/===============\\");
            System.out.println("   Stok habis");
            System.out.println("/===============\\");
            
        } else {
            System.out.println("/====================\\");
            System.out.println(" Stok masih tersedia");
            System.out.println("/====================\\");
            
        }
        quantityInStock = stok - jumlahDibeli;
        
    }
   
    void displayInfo(){
        
        if(quantityInStock < 0 ){
            System.out.println("Sisa stok setelah dibeli: 0");
        }else{
            System.out.println("/===================\\");
            System.out.println("Sisa stok setelah dibeli : " + quantityInStock);
            System.out.println("/===================\\");
        }
    }

    
    
    
   
}

public class TP2_H071231037 {
    public static void main(String[] args) {
        Produk produk1 = new Produk();
       
        produk1.nama = "Handphone";
        produk1.stok = 2;
        produk1.harga = 120;
        
        

        produk1.cekStok(1);
        produk1.displayInfo();
        
    }
}
