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
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WhiteheadPageController implements Initializable {

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private ImageView image_backbutton;

    @FXML
    private Label label_whitehead;

    @FXML
    private ImageView image_homeButton;

    @FXML
    private ImageView image_whitehead;

    @FXML
    private Label label_topic;

    @FXML
    private Label label_descTopic;

    @FXML
    private VBox vbox_howForm;

    @FXML
    private ImageView image_howForm;

    @FXML
    private Label label_howForm_whitehead;

    @FXML
    private Label label_process_whitehead;

    @FXML
    private Text text_explanation_whitehead;

    @FXML
    private VBox vbox_factors;

    @FXML
    private ImageView image_factors_whitehead;

    @FXML
    private Label label_factors_whitehead;

    @FXML
    private Text text_factors;

    @FXML
    private VBox vbox_causes;

    @FXML
    private Label label_factors;

    @FXML
    private ImageView image_factor_1;

    @FXML
    private Label label_factor_1;

    @FXML
    private ImageView image_factor_2;

    @FXML
    private Label label_factor_2;

    @FXML
    private ImageView image_factor_3;

    @FXML
    private Label label_factor_3;

    @FXML
    private ImageView image_factor_4;

    @FXML
    private Label label_factor_4;

    @FXML
    private ImageView image_factor_5;

    @FXML
    private Label label_factor_5;

    @FXML
    private VBox vbox_preventionTreatments;

    @FXML
    private ImageView image_prevention_whitehead;

    @FXML
    private Label label_prevention_whitehead;

    @FXML
    private Text text_prevention;

    @FXML
    private VBox vbox_prevention_whitehead;

    @FXML
    private Label label_prevention;

    @FXML
    private ImageView image_prevention_1;

    @FXML
    private Label label_prevention_1;

    @FXML
    private ImageView image_prevention_2;

    @FXML
    private Label label_prevention_2;

    @FXML
    private ImageView image_prevention_3;

    @FXML
    private Label label_prevention_3;

    @FXML
    private ImageView image_prevention_4;

    @FXML
    private Label label_prevention_4;

    @FXML
    private ImageView image_prevention_5;

    @FXML
    private Label label_prevention_5;

    @FXML
    private ImageView image_prevention_6;

    @FXML
    private Label label_prevention_6;

    @FXML
    private ImageView image_prevention_7;

    @FXML
    private Label label_prevention_7;
    
    @FXML
    private void goBack() {
        try {
            // Load and display the AcneTypePage.fxml
            Parent AcneTypePage = FXMLLoader.load(getClass().getResource("AcneTypePage.fxml"));
            Scene AcneTypePageScene = new Scene(AcneTypePage);
            Stage window = (Stage) image_backbutton.getScene().getWindow();
            window.setScene(AcneTypePageScene);
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set the mouse click event on the back button to trigger goBack method.
        image_backbutton.setOnMouseClicked(event -> goBack());
        // Set the mouse click event on the home button to trigger goHome method.
        image_homeButton.setOnMouseClicked(event -> goHome());
    }    
    
}
