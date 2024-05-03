package Nomor_Satu;
abstract class Dog {
   int position;
   int averageLength;
   
   
   abstract void move();
   abstract void describe();
}

class Pitbull extends Dog {
    


    @Override
    public void move() {
        this.position += 3; 
        System.out.println("posisi: " + this.position);
        System.out.println("Pitbull bergerak 3 langkah ke kanan.");
    }

    @Override
    public void describe() {
        System.out.println("Besar, sangar, ngeri, gigi tajam dan panjang, berotot, agresif.");
    }
}

class SiberianHusky extends Dog {
  

  

    @Override
    public void move() {
        this.position += 2; 
        System.out.println("Siberian Husky bergerak 2 langkah ke kanan.");
    }

    @Override
    public void describe() {
        System.out.println("Mirip serigala, anggun, keren, pasif, energik, bulunya biasa berwarna hitam putih.");
    }
}

class Bulldog extends Dog {
    


    @Override
    public void move() {
        this.position += 1; 
        System.out.println("Bulldog bergerak 1 langkah ke kanan.");
    }

    @Override
    public void describe() {
        System.out.println("Pendek, wajahnya seperti banyak keriput, jelek, selalu berliur, wajahnya jelek.");
    }
}

class GermanShepherd extends Dog {
  
  

    @Override
    public void move() {
        this.position += 3; 
        System.out.println("German Shepherd bergerak 3 langkah ke kanan.");
    }

    @Override
    public void describe() {
        System.out.println("Cakep, gagah, berwibawa, biasanya berwarna cokelat dan corak hitam, sangat pintar, energik, loyal, tidak agresif.");
    }
}
