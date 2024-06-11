import java.util.scanner;


 class Bangundatar {
    double luas;

    double keliling;

    void hitungluas(){
    }
    void hitungkeliling(){
    }
}
 class Bangunruang extends Bangundatar {
    double volume;

    void hitungvolume(){
    }
}
 class Persegi extends Bangundatar{
    double sisi;
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    
    void hitungluas(){
        luas = sisi * sisi;
        }
    void hitungkeliling(){
        keliling = 4 * sisi;
    }
}

class PersegiPanjang extends Bangundatar{
    double panjang,lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        }
    void hitungluas(){
        luas = panjang * lebar;
    }
    void hitungkeliling(){
        keliling = 2 * (panjang + lebar);
    }
}
class Lingkaran extends Bangundatar{
    double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }
    void hitungluas(){
        luas = 3.14 * jarijari * jarijari;
    }
    void hitungkeliling(){
        keliling = 2 * 3.14 * jarijari;
    }
}
class Trapesium extends Bangundatar{
    double sisi1,sisi2,sisi3,sisi4,tinggi;

    public Trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
        this.tinggi = tinggi;
    }
    void luas (){
        luas = (sisi1 + sisi2) * tinggi / 2;
    }
    void keliling(){
        keliling = sisi1 + sisi2 + sisi3 + sisi4;
    }
}
class kubus extends Bangunruang{
    double sisi ;

    public kubus(double sisi) {
        this.sisi = sisi;
    }
    void hitungvolume(){
        volume = sisi * sisi * sisi;
    }
    void hitungluaspermukaan(){
        luas = 6 * sisi * sisi;
    }
}
class balok extends Bangunruang{
    double panjang, lebar, tinggi;

    public balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    void hitungvolume(){
        volume = panjang * lebar * tinggi;
    }
    void hitungluaspermukaan(){
        luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
class tabung extends Bangunruang{
    double jari, tinggi;

    public tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
    void hitungvolume(){
        volume = 3.14 * jari * jari * tinggi;
    }
    void hitungluaspermukaan() {
        luas = 2 * 3.14 * jari * (jari + tinggi);
    }
}
class Bola extends Bangunruang{
    double jari;

    public Bola(double jari) {
        this.jari = jari;
    }
    void hitungvolume(){
        volume = 4/3 * 3.14 * jari * jari * jari;
    }
    void hitungluaspermukaan() {
        luas = 4 * 3.14 * jari * jari;
    }
}


    
