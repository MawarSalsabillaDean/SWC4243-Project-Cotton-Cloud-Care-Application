/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cottoncloudcareapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ResultPopupController implements Initializable {

    @FXML
    private VBox vbox_result;

    @FXML
    private ImageView image_notification;

    @FXML
    private Label Label_SkinType;

    @FXML
    private Label resultLabel;

    @FXML
    private Button button_close;
    
    //Sets the text of the result label to display the skin type result.
    @FXML
    public void setResult(String result) {
        resultLabel.setText(result);
    }

    // Closes the popup window when the close button is clicked.
    @FXML
    private void handleClose() {
        // Obtain the stage from the close button's scene and close it.
        Stage stage = (Stage) button_close.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set the close button's mouse click event to trigger the handleClose method.
        button_close.setOnMouseClicked(event -> handleClose());
    }    
    
}
