package prak1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HomeScene {
    final static String BisonFontPath = "C:\\Users\\ASUS\\OneDrive\\Documents\\Algoritma dan Pemograman 1\\LAB-PBO-11-2024\\H071231008\\Praktikum-8\\app\\src\\main\\resources\\Bison.ttf";
    final static String HelveticaFontPath = "C:\\Users\\ASUS\\OneDrive\\Documents\\Algoritma dan Pemograman 1\\LAB-PBO-11-2024\\H071231008\\Praktikum-8\\app\\src\\main\\resources\\HelveticaNormal.ttf";
    final static String HelveticaBoldFontPath = "C:\\Users\\ASUS\\OneDrive\\Documents\\Algoritma dan Pemograman 1\\LAB-PBO-11-2024\\H071231008\\Praktikum-8\\app\\src\\main\\resources\\HelveticaBold.ttf";
    static void ShowHomeScreen(Stage stage) throws FileNotFoundException {
        Group root = new Group();
        Scene scene1 = new Scene(root);
        Color mainColor = new Color(32.0 / 255.0, 26.0 / 255.0, 48.0 / 255.0, 1.0);
        scene1.setFill(mainColor);
        
        scene1.getStylesheets().add(HomeScene.class.getResource("/scenestyle.css").toExternalForm());
        
        //Load font

        Font HelveticaBoldFont = Font.loadFont(new FileInputStream(new File(HelveticaBoldFontPath)), 10);
        Font HelveticaNormalFont = Font.loadFont(new FileInputStream(new File(HelveticaFontPath)), 10);


        // Create a circle
        Circle circle = new Circle(550, 600, 300);
        circle.getStyleClass().add("custom-circle");
        root.getChildren().add(circle);

        // Create a rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.getStyleClass().add("custom-rectangle");
        rectangle.setWidth(250); 
        rectangle.setHeight(180);
        rectangle.setFill(Color.RED); 
        rectangle.setX(30);
        rectangle.setY(225);
        root.getChildren().add(rectangle);

        //title Text
        Text titleMainMenu = new Text("MainMenu");
        titleMainMenu.setFont(HelveticaBoldFont);
        titleMainMenu.getStyleClass().add("custom-text");
        titleMainMenu.setY(200);
        titleMainMenu.setX(40);
        root.getChildren().add(titleMainMenu);
        
                // Create a text object for the small text
                Text smallText = new Text("App By Andi Riswanda");
                smallText.setFont(Font.font("Helvetica", 10));
                smallText.setFill(Color.WHITE); 
                smallText.setLayoutX(44); 
                smallText.setLayoutY(217); 
                root.getChildren().add(smallText);
            

        //ToProfile Scene Button
        Button toProfileSceneBtn = new Button("Profile");
        toProfileSceneBtn.setFont(HelveticaNormalFont);
        toProfileSceneBtn.setLayoutX(50);
        toProfileSceneBtn.setLayoutY(250);
        toProfileSceneBtn.getStyleClass().add("custom-button");
        toProfileSceneBtn.setOnAction(event -> {
            AnimationUtils.switchSceneWithFadeTransition(stage, () -> {
                try {
                    ProfileScene.showProfileScene(stage);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            });
        });

        AnimationUtils.applyButtonAnimation(toProfileSceneBtn);
        root.getChildren().add(toProfileSceneBtn);
        
        //ToProfile Scene Button
        Button ExitButton = new Button("Exit App");
        ExitButton.setLayoutX(50);
        ExitButton.setLayoutY(320);
        ExitButton.getStyleClass().add("custom-button");
        ExitButton.setOnAction(event -> {
                stage.close();
        });
        root.getChildren().add(ExitButton);
        AnimationUtils.applyButtonAnimation(ExitButton);


        stage.setScene(scene1);
        stage.setTitle("Home Screen");
        stage.show();

    }
}
