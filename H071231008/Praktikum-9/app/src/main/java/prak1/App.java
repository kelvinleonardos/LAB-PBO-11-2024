package prak1;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage PrimaryStage) throws MalformedURLException, FileNotFoundException {
        Image icon = new Image(new File
        ("C:\\Users\\ASUS\\OneDrive\\Documents\\Algoritma dan Pemograman 1\\LAB-PBO-11-2024\\H071231008\\Praktikum-8\\app\\src\\main\\resources\\Artboard 158.png")
        .toURI().toURL().toExternalForm());
        //add icon
        PrimaryStage.getIcons().add(icon);
        //set size
        
        PrimaryStage.setHeight(600);
        PrimaryStage.setWidth(500);
        PrimaryStage.setResizable(false);;

        HomeScene.ShowHomeScreen(PrimaryStage);
    }

}