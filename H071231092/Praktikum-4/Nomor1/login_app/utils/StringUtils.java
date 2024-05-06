package login_app.utils;

public class StringUtils {
    public static String NamaPanggil(String fullNama) {
        String[] hitungKata = fullNama.split(" ");

        if (hitungKata.length == 1) {
            return fullNama;
        } else {
            return hitungKata[1];
        }
    }
}
