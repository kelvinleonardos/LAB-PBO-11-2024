package TP9_H071231092;

import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class HomeScene {
    private Stage stage;
    private App app;

    public HomeScene(Stage stage, App app) {
        this.stage = stage;
        this.app = app;
    }

    public void show() {
        //nama
        Label namaLabel = new Label("Nama: ");
        namaLabel.setFont(Font.font("Tahoma"));
        TextField inputNama = new TextField();
        inputNama.setPrefWidth(200);
        HBox namaBox = new HBox(10, namaLabel, inputNama);
        namaBox.setAlignment(Pos.CENTER);

        //Umur
        Label umurLabel = new Label("Umur: ");
        umurLabel.setFont(Font.font("Tahoma"));
        TextField inputUmur = new TextField();
        inputUmur.setPrefWidth(200);
        HBox umurBox = new HBox(10, umurLabel, inputUmur);
        umurBox.setAlignment(Pos.CENTER);

        // Jenis Kelamin
        Label jenisKelaminLabel = new Label("Gender: ");
        jenisKelaminLabel.setPadding(new Insets(0, 30, 0,0));
        RadioButton lakiLakiButton = new RadioButton("Laki-Laki");
        RadioButton perempuanButton = new RadioButton("Perempuan");

        jenisKelaminLabel.setFont(Font.font("Tahoma"));
        lakiLakiButton.setFont(Font.font("Tahoma"));
        perempuanButton.setFont(Font.font("Tahoma"));

        ToggleGroup jenisKelaminGroup = new ToggleGroup();
        lakiLakiButton.setToggleGroup(jenisKelaminGroup);
        perempuanButton.setToggleGroup(jenisKelaminGroup);

        HBox jenisKelaminBox = new HBox(10, jenisKelaminLabel, lakiLakiButton, perempuanButton);
        jenisKelaminBox.setAlignment(Pos.CENTER);

        VBox jenisKelaminContainer = new VBox(10, jenisKelaminBox);
        jenisKelaminContainer.setAlignment(Pos.CENTER);

         //Tombol data
         Button btnData = new Button("Enter");
         btnData.setOnAction(e -> {
            this.app.setNama(inputNama.getText());
            this.app.setUmur(inputUmur.getText());
            // Memeriksa apakah RadioButton dipilih sebelum mencoba mendapatkan teksnya
            RadioButton selectedRadioButton = (RadioButton) jenisKelaminGroup.getSelectedToggle();
            if(selectedRadioButton != null) {
                this.app.setJenisKelamin(selectedRadioButton.getText());
            } else {
                this.app.setJenisKelamin(null); // Atau sesuaikan dengan nilai default yang diinginkan
            }
         });

         //Tombol Reset
         Button btnReset = new Button("Reset");
         btnReset.setOnAction(e -> {
            inputNama.clear();
            inputUmur.clear();
            jenisKelaminGroup.selectToggle(null); // Menghapus seleksi pada RadioButton
         });

        //Tombol ke Profile
        Button btnProfile = new Button("Detail Profile");
        btnProfile.setOnAction(e -> {
            ProfileScene profileScene = new ProfileScene(stage, app.getNama(), app.getUmur(), app.getJenisKelamin(), app);
            profileScene.show();
        });
        HBox buttonsBox = new HBox(40, btnData, btnReset, btnProfile);
        buttonsBox.setAlignment(Pos.CENTER);

        VBox layout = new VBox(20, namaBox, umurBox, jenisKelaminContainer, buttonsBox);
        layout.setAlignment(Pos.CENTER);

        // Mengubah warna latar belakang
        BackgroundFill backgroundFill = new BackgroundFill(Color.ORANGE, CornerRadii.EMPTY, Insets.EMPTY);
        layout.setBackground(new Background(backgroundFill));

        Scene scene = new Scene(layout, 400, 350);
        stage.setScene(scene);
        stage.show();
    }
}
