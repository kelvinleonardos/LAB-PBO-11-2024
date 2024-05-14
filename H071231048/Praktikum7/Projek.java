public class Projek extends Kehidupan{
    int jumlahProjek;

    public Projek(int jumlahProjek) {
        this.jumlahProjek = jumlahProjek;
    }
    @Override
    public void prosesKehidupan(){
        System.out.println("Pernah memiliki projek");
    }
    public void jumlahProjek() { 
        if (this.jumlahProjek == 1){
            System.out.println("Jumlah projek IT : 4");
        }else if (this.jumlahProjek == 2){
            System.out.println("Jumlah projek IT : 8");
        }else if (this.jumlahProjek == 3){
            System.out.println("Jumlah projek IT : 12");
        }else if (this.jumlahProjek == 4){
            System.out.println("Jumlah projek IT : 15");
        }else{   
        }
    }
    public int getJumlahProjek(){
        return this.jumlahProjek;
    }
}
