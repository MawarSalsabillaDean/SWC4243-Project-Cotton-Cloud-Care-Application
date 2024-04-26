/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package cottoncloudcareapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CottonCloudCareController implements Initializable {
    
    @FXML
    private ImageView image_logo;

    @FXML
    private Label label_appname;

    @FXML
    private Label label_trademark;

    @FXML
    private ProgressIndicator progressIndicator;
    
    private void loadMenuPage() {
        try {
            // Load the menu page view
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
            Parent menuPageRoot = loader.load();
            Scene menuPageScene = new Scene(menuPageRoot);

            // Get the current stage using the progress indicator's scene
            Stage currentStage = (Stage) progressIndicator.getScene().getWindow();
            currentStage.setScene(menuPageScene);
            currentStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void simulateLoadingProcess() {
    try {
        for (int i = 1; i <= 100; i++) {
            final double progress = i / 100.0;
            Platform.runLater(() -> progressIndicator.setProgress(progress));
            Thread.sleep(50); // Simulating delay for loading
        }
        Platform.runLater(() -> {
            progressIndicator.setVisible(false);
            loadMenuPage(); // Transition to the menu page after loading is complete
        });
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Start with an indeterminate progress indicator
        progressIndicator.setProgress(ProgressIndicator.INDETERMINATE_PROGRESS);

        // Simulate a loading process
        new Thread(() -> {
            simulateLoadingProcess();
        }).start();
    }    
    
}
