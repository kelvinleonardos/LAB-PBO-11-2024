import java.util.Scanner;;
public class TP4_H071231037 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan jari-jari lingkaran = ");
    

    try{
        double r = scanner.nextDouble();
        double luas =Math.PI*r*r;
        String hasil = String.format("%.2f", luas);
        System.out.println(hasil);
    }
    catch(Exception e){
        System.out.println("Input harus bilangan");

    
    }
    scanner.close();
}
}
