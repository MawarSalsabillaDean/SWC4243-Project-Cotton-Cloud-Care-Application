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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ArticlePageController implements Initializable {

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private Label label_article;

    @FXML
    private ImageView image_backbutton;

    @FXML
    private VBox vbox_article1;

    @FXML
    private Label label_articletitle_1;

    @FXML
    private Text text_articledesc_1;

    @FXML
    private Button button_readarticle;

    @FXML
    private Hyperlink hyperlink_1;

    @FXML
    private ImageView image_article1;

    @FXML
    private VBox vbox_article2;

    @FXML
    private Label label_articletitle_2;

    @FXML
    private Text text_articledesc_2;

    @FXML
    private Button button_readarticle2;

    @FXML
    private Hyperlink hyperlink_2;

    @FXML
    private ImageView image_article2;

    @FXML
    private VBox vbox_article3;

    @FXML
    private Label label_articletitle_3;

    @FXML
    private Text text_articledesc_3;

    @FXML
    private Button button_readarticle3;

    @FXML
    private Hyperlink hyperlink_3;

    @FXML
    private ImageView image_article3;

    @FXML
    private VBox vbox_article4;

    @FXML
    private Label label_articletitle_4;

    @FXML
    private Text text_articledesc_4;

    @FXML
    private Button button_readarticle4;

    @FXML
    private Hyperlink hyperlink_4;

    @FXML
    private ImageView image_article4;    
    
    // Event handler for back button to return to previous scene
    @FXML
    private void goBack() {
        try {
            // Load and display the MenuPage.fxml
            Parent MenuPage = FXMLLoader.load(getClass().getResource("MenuPage.fxml"));
            Scene MenuPageScene = new Scene(MenuPage);
            Stage window = (Stage) image_backbutton.getScene().getWindow();
            window.setScene(MenuPageScene);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    } 
    
    // Method to handle the action of reading the first article
    @FXML
    private void handleReadArticle() {
        System.out.println("Attempting to handle reading article...");
        try {
            System.out.println("Loading FXML...");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FirstArticlePage.fxml"));
            if (loader.getLocation() == null) {
                System.out.println("Resource not found. Check the FXML file path.");
                return;
            }
            Parent root = loader.load();
            System.out.println("FXML loaded.");

            FirstArticlePageController controller = loader.getController();
            if (controller == null) {
                System.out.println("Controller not instantiated properly. Check FXML Controller definition.");
                return;
            }
            System.out.println("Controller fetched.");

            controller.setArticleURL("https://www.eucerin.my/about-skin/basic-skin-knowledge/skin-types");

            Stage stage = (Stage) hyperlink_1.getScene().getWindow();
            if (stage == null) {
                System.out.println("Stage not found. Check your scene setup.");
                return;
            }
            System.out.println("Getting the stage...");

            stage.setScene(new Scene(root));
            stage.show();
            System.out.println("Stage shown.");
        } catch (Exception e) {
            System.out.println("Failed to load the article page.");
            e.printStackTrace();
        }
    }
    
    // Method to handle the action of reading the second article   
    @FXML
    private void handleReadSecondArticle() {
        System.out.println("Attempting to handle reading second article...");
            try {
                System.out.println("Loading second FXML...");
                FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondArticlePage.fxml"));
                Parent root = loader.load();
                System.out.println("Second FXML loaded.");

                SecondArticlePageController controller = loader.getController();
                if (controller == null) {
                    System.out.println("Second Controller not instantiated properly. Check FXML Controller definition.");
                    return;
                }
                System.out.println("Second Controller fetched.");
                controller.setArticleURL("https://www.vogue.com/article/skincare-mechanical-vs-chemical-vs-physical-exfoliation"); 

                Stage stage = (Stage) hyperlink_2.getScene().getWindow(); 
                stage.setScene(new Scene(root));
                stage.show();
                System.out.println("Second Stage shown.");
            } catch (Exception e) {
                System.out.println("Failed to load the second article page.");
                e.printStackTrace();
            }
    }
    
    // Method to handle the action of reading the third article
    @FXML
    private void handleReadThirdArticle() {
        System.out.println("Attempting to handle reading third article...");
        try {
            System.out.println("Loading third FXML...");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ThirdArticlePage.fxml"));
            Parent root = loader.load();
            System.out.println("Third FXML loaded.");

            ThirdArticlePageController controller = loader.getController();
            if (controller == null) {
                System.out.println("Third Controller not instantiated properly. Check FXML Controller definition.");
                return;
            }
            System.out.println("Third Controller fetched.");
            controller.setArticleURL("https://www.medicalnewstoday.com/articles/patch-test-skincare"); 

            Stage stage = (Stage) hyperlink_3.getScene().getWindow(); 
            stage.setScene(new Scene(root));
            stage.show();
            System.out.println("Third Stage shown.");
        } catch (Exception e) {
            System.out.println("Failed to load the third article page.");
            e.printStackTrace();
        }
    }   

    // Method to handle the action of reading the fourth article
    @FXML
    private void handleReadFourthArticle() {
        System.out.println("Attempting to handle reading fourth article...");
        try {
            System.out.println("Loading fourth FXML...");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FourthArticlePage.fxml"));
            Parent root = loader.load();
            System.out.println("Fourth FXML loaded.");

            FourthArticlePageController controller = loader.getController();
            if (controller == null) {
                System.out.println("Fourth Controller not instantiated properly. Check FXML Controller definition.");
                return;
            }
            System.out.println("Fourth Controller fetched.");
            controller.setArticleURL("https://pureandcimple.com/blogs/our-blog/the-power-of-a-minimalist-approach-to-skincare"); 

            Stage stage = (Stage) hyperlink_4.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
            System.out.println("Fourth Stage shown.");
        } catch (Exception e) {
            System.out.println("Failed to load the fourth article page.");
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        image_backbutton.setOnMouseClicked(event -> goBack());
        
    }    
    
}
