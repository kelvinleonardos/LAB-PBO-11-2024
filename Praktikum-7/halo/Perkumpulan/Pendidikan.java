package halo.Perkumpulan;

public class Pendidikan extends Kehidupan{
    String pendidikan;

    public Pendidikan (String nama,int gaji,  String pendidikan){
        super(nama, gaji);
        this.pendidikan = pendidikan;
    }


    
    public void isipendidikan() {
        System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");

    }

    public Pendidikan(){

    }
    
    @Override
    public void prosesKehidupan() {
        if (pendidikan.equals("SD")) {
            System.out.println("Pendidikan Terakhir : SD");
        } else if (pendidikan.equals("SMP")) {
            System.out.println("Pendidikan Terakhir : SMP");
        } else if (pendidikan.equals("SMK")) {
            System.out.println("Pendidikan Terakhir : SMK");
        } else if (pendidikan.equals("SMA")) {
            System.out.println("Pendidikan Terakhir : SMA");
        } else if (pendidikan.equals("S1")) {
            System.out.println("Pendidikan Terakhir : S1");
        } else if (pendidikan.equals("S2")) {
            System.out.println("Pendidikan Terakhir : S2");
        } else if (pendidikan.equals("S2")) {
            System.out.println("Pendidikan Terakhir : S3");
        }
    }

    public void pendidikanKaryawan() {
        boolean hentikan = false;
        while (!hentikan) {
            try {
                boolean a = false;
                while (!a) {
                    isipendidikan();
                    this.pendidikan = ip.nextLine().toUpperCase();
                    if (pendidikan.equals("SD")){
                        this.nilai = 0;
                        hentikan = true;
                        a = true;
                    }else if (pendidikan.equals("SMP")) {
                        this.nilai = 0;
                        hentikan = true;
                        a = true;
                    } else if (pendidikan.equals("SMK")) {
                        this.nilai = 1;
                        hentikan = true;
                        a = true;
                    } else if (pendidikan.equals("SMA")) {
                        this.nilai = 1;
                        hentikan = true;
                        a = true;
                    } else if (pendidikan.equals("S1")) {
                        this.nilai = 1;
                        hentikan = true;
                        a = true;
                    } else if (pendidikan.equals("S2")) {
                        this.nilai = 1;
                        hentikan = true;
                        a = true;
                    } else if (pendidikan.equals("S3")) {
                        this.nilai = 1;
                        hentikan = true;
                        a = true;
                    } else {
                        System.out.println("Pilihan hanya (SD/SMP/SMA/SMK/S1/S2/S3)");
                    }   
                }
            } catch (Exception e) {
                System.out.println("Inputan Tidak Menerima Angka");
                ip.nextLine();
            }
        }
    }
}

