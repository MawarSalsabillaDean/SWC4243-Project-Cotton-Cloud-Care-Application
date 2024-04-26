/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cottoncloudcareapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SecondQuizQuestionController implements Initializable {

    @FXML
    private ImageView image_backbutton;
    
    @FXML
    private ImageView image_homeButton;

    @FXML
    private Label label_SkinTypeQuiz;

    @FXML
    private VBox vbox_question2;

    @FXML
    private Label label_2;

    @FXML
    private Label label_question2;

    @FXML
    private ImageView image_oiliness;

    @FXML
    private Button button_yes;

    @FXML
    private Button button_no;

    @FXML
    private Label label_titleOiliness;

    @FXML
    private ProgressBar progressbar;
    
    @FXML
    private void goBack() {
        try {
            // Load and display the FirstQuizQuestion.fxml
            Parent FirstQuizQuestionPage = FXMLLoader.load(getClass().getResource("FirstQuizQuestion.fxml"));
            Scene FirstQuizQuestionScene = new Scene(FirstQuizQuestionPage);
            Stage window = (Stage) image_backbutton.getScene().getWindow();
            window.setScene(FirstQuizQuestionScene);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    
    @FXML
    private void goHome() {
        try {
            // Load and display the MenuPage.fxml
            Parent MenuPage = FXMLLoader.load(getClass().getResource("MenuPage.fxml"));
            Scene MenuScene = new Scene(MenuPage);
            Stage window = (Stage) image_backbutton.getScene().getWindow();
            window.setScene(MenuScene);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    
    // Updates the progress bar with a specific progress value.
    public void setProgress(double progress) {
        progressbar.setProgress(progress);
    }
    
    // Displays the result popup based on the selected skin type.
    private void showResult(String skinType) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ResultPopup.fxml"));
        AnchorPane pane = fxmlLoader.load();
        
        ResultPopupController controller = fxmlLoader.getController();
        controller.setResult(skinType);

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Skin Type Result");
        stage.setScene(new Scene(pane));
        stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleYes() {
        // If Yes is for Dry Skin Type
        showResult("Oily Skin Type");
    }

    @FXML
    private void handleNo() {
        // If No is for Normal Skin Type
        showResult("Combination Skin Type");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        progressbar.setProgress(1.0); // Set full progress for the last question
        
        image_backbutton.setOnMouseClicked(event -> goBack()); // Setup back navigation
        image_homeButton.setOnMouseClicked(event -> goHome()); // Setup home navigation
    }    
    
}
