/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.samira;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import projectbritishcouncil.common.util.SceneSwitcher;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
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
    @FXML
     ImageView myImageView;
    
    Image myImage = new Image(getClass().getResourceAsStream("/FXMLScenes/Users/samira/images/BClogo.png"));
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
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        // TODO
    }    
    private void goHomeButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"/FXMLScenes/Users/samira/AdminDashboardScene.fxml");
    }


    @FXML
    private void goHomeButtonOnClick(javafx.event.ActionEvent event) {
         SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"/FXMLScenes/Users/samira/AdminDashboardScene.fxml");
    }


    @FXML
    private void addUser(javafx.event.ActionEvent event) {
         SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"/FXMLScenes/Users/samira/ViewListOfUsersScene.fxml");
    }

    @FXML
    private void removeUser(javafx.event.ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"/FXMLScenes/Users/samira/ViewListOfUsersScene.fxml");
    }

    @FXML
    private void publishNotice(javafx.event.ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"/FXMLScenes/Users/samira/AdminViewBulletinBoardScene.fxml");
    }

    @FXML
    private void viewComplaints(javafx.event.ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"/FXMLScenes/Users/samira/AdminViewComplaintsScene.fxml");
    }

    @FXML
    private void reviewApplications(javafx.event.ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"/FXMLScenes/Users/samira/AdminViewComplaintsScene.fxml");
    }

    @FXML
    private void resolveBillingDisputes(javafx.event.ActionEvent event) { 
    }

    @FXML
    private void resolveRequests(javafx.event.ActionEvent event) {
    }

    @FXML
    private void help(javafx.event.ActionEvent event) {
    }

    @FXML
    private void logout(javafx.event.ActionEvent event) throws IOException {
          Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Logout");
            alert.setHeaderText("Are you sure you want to Logout?");
            alert.setContentText("Click OK to Confirm");
       
           Optional <ButtonType> result = alert.showAndWait();
            if(result.get() == ButtonType.OK){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("ExaminerDashboardScene.fxml"));
                Parent homePageParent = loader.load();
                Scene homaPageScene = new Scene(homePageParent);
           
                Stage currentStage = (Stage)settignsMenuBar.getScene().getWindow();
                currentStage.setScene(homaPageScene);
                currentStage.show();
           
       }
       
       else{
           
       }
    }
  
}
     