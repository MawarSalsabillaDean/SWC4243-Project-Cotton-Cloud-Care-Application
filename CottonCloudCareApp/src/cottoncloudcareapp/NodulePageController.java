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

public class NodulePageController implements Initializable {

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private ImageView image_backbutton;

    @FXML
    private Label label_Nodule;

    @FXML
    private ImageView image_homeButton;

    @FXML
    private ImageView image_Nodule;

    @FXML
    private Label label_topic;

    @FXML
    private Label label_descTopic;

    @FXML
    private VBox vbox_howForm;

    @FXML
    private ImageView image_howForm;

    @FXML
    private Label label_howForm_Nodule;

    @FXML
    private Label label_process_Nodule;

    @FXML
    private Text text_explanation_Nodule;

    @FXML
    private VBox vbox_factors;

    @FXML
    private ImageView image_factors_Nodule;

    @FXML
    private Label label_factors_Nodule;

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
    private ImageView image_prevention_Nodule;

    @FXML
    private Label label_prevention_Nodule;

    @FXML
    private Text text_prevention;

    @FXML
    private VBox vbox_prevention_Nodule;

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
            // Load the AcneTypePage.fxml to switch back to the acne type selection page.
            Parent AcneTypePage = FXMLLoader.load(getClass().getResource("AcneTypePage.fxml"));
            Scene AcneTypePageScene = new Scene(AcneTypePage);
            // Get the current window (stage) from the back button's scene and set the new scene.
            Stage window = (Stage) image_backbutton.getScene().getWindow();
            window.setScene(AcneTypePageScene);
        } catch (IOException e) {
            e.printStackTrace(); // Log an error if the FXML file couldn't be loaded.
        }
    }

    @FXML
    private void goHome() {
        try {
            // Load the MenuPage.fxml to return to the main menu.
            Parent MenuPage = FXMLLoader.load(getClass().getResource("MenuPage.fxml"));
            Scene MenuScene = new Scene(MenuPage);
            // Use the same stage as the back button to switch scenes.
            Stage window = (Stage) image_backbutton.getScene().getWindow();
            window.setScene(MenuScene);
        } catch (IOException e) {
            e.printStackTrace(); // Log an error if the FXML file couldn't be loaded.
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set up the back button to run the goBack method when clicked.
        image_backbutton.setOnMouseClicked(event -> goBack());
        
        // Set up the home button to run the goHome method when clicked.
        image_homeButton.setOnMouseClicked(event -> goHome());
    }    
    
}
