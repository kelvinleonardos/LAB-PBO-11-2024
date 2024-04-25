package login_app;

import login_app.models.*;
import login_app.utils.*;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
                break;
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.nextLine();
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.nextLine();
            

            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);

            // Jika passwordnya sama maka berhasil login
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");

                // Panggil method showDetailUser dan kirimkan data Profile User yang login
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                // saat password salah akan menampilkan password salah
                System.out.println("Password Salah");
            }
           

            
        }
    }
    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");
    
        // Input username
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
    
        
        if (username.isEmpty()) {
            System.out.println("Username tidak boleh kosong.");
            System.exit(0);; 
        }
        
        for (User user : listUser) {
            if (user.getUsername().equals(username)) {
                System.out.println("Username sudah digunakan. Silakan pilih username lain.");
                showRegisterMenu(); 
                return; 
            }
        }
    
        // Input password
        System.out.println("Password (minimal 8 characters)");
        System.out.print("> ");
        String password = sc.nextLine();

        
        if(password.isEmpty()){
        System.out.println("Password tidak boleh kosong.");
        System.exit(0);
        
    }
      
    
        // Validasi panjang password
        if (password.length() < 8) {
            System.out.println("Password harus memiliki minimal 8 karakter.");
            showRegisterMenu(); // Memanggil kembali menu utama
            return; // Menghentikan eksekusi metode ini
        }
    
        // Create a new user
        User newUser = new User(username, password);
        Profile profile = new Profile();
    
        // Input user profile data
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
    
        // Input umur dengan validasi untuk memastikan input adalah angka
        int age = 0;
        boolean validAgeInput = false;
        while (!validAgeInput) {
            System.out.println("Umur");
            System.out.print("> ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                sc.nextLine();
                validAgeInput = true;
            } else {
                System.out.println("Umur harus berupa angka.");
                sc.nextLine();
            }
        }
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
    
        // Set profile data
        profile.setFullName(fullName);
        profile.setHobby(hobby);
        profile.setAge(age);
        profile.setNickname(StringUtils.nickName(fullName));
    
        // Add the user and profile to the lists
        listUser.add(newUser);
        listUserProfile.add(profile);
    
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }
    
        
    
    

    

    
    

    private static void showDetailUser(Profile profile) {
        /*
         * Tampilkan semua data profile user yang login
         */
        System.out.println("SELAMAT DATANG!!!!");
        System.out.println("============================================");
        System.out.println("Nama lengkap : " + profile.getFullName());
        System.out.println("Umur         : " + profile.getAge());
        System.out.println("Hobby        : " + profile.getHobby());
        System.out.println("Nickname     : " + profile.getNickname());
        System.out.println("============================================");
    }
}
