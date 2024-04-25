public class UsiaPejuang {
    private int tahunLahir;

    public UsiaPejuang() {}

    public UsiaPejuang(int tahunLahir) {
        this.tahunLahir = 2000;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public int hitungUsia(int tahunSekarang) {
        return tahunSekarang - tahunLahir;
    }
}
