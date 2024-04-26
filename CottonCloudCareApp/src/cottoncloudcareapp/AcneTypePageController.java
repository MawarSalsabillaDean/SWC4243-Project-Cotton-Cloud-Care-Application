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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AcneTypePageController implements Initializable {
    
    @FXML
    private Label label_acneType;

    @FXML
    private ImageView image_backbutton;

    @FXML
    private ImageView image_person;

    @FXML
    private ImageView image_blackhead;

    @FXML
    private ImageView image_pustule;

    @FXML
    private ImageView image_nodule;

    @FXML
    private ImageView image_papule;

    @FXML
    private ImageView image_whitehead;

    @FXML
    private Label label_typeOfAcne;

    @FXML
    private Text text_select;

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
    
    // Navigation methods to different acne type pages, similar to the goBack() method
    @FXML
    private void goWhitehead() {
        try {
            // Load and display the WhiteheadPage.fxml
            Parent whiteheadPage = FXMLLoader.load(getClass().getResource("WhiteheadPage.fxml"));
            Scene whiteheadScene = new Scene(whiteheadPage);
            Stage window = (Stage) image_blackhead.getScene().getWindow();
            window.setScene(whiteheadScene);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    
    @FXML
    private void goPapule() {
        try {
            // Load and display the PapulePage.fxml
            Parent PapulePage = FXMLLoader.load(getClass().getResource("PapulePage.fxml"));
            Scene PapuleScene = new Scene(PapulePage);
            Stage window = (Stage) image_papule.getScene().getWindow();
            window.setScene(PapuleScene);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    
    @FXML
    private void goBlackhead() {
        try {
            // Load and display the BlackheadPage.fxml
            Parent blackheadPage = FXMLLoader.load(getClass().getResource("BlackheadPage.fxml"));
            Scene blackheadScene = new Scene(blackheadPage);
            Stage window = (Stage) image_whitehead.getScene().getWindow();
            window.setScene(blackheadScene);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    
    @FXML
    private void goNodule() {
        try {
            // Load and display the NodulePage.fxml
            Parent nodulePage = FXMLLoader.load(getClass().getResource("NodulePage.fxml"));
            Scene noduleScene = new Scene(nodulePage);
            Stage window = (Stage) image_nodule.getScene().getWindow();
            window.setScene(noduleScene);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    
    @FXML
    private void goPustule() {
        try {
            // Load and display the PustulePage.fxml
            Parent pustulePage = FXMLLoader.load(getClass().getResource("PustulePage.fxml"));
            Scene pustuleScene = new Scene(pustulePage);
            Stage window = (Stage) image_pustule.getScene().getWindow();
            window.setScene(pustuleScene);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set up mouse click events for images to navigate to detailed pages about each type of acne
        image_backbutton.setOnMouseClicked(event -> goBack());
        image_whitehead.setOnMouseClicked(event -> goWhitehead());
        image_papule.setOnMouseClicked(event -> goPapule());
        image_blackhead.setOnMouseClicked(event -> goBlackhead());
        image_nodule.setOnMouseClicked(event -> goNodule());
        image_pustule.setOnMouseClicked(event -> goPustule());
    }    
    
}
