public class Pitbull extends Dog {
    public Pitbull(int posision, int averageLength){
        super(posision, averageLength);
    }
    public void move(){
        this.posision += 3;
    }
    public void descibe(){
        System.out.println("describe 1");
        System.out.println("describe 2");
        System.out.println("Pitbull memiliki rata rata panjang badan " + this.posision);
    }
}
