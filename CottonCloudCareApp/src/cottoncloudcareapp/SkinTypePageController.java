/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cottoncloudcareapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SkinTypePageController implements Initializable {

    @FXML
    private Label label_skinTypeInfo;

    @FXML
    private ImageView image_backbutton;

    @FXML
    private Label label_select;

    @FXML
    private VBox mainContainer;

    @FXML
    private VBox vbox_normal;

    @FXML
    private HBox hbox_normal;

    @FXML
    private ImageView img_normal;

    @FXML
    private Button button_section1;

    @FXML
    private VBox content1;

    @FXML
    private Label label_normal;

    @FXML
    private VBox vbox_dry;

    @FXML
    private HBox hbox_dry;

    @FXML
    private ImageView img_dry;

    @FXML
    private Button button_section2;

    @FXML
    private VBox content2;

    @FXML
    private Label label_dry;

    @FXML
    private VBox vbox_combination;

    @FXML
    private HBox hbox_combination;

    @FXML
    private ImageView img_combi;

    @FXML
    private Button button_section3;

    @FXML
    private VBox content3;

    @FXML
    private Label label_combi;

    @FXML
    private VBox vbox_oily;

    @FXML
    private HBox hbox_oily;

    @FXML
    private ImageView img_oily;

    @FXML
    private Button button_section4;

    @FXML
    private VBox content4;

    @FXML
    private Label label_oily;

    @FXML
    private VBox vbox_sensitive;

    @FXML
    private HBox hbox_sensitive;

    @FXML
    private ImageView img_sensitive;

    @FXML
    private Button button_section5;

    @FXML
    private VBox content5;

    @FXML
    private Label label_sensitive;
    
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
    
    @FXML
    private void toggleSection1(ActionEvent event) {
        // Check whether content is currently managed and visible
        final boolean isExpanded = content1.isManaged();
        final double startHeight = isExpanded ? content1.getHeight() : 0;
        final double endHeight = isExpanded ? 0 : content1.getPrefHeight();

        // Animate the maxHeight property for smooth expansion/collapse
        Transition transition = new Transition() {
            { setCycleDuration(Duration.millis(250)); }

            @Override
            protected void interpolate(double frac) {
                final double newHeight = startHeight + (endHeight - startHeight) * frac;
                content1.setMaxHeight(newHeight); // Set the new height during the animation
                content1.setVisible(newHeight > 0); // Make visible if height > 0
            }
        };

        // When the animation is finished, set the final state of content1
        transition.setOnFinished(evt -> {
            content1.setManaged(!isExpanded); // Toggle the managed status
            content1.setVisible(!isExpanded); // Toggle the visibility to show/hide content

            // If the content is expanded, set the preferred height to USE_COMPUTED_SIZE to allow it to resize with its content
            if (!isExpanded) {
                content1.setPrefHeight(Region.USE_COMPUTED_SIZE); // Reset to computed size
            }
        });

        transition.play(); // Start the animation
    } 

    @FXML
    private void toggleSection2(ActionEvent event) {
        // Check whether content is currently managed and visible
        final boolean isExpanded = content2.isManaged();
        final double startHeight = isExpanded ? content2.getHeight() : 0;
        final double endHeight = isExpanded ? 0 : content2.getPrefHeight();

        // Animate the maxHeight property for smooth expansion/collapse
        Transition transition = new Transition() {
            { setCycleDuration(Duration.millis(250)); }

            @Override
            protected void interpolate(double frac) {
                final double newHeight = startHeight + (endHeight - startHeight) * frac;
                content2.setMaxHeight(newHeight); // Set the new height during the animation
                content2.setVisible(newHeight > 0); // Make visible if height > 0
            }
        };

        // When the animation is finished, set the final state of content2
        transition.setOnFinished(evt -> {
            content2.setManaged(!isExpanded); // Toggle the managed status
            content2.setVisible(!isExpanded); // Toggle the visibility to show/hide content

            // If the content is expanded, set the preferred height to USE_COMPUTED_SIZE to allow it to resize with its content
            if (!isExpanded) {
                content2.setPrefHeight(Region.USE_COMPUTED_SIZE); // Reset to computed size
            }
        });

        transition.play(); // Start the animation
    }
    
    @FXML
    private void toggleSection3(ActionEvent event) {
        // Check whether content is currently managed and visible
        final boolean isExpanded = content3.isManaged();
        final double startHeight = isExpanded ? content3.getHeight() : 0;
        final double endHeight = isExpanded ? 0 : content3.getPrefHeight();

        // Animate the maxHeight property for smooth expansion/collapse
        Transition transition = new Transition() {
            { setCycleDuration(Duration.millis(250)); }

            @Override
            protected void interpolate(double frac) {
                final double newHeight = startHeight + (endHeight - startHeight) * frac;
                content3.setMaxHeight(newHeight); // Set the new height during the animation
                content3.setVisible(newHeight > 0); // Make visible if height > 0
            }
        };

        // When the animation is finished, set the final state of content3
        transition.setOnFinished(evt -> {
            content3.setManaged(!isExpanded); // Toggle the managed status
            content3.setVisible(!isExpanded); // Toggle the visibility to show/hide content

            // If the content is expanded, set the preferred height to USE_COMPUTED_SIZE to allow it to resize with its content
            if (!isExpanded) {
                content3.setPrefHeight(Region.USE_COMPUTED_SIZE); // Reset to computed size
            }
        });

        transition.play(); // Start the animation
    }

    @FXML
    private void toggleSection4(ActionEvent event) {
        // Check whether content is currently managed and visible
        final boolean isExpanded = content4.isManaged();
        final double startHeight = isExpanded ? content4.getHeight() : 0;
        final double endHeight = isExpanded ? 0 : content4.getPrefHeight();

        // Animate the maxHeight property for smooth expansion/collapse
        Transition transition = new Transition() {
            { setCycleDuration(Duration.millis(250)); }

            @Override
            protected void interpolate(double frac) {
                final double newHeight = startHeight + (endHeight - startHeight) * frac;
                content4.setMaxHeight(newHeight); // Set the new height during the animation
                content4.setVisible(newHeight > 0); // Make visible if height > 0
            }
        };

        // When the animation is finished, set the final state of content4
        transition.setOnFinished(evt -> {
            content4.setManaged(!isExpanded); // Toggle the managed status
            content4.setVisible(!isExpanded); // Toggle the visibility to show/hide content4

            // If the content is expanded, set the preferred height to USE_COMPUTED_SIZE to allow it to resize with its content
            if (!isExpanded) {
                content4.setPrefHeight(Region.USE_COMPUTED_SIZE); // Reset to computed size
            }
        });

        transition.play(); // Start the animation
    }

    @FXML
    private void toggleSection5(ActionEvent event) {
        // Check whether content5 is currently managed and visible
        final boolean isExpanded = content5.isManaged();
        final double startHeight = isExpanded ? content5.getHeight() : 0;
        final double endHeight = isExpanded ? 0 : content5.getPrefHeight();

        // Animate the maxHeight property for smooth expansion/collapse
        Transition transition = new Transition() {
            { setCycleDuration(Duration.millis(250)); } // Set animation duration

            @Override
            protected void interpolate(double frac) {
                final double newHeight = startHeight + (endHeight - startHeight) * frac;
                content5.setMaxHeight(newHeight); // Set the new height during the animation
                content5.setVisible(newHeight > 0); // Make visible if height > 0
            }
        };

        // When the animation is finished, set the final state of content5
        transition.setOnFinished(evt -> {
            content5.setManaged(!isExpanded); // Toggle the managed status
            content5.setVisible(!isExpanded); // Toggle the visibility

            // If the content is expanded, set the preferred height to USE_COMPUTED_SIZE to allow it to resize with its content
            if (isExpanded) {
                content5.setPrefHeight(Region.USE_COMPUTED_SIZE); // Reset to computed size
            }
        });

        transition.play(); // Start the animation
    }    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set up click event to navigate back.
        image_backbutton.setOnMouseClicked(event -> goBack());

        // Initially hide and collapse content sections 1 through 5.
        content1.setManaged(false);
        content1.setVisible(false);
        content1.setMaxHeight(0); // Hide content1 initially.

        content2.setManaged(false);
        content2.setVisible(false);
        content2.setMaxHeight(0); // Hide content2 initially.

        content3.setManaged(false);
        content3.setVisible(false);
        content3.setMaxHeight(0); // Hide content3 initially.

        content4.setManaged(false);
        content4.setVisible(false);
        content4.setMaxHeight(0); // Hide content4 initially.

        content5.setManaged(false);
        content5.setVisible(false);
        content5.setMaxHeight(0); // Hide content5 initially.        
    }    
    
}
