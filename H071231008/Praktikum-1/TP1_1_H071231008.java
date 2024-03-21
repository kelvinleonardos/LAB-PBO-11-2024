import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Berapa banyak angka? : ");
            int repeat2 = scan.nextInt();
            scan.nextLine();
            
            if (repeat2 <= 0) {
                throw new IllegalArgumentException("Jumlah angka harus positif!");
            }


            System.out.println("Masukkan barisan angka: ");

            String[] userinput2 = new String[repeat2];

            userinput2 = scan.nextLine().split(" ");
            
                //Error Handling
            for (String input : userinput2) {
                if (!isNumeric(input)) {
                    throw new IllegalArgumentException ( input +" bukan angka!");
                }
            }
            if (userinput2.length != repeat2) {
                throw new IllegalArgumentException ("Jumlah angka yang dimasukkan tidak sesuai dengan jumlah yang diharapkan!");
            }


            HitungDecimmal1(userinput2, repeat2);



        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static void HitungDecimmal1(String[] userinput, int repeat) {
        int bulat = 0;
        int decimal = 0;

        for (int i = repeat - 1; i >= 0; i--) {
            if (userinput[i].contains(".")) {
                decimal++;
            } else {
                bulat++;
            }
        }

        System.out.println(decimal + " Bilangan Decimal\n" + bulat + " Bilangan Bulat");
    }
}
