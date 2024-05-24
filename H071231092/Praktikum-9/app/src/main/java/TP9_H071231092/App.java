package TP9_H071231092;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    private String nama;
    private String umur;
    private String jenisKelamin;

    @Override 
    public void start(Stage stage) {
        stage.setResizable(false);
        stage.setTitle("Data Diri");

        App app = new App();
        HomeScene iniScene = new HomeScene(stage, app);
        iniScene.show();
    }

    // Getter dan Setter untuk data nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk data umur
    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    // Getter dan Setter untuk data jenis kelamin
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public static void main(String[] args) {
        launch(args);
    }
}