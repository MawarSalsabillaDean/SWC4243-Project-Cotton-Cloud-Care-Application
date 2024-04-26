/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cottoncloudcareapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class QuizPageController implements Initializable {

    @FXML
    private Label label_quiztitle;

    @FXML
    private ImageView image_backbutton;

    @FXML
    private VBox vbox_intro;

    @FXML
    private HBox hbox_washface;

    @FXML
    private Label label_washface;

    @FXML
    private Label label_washface2;

    @FXML
    private Label label_washface3;

    @FXML
    private ImageView image_washface;

    @FXML
    private Label label_desc;

    @FXML
    private Button button_start;
    
    //Handles the back button click to navigate to the main menu.
    @FXML
    private void goBack() {
        try {
            // Load and display the MenuPage.fxml
            Parent menuPage = FXMLLoader.load(getClass().getResource("MenuPage.fxml"));
            Scene menuScene = new Scene(menuPage);
            Stage window = (Stage) image_backbutton.getScene().getWindow();
            window.setScene(menuScene);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    
    //Handles the start button click to proceed to the first quiz question.
    @FXML
    private void goFirstQuizQuestion() {
        try {
            // Load and display the FirstQuizQuestion.fxml
            Parent FirstQuizQuestionPage = FXMLLoader.load(getClass().getResource("FirstQuizQuestion.fxml"));
            Scene FirstQuizQuestionScene = new Scene(FirstQuizQuestionPage);
            Stage window = (Stage) button_start.getScene().getWindow();
            window.setScene(FirstQuizQuestionScene);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    
    //Initializes the controller, setting event handlers for the back and start buttons.
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        image_backbutton.setOnMouseClicked(event -> goBack());
        
        button_start.setOnMouseClicked(event -> goFirstQuizQuestion());
   }
}
