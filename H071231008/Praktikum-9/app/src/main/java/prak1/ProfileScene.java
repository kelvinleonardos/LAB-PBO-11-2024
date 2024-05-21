
package prak1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class ProfileScene {
    final static String HelveticaFontPath = "C:\\Users\\ASUS\\OneDrive\\Documents\\Algoritma dan Pemograman 1\\LAB-PBO-11-2024\\H071231008\\Praktikum-8\\app\\src\\main\\resources\\HelveticaBold.ttf";
    final static String BisonFontPath = "C:\\Users\\ASUS\\OneDrive\\Documents\\Algoritma dan Pemograman 1\\LAB-PBO-11-2024\\H071231008\\Praktikum-8\\app\\src\\main\\resources\\Bison.ttf";
    static void showProfileScene(Stage stage) throws FileNotFoundException {
        Group root = new Group();
        Scene scene1 = new Scene(root);
        Color mainColor = new Color(32.0 / 255.0, 26.0 / 255.0, 48.0 / 255.0, 1.0);
        scene1.setFill(mainColor);
        scene1.getStylesheets().add(HomeScene.class.getResource("/scenestyle.css").toExternalForm());

        //Load font
        Font BisonFont = Font.loadFont(new FileInputStream(new File(BisonFontPath)), 10);
        Font HelveticaNormalFont = Font.loadFont(new FileInputStream(new File(HelveticaFontPath)), 10);
        // Load image
        Image image = new Image(new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Documents\\Algoritma dan Pemograman 1\\LAB-PBO-11-2024\\H071231008\\Praktikum-8\\app\\src\\main\\resources\\KingTekken.jpg"));

        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        imageView.setX(130);
        imageView.setY(18);
    
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(10);
        dropShadow.setColor(Color.BLACK);
        imageView.setEffect(dropShadow);

        Circle clip = new Circle(100);
        clip.setLayoutX(80);
        clip.setCenterX(150);
        clip.setCenterY(120);
        imageView.setClip(clip);

        root.getChildren().add(imageView);


        //USER
        UserProfile user = new UserProfile();
        user.setName("Andi Riswanda");
        user.setHobby("Editing");
        user.setAge(19);
        user.setGender("Male");
        user.setJurusan("Sistem Informasi");
        user.setEmail("andiriswandalah@gmail.com");


        // rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.getStyleClass().add("custom-rectangle");
        rectangle.setWidth(360); 
        rectangle.setHeight(200);
        rectangle.setX(10);
        rectangle.setY(225+83-20-10);
        root.getChildren().add(rectangle);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.getStyleClass().add("custom-rectangle2");
        rectangle2.setWidth(260); 
        rectangle2.setHeight(35);
        rectangle2.setX(10);
        rectangle2.setY(168+88-15);
        root.getChildren().add(rectangle2);

// Use VBox for layout
        VBox vbox = new VBox();
        vbox.setSpacing(5); 
        vbox.setLayoutX(20);
        vbox.setLayoutY(260-20); 
        root.getChildren().add(vbox);

       

        // Title Text
        Text ProfileTitle = new Text(user.getName() +" Profile");
        ProfileTitle.setFont(BisonFont);
        ProfileTitle.getStyleClass().add("custom-text4");
        vbox.getChildren().add(ProfileTitle);

        Text nameHeader = new Text("Username: " + user.getName());
        nameHeader.setFont(HelveticaNormalFont);
        nameHeader.getStyleClass().add("custom-text3");
        vbox.getChildren().add(nameHeader);

        Text ageHeader = new Text("Age: " + user.getAge());
        ageHeader.getStyleClass().add("custom-text3");
        vbox.getChildren().add(ageHeader);

        Text genderHeader = new Text("Gender: " + user.getGender());
        genderHeader.getStyleClass().add("custom-text3");
        vbox.getChildren().add(genderHeader);

        Text emailHeader = new Text("Email: " + user.getEmail());
        emailHeader.getStyleClass().add("custom-text3");
        vbox.getChildren().add(emailHeader);

        Text jurusanHeader = new Text("Jurusan: " + user.getJurusan());
        jurusanHeader.getStyleClass().add("custom-text3");
        vbox.getChildren().add(jurusanHeader);

        Text hobbyHeader = new Text("Hobby: " + user.getHobby());
        hobbyHeader.getStyleClass().add("custom-text3");
        vbox.getChildren().add(hobbyHeader);

        // Back to Main Menu Button
        Button backButton = new Button("Back to Main Menu");
        backButton.setFont(BisonFont);
        backButton.setLayoutX(150);
        backButton.setLayoutY(500);
        backButton.getStyleClass().add("custom-button2");
        AnimationUtils.applyButtonAnimation(backButton);
        backButton.setOnAction(event -> {
            AnimationUtils.switchSceneWithFadeTransition(stage, () -> {
                try {
                    HomeScene.ShowHomeScreen(stage);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            });
        });
        root.getChildren().add(backButton);


        stage.setScene(scene1);
        stage.setTitle("Profile Sccne");
        stage.show();
    }
}
