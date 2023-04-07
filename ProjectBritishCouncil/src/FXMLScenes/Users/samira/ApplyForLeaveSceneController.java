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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import projectbritishcouncil.common.util.SceneSwitcher;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author samir
 */
public class ApplyForLeaveSceneController implements Initializable {

    @FXML
    private TextArea applicationTextArea;
    private ComboBox<String> menuComboBox;
     private ComboBox<String> settingsComboBox;
    @FXML
     private TextField employeeIdTextField;
     private AnchorPane scenePane;
     Stage stage;
    @FXML
    private MenuButton MenuMenuBar;
    @FXML
    private MenuButton settignsMenuBar;
    @FXML
    private ComboBox<?> employeeCategoryComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         menuComboBox.getItems().addAll("Profile", "All Tasks", "Applications", "Complaints and feedbacks", "Provide IT support");
         settingsComboBox.getItems().addAll("Account", "Privacy", "About", "Help");
        // TODO
    }    

    private void goHomeButtonOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/FXMLScenes.Users.samira/AdminDashboardScene.fxml", true);
    }

    private void submitApplicationButtonOnClick(ActionEvent event) {
        applicationTextArea.clear();
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/FXMLScenes.Users.samira/AdminDashboardScene.fxml", true);
    }

    private void goBackButtonOnClick(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Go Back");
        alert.setHeaderText("You're about to leave this page");
        alert.setContentText("Are you sure you want to leave this page?: ");
        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage) scenePane.getScene().getWindow();
            SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/FXMLScenes.Users.samira/AdminDashboardScene.fxml", true);
      }
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
    private void submitApplicationButtonOnClick(javafx.event.ActionEvent event) {
    }

    @FXML
    private void goBackButtonOnClick(javafx.event.ActionEvent event) {
    }
}
