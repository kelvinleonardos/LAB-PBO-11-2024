public class Pendidikan extends Kehidupan {
    String tingkatPendidikan;

    public Pendidikan(String tingkatPendidikan){
        this.tingkatPendidikan = tingkatPendidikan;
    }
    public void pendidikanKaryawan(){
        System.out.println("Pendidikan Terakhir : " + tingkatPendidikan);
    }
    @Override
    public void prosesKehidupan(){
        System.out.println("Pernah Sekolah");
    }
    public String grtPendidikan(){
        return tingkatPendidikan;
    }
}
