/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.samira;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author samir
 */
public class ExaminerDashboardSceneController implements Initializable {

    @FXML
    private ComboBox<String> menuComboBox;
    @FXML
    private ComboBox<String> settingsComboBox;
    @FXML
    private ImageView myImageView;
     Image myImage = new Image(getClass().getResourceAsStream("BClogo.png"));
    public void displayImage(){
        myImageView.setImage(myImage);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       menuComboBox.getItems().addAll("Profile", "All Tasks", "Applications", "Complaints and feedbacks", "Provide IT support");
        settingsComboBox.getItems().addAll("Account", "Privacy", "About", "Help");
        // TODO
    }    

    @FXML
    private void goHomeButtonOnClick(ActionEvent event) {
         SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/ExaminerDashboardScene.fxml", false);
    }
    
}
