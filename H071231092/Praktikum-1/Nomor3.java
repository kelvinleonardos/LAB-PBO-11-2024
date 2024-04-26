package LAB_PBO_2024.Tugas.Tugas_01;

import java.util.Scanner;
import java.util.HashMap;

public class Soal03 {
    
    public static String konversiTanggal(String inputString) {
        // Membagi string input berdasarkan tanda strip "-"
        String[] parts = inputString.split("-");
        String tanggal = parts[0];
        String bulan = parts[1];
        String tahun = parts[2];

        if (tahun.length() != 2 && tahun.length() != 4) {
            return "Format tahun tidak valid";
        }
        
        // Mengonversi tahun menjadi empat digit jika hanya dua digit
        if (tahun.length() == 2) {
            int intTahun = Integer.parseInt(tahun);
            if (intTahun >= 0 && intTahun <= 24) {
                tahun = "20" + tahun;
            } else {
                tahun = "19" + tahun;
            }
        }

        int intTahun = Integer.parseInt(tahun);
        // Memeriksa apakah tahun berada di rentang yang valid
        if (intTahun < 1900 || intTahun > 2024) {
            return "Tahun harus berada di antara 1990 dan 2024";
        }
        
        // Membuat dictionary untuk mapping nama bulan dari angka
        HashMap<String, String> bulanMap = new HashMap<>();
        bulanMap.put("01", "Januari");
        bulanMap.put("02", "Februari");
        bulanMap.put("03", "Maret");
        bulanMap.put("04", "April");
        bulanMap.put("05", "Mei");
        bulanMap.put("06", "Juni");
        bulanMap.put("07", "Juli");
        bulanMap.put("08", "Agustus");
        bulanMap.put("09", "September");
        bulanMap.put("10", "Oktober");
        bulanMap.put("11", "November");
        bulanMap.put("12", "Desember");
        
        // Mengubah bulan dari angka ke nama bulan menggunakan dictionary
        String bulanString = bulanMap.get(bulan);
        
        // Menghapus angka 0 di depan tanggal jika ada
        if (tanggal.startsWith("0")) {
            tanggal = tanggal.substring(1);
        }
        
        // Menghapus angka 0 di depan tahun jika ada
        if (tahun.startsWith("0")) {
            tahun = tahun.substring(1);
        }
        
        // Mengembalikan hasil konversi sebagai satu string
        return tanggal + " " + bulanString + " " + tahun;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("input: ");
            String input = scanner.nextLine();

            String output = konversiTanggal(input);

            System.out.println("output: ");
            System.out.print(output);
        } catch (Exception e) {
            System.out.println("Invalid Input");
        } finally {
            scanner.close();
        }
    }
}

