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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author samir
 */
public class AdminDashboardSceneController implements Initializable {
     @FXML
    ImageView myImageView;
    
    Image myImage = new Image(getClass().getResourceAsStream("BClogo.png"));
    public void displayImage(){
        myImageView.setImage(myImage);
    }
    @FXML
    private ComboBox<String> MenuComboBox;
    @FXML
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

    @FXML
    private void goHomeButtonOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/AdminDashboardScene.fxml", false);
    }
  
}
     