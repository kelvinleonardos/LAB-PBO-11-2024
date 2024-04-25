import java.util.Scanner;

public class TP1_3_H071231048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;
        String data = "";

        while (!inputValid) {
            try {
                System.out.println("Masukkan tanggal:");
                data = scanner.nextLine();

                Integer.parseInt(data.substring(0, 2));
                Integer.parseInt(data.substring(3, 5));
                Integer.parseInt(data.substring(6));

                inputValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka. Silakan coba lagi.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
        mengubahTanggal(data);
    }

    private static void mengubahTanggal(String data) {
        String tanggal = data.substring(0, 2);
        String bulan = data.substring(3, 5);
        String tahun = data.substring(6);

        StringBuilder hasil = new StringBuilder();

        if (tanggal.charAt(0) != '0') {
            hasil.append(tanggal);
        } else {
            hasil.append(tanggal.charAt(1));
        }

        hasil.append(" ");

        switch (bulan) {
            case "01":
                hasil.append("Januari");
                break;
            case "02":
                hasil.append("Februari");
                break;
            case "03":
                hasil.append("Maret");
                break;
            case "04":
                hasil.append("April");
                break;
            case "05":
                hasil.append("Mei");
                break;
            case "06":
                hasil.append("Juni");
                break;
            case "07":
                hasil.append("Juli");
                break;
            case "08":
                hasil.append("Agustus");
                break;
            case "09":
                hasil.append("September");
                break;
            case "10":
                hasil.append("Oktober");
                break;
            case "11":
                hasil.append("November");
                break;
            case "12":
                hasil.append("Desember");
                break;
        }

        hasil.append(" ");

        int tahunInt = Integer.parseInt(tahun);
        if (tahunInt <= 24) {
            hasil.append("20").append(tahun);
        } else {
            hasil.append("19").append(tahun);
        }

        System.out.println(hasil.toString());
    }
}
