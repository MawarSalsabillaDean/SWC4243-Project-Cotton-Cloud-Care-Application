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
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuPageController implements Initializable {
    
    @FXML
    private Label label_content;

    @FXML
    private AnchorPane Anchor_Menu;

    @FXML
    private Label label_SkinProfile;

    @FXML
    private GridPane gridpane_menu;

    @FXML
    private VBox vbox_quiz;

    @FXML
    private Label label_quiz;

    @FXML
    private Separator separator_quiz;

    @FXML
    private ImageView image_quiz;

    @FXML
    private Label label_quiz2;

    @FXML
    private VBox vbox_skintype;

    @FXML
    private Label label_skintype;

    @FXML
    private Separator separator_skin;

    @FXML
    private ImageView image_skin;

    @FXML
    private Label label_skininfo;

    @FXML
    private VBox vbox_acnetype;
    
    @FXML
    private Label label_acnetype;

    @FXML
    private Separator separator_acne;

    @FXML
    private ImageView image_acne;

    @FXML
    private Label label_acneinfo;

    @FXML
    private VBox vbox_article;

    @FXML
    private Label label_article;

    @FXML
    private Separator separator_article;

    @FXML
    private ImageView image_article;

    @FXML
    private Label label_articleskincare;

    @FXML
    private ImageView image_FAQ;
    
    @FXML
    private Label label_copyright;
    
    private void loadPage(String fxmlFile) {
        try {
            // Load the page specified by the fxmlFile parameter
            Parent pageRoot = FXMLLoader.load(getClass().getResource(fxmlFile));
            Scene pageScene = new Scene(pageRoot);
            Stage mainStage = (Stage) label_content.getScene().getWindow(); // Get the current stage
            mainStage.setScene(pageScene); // Set the new scene on current stage
            mainStage.show(); // Show the stage with new content
        } catch (IOException e) {
            e.printStackTrace(); // Handle possible IO exceptions like a missing FXML file
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set up mouse click events for each VBox and ImageView that navigates to different pages        
        vbox_quiz.setOnMouseClicked(e -> loadPage("QuizPage.fxml"));
        vbox_skintype.setOnMouseClicked(e -> loadPage("SkinTypePage.fxml"));
        vbox_acnetype.setOnMouseClicked(e -> loadPage("AcneTypePage.fxml"));
        vbox_article.setOnMouseClicked(e -> loadPage("ArticlePage.fxml"));
        image_FAQ.setOnMouseClicked(e -> loadPage("FrequentlyAskedQuestionsPage.fxml"));
    }    
    
}
