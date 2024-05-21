package prak1;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationUtils {
    static void applyButtonAnimation(Button button) {
    button.setOnMousePressed(event -> {
        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(100), button);
        scaleTransition.setToX(0.95);
        scaleTransition.setToY(0.95);
        scaleTransition.play();
    });

    button.setOnMouseReleased(event -> {
        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(100), button);
        scaleTransition.setToX(1);
        scaleTransition.setToY(1);
        scaleTransition.play();
    });

    ScaleTransition hoverScaleUp = new ScaleTransition(Duration.millis(200), button);
    hoverScaleUp.setToX(1.1);
    hoverScaleUp.setToY(1.1);
    ScaleTransition hoverScaleDown = new ScaleTransition(Duration.millis(200), button);
    hoverScaleDown.setToX(1);
    hoverScaleDown.setToY(1);

    button.setOnMouseEntered(event -> {
        hoverScaleDown.stop();
        hoverScaleUp.play();
    });

    button.setOnMouseExited(event -> {
        hoverScaleUp.stop();
        hoverScaleDown.play();
    });
}
    public static void switchSceneWithFadeTransition(Stage stage, Runnable showSceneFunction) {
        Parent root = stage.getScene().getRoot();
        FadeTransition fadeOut = new FadeTransition(Duration.seconds(0.5), root);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);
        fadeOut.setOnFinished(event -> {
            Scene newScene = stage.getScene();
            FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.5), newScene.getRoot());
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);
            fadeIn.play();
            showSceneFunction.run();
        });
        fadeOut.play();
    }
}

