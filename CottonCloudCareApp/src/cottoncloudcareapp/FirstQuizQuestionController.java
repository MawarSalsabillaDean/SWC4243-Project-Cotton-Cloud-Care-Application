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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstQuizQuestionController implements Initializable {

    @FXML
    private ImageView image_backbutton;

    @FXML
    private ImageView image_homeButton;
    
    @FXML
    private Label label_SkinTypeQuiz;

    @FXML
    private VBox vbox_question1;

    @FXML
    private Label label_1;

    @FXML
    private Label label_question1;

    @FXML
    private ImageView image_sebum;

    @FXML
    private Button button_yes;

    @FXML
    private Button button_no;

    @FXML
    private Label label_titleSebum;

    @FXML
    private ProgressBar progressbar;
    
    @FXML
    private void goBack() {
        try {
            // Load and display the QuizPage.fxml
            Parent quizPage = FXMLLoader.load(getClass().getResource("QuizPage.fxml"));
            Scene quizScene = new Scene(quizPage);
            Stage window = (Stage) image_backbutton.getScene().getWindow();
            window.setScene(quizScene);
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
    
    @FXML
    private void goSecondQuizQuestion() {
        try {
            // Load and display the SecondQuizQuestion.fxml
            Parent SecondQuizQuestionPage = FXMLLoader.load(getClass().getResource("SecondQuizQuestion.fxml"));
            Scene SecondQuizQuestionScene = new Scene(SecondQuizQuestionPage);
            Stage window = (Stage) button_yes.getScene().getWindow();
            window.setScene(SecondQuizQuestionScene);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    
    @FXML
    private void goThirdQuizQuestion() {
        try {
            // Load and display the ThirdQuizQuestion.fxml
            Parent ThirdQuizQuestionPage = FXMLLoader.load(getClass().getResource("ThirdQuizQuestion.fxml"));
            Scene ThirdQuizQuestionScene = new Scene(ThirdQuizQuestionPage);
            Stage window = (Stage) button_yes.getScene().getWindow();
            window.setScene(ThirdQuizQuestionScene);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    
    //Updates the progress bar to reflect quiz progress.
    public void setProgress(double progress) {
        progressbar.setProgress(progress);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        progressbar.setProgress(0.5); // Set initial progress
        
        image_backbutton.setOnMouseClicked(event -> goBack()); // Handle back navigation
        image_homeButton.setOnMouseClicked(event -> goHome()); // Handle home navigation
        button_yes.setOnMouseClicked(event -> goSecondQuizQuestion()); // Navigate to second question
        button_no.setOnMouseClicked(event -> goThirdQuizQuestion()); // Navigate to third question
    }    
    
}
