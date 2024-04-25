class Alamat{
    String jalan;
    String kota;

    String getLokasi(){
        return jalan + ", " + kota;

    }
    public void setJalan(String jalan){
        this.jalan = jalan;
    }
    public void setKota(String kota){
        this.kota = kota;
    }
    public String getJalan(){
        return jalan;
    }
    public String getKota(){
        return kota;
    }
}
class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setAlamat(Alamat alamat){
        this.alamat = alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getAlamat(){
        return alamat.getLokasi();
    }
}

public class TP2_4_H071231005 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Nurul wahdania";
        mahasiswa.nim = "H071231005";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}