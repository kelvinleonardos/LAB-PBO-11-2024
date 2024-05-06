public class Bulldog extends Dog {
    public Bulldog(int posision, int averageLength){
        super(posision, averageLength);
    }
    public void move(){
        this.posision += 1;
    }
    public void descibe(){
        System.out.println("\n1.Bulldog adalah jenis anjing berukuran sedang dengan tubuh yang kokoh dan berotot. ");
        System.out.println("2.Bulldog dikenal karena sifatnya yang ramah dan bersahabat. ");
        System.out.println("3.Bulldog cenderung sangat tenang dan bersahabat, tetapi mereka juga memiliki kecenderungan untuk menjadi protektif terhadap keluarga mereka.");
    }
}
