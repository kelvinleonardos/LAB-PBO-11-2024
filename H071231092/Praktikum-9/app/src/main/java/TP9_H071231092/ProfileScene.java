package TP9_H071231092;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ProfileScene {
    private Stage stage;
    private String nama;
    private String umur;
    private String jenisKelamin;
    private App app;

    ProfileScene(Stage stage, String nama, String umur, String jenisKelamin, App app) {
        this.stage = stage;
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.app = app;
    }

    public void show() {
        try {
            if ((nama == null || nama.trim().isEmpty()) && (umur == null || umur.trim().isEmpty()) && (jenisKelamin == null || jenisKelamin.trim().isEmpty())) {
                throw new Exception("Tolong mengisi data.");
            } else if ((nama == null || nama.trim().isEmpty()) || (umur == null || umur.trim().isEmpty()) || (jenisKelamin == null || jenisKelamin.trim().isEmpty())) {
                throw new Exception("Maaf, masih ada data yang kosong.");
            }
    
            // Label untuk Data Diri
            Label dataDiriLabel = new Label("Data Profile :");
            dataDiriLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
            dataDiriLabel.setAlignment(Pos.TOP_LEFT);
            dataDiriLabel.setPadding(new Insets(0, 40, 15, 0));

            // Display nama, umur, and Jenis Kelamin
            Label namaLabel = new Label("Nama   : " + nama);
            namaLabel.setAlignment(Pos.CENTER_LEFT);
            namaLabel.setPadding(new Insets(0, 40, 3, 0));
            Label umurLabel = new Label("Umur   : " + umur);
            umurLabel.setAlignment(Pos.CENTER_LEFT);
            umurLabel.setPadding(new Insets(0, 40, 3, 0));
            Label jenisKelaminLabel = new Label("Gender: " + jenisKelamin);
            jenisKelaminLabel.setAlignment(Pos.CENTER_LEFT);
            jenisKelaminLabel.setPadding(new Insets(0, 40, 50, 0));

            // Pengaturan tata letak untuk data diri, nama, umur, dan jenis kelamin
            VBox dataLayout = new VBox(10, dataDiriLabel, namaLabel, umurLabel, jenisKelaminLabel);
            dataLayout.setAlignment(Pos.CENTER_LEFT);
            dataLayout.setPadding(new Insets(10, 20, 10, 20));  // Padding kanan dan kiri
    
            //Tombol pulang
            Button btnHome = new Button("Back");
            btnHome.setPrefWidth(100);
            btnHome.setOnAction(v -> {
                HomeScene homeScene = new HomeScene(stage, app);
                homeScene.show();
            });

            VBox layout = new VBox(20, dataLayout, btnHome);
            layout.setAlignment(Pos.CENTER);
            layout.setPadding(new Insets(20));

            // Mengubah warna latar belakang
            if (jenisKelamin.equals("Perempuan")) {
                BackgroundFill backgroundFill = new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY);
                layout.setBackground(new Background(backgroundFill));
            } else {
                BackgroundFill backgroundFill = new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY);
                layout.setBackground(new Background(backgroundFill));
            }
            
    
            Scene scene = new Scene(layout, 400, 350);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            // Jika ada kesalahan, tampilkan pesan kesalahan di ProfileScene
            VBox errorLayout = new VBox(10);
            errorLayout.setAlignment(Pos.CENTER);
            errorLayout.setPadding(new Insets(20));
    
            Label errorMessage = new Label(e.getMessage());
            errorMessage.setFont(Font.font("Torama", FontWeight.BOLD, 20));
            Button btnBack = new Button("Back");
            btnBack.setOnAction(v -> {
                HomeScene homeScene = new HomeScene(stage, app);
                homeScene.show();
            });
    
            errorLayout.getChildren().addAll(errorMessage, btnBack);

            // Mengubah warna latar belakang
            BackgroundFill backgroundFill = new BackgroundFill(Color.ORANGE, CornerRadii.EMPTY, Insets.EMPTY);
            errorLayout.setBackground(new Background(backgroundFill));
    
            Scene errorScene = new Scene(errorLayout, 400, 350);
            stage.setScene(errorScene);
            stage.show();
        }
    }
}