/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.samira;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import projectbritishcouncil.common.util.SceneSwitcher;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author samir
 */
public class AdminDashboardSceneController implements Initializable {
     ImageView myImageView;
    
    Image myImage = new Image(getClass().getResourceAsStream("BClogo.png"));
    @FXML
    private BorderPane borderPane;
    @FXML
    private MenuButton MenuMenuBar;
    @FXML
    private MenuButton settignsMenuBar;
    @FXML
    private AnchorPane anchorPane;
    public void displayImage(){
        myImageView.setImage(myImage);
    }
    private ComboBox<String> MenuComboBox;
    private ComboBox<String> settingsComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        MenuComboBox.getItems().addAll("Profile", "All Tasks", "Applications", "Complaints and feedbacks", "Provide IT support");
        settingsComboBox.getItems().addAll("Account", "Privacy", "About", "Help");
        // TODO
    }    

    private void goHomeButtonOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/AdminDashboardScene.fxml", false);
    }

    @FXML
    private void goHomeButtonOnClick(javafx.event.ActionEvent event) {
    }

    @FXML
    private void showMenuOptionsOnClick(javafx.event.ActionEvent event) {
    }

    @FXML
    private void showSettingsOnClick(javafx.event.ActionEvent event) {
    }

    @FXML
    private void goBackButtonOnClick(javafx.event.ActionEvent event) {
    }
  
}
     