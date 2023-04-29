/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.samira;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;
import projectbritishcouncil.common.util.SceneSwitcher;
import javafx.fxml.FXML;
import java.util.Optional;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * FXML Controller class
 *
 * @author samir
 */
public class ExaminerDashboardSceneController implements Initializable {
    private ImageView myImageView;
    
    Image myImage = new Image(getClass().getResourceAsStream("/FXMLScenes/Users/samira/images/BClogo.png"));
    
    @FXML
    private MenuButton menuMenuBar;
    @FXML
    private MenuButton settingsMenuBar;
   
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
     
 }    

    @FXML
    private void goHomeButtonOnClick(ActionEvent event) {
         SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(), "/FXMLScenes/Users/samira/ExaminerDashboardScene.fxml");
    }

    @FXML
    private void checkAnswers(ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"/FXMLScenes/Users/samira/CheckingPapersScene.fxml");
    }

    @FXML
    private void viewGradeBoundary(ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"/FXMLScenes/Users/samira/ViewGradeBoundaryScene.fxml");
        
    }

    @FXML
    private void checkMarkScheme(ActionEvent event) {
        
    }

    @FXML
    private void reportCandidate(ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"/FXMLScenes/Users/samira/ReportCandidateScene.fxml");
    }

    @FXML
    private void pulishResults(ActionEvent event) {
    }

    @FXML
    private void applyForLeave(ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"FXMLScenes/Users/samira/ApplyForLeaveScene.fxml");
    }

    @FXML
    private void help(ActionEvent event) {
    }

    @FXML
    private void logout(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
       alert.setTitle("Logout");
       alert.setHeaderText("Are you sure you want to Logout?");
       alert.setContentText("Click OK to Confirm");
       
       Optional <ButtonType> result = alert.showAndWait();
       if(result.get() == ButtonType.OK){
           FXMLLoader loader = new FXMLLoader(getClass().getResource("ExaminerDashboardScene.fxml"));
           Parent homePageParent = loader.load();
           Scene homaPageScene = new Scene(homePageParent);
           
           Stage currentStage = (Stage) settingsMenuBar.getScene().getWindow();
           currentStage.setScene(homaPageScene);
           currentStage.show();
           
       }
       
       else{
           
       }
    }      

    @FXML
    private void writeQuestions(ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"/FXMLScenes.Users.samira/ExaminerWriteQuestionsScene.fxml");
    }
}
    