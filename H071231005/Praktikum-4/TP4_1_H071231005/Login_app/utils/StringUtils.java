package Login_app.utils;

public class StringUtils {
    public static String bagi(String fullName) {
        String[] bagi = fullName.split(" ");
      
        if (bagi.length == 1){
            return fullName;
        }else {
            return bagi[1];
        }
    }
}

