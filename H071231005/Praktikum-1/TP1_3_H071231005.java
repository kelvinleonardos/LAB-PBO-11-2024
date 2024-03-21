import java.util.Scanner;

public class TP1_3_H071231005 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String tanggal = ip.nextLine();
        String[] ps = tanggal.split("-");
        // Tentukan indeks dari ps
        int hari = Integer.parseInt(ps[0]);
        int bulan = Integer.parseInt(ps[1]);
        int tahun = Integer.parseInt(ps[2]);
        // int hari,bulan,tahun = Integer.parseInt(ps[0],ps[2],ps[3]);
        // Mengubah string bulan menjadi integer
        String oke = ""; 
        // System.out.println(bulan);
        
        if (bulan <= 12){
            switch (bulan) {
                case 1:
                    oke = "Januari";
                    break;
                case 2:
                    oke = "Februari";
                    break;
                case 3:
                    oke = "Maret";
                    break;
                case 4:
                    oke = "April";
                    break;
                case 5:
                    oke = "Mei";
                    break;
                case 6:
                    oke = "Juni";
                    break;
                case 7:
                    oke = "Juli";
                    break;
                case 8:
                    oke = "Agustus";
                    break;
                case 9:
                    oke = "September";
                    break;
                case 10:
                    oke = "Oktober";
                    break;
                case 11:
                    oke = "November";
                    break;
                case 12:
                    oke = "Desember";
                    break;

            }
                
        }else {
            System.out.println("Inputan Bulan Tidak Valid");
            return ;
        
        }
        
        
        if (tahun >= 40){
            System.out.println(hari + " " + oke  + " "  + (1900 + tahun));
        }else {
            System.out.println(hari + " " + oke  + " "  + (2000 + tahun));
        }
        ip.close();
        
        // System.out.println(hasil);


        // System.out.println("Nama bulan: " + hari + " " + oke  + " "  + tahun);
    }
}
