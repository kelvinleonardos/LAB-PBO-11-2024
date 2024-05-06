public abstract class Dog implements Move{
    int position, averageLength;

    public Dog(int position, int averageLength){
        this.position = position;
        this.averageLength = averageLength;
    }

    // public abstract void move();
    public abstract void describe();
}
class Pitbul extends Dog{
    public Pitbul(int position, int averageLength){
        super(position, averageLength);
    }
// ovverride penanda bahwa funsion itu sudah ada di kelas sebalumnya, di dalamnya belum ada apa-apa
    @Override
    public void move(){
        position += 3;
        System.out.println("Posisi Pitbul berpindah sejauh " + position + " langkah");
    }
    @Override
    public void describe(){
        System.out.println("Turunan dari bulldog, mukanya garang sekalii, besar galak lagi");
        

    }
}

class SiberianHusky extends Dog{
    public SiberianHusky(int position, int averageLength){
        super(position, averageLength);
    }

    @Override
    public void move(){
        position += 2;
        System.out.println("Posisi Siber berpindah sejauh " + position + " langkah");
    }
    @Override
    public void describe(){
        System.out.println("wahh keren, berbulu tebal layaknya serigala");

    }
}

class Bulldog extends Dog{
    public Bulldog (int position, int averageLength){
        super(position, averageLength);
    }

    @Override
    public void move(){
        position += 1;
        System.out.println("Posisi Bulldog berpindah sejauh " + position + " langkah");

    }
    @Override
    public void describe(){
        System.out.println("Anjing tertua asalnya Inggris telinganya mwlwngkung bisa berat samoai 25kg(wah berat banget)");

    }

}

class GermanShepherd extends Dog{
    public GermanShepherd (int position, int averageLength){
        super(position, averageLength);
    }

    @Override
    public void move(){
        position += 3;
        System.out.println("Posisi germansphered berpindah sejauh " + position + " langkah");

    }
    @Override
    public void describe(){
        System.out.println("cerdas, setia dan memiliki insting untuk menjadi penjaga yang kuat");

    }
}


