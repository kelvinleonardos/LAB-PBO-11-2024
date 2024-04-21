package login_app.utils;

public class StringUtils{

    public static String nickName(String fullName){
        
          String namaPanggilan[] = fullName.split(" ");

          if (namaPanggilan.length == 1){
               return fullName;
          }else{
               return namaPanggilan[1];
          }

     }

}