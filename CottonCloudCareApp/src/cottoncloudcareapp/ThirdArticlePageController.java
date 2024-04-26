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
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class ThirdArticlePageController implements Initializable {
    
    @FXML
    private ImageView image_backbutton;

    @FXML
    private Label label_thirdArticle;

    @FXML
    private ImageView image_homeButton;

    @FXML
    private WebView webView;

    @FXML
    private void goBack() {
        try {
            // Load and display the ArticlePage.fxml
            Parent ArticlePage = FXMLLoader.load(getClass().getResource("ArticlePage.fxml"));
            Scene ArticlePageScene = new Scene(ArticlePage);
            Stage window = (Stage) image_backbutton.getScene().getWindow();
            window.setScene(ArticlePageScene);
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

    public void setArticleURL(String url) {
        if (webView != null) {
            System.out.println("Loading URL: " + url); // Debugging output
            webView.getEngine().load(url);
        } else {
            System.out.println("WebView is null."); // Debugging output
        }
    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        image_backbutton.setOnMouseClicked(event -> goBack());
        
        image_homeButton.setOnMouseClicked(event -> goHome());
        
        // This method sets a URL when the controller is initialized
        if (webView != null) {
            String defaultUrl = "https://www.medicalnewstoday.com/articles/patch-test-skincare";
            System.out.println("Initializing with default URL: " + defaultUrl); // Debugging output
            webView.getEngine().load(defaultUrl);
        } else {
            System.out.println("WebView is not initialized in FXML."); // Debugging output
        }
    }   
    
}
