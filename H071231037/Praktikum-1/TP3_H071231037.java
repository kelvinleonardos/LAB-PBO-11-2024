import java.util.Scanner;
public class TP3_H071231037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tanggal = ");
        String input = scanner.nextLine();
        String[] garis = input.split("-");
       
        String tanggal = garis[0];
        String bulan = garis[1];
        String tahun = garis[2];
        
        
        switch (bulan) {
            case "01":
            bulan = "Januari";
            break;
        case "02":
            bulan = "Februari";
            break;
        case "03":
            bulan = "Maret";
            break;
        case "04":
            bulan = "April";
            break;
        case "05":
            bulan = "Mei";
            break;
        case "06":
            bulan = "Juni";
            break;
        case "07":
            bulan = "Juli";
            break;
        case "08":
            bulan = "Agustus";
            break;
        case "09":
            bulan = "September";
            break;
        case "10":
            bulan = "Oktober";
            break;
        case "11":
            bulan = "November";
            break;
        case "12":
            bulan = "Desember";
            break;
            
        }
        
        
        
        int tahunInt = Integer.parseInt(tahun);
        if (tahunInt <= 25 ){
            tahun = "20" + tahun;
        } else {
            tahun = "19" + tahun;
        } 
        int tanggalInt = Integer.parseInt(tanggal);
        if (tanggalInt > 31){
            System.out.println("tanggal tidak valid");
            
        
        }else{
            System.out.println(tanggal + "-" + bulan + "-" + tahun);
        }
        
        scanner.close();
    
    }
}

