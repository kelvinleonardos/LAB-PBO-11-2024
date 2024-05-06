public class SiberianHusky extends Dog {
    public SiberianHusky(int posision, int averageLength){
        super(posision, averageLength);
    }
    public void move(){
        this.posision += 2;
    }
    public void descibe(){
        System.out.println("\n1.Siberian Husky memiliki tubuh yang atletis dan kuat, dengan bulu yang tebal dan padat untuk melindungi dari cuaca dingin.");
        System.out.println("\n2.Siberian Husky adalah anjing berukuran sedang. Tinggi di bahu biasanya antara 50-60 cm, dan berat berkisar antara 20-27 kg, dengan jantan biasanya lebih besar daripada betina.");
        System.out.println("\n3.Siberian Husky sangat aktif dan membutuhkan banyak latihan dan rangsangan mental. ");
    }
}
