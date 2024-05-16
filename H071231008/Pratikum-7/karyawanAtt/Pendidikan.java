package karyawanAtt;

public class Pendidikan {
    int tingkatPendidikan;

    public void masaPendidikan(String pendidikan) {
        switch (pendidikan) {
            case "SD":
                sekolahDasar();
                break;
            case "SMP":
                sekolahPertama();
                break;
            case "SMA":
                sekolahAtas();
                break;
            case "SMK":
                sekolahKejuruan();
                break;
            case "S1":
                strataSatu();
                break;
            case "S2":
                strataDua();
                break;
            case "S3":
                strataTiga();
                break;
            default:
                break;
        }
    }

    private int sekolahDasar() {
        setTingkatPendidikan(1);
        return getTingkatPendidikan();
    }

    private int sekolahPertama() {
        setTingkatPendidikan(2);
        return getTingkatPendidikan();
    }
    
    private int sekolahAtas() {
        setTingkatPendidikan(3);
        return getTingkatPendidikan();
    }

    private int sekolahKejuruan() {
        setTingkatPendidikan(4);
        return getTingkatPendidikan();
    }

    private int strataSatu() {
        setTingkatPendidikan(5);
        return getTingkatPendidikan();
    }
    
    private int strataDua() {
        setTingkatPendidikan(6);
        return getTingkatPendidikan();
    }
    
    private int strataTiga(){
        setTingkatPendidikan(7);
        return getTingkatPendidikan();
    }

    public int getTingkatPendidikan() {
        return tingkatPendidikan;
    }
    public void setTingkatPendidikan(int tingkatPendidikan) {
        this.tingkatPendidikan = tingkatPendidikan;
    }
}
