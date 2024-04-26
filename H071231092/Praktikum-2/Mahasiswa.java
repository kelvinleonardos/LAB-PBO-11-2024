package LAB_PBO_2024.Praktikum.Praktikum_02;

public class Mahasiswa {
    Alamat alamat;
    String nama;
    String nim;
    
    //Getter untuk nama
    public String getNama() {
        return nama;
    }

    //Getter untuk nim
    public String getNim() {
        return nim;
    }
    
    //Getter untuk alamat
    public String getAlamat() {
        return alamat.getJalan() + ", " + alamat.getKota();
    }
}
